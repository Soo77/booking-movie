package com.kcc.soo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kcc.soo.dao.MemberDao;
import com.kcc.soo.domain.Member;

@Service
public class MemberService {
	
	@Resource
	 private MemberDao memberDao;

  public List<Member> findAll() throws Exception {
	 System.out.println("서비스 들어감");
    return memberDao.findAll();
  }
}
