package com.kcc.soo.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kcc.soo.dao.CommCodeGroupDao;
import com.kcc.soo.domain.CommCodeGroup;
import com.kcc.soo.service.CommCodeGroupService;


// CommCodeGroupService 기본 구현체 
//
@Service
public class DefaultCommCodeGroupService implements CommCodeGroupService {

  @Resource
  private CommCodeGroupDao commCodeGroupDao;

  @Override
  public void insert(CommCodeGroup commCodeGroup) throws Exception {
    commCodeGroupDao.insert(commCodeGroup);
  }

  @Override
  public void delete(String groupcodeId) throws Exception {
    if (commCodeGroupDao.delete(groupcodeId) == 0) {
      throw new Exception("해당 데이터가 없습니다.");
    }
  }

  @Override
  public CommCodeGroup get(String groupcodeId) throws Exception {
    CommCodeGroup commCodeGroup = commCodeGroupDao.findBy(groupcodeId);
    if (commCodeGroup == null) {
      throw new Exception("해당 번호의 데이터가 없습니다!");
    } 
    return commCodeGroup;
  }

  @Override
  public List<CommCodeGroup> list() throws Exception {
    return commCodeGroupDao.findAll();
  }

  @Override
  public void update(CommCodeGroup commCodeGroup) throws Exception {
    commCodeGroupDao.update(commCodeGroup);
  }
}