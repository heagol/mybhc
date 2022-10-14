package com.spring.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mybhc.vo.BhcAdminMenuVO;
import com.spring.service.AdminMenuServiceImpl;
import com.spring.service.FileServiceImpl;
import com.spring.service.PageServiceImpl;

@Controller
public class AdminController {
	@Autowired
	private AdminMenuServiceImpl adminMenuService;
	
	@Autowired
	private PageServiceImpl  pageService;
	
	@Autowired
	private FileServiceImpl  fileService;
	
	/**
	 * admin_stock_update.do : �������� ����ȭ�� 
	 */
	@RequestMapping(value="/admin_stock_update.do", method=RequestMethod.GET)
	public ModelAndView admin_stock_update(String mid) {
		ModelAndView mv = new ModelAndView();
		
		BhcAdminMenuVO vo = adminMenuService.getContent(mid);
		
		mv.addObject("vo", vo);
		mv.setViewName("/admin/admin_stock/admin_stock_update");
		
		return mv;
	}
	
	
	/**
	 * admin_stock_update_check.do 
	 */
	@RequestMapping(value="/admin_stock_update_check.do", method=RequestMethod.POST)
	public ModelAndView admin_stock_update_check(BhcAdminMenuVO vo, HttpServletRequest request)
																throws Exception {
		ModelAndView mv = new ModelAndView();

		String old_filename = vo.getMsfile();
		
		vo = fileService.update_fileCheck(vo);
		int result = adminMenuService.getUpdate(vo);
		
		if(result == 1){
			fileService.update_filesave(vo, request, old_filename);
			mv.setViewName("/admin/admin_stock/admin_stock_list.do");
		}else{

			mv.setViewName("error_page");
		}		
		
		return mv;
	}
	
	
	/**
	 * admin_stock_content: 메뉴 추가
	 */
	@RequestMapping(value="/admin_stock_content.do", method=RequestMethod.GET)
	public ModelAndView admin_stock_content(String mid) {
		 ModelAndView mv = new ModelAndView();
		 
		 BhcAdminMenuVO vo = adminMenuService.getContent(mid);
		
		 mv.addObject("vo", vo);
		 mv.setViewName("/admin/admin_stock/admin_stock_content");
		 
		 
		 return mv;
	}
	/**
	 * admin_add_check.do : 메뉴 추가
	 */
	@RequestMapping(value="/admin_add_check.do", method=RequestMethod.POST)
	public ModelAndView admin_add_check(BhcAdminMenuVO vo) throws Exception {
		
		 ModelAndView mv = new ModelAndView();
		 
		 int result = adminMenuService.getWriteResult(vo);
		
		 if(result == 1){ 
		 mv.setViewName("redirect:/admin.do"); 
		 }else{
		 mv.setViewName("error_page"); 
		 }
		
		
		
		return mv;
	}
	
	/**
	 * admin_add_list.do : 관리자 재고관리 페이지
	 */
	@RequestMapping(value="/admin_add_list.do", method=RequestMethod.GET)
	public String admin_add_list() {
		
		return "/admin/admin_add/admin_add_list";
	}
	
	
	/**
	 * admin_stock_list.do : 관리자 재고관리 페이지
	 */
	@RequestMapping(value="/admin_stock_list.do", method=RequestMethod.GET)
	public ModelAndView admin_stock_list(String rpage) {
		
		ModelAndView mv = new ModelAndView();
		Map<String, Integer> param = pageService.getPageResult(rpage, "adminMenu", adminMenuService);
		ArrayList<BhcAdminMenuVO> list = adminMenuService.getList(param.get("startCount"),param.get("endCount"));
		
		 
		mv.addObject("list",list);
		mv.addObject("dbCount", param.get("dbCount"));
		mv.addObject("rpage", param.get("rpage"));
		mv.addObject("pageSize", param.get("pageSize"));
		mv.setViewName("/admin/admin_stock/admin_stock_list"); 
		
		return mv;
	}
	
	/**
	 * admin.do : 관리자 메인페이지
	 */
	@RequestMapping(value="/admin.do", method=RequestMethod.GET)
	public String admin() {
		return "/admin/admin";
	}
	
}
