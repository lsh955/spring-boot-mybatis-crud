package com.example.springboot_mybatis_crud.controller;

import com.example.springboot_mybatis_crud.dto.BoardDto;
import com.example.springboot_mybatis_crud.service.BoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        // 작업중...
        return mv;
    }

    @GetMapping("/")
    public String read(Model model, BoardDto boardDto) {   // Read(읽기)

        int select_count = boardServiceImpl.selectcount(boardDto);
        List<BoardDto> select_list = boardServiceImpl.select(boardDto);

        model.addAttribute("select_count", select_count);   // 리스트 카운트
        model.addAttribute("select_list", select_list);     // 리스트

        return "read";
    }

    @GetMapping("/update")
    public ModelAndView update(BoardDto boardDto) { // Update(갱신)
        ModelAndView mv = new ModelAndView();
        // 작업중...
        return mv;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) { // Delete(삭제)
        boardServiceImpl.delete(id);
        return "read";
    }

}