package com.zhy.pattern.proxyPattern.dynamicproxy.gpJdkProxy;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: GPProxy
 * @Description: 用来生成源代码的工具类
 * @auther: zhy
 * @Date: 2019/5/5 11:43
 * @Version: 1.0
 **/
public class GPProxy {

    public static Object newProxyInstance(GPClassLoader classLoader ,Class<?>[] interfaces,GPInvocationHandler h){
        try {
            //1.动态生成源代码.java文件
            String src = generateSrc(interfaces);
            System.out.println(src);
            //2.Java文件 输出磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            System.out.println(filePath);

            File f = new File(filePath + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();
            //3.将java文件编译为.class文件
            JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager =
                    systemJavaCompiler.getStandardFileManager(null,null,null);
            Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task =
                    systemJavaCompiler.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();
            //4.编译生成的.class文件 加载到jvm中
            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor constructor = proxyClass.getConstructor(GPInvocationHandler.class);
            //f.delete();
            //5.返回字节码重组以后的新的代理对象
            return constructor.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //5.返回 字节码文件重组之后的代理对象
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        String ln = "\r\n";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("package com.zhy.pattern.proxyPattern.dynamicproxy.gpJdkProxy;"+ln);
        stringBuffer.append("import com.zhy.pattern.proxyPattern.staticProxy.Person;"+ln);
        stringBuffer.append("import java.lang.reflect.*;"+ln);
        stringBuffer.append("public class $Proxy0 implements "+interfaces[0].getName()+"{"+ln);
        stringBuffer.append("GPInvocationHandler h;"+ln);
        stringBuffer.append("public $Proxy0(GPInvocationHandler h) {"+ln);
            stringBuffer.append("this.h = h;"+ln);
        stringBuffer.append("}"+ln);
        for (Method method:interfaces[0].getMethods()){
            Class<?>[] parameterTypes = method.getParameterTypes();
            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();
            for (int i = 0;i<parameterTypes.length;i++){
               Class clazz =  parameterTypes[i];
                String type = clazz.getName();
                String paramsName = toLowerFirstCase(clazz.getSimpleName());
                paramNames.append(type+" "+paramsName);
                paramValues.append(paramsName);
                paramClasses.append(clazz.getName()+".class");
                if (i>0 && i<parameterTypes.length-1){
                    paramNames.append(",");
                    paramClasses.append(",");
                    paramValues.append(",");
                }
            }
            stringBuffer.append("@Override"+ln);
            stringBuffer.append("public "+method.getReturnType().getName()+" "+method.getName()+" ("+paramNames.toString()+
                    ") " +"{"+ln);
                stringBuffer.append("try{"+ln);
                    stringBuffer.append("Method m = "+interfaces[0].getName()+".class.getMethod(\""
                            +method.getName()+"\",new Class[]{"+paramClasses.toString()+"});"+ln);
                    stringBuffer.append((hasReturnValue(method.getReturnType())? "return " :"")
                                +getCaseCode("this.h.invoke(this,m,new Object[] {"+paramValues+"})",method.getReturnType())+";");

                stringBuffer.append("} catch(Error _ex) {}");
                stringBuffer.append("catch (Throwable e){"+ln);
                    stringBuffer.append("throw new UndeclaredThrowableException(e);"+ln);
                stringBuffer.append("}"+ln);
                stringBuffer.append(getReturnEmptyCode(method.getReturnType()));
            stringBuffer.append("}"+ln);
        }

        stringBuffer.append("}");

        return stringBuffer.toString();
    }

    private static String getReturnEmptyCode(Class<?> returnClass) {
        if (mappings.containsKey(returnClass)) {
            return "0";
        } else if (returnClass==void.class){
            return "";
        } else {
            return null;
        }
    }

    private static String toLowerFirstCase(String src) {
        char[] chars = src.toCharArray();
        chars[0] +=32;
        return String.valueOf(chars);
    }

    private static Map<Class,Class> mappings = new HashMap<Class, Class>();
    static {
        mappings.put(int.class,Integer.class);
    }
    private static String getCaseCode(String code,Class<?> returnClass){
        if (mappings.containsKey(returnClass)){
            return "(("+mappings.get(returnClass).getName()+")"+code+")."+
                    returnClass.getSimpleName()+"Value()";
        }else {
            return code;
        }
    }

    private static boolean hasReturnValue(Class<?> clazz){
        return clazz != void.class;
    }
}
