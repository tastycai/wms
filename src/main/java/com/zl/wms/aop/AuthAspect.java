package com.zl.wms.aop;

import com.zl.wms.constant.AuthConstant;
import com.zl.wms.util.ServletUtil;
import com.zl.wms.vo.auth.SessionUserVO;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Aspect
@Component
public class AuthAspect {

    // 初始化信息

    @Around("execution(* com.zl.wms.controller..*(..))")
    public Object arroundMethod(ProceedingJoinPoint pjp){

        // request获取url和客户
        HttpServletRequest request = ServletUtil.getRequest();

        HttpSession session = request.getSession();

        String url = request.getRequestURL().toString();

        SessionUserVO userVO = (SessionUserVO)session.getAttribute(AuthConstant.SESSION_USER);

        /*if (userVO == null){

            return "未登录！";
        }

        // 查询客户拥有的资源权限
        if (!userVO.getUrlList().contains(url)){

            return "无权限！";
        }*/

        try {

            return pjp.proceed();

        }catch (Throwable e){

            e.printStackTrace();
        }

        return null;
    }
}
