package com.simple.basic.service.score;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.basic.command.ScoreVO;
import com.simple.basic.service.score.impl.ScoreDAO;

@Service("x") // 반드시 component-scan에 의하여 읽혀야 함
public class ScoreServiceImpl implements ScoreService {

//	@Autowired
//	@Qualifier("y")
//	ScoreDAO scoreDAO;

	@Autowired
	private ScoreMapper scoreMapper;

	@Override
	public void regist(ScoreVO vo) {
		scoreMapper.regist(vo);
	}

	@Override
	public ArrayList<ScoreVO> getScore() {
		return scoreMapper.getScore();
	}

	@Override
	public void delete(int sno) {
		scoreMapper.delete(sno);
	}

}
