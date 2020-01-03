package com.example.springboot_mybatis_crud.controller;

import com.example.springboot_mybatis_crud.dto.BoardDto;
import com.example.springboot_mybatis_crud.service.BoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 이승환
 * @since 2019-12-18
 */
@Controller
public class BoardController {
    
    @Autowired
    private BoardServiceImpl boardServiceImpl;
    
    @GetMapping("/create")
    public ModelAndView create(BoardDto boardDto) { // Create(생성)
        ModelAndView mv = new ModelAndView();
        
        return mv;
    }
    
    @GetMapping("/")
    public ModelAndView read(BoardDto boardDto) {   // Read(읽기)
        ModelAndView mv = new ModelAndView();
        
        // 목록 갯수
        int totalCnt = this.boardServiceImpl.selectCnt(boardDto);
        
        // 목록
        List<BoardDto> list = null;
        if (totalCnt > 0) {
            list = this.boardServiceImpl.select(boardDto);
        }
        
        mv.addObject("totalCnt", totalCnt);
        mv.addObject("list", list);
        mv.setViewName("read");
        return mv;
    }
    
    @GetMapping("/update")
    public ModelAndView update(BoardDto boardDto) { // Update(갱신)
        ModelAndView mv = new ModelAndView();
        
        return mv;
    }
    
    @GetMapping("/delete/{id}")
    public int delete(@PathVariable int id) { // Delete(삭제)
        return boardServiceImpl.delete(id);
    }
    
}