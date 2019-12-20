package com.example.springboot_mybatis_crud.service;

import com.example.springboot_mybatis_crud.dto.BoardDto;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 이승환
 * @since 2019-12-18
 */
public interface BoardService {
    
    public int selectBoardListCnt(HttpServletRequest request, BoardDto boardDto) throws Exception;
    
    public List<BoardDto> selectBoardList(HttpServletRequest request, BoardDto boardDto) throws Exception;
    
}
