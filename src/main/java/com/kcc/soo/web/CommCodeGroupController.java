package com.kcc.soo.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kcc.soo.domain.CommCodeGroup;
import com.kcc.soo.service.CommCodeGroupService;

@Controller

@RequestMapping("/commcodegroup")
public class CommCodeGroupController {

  @Resource
  CommCodeGroupService commCodeGroupService;

  @GetMapping("form")
  public void form() throws Exception {
  }

  @GetMapping("list")
  public void findAll(Model model) throws Exception {
    List<CommCodeGroup> commCodeGroups = commCodeGroupService.list();
    System.out.println("Controller");
    model.addAttribute("commCodeGroups", commCodeGroups);
  }

}
