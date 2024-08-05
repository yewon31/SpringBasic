package com.simple.basic.service.board;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.simple.basic.command.BoardVO;

@Mapper
public interface BoardMapper {

	public void regist(BoardVO vo); // 등록

	public ArrayList<BoardVO> getBoard(); // 조회

	public void delete(int num); // 삭제
}
