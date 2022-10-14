package com.spring.controller;


import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mybhc.vo.BhcBoardVO;
import com.spring.service.BoardServiceImpl;
import com.spring.service.FileServiceImpl;
import com.spring.service.PageServiceImpl;


@Controller
public class BoardController {
	
	
	@Autowired
	private BoardServiceImpl boardService;


	@Autowired
	private PageServiceImpl pageService;
	
	@Autowired
	private FileServiceImpl fileService;
	
	
	/**
	 * board_update.do : �Խ��� ���� ȭ��
	 */
	@RequestMapping(value="/board_update.do", method=RequestMethod.GET)
	public ModelAndView board_update(String bid) {
		ModelAndView mv = new ModelAndView();
		
		BhcBoardVO vo = boardService.getContent(bid);
		
		mv.addObject("vo", vo);
		mv.setViewName("/board/board_update");
		
		return mv;
	
	}
	
	
	
	
	/**
	 * board_update_check.do : �Խ��� ���� ó��
	 */
	@RequestMapping(value="/board_update_check.do", method=RequestMethod.POST)
	public ModelAndView board_update_check(BhcBoardVO vo, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		//���� ������ �����ϴ� ��� �̸��� ������ ����
		String old_filename = vo.getBsfile();
		
		//������ ���ο� ������ �����ߴ��� Ȯ��
		vo = fileService.update_fileCheck(vo); 
		int result = boardService.getUpdate(vo);
		
		if(result == 1){
			//���ο� ������ upload ������ ����
			fileService.update_filesave(vo, request, old_filename);
			mv.setViewName("redirect:/board_list.do");
		}else{
			mv.setViewName("error_page");
		}
		
		return mv;
	}
	
	
	
	
	
	/**
	 * board_delete.do : �Խ��� ���� ȭ��
	 */
	@RequestMapping(value="/board_delete.do", method=RequestMethod.GET)
	public ModelAndView board_delete(String bid) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("bid", bid);
		mv.setViewName("/board/board_delete");
		
		return mv;
	}
	
	
	/**
	 * board_delete_check.do : �Խ��� ���� ó��
	 */
	@RequestMapping(value="/board_delete_check.do", method=RequestMethod.POST)
	public ModelAndView board_delete_check(String bid, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		
		//������ bid �࿡ bsfile�� �̸��� �������� ���� dao.select(bid) �޼ҵ� ȣ��--> upload������ ���� ���� Ȯ��
		BhcBoardVO vo = boardService.getContent(bid); //dao.select(bid) �޼ҵ�� delete �޼ҵ� ȣ�� ���� ����Ǿ����!! 
		int result = boardService.getDelete(bid);
		
		if(result == 1){
			//�Խñ� ������ upload ������ �����ϴ� ������ �ִٸ� �����ϱ�
			fileService.fileDelete(vo, request);
			mv.setViewName("redirect:/board_list.do");
		}else{
			mv.setViewName("error_page");
		}
		
		return mv;
	}
	
	
	
	/**
	 * board_content.do : �Խ��� �� ����
	 */
	@RequestMapping(value="/board_content.do", method=RequestMethod.GET)
	public ModelAndView board_content(String bid) {
		ModelAndView mv = new ModelAndView();

		//String bid = request.getParameter("bid");
		BhcBoardVO vo = boardService.getContent(bid);
		if(vo != null){
			boardService.getUpdateHits(bid);
		}

		mv.addObject("vo", vo);
		mv.setViewName("/board/board_content");

		return mv;
	}
	
	
	/**
	 * board_write_check.do : �Խ��� �۾��� ó��
	 */
	@RequestMapping(value="/board_write_check.do", method=RequestMethod.POST)
	public ModelAndView board_write_check(BhcBoardVO vo, HttpServletRequest request)
			throws Exception {
		
		ModelAndView mv = new ModelAndView();

		//1.����üũ �� bfile,bsfile�� ����Ǵ� �̸� ����
		vo = fileService.fileCheck(vo);
		int result = boardService.getWriteResult(vo);
		
        //2.upload ������ bsfile ������ ���� ���� ���ε� ó��
		if(result == 1){
	/*	if(result == 1){
			if(!vo.getFile1().getOriginalFilename().equals("")) {
				String path = request.getSession().getServletContext().getRealPath("/");
				path += "\\resources\\upload\\";

				File file = new File(path+vo.getBsfile());
				vo.getFile1().transferTo(file);
			}*/
		   fileService.fileSave(vo,request);

			mv.setViewName("redirect:/board_list.do"); //DB������ Controller���� �����ϹǷ�, ���ο� ������ ����!!
		}else{
			mv.setViewName("error_page");
		}

		return mv;
	}

	
	
	
	/**
	 * board_write.do : �Խ��� �۾��� ȭ��
	 */
	@RequestMapping(value="/board_write.do", method=RequestMethod.GET)
	public String board_write() {
		return "/board/board_write";
	}
	
	
	/**
	 * board_list.do : �Խ��� ��ü ����Ʈ 
	 */
	@RequestMapping(value="/board_list.do", method=RequestMethod.GET)
	public ModelAndView board_list(String rpage) {
		ModelAndView mv = new ModelAndView();

		Map<String,Integer> param = pageService.getPageResult(rpage, "board", boardService);
		ArrayList<BhcBoardVO> list = boardService.getList(param.get("startCount"), param.get("endCount"));

		mv.addObject("list", list);
		mv.addObject("dbCount", param.get("dbCount"));
		mv.addObject("pageSize", param.get("pageSize"));
		mv.addObject("rpage", param.get("rpage"));
		mv.setViewName("/board/board_list");


		return mv;
	}

}
