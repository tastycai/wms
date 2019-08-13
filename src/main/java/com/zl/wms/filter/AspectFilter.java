package com.zl.wms.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class AspectFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        // 获取资源信息

        //


    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // 进行资源拦截
        System.out.println("进入了Filter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
