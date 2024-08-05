package com.simple.basic.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.basic.command.ScoreVO;
import com.simple.basic.service.score.ScoreService;
import com.simple.basic.service.score.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class ScoreController {

	//1st
//	ScoreService service = new ScoreServiceImpl();
	
	//impl를 bean으로 등록
	@Autowired //Resource <--
	@Qualifier("x")
	ScoreService scoreService;
	
	
	
	//목록
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {
		
		//select해서 model에 담아서 화면으로..
		ArrayList<ScoreVO> list = scoreService.getScore();
		model.addAttribute("list", list);
		
		return "service/scoreList";
	}
	
	//등록
	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		return "service/scoreRegist";
	}
	
	//폼요청
	@RequestMapping(value = "/scoreForm", method = RequestMethod.POST)
	public String scoreForm( ScoreVO vo ) { //값 받기
	
		scoreService.regist(vo);
				
		return "service/scoreResult"; //결과화면
	}
	
	//삭제요청
	@RequestMapping("/deleteScore")
	public String deleteScore(@RequestParam("sno") int sno) {
		
		scoreService.delete(sno);
		
		return "redirect:/service/scoreList"; //다시 목록화면으로
	}
	
	
	
	
}
