package com.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.board.controller.BoardController;
import com.board.domain.BoardDTO;
import com.board.mapper.BoardMapper;

@SpringBootTest
class MapperTests {

	@Autowired
	private BoardMapper boardMapper;
	
	/* 게시글 생성 */
	@Test
	public void testOfInsert() {
		BoardDTO params = new BoardDTO();
		params.setTitle("게시글 제목 테스트1");
		params.setContent("게시글 내용 테스트2");
		params.setWriter("테스트계정1");

		int result = boardMapper.insertBoard(params);
		System.out.println("결과는 " + result + "입니다.");
	}
	
	/* 게시글 삭제 */
	@Test
	public void testOfDelete() {
		long idx = 4;
		
		int result = boardMapper.deleteBoard(idx);
		System.out.println("결과는 " + result + "입니다.");
	}

}