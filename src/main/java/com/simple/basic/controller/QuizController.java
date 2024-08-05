package com.simple.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.basic.command.QuizVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	//화면요청
	@RequestMapping("/quiz01")
	public String quiz01() {
		return "quiz/quiz01";		
	}
	
	//폼요청
	@RequestMapping("/join")
	public String join( @ModelAttribute("vo") QuizVO vo ) {
		
		System.out.println(vo.toString());
		
		return "quiz/quiz01_ok";
	}
	
	///////////////////////////////////////////////////////////////
	//quiz02 화면요청
	@RequestMapping("/quiz02")
	public String quiz02() {
		return "quiz/quiz02";
	}
	
	//result 화면요청
	@RequestMapping("/result")
	public String result() {
		return "quiz/result";
	}
	
	
	//폼요청
	@RequestMapping("/birthForm")
	public String birthForm( @RequestParam("year") String year,
							 @RequestParam("month") String month,
							 @RequestParam("day") String day,
							 @RequestParam("msg") String msg,
							 RedirectAttributes ra
							) {
		
		String str = year + "-" + month + "-" + day + "-" + msg;
		ra.addFlashAttribute("msg", str); //리다이렉트 시에 1번 사용할 수 있음.
		
		return "redirect:/quiz/result"; //다시 컨트롤러를 태움
	}
	
	
	
	
	
	
	
	
	
	
}
