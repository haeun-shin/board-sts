package com.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.board.domain.BoardDTO;

@Mapper
public interface BoardMapper {
	// 게시글 생성
	public int insertBoard(BoardDTO params);	
}
