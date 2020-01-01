package com.example.springboot_mybatis_crud.service;

import com.example.springboot_mybatis_crud.dto.BoardDto;

import java.util.List;

/**
 * @author 이승환
 * @since 2019-12-18
 */
public interface BoardService {
    
    int selectBoardListCnt(BoardDto boardDto);
    
    List<BoardDto> selectBoardList(BoardDto boardDto);
    
}
