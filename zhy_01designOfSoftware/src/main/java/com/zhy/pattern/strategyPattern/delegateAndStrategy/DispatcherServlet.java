package com.zhy.pattern.strategyPattern.delegateAndStrategy;

import com.zhy.pattern.delegatePattern.mvc.MemberController;
import com.zhy.pattern.delegatePattern.mvc.OrderController;
import com.zhy.pattern.delegatePattern.mvc.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: Delegatepattern
 * @Description: 对委托模式中的SpringMvc加上策略模式 进行优化
 * @auther: zhy
 * @Date: 2019/5/28 14:49
 * @Version: 1.0
 **/
public class DispatcherServlet extends HttpServlet {

    private List<Handler> handlerMapping = new ArrayList<>();

    @Override
    public void init(){
        Class<MemberController> memberControllerClass = MemberController.class;
        try {
            handlerMapping.add(new Handler().setController(memberControllerClass.newInstance())
                    .setMethod(memberControllerClass.getMethod("getMemberById", new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //1.获取用户请求的url
        //如果按照javaEE标准 每个url对应一个Serlvet,url由浏览器输入
        String uri = req.getRequestURI();
        //2.Servlet拿到url以后,要做权衡(要做判断,要做选择)
        //根据用户请求的URl,去找这个url对应的某个java类的方法

        //3.通过拿到的url以后,要做权衡(要做判断,要做选择)
        // 根据用户的请求的url,去找到这个url对应的某个java类的方法

        //通过拿到url去handlerMapping
        Handler handler = null;
        for (Handler h:handlerMapping){
            if (uri.equals(h.getUrl())) {
                handler = h;
                break;
            }
        }
        //4.将具体的任务分发给Method(通过反射调用其对应的方法)
        Object o = null;
        try {
             o = handler.getMethod().invoke(handler.getController(),req.getParameter("id"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            doDispatch(req, resp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class Handler{
        private Object controller;
        private String url;
        private Method method;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }
    }


}
