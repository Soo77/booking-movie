package com.kcc.soo.dao;

import java.util.List;
import com.kcc.soo.domain.CommCodeGroup;

// DAO 사용 규칙을 정의한다.
public interface CommCodeGroupDao {
  int insert(CommCodeGroup commCodeGroup) throws Exception;
  List<CommCodeGroup> findAll() throws Exception;
  CommCodeGroup findBy(String groupcodeId) throws Exception;
  int update(CommCodeGroup commCodeGroup) throws Exception;
  int delete(String groupcodeId) throws Exception;
}