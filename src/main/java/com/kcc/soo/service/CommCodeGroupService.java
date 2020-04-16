package com.kcc.soo.service;

import java.util.List;
import com.kcc.soo.domain.CommCodeGroup;

public interface CommCodeGroupService {
	  List<CommCodeGroup> list() throws Exception;
	  CommCodeGroup get(String groupcodeId) throws Exception;
	  void insert(CommCodeGroup commCodeGroupService) throws Exception;
	  void update(CommCodeGroup commCodeGroupService) throws Exception;
	  void delete(String groupcodeId) throws Exception;
}
