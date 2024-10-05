package com.example.board.service;

import com.example.board.dto.BoardCateDto;
import com.example.board.dto.BoardDetailDto;
import com.example.board.dto.BoardListDto;

import java.util.List;
import java.util.Map;

public interface BoardService {

    public List<BoardCateDto> selectAll();

    public List<BoardListDto> selectBoardListById(String boardCateID);

    public String selectBoardListName(String boardCateId);

    public BoardDetailDto selectBoardDetailById(Map<String,String> searchMap);
}
