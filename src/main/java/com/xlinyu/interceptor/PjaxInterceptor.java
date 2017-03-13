package com.xlinyu.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class PjaxInterceptor extends HandlerInterceptorAdapter {

//	@Value("${X-PJAX-Version}")
//	private String X_PJAX_VERSION;
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if(modelAndView != null){
			boolean isPajx = Boolean.parseBoolean(request.getHeader("X-PJAX"));// 值为true表示pjax请求，这是重点
	        ModelMap model = modelAndView.getModelMap();
	        if (isPajx) {
//	        	System.out.println(model.get("title"));
//	        	System.out.println("is pjax request.");
//	        	model.addAttribute("layout", "layout_pjax.vm");// 指定pjax请求时使用的模版
	            // 在vm页面中通过 #set($layout = 'xxx.vm') 的方式指定模版
//	            response.setHeader("X-PJAX-Version", X_PJAX_VERSION);// 响应内容的pjax版本，有新模版发布时，通过配置文件修改版本来强制页面刷新
	        	model.addAttribute("uri", "");
	        }else{
	        	String uri = request.getRequestURI();
	        	System.out.println(uri);
	        	if(!uri.equals("/account/login") && !uri.equals("/account/logout")){
	        		model.addAttribute("uri", uri);
	        	}
	        }
		}
	}
	
}
