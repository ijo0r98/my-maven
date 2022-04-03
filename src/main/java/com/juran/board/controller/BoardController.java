package com.juran.board.controller;

import com.juran.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Resource(name="boardService")
    private BoardService boardService;

    @GetMapping("")
    public ModelAndView main() throws Exception {
        ModelAndView mv = new ModelAndView("board/index");
        mv.addObject("boardList", boardService.boardList());
        System.out.println(boardService.boardList());
        return mv;
    }
}
