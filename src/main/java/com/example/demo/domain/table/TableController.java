package com.example.demo.domain.table;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("")
public class TableController {

    //테이블 페이지
    @GetMapping("/tables.html")
    public ModelAndView layoutSidenav() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/charge/tables");
        return modelAndView;
    }

    @GetMapping("/result.html")
    public ModelAndView result() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/charge/result");
        return modelAndView;
    }


}
