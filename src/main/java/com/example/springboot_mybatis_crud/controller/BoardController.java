package com.example.springboot_mybatis_crud.controller;

import com.example.springboot_mybatis_crud.dto.BoardDto;
import com.example.springboot_mybatis_crud.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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
    public ModelAndView notice(HttpServletRequest request, BoardDto boardDto) throws Exception {
        ModelAndView mv = new ModelAndView();
    
        // 목록 갯수
        int totalCnt = this.boardService.selectBoardListCnt(request, boardDto);
    
        // 목록
        List<BoardDto> list = null;
        if(totalCnt > 0){
            list = this.boardService.selectBoardList(request, boardDto);
        }
    
        mv.addObject("totalCnt", totalCnt);
        mv.addObject("list", list);
        mv.addObject("boardDto", boardDto);
        mv.setViewName("read");
        return mv;
    }

}
