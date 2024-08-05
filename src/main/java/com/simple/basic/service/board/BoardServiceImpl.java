package com.simple.basic.service.board;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.basic.command.BoardVO;

@Service("BoardService") // 반드시 component-scan에 의하여 읽혀야 함
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper scoreMapper;

	@Override
	public void regist(BoardVO vo) {
		scoreMapper.regist(vo);
	}

	@Override
	public ArrayList<BoardVO> getBoard() {
		return scoreMapper.getBoard();
	}

	@Override
	public void delete(int num) {
		scoreMapper.delete(num);
	}

}
