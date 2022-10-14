package com.spring.service;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.mybhc.vo.BhcAdminMenuVO;
import com.mybhc.vo.BhcBoardVO;

public class FileServiceImpl {
	
	
	
	
	
	
	
	
	
	
	/*
	 * ��ȭ��� : ��Ƽ���� ���� 
	 */
	
	/*
	public void multiFileSave(BhcMovieVO vo, HttpServletRequest request) throws Exception{
		//������ upload�� ����
		for(int i=0; i<vo.getFiles().length; i++) {
			CommonsMultipartFile file = vo.getFiles()[i];

			if(!file.getOriginalFilename().equals("")) {
				String path = request.getSession().getServletContext().getRealPath("/");
				path += "\\resources\\upload\\";

				File upload_file = new File(path+vo.getMsfiles().get(i));
				file.transferTo(upload_file);
			}
		}//for
	}
	
	
	/*
	 * ��ȭ���: ��Ƽ���� üũ 
	 */
	
	/*
	public CgvMovieVO multiFileCheck(CgvMovieVO vo) {
		
		for(CommonsMultipartFile file : vo.getFiles()) {
			if(!file.getOriginalFilename().equals("")) {
				UUID uuid = UUID.randomUUID();

				vo.getMfiles().add(file.getOriginalFilename());
				vo.getMsfiles().add(uuid+"_"+file.getOriginalFilename());
			}else {
				vo.getMfiles().add("");
				vo.getMsfiles().add("");

			}
		}
		vo.setMfile(vo.getMfiles().get(0));
		vo.setMfile2(vo.getMfiles().get(1));
		vo.setMsfile(vo.getMsfiles().get(0));
		vo.setMsfile2(vo.getMsfiles().get(1));

		return vo;
	}
	
	
	/*
	 *  ��������:�Խñ� ���� �� ������ �����ϸ� �����ϱ�
	 */
	
	/*
	public void fileDelete(BhcNoticeVO vo,HttpServletRequest request)throws Exception{
		if(vo.getNsfile() != null) {
			String path=request.getSession().getServletContext().getRealPath("/");
			path += "\\resources\\upload\\";

			File old_file = new File(path+vo.getNsfile());
			if(old_file.exists()) {
				old_file.delete();
			}
		}
		
	}
	*/
	
	/*
	 *  �Խ���: �Խñ� ���� �� ������ �����ϸ� �����ϱ�
	 */
	public void fileDelete(BhcBoardVO vo,HttpServletRequest request)throws Exception{
		if(vo.getBsfile() != null) {
			String path=request.getSession().getServletContext().getRealPath("/");
			path += "\\resources\\upload\\";

			File old_file = new File(path+vo.getBsfile());
			if(old_file.exists()) {
				old_file.delete();
			}
		}
		
	}
	
	
	/*
	 * ������ �ִ� ��� update�� �������� 
	 */
	
	/*
	public void update_filesave(CgvNoticeVO vo, HttpServletRequest request, String old_filename) throws Exception {
		
		//���ο� ������ upload ������ ����
		//���ο� ���ϼ���x,���� ����
		if(!vo.getFile1().getOriginalFilename().equals("")) { 
			String path = request.getSession().getServletContext().getRealPath("/");
			path += "\\resources\\upload\\";
			System.out.println(path);
			
			File file = new File(path+vo.getNsfile());
			vo.getFile1().transferTo(file);

			//���������� �ִ� ��쿡�� ���� ����
			File ofile = new File(path+old_filename);
			if(ofile.exists()) {
				ofile.delete();
			}
		}

	}
	
	/*
	 * ������ �ִ� ��� update�� �������� 
	 */
	public void update_filesave(BhcAdminMenuVO vo, HttpServletRequest request, String old_filename) throws Exception {
		
		//���ο� ������ upload ������ ����
		//���ο� ���ϼ���x,���� ����
		if(!vo.getFile1().getOriginalFilename().equals("")) { 
			String path = request.getSession().getServletContext().getRealPath("/");
			path += "\\resources\\upload\\";
			System.out.println(path);
			
			File file = new File(path+vo.getMsfile());
			vo.getFile1().transferTo(file);

			//���������� �ִ� ��쿡�� ���� ����
			File ofile = new File(path+old_filename);
			if(ofile.exists()) {
				ofile.delete();
			}
		}

	}
	
	/*
	 * ������ �ִ� ��� update�� �������� 
	 */
	public void update_filesave(BhcBoardVO vo, HttpServletRequest request, String old_filename) throws Exception {
		
		//���ο� ������ upload ������ ����
		//���ο� ���ϼ���x,���� ����
		if(!vo.getFile1().getOriginalFilename().equals("")) { 
			String path = request.getSession().getServletContext().getRealPath("/");
			path += "\\resources\\upload\\";
			System.out.println(path);
			
			File file = new File(path+vo.getBsfile());
			vo.getFile1().transferTo(file);

			//���������� �ִ� ��쿡�� ���� ����
			File ofile = new File(path+old_filename);
			if(ofile.exists()) {
				ofile.delete();
			}
		}

	}
	
	
	/*
	 * �������� :������ �ִ� ��� update�� ����üũ 
	 */
	/*
	public CgvNoticeVO update_fileCheck(CgvNoticeVO vo) {
		if(!vo.getFile1().getOriginalFilename().equals("")) { //���ο� ���ϼ���x,���� ����
			
			UUID uuid = UUID.randomUUID();

			vo.setNfile(vo.getFile1().getOriginalFilename());
			vo.setNsfile(uuid+"_"+vo.getFile1().getOriginalFilename());

		}
        return vo;
	}
	
	/*
	 * �Խ��� :������ �ִ� ��� update�� ����üũ 
	 */
	public BhcAdminMenuVO update_fileCheck(BhcAdminMenuVO vo) {
		if(vo.getFile1() != null) {
		if(!vo.getFile1().getOriginalFilename().equals("")) { //���ο� ���ϼ���x,���� ����
			
			UUID uuid = UUID.randomUUID();

			vo.setMfile(vo.getFile1().getOriginalFilename());
			vo.setMsfile(uuid+"_"+vo.getFile1().getOriginalFilename());
		}
		}
        return vo;
	}
	
	/*
	 * �Խ��� :������ �ִ� ��� update�� ����üũ 
	 */
	public BhcBoardVO update_fileCheck(BhcBoardVO vo) {
		if(vo.getFile1() != null) {
		if(!vo.getFile1().getOriginalFilename().equals("")) { //���ο� ���ϼ���x,���� ����
			
			UUID uuid = UUID.randomUUID();

			vo.setBfile(vo.getFile1().getOriginalFilename());
			vo.setBsfile(uuid+"_"+vo.getFile1().getOriginalFilename());
		}
		}
        return vo;
	}
	
	
	
	
	/*
	 * �������� : ���� upload ������ ���� 
	 */
	
	/*
	public void fileSave(CgvNoticeVO vo, HttpServletRequest request) throws Exception {
		 //2.upload ������ bsfile ������ ���� ���� ���ε� ó��
			if(!vo.getFile1().getOriginalFilename().equals("")) {
				String path = request.getSession().getServletContext().getRealPath("/");
				path += "\\resources\\upload\\";

				File file = new File(path+vo.getNsfile());
				vo.getFile1().transferTo(file);
			}
	}
	
	
	
	/*
	 * �Խ��� :���� upload ������ ���� 
	 */
	public void fileSave(BhcAdminMenuVO vo, HttpServletRequest request) throws Exception {
		 //2.upload ������ bsfile ������ ���� ���� ���ε� ó��
			if(!vo.getFile1().getOriginalFilename().equals("")) {
				String path = request.getSession().getServletContext().getRealPath("/");
				path += "\\resources\\upload\\";

				File file = new File(path+vo.getMsfile());
				vo.getFile1().transferTo(file);
			}
	}
	
	
	/*
	 * �Խ��� :���� upload ������ ���� 
	 */
	public void fileSave(BhcBoardVO vo, HttpServletRequest request) throws Exception {
		 //2.upload ������ bsfile ������ ���� ���� ���ε� ó��
			if(!vo.getFile1().getOriginalFilename().equals("")) {
				String path = request.getSession().getServletContext().getRealPath("/");
				path += "\\resources\\upload\\";

				File file = new File(path+vo.getBsfile());
				vo.getFile1().transferTo(file);
			}
	}
	
	
	
	
	/*
	 *
	 */
	public BhcAdminMenuVO fileCheck(BhcAdminMenuVO vo) {
		if(!vo.getFile1().getOriginalFilename().equals("")) {
			vo.setMfile("");
			vo.setMsfile("");
		}else {

			UUID uuid = UUID.randomUUID();
		    vo.setMfile(vo.getFile1().getOriginalFilename());
			vo.setMsfile(uuid+"_"+vo.getFile1().getOriginalFilename());			
		}
		return vo;
	}//fileCheck
	
	/*
	 * �Խ��� : ���� üũ �� bfile ,bsfile ����
	 */
	public BhcBoardVO fileCheck(BhcBoardVO vo) {
		//1.����üũ �� bfile,bsfile�� ����Ǵ� �̸� ����
		if(!vo.getFile1().getOriginalFilename().equals("")) {
			vo.setBfile("");
			vo.setBsfile("");
		}else {

			UUID uuid = UUID.randomUUID();
		    vo.setBfile(vo.getFile1().getOriginalFilename());
			vo.setBsfile(uuid+"_"+vo.getFile1().getOriginalFilename());			
		}
		return vo;
	}//fileCheck
	
}
