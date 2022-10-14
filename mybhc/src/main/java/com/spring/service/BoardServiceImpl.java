package com.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybhc.dao.BhcBoardDAO;
import com.mybhc.vo.BhcBoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BhcBoardDAO boardDao;
	
	
	/*
	 * 게시글 삭제 처리
	 */
	@Override
	public int getDelete(String bid) {
		return boardDao.delete(bid);
	}
	
	/*
	 * 게시글 수정 처리
	 */
//	@Override
	public int getUpdate(BhcBoardVO vo) {
		return boardDao.update(vo);
	}
	
	/*
	 * 게시글 조회수 업데이트
	 */
	@Override
	public void getUpdateHits(String bid) {
		boardDao.updateHits(bid);
	}
	
	
	/*
	 * 게시글 글쓰기
	 */
	@Override
	public int getWriteResult(BhcBoardVO vo) {
		return boardDao.insert(vo);
	}
	
	
	/*
	 * 게시글 상세보기
	 */
	@Override
	public BhcBoardVO getContent(String bid) {
		return boardDao.select(bid);
	}
	
	
	
	
	/*
	 * 게시글 전체 로우
     */
	@Override
	public int getTotalCount() {
		return boardDao.totalCount();

}
	
	/*
	 * 게시글 전체 리스트 
	 */
	@Override
	public ArrayList<BhcBoardVO> getList(int startCount, int endCount){

		ArrayList<BhcBoardVO> list = boardDao.select(startCount, endCount);

		return list;
	}


}
