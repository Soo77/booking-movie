package com.kcc.soo.dao;

import java.util.List;

import com.kcc.soo.domain.Member;

public interface MemberDao {

	List<Member> findAll() throws Exception;
}
