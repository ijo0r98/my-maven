package com.juran.board.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

@Getter
@Setter
public class BoardRegVO {

    private String boardTitle;
    private String boardContent;
//    private int categoryNo;
//    private int memberNo;
    private char secretYn;
    private String issueDate;

//    @Nullable
//    private String secretPw;

}
