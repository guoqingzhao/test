package com.tpclaim.WeiXin.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class LoginAct extends AbstractController{
	public static Log log=LogFactory.getLog(LoginAct.class);  
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		String n=req.getParameter("name");
		ModelAndView m=new ModelAndView("successorfail");
		if(n.equals("uu")){
			System.out.println("ok");
			log.debug("正确人员");
			m.addObject("message","欢迎登陆"+n);
		}else{
			m.addObject("message","请重新输入账户密码！");
		}
		
		return m;
	}

}
