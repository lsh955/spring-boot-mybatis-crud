package com.example.springboot_mybatis_crud.service;

import com.example.springboot_mybatis_crud.dao.ReadDao;
import com.example.springboot_mybatis_crud.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 이승환
 * @since 2019-12-18
 */
@Service
public class BoardService {
    
    @Autowired
    private ReadDao readDao;
    
    public List<BoardDto> getall() throws Exception {
        return readDao.getall();
    }
    
}
