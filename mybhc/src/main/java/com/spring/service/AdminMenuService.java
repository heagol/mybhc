package com.spring.service;



import java.util.ArrayList;

import com.mybhc.vo.BhcAdminMenuVO;

public interface AdminMenuService {
	int getWriteResult(BhcAdminMenuVO vo);		
	ArrayList<BhcAdminMenuVO> getList(int startCount, int endCount);
	BhcAdminMenuVO getContent(String mid);
	int getUpdate(BhcAdminMenuVO vo);
}
