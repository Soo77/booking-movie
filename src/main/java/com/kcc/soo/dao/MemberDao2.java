package com.kcc.soo.dao;

import com.kcc.soo.domain.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDao2 {

  Connection con;

  public List<Member> findAll() throws Exception {
	  System.out.println("DAO 들어옴?");
    try (PreparedStatement pstmt = con.prepareStatement("select * from member order by id desc");
        ResultSet rs = pstmt.executeQuery()) {
    	System.out.println("DAO 트라이 들어옴?");

      List<Member> list = new ArrayList<>();

      while (rs.next()) {
        Member memberVO = new Member();

        memberVO.setId(rs.getInt("id"));
        memberVO.setName(rs.getString("name"));
        memberVO.setAge(rs.getString("age"));
        memberVO.setAddress(rs.getString("address"));

        list.add(memberVO);
        pstmt.executeUpdate();
      }
      System.out.println(list);
      return list;
    }
  }
}
