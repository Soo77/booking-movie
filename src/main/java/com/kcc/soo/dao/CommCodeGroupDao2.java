package com.kcc.soo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kcc.soo.domain.CommCodeGroup;

public class CommCodeGroupDao2 {

	  Connection con;

	  public CommCodeGroupDao2() throws SQLException {
	  }

	  public List<CommCodeGroup> findAll() throws Exception {
		  System.out.println("hi");
	    try (PreparedStatement pstmt = con.prepareStatement("select * from comm_code_group order by groupcode_id desc");
	        ResultSet rs = pstmt.executeQuery()) {

	      List<CommCodeGroup> list = new ArrayList<>();

	      while (rs.next()) {
	    	  CommCodeGroup commCodeGroupVO = new CommCodeGroup();

	    	  commCodeGroupVO.setGroupcodeId(rs.getString("groupcodeId"));
	    	  commCodeGroupVO.setGroupcodeName(rs.getString("groupcodeName"));
	    	  commCodeGroupVO.setRegId(rs.getString("regId"));
	    	  commCodeGroupVO.setRegDt(rs.getTimestamp("regDt"));
	    	  commCodeGroupVO.setRegIp(rs.getString("regIp"));
	    	  commCodeGroupVO.setModId(rs.getString("modId"));
	    	  commCodeGroupVO.setModDt(rs.getTimestamp("modDt"));
	    	  commCodeGroupVO.setModIp(rs.getString("modIp"));

	        list.add(commCodeGroupVO);
	        pstmt.executeUpdate();
	      }
	      System.out.println(list);
	      System.out.println("저기요;");
	      return list;
	    }
	  }
}
