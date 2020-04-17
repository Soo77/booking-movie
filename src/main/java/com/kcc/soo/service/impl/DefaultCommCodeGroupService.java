package com.kcc.soo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kcc.soo.dao.CommCodeGroupDao;
import com.kcc.soo.domain.CommCodeGroup;
import com.kcc.soo.service.CommCodeGroupService;

@Service
public class DefaultCommCodeGroupService implements CommCodeGroupService{

 
	@Resource
	private CommCodeGroupDao commCodeGroupDao;
//	private CommCodeGroupDao2 commCodeGroupDao;
	
	@Override
	public List<CommCodeGroup> list() throws Exception {
		System.out.println("Service");
		return commCodeGroupDao.findAll();
	}
//
//	@Override
//	public void insert(CommCodeGroup commCodeGroup) throws Exception {
//		commCodeGroupDao.insert(commCodeGroup);
//	}
//
//	@Override
//	public CommCodeGroup get(String commCodeGroupId) throws Exception {
//		CommCodeGroup commCodeGroup = commCodeGroupDao.findBy(commCodeGroupId);
//		if (commCodeGroup == null) {
//			throw new Exception("해당 번호의 데이터가 없습니다.");
//		}
//		return commCodeGroup;
//	}
//
//	@Override
//	public void update(CommCodeGroup commCodeGroup) throws Exception {
//		commCodeGroupDao.update(commCodeGroup);
//	}
//
//	@Override
//	public void delete(String commCodeGroupId) throws Exception {
//		if (commCodeGroupDao.delete(commCodeGroupId) == 0) {
//			throw new Exception("해당 데이터가 없습니다!");
//		}
//	}
 
}
