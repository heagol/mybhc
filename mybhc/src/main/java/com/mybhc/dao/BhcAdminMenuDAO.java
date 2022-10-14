package com.mybhc.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mybhc.vo.BhcAdminMenuVO;

@Repository
public class BhcAdminMenuDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	/**
	 * update : �������� ������Ʈ -mapper.notice.update
	 */
	public int update(BhcAdminMenuVO vo) {
		return sqlSession.update("mapper.admin.update", vo);
	}
	
	/**
	 * select :
	 */
	public BhcAdminMenuVO select(String mid) {
		return sqlSession.selectOne("mapper.admin.content", mid);
	}
	
	
	
	/**
	 * select : mapper.admin.
	 */
	public ArrayList<BhcAdminMenuVO> select(int startCount, int endCount) {
		Map<String,Integer> param = new HashMap<String,Integer>();
		param.put("start", startCount);
		param.put("end", endCount);
		
		List<BhcAdminMenuVO> list = sqlSession.selectList("mapper.admin.list", param);
		
		
		return (ArrayList<BhcAdminMenuVO>)list;
	}
	
	/**
	 * insert : mapper.admin.insert
	 */
	public int insert(BhcAdminMenuVO vo) {
		return sqlSession.insert("mapper.admin.insert", vo);
	}
}
