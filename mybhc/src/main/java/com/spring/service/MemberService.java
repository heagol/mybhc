package com.spring.service;

import java.util.ArrayList;

import com.mybhc.vo.BhcMemberVO;
import com.mybhc.vo.SessionVO;

public interface MemberService {	
	SessionVO getLoginResult(BhcMemberVO vo);  //로그인 처리 메소드
	int getJoinResult(BhcMemberVO vo);	 //회원가입 처리 메소드
	int getTotalCount();	//전체 회원수 
	ArrayList<BhcMemberVO> getMemberList(int startCount, int endCount);  //회원 전체 리스트
	BhcMemberVO getMemberContent(String id);	//회원 상세정보
	
}
