package com.juran.board.service;

import com.juran.board.dao.BoardDAO;
import com.juran.board.vo.BoardListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

    @Resource(name = "boardDAO")
    private BoardDAO boardDAO;

    @Override
    public List<BoardListVO> boardList() throws Exception {
        return boardDAO.boardList();
    }
}
