package com.example.springboot_mybatis_crud.controller;

import com.example.springboot_mybatis_crud.dto.BoardDto;
import com.example.springboot_mybatis_crud.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 이승환
 * @since 2019-12-18
 */
@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;
    
    @GetMapping("/")
    public ModelAndView home() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        
        List<BoardDto> list = boardService.getall();
        modelAndView.addObject("list", list);
    
        modelAndView.setViewName("read");
        return modelAndView;
    }

}
