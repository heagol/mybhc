package com.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybhc.dao.BhcNoticeDAO;
import com.mybhc.vo.BhcNoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService{
	@Autowired
	private BhcNoticeDAO noticeDao;
	
	/**
	 * 공지사항 전체 리스트
	 */
	@Override
	public ArrayList<BhcNoticeVO> getList(int startCount, int endCount){
		
		return noticeDao.select(startCount,endCount);
		
	}

	/*
	 * @Override public int getWriteResult(BhcNoticeVO vo) { // TODO Auto-generated
	 * method stub return 0; }//getWriteResult
	 */	
	  @Override 
	  public int getTotalCount() { 
		  // TODO Auto-generated method stub

		  return noticeDao.totalCount();
		  
		  
	}//getTotalCount
	 
	  @Override 
	  public void getUpdateHits(String nid) {
		  // TODO Auto-generated method stub
		   noticeDao.updateHits(nid);
		   
		   }//getUpdateHists

	/*
	 * @Override public BhcNoticeVO getContent(String nid) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * 
	 * 
	 * @Override public int getUpdate(CgvNoticeVO vo) { // TODO Auto-generated
	 * method stub return 0; }
	 * 
	 * @Override public int getDelete(String nid) { // TODO Auto-generated method
	 * stub return 0; }
	 * 
	 * @Override public CgvNoticeVO getContent(String nid) { // TODO Auto-generated
	 * method stub return null; }
	 */
}
