package com.example.board.mapper;

import com.example.board.dto.BoardCateDto;
import com.example.board.dto.BoardDetailDto;
import com.example.board.dto.BoardListDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {
    public List<BoardCateDto> selectAll();

    public List<BoardListDto> selectBoardListById(String boardCateId);

    public String selectBoardListName(String boardCateId);

    public BoardDetailDto selectBoardDetailById(Map<String,String> searchMap);
}
