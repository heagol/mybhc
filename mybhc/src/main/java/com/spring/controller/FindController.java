package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mybhc.vo.BhcMemberVO;
import com.spring.service.MemberServiceImpl;

@Controller
public class FindController {
	
	@Autowired
	private MemberServiceImpl memberService;
	
	
	/**
	 * findid.do : ¾ÆÀÌµðÃ£±â Æû Æû
	 */
	@RequestMapping(value="/findid.do", method=RequestMethod.GET)
	public String findid() {
		return "/find/findid";
	}
}
