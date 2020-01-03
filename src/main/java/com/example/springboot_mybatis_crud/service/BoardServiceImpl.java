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
    public int selectCnt(BoardDto boardDto) {  // 목록개수 카운트
        return boardMapper.selectCnt();
    }
    
    @Override
    public List<BoardDto> select(BoardDto boardDto) {  // 리스트 조회
        return boardMapper.select();
    }
    
    @Override
    public int delete(int id) {  // 삭제
        return boardMapper.delete(id);
    }
    
}
