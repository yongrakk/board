package com.example.board.dto;

import lombok.Data;

@Data
public class BoardDetailDto {
    private int boardNo;
    private String boardCateId;
    private String boardWriter;
    private String boardTitle;
    private String boardDate;
    private String boardContent;
}
