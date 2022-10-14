package com.spring.service;

import java.util.ArrayList;

import com.mybhc.vo.BhcBoardVO;


public interface BoardService {
	//전체 회원수
	int getTotalCount();


	//회원 전체 리스트
	ArrayList<BhcBoardVO> getList(int startCount, int endCount);
	
	//게시글 글쓰기
	int getWriteResult(BhcBoardVO vo);
	
	
	//게시글 상세보기
	BhcBoardVO getContent(String bid);
	
	//게시글 조회수 업데이트
	void getUpdateHits(String bid);
	
	//게시글 수정 처리
	int getUpdate(BhcBoardVO vo);
	
	//게시글 삭제 처리
	int getDelete(String bid);

}
