package egovframework.com.main.web;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import egovframework.com.main.service.MainService;

@Controller
public class MainController {
	@Resource(name="MainService")
	private MainService mainService;
	
	@RequestMapping("/main.do")
	public String main() {
		return "main/main";
	}

	@RequestMapping("/login.do")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/join.do")
	public String join() {
		return "join";
	}
	
	@RequestMapping("/member/idChk.do")
	public ModelAndView idChk(@RequestParam HashMap<String,Object> paramMap) {
		ModelAndView mv = new ModelAndView();
		
		int idChk = 0;
		idChk = mainService.selectIdChk(paramMap);
		mv.addObject("idChk", idChk);
		mv.setViewName("jsonView");
		return mv;
	}
	
	@RequestMapping("/member/insertMember.do")
	public ModelAndView insertMember(@RequestParam HashMap<String,Object> paramMap) {
		ModelAndView mv = new ModelAndView();
		
		
		mv.setViewName("jsonView");
		return mv;
	}
}
