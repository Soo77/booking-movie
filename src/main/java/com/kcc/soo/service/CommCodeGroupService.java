package com.kcc.soo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kcc.soo.domain.CommCodeGroup;

@Service
public interface CommCodeGroupService {

	List<CommCodeGroup> list() throws Exception;
//	void insert(CommCodeGroup commCodeGroup) throws Exception;
//	CommCodeGroup get(String commCodeGroupId) throws Exception;
//	void update(CommCodeGroup commCodeGroup) throws Exception;
//	void delete(String commCodeGroupId) throws Exception;
}