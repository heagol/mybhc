package com.mybhc.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.mybhc.vo.BhcNoticeVO;



public class BhcNoticeDAO{


	@Autowired
	private SqlSessionTemplate sqlSession;
	private String namespace = "mapper.notice";



	/**
	 * select : ��ü �������� ����Ʈ
	 * mapper.board.list 
	 */
	public ArrayList<BhcNoticeVO> select(int startCount, int endCount){
		//�Ķ���͸� Map���� �����ϱ�
		Map<String,Integer> param = new HashMap<String,Integer>();
		param.put("start",startCount);
		param.put("end",endCount);

		List<BhcNoticeVO> list = sqlSession.selectList(namespace + ".list",param);

		return (ArrayList<BhcNoticeVO>)list;
	}//select


	/**
	 * insert : �Խñ� ��� - mapper.board.insert
	 */

	public int insert(BhcNoticeVO vo) {


		return sqlSession.insert("mapper.notice.insert",vo); }


	/**
	 * totalCount : ��ü �ο�� ���
	 */
	public int totalCount() {
		return sqlSession.selectOne(namespace + ".totalcount");

	}

	/**
	 * delete : �Խñ� ����
	 */
	/*
	 * public int delete(String bid) { return 0;
	 * 
	 * }
	 */


	/**
	 * update : �Խñ� ���� 
	 */
	/*
	 * public int update(BhcNoticeVO vo) { return 0;
	 * 
	 * }
	 */

	/**
	 * updateHits : ��ȸ�� ������Ʈ
	 */

	public int updateHits(String nid) { 
		return sqlSession.update(namespace +".updatehits",nid);
	}


	/**
	 * select : �Խñ� �� ���� -mapper.board.content
	 */
	
	  public BhcNoticeVO select(String nid) { 
		  return sqlSession.selectOne(namespace +".select",nid); 
		  }
	







} // BhcNoticeDAO
