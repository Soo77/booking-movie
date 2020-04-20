package com.kcc.soo.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.kcc.soo.domain.CommCodeGroup;

	
public interface CommCodeGroupDao {

	int insert(CommCodeGroup commCodeGroup) throws Exception;
	List<CommCodeGroup> findAll() throws Exception;
	CommCodeGroup findBy(String groupcodeId) throws Exception;
	int update(CommCodeGroup commCodeGroup) throws Exception;
	int delete(String groupcodeId) throws Exception;
	
}
