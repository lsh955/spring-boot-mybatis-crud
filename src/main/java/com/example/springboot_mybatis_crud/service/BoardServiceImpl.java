package com.example.springboot_mybatis_crud.service;

import com.example.springboot_mybatis_crud.dto.BoardDto;
import com.example.springboot_mybatis_crud.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author 이승환
 * @since 2019-12-20
 */
@Service
public class BoardServiceImpl implements BoardService {
    
    @Autowired
    private BoardMapper boardMapper;

    @Override
    public int selectBoardListCnt(BoardDto boardDto) {
        return boardMapper.selectBoardListCnt();
    }

    @Override
    public List<BoardDto> selectBoardList(BoardDto boardDto) {
        return boardMapper.selectBoardList();
    }
    
}
