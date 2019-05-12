package com.zhy.pattern.proxyPattern.dynamicproxy.gpJdkProxy;

import java.io.*;

/**
 * @ClassName: GPClassLoader
 * @Description: 类加载器
 * @auther: zhy
 * @Date: 2019/5/5 11:47
 * @Version: 1.0
 **/
public class GPClassLoader extends ClassLoader{
    private File classPathFile;

    public GPClassLoader(){
        String classPath = GPClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }


    @Override
    protected Class<?> findClass(String name){
        String className = GPClassLoader.class.getPackage().getName() + "." + name;

        if (classPathFile !=null) {
            File classFile = new File(classPathFile, name.replace("\\.", "/") + ".class");
            if (classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;

                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff))!=-1){
                        out.write(buff,0,len);
                    }
                    return defineClass(className,out.toByteArray(),0,out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    if (null !=in){
                        if (null != in){
                            try {
                                in.close();

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        if (null!=out){

                            try {
                                out.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }

        return null;
    }
}
