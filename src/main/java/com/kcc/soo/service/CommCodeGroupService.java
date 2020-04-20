package com.kcc.soo.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.kcc.soo.domain.CommCodeGroup;

@Service
public interface CommCodeGroupService {

	List<CommCodeGroup> list() throws Exception;
	void insert(CommCodeGroup commCodeGroup) throws Exception;
	CommCodeGroup get(String groupcodeId) throws Exception;
	void update(CommCodeGroup commCodeGroup) throws Exception;
	void delete(String groupcodeId) throws Exception;
}
