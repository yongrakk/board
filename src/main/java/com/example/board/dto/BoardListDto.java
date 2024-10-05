package com.example.board.dto;

import lombok.Data;

@Data
public class BoardListDto {

    private String boardCateId;
    private String boardCateNm;
    private int boardNo;
    private String boardWriter;
    private String boardTitle;
    private String boardDate;

}
