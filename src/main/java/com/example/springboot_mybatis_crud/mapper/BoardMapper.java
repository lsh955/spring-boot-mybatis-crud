package com.example.springboot_mybatis_crud.mapper;

import com.example.springboot_mybatis_crud.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 이승환
 * @since 2019-12-18
 */
@Component
@Mapper
public interface BoardMapper {
    
    int selectBoardListCnt();
    
    List<BoardDto> selectBoardList();

}
