package com.tpclaim.WeiXin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloAction extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {

		String user=req.getParameter("name");
		String paw=req.getParameter("pw");
		System.out.println("用户名："+user+"\n 密码:"+paw);
		ModelAndView v=new ModelAndView("hello");
		v.addObject("message","欢迎："+user+"到来！");
		return v;
	}

}
