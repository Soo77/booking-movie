package com.kcc.soo.web;

import com.kcc.soo.domain.Member;
import com.kcc.soo.service.impl.MemberService;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

  @Resource
  MemberService memberService;

  @GetMapping("form")
  public void form() throws Exception {
  }
  
  @GetMapping("db")
  public void db() throws Exception {
  }

  @GetMapping("list")
  public void findAll(Model model, Member memberVO) throws Exception {
	  System.out.println("컨트롤러 들어감");
    List<Member> members = memberService.findAll();
    System.out.println("컨트롤러임 서비스 찾아서 나옴");
    model.addAttribute("members", members);
    System.out.println("컨트롤러 완료!");
  }

}
