package com.board.service;

import com.board.domain.BoardDTO;

public interface BoardService {
	// 게시글 등록
	public boolean registerBoard(BoardDTO params);
}
