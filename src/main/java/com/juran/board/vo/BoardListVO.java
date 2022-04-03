package com.juran.board.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardListVO {

    private int boardNo;
    private String boardTitle;
    private String regDate;
    private String issueDate;
    private int memberNo;
    private int categoryNo;
    private char secretYn;

}
