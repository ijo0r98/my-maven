package com.juran.board.dao;

import com.juran.board.vo.BoardListVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("boardDAO")
public interface BoardDAO {

    List<BoardListVO> boardList() throws Exception;
}
