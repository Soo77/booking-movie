package com.kcc.soo.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
  
  @PostMapping("add")
  public String add(HttpServletRequest request, CommCodeGroup commCodeGroup, Model model) throws Exception {
	  String clientIp = getRemoteAddr(request);
	  commCodeGroup.setRegId("shimsh");
	  commCodeGroup.setRegIp(clientIp);
	  commCodeGroup.setModId("shimsh");
	  commCodeGroup.setModIp(clientIp);

	  commCodeGroupService.insert(commCodeGroup);
	  return "redirect:list";
  }
  
	public static String getRemoteAddr(HttpServletRequest request) {
        String ip = null;
        ip = request.getHeader("X-Forwarded-For");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
            ip = request.getHeader("Proxy-Client-IP"); 
        } 
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
            ip = request.getHeader("WL-Proxy-Client-IP"); 
        } 
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
            ip = request.getHeader("HTTP_CLIENT_IP"); 
        } 
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
            ip = request.getHeader("HTTP_X_FORWARDED_FOR"); 
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
            ip = request.getHeader("X-Real-IP"); 
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
            ip = request.getHeader("X-RealIP"); 
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
            ip = request.getHeader("REMOTE_ADDR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
            ip = request.getRemoteAddr(); 
        }
        return ip;
    }
}
