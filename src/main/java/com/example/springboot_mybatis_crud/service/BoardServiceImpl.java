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
    public List<BoardDto> select(BoardDto boardDto) {  // 리스트 조회

        int totalCnt = boardMapper.selectcount();

        List<BoardDto> select_list = null;
        if (totalCnt > 0) {
            select_list = boardMapper.select();
        }

        return select_list;
    }

    @Override
    public int selectcount(BoardDto boardDto) {  // 리스트 카운트(리스트 부가기능)
        return boardMapper.selectcount();
    }

    @Override
    public int delete(int id) {  // 삭제
        return boardMapper.delete(id);
    }

}
