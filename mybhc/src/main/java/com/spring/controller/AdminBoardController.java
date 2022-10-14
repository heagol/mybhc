package com.spring.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mybhc.vo.BhcNoticeVO;
import com.spring.service.NoticeServiceImpl;
import com.spring.service.PageServiceImpl;


@Controller
public class AdminBoardController {

	@Autowired
	private NoticeServiceImpl noticeService;
	
	@Autowired
	private PageServiceImpl pageService;
	
		@RequestMapping(value="/admin_board_product.do" , method=RequestMethod.GET)
		public String admin_board_product() {
			
			return "/admin/admin_board/admin_board_product";
		}
		
		@RequestMapping(value="/admin_notice_list.do" , method=RequestMethod.GET)
		public ModelAndView admin_notice_list(String rpage) {
			ModelAndView mv = new ModelAndView();
			
			Map<String,Integer> param = pageService.getPageResult(rpage,"notice",noticeService);
			ArrayList<BhcNoticeVO> list = noticeService.getList(param.get("startCount"),param.get("endCount")); 
		
			
			mv.addObject("list", list);
			mv.addObject("dbCount", param.get("dbCount"));
			mv.addObject("pageSize", param.get("pageSize"));
			mv.addObject("rpage", param.get("rpage"));
			mv.setViewName("/admin/admin_board/admin_notice_list");
			return mv;
		}

		@RequestMapping(value="/admin_notice_content.do" , method=RequestMethod.GET)
		public String admin_notice_content() {
			 
			return "/admin/admin_board/admin_notice_content";
		}

}
