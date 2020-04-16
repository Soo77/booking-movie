package com.kcc.soo.web;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kcc.soo.domain.CommCodeGroup;
import com.kcc.soo.service.CommCodeGroupService;

@Controller
@RequestMapping("/commCodeGroup")
public class CommCodeGroupController {

  @Resource
  private CommCodeGroupService commCodeGroupService;

  @GetMapping("form")
  public void form() {
  }
  
  @PostMapping("add")
  public String add(CommCodeGroup commCodeGroup) throws Exception {
    commCodeGroupService.insert(commCodeGroup);
    return "redirect:list";
  }
  
  @GetMapping("delete")
  public String delete(String groupcodeId) throws Exception {
    commCodeGroupService.delete(groupcodeId);
    return "redirect:list";
  }
  
  @GetMapping("detail")
  public void detail(Model model, String groupcodeId) 
      throws Exception {
    CommCodeGroup commCodeGroup = commCodeGroupService.get(groupcodeId);
    model.addAttribute("commCodeGroup", commCodeGroup); 
  }
  
  @GetMapping("list")
  public void list(Model model) 
      throws Exception {
    List<CommCodeGroup> commCodeGroups = commCodeGroupService.list();
    model.addAttribute("commCodeGroups", commCodeGroups);
  }
  
  @PostMapping("update")
  public String update(CommCodeGroup commCodeGroup) 
      throws Exception {
    commCodeGroupService.update(commCodeGroup);
    return "redirect:list";
  }

}