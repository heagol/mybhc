package com.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybhc.dao.BhcAdminMenuDAO;
import com.mybhc.vo.BhcAdminMenuVO;

@Service
public class AdminMenuServiceImpl implements AdminMenuService{
	
	@Autowired
	private BhcAdminMenuDAO  menuDao;
	
	/**
	 * 
	 */
	@Override
	public int getUpdate(BhcAdminMenuVO vo) {
		return menuDao.update(vo);
	}
	
	/**
	 * 
	 */
	@Override
	public BhcAdminMenuVO getContent(String mid) {
		return menuDao.select(mid);
	}
	/**
	 * 
	 */
	@Override
	public ArrayList<BhcAdminMenuVO> getList(int startCount, int endCount) {
		return menuDao.select(startCount,endCount);
	}
	
	/**
	 * 
	 */
	@Override
	public int getWriteResult(BhcAdminMenuVO vo) {
		return menuDao.insert(vo);
	}
	

}
