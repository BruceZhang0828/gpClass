package com.zhy.pattern.delegatePattern.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: Delegatepattern
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 14:49
 * @Version: 1.0
 **/
public class DispatcherServlet extends HttpServlet {

    /**
     * @Author zhy
     * @Description 模拟SpringMvc进行分发操作
     * @Date 15:15 2019/5/28
     * @Param [req, resp]
     * @return void
    **/
    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uri = req.getRequestURI();
        String id = req.getParameter("id");
        if ("getMemberById".equals(uri)){
            new MemberController().getMemberById(id);
        }else if ("getOrderById".equals(uri)){
            new OrderController().getOrderById(id);
        }else if ("layout".equals(uri)) {
            new SystemController().layout();
        }else {
            resp.getWriter().write("404 Not Found!!");
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


}
