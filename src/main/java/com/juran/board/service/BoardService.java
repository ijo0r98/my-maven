package com.juran.board.service;

import com.juran.board.vo.BoardListVO;

import java.util.List;

public interface BoardService {

    List<BoardListVO> boardList() throws Exception;
}
