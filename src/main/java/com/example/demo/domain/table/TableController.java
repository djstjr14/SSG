package com.example.demo.domain.layout;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("")
public class LayoutController {

    //메인 페이지
    @GetMapping("/layout-sidenav-light.html")
    public ModelAndView layoutSidenav() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("layouts/layout-sidenav-light");
        return modelAndView;
    }

    //로그인
    @GetMapping("/layout-static.html")
    public ModelAndView layout() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("layouts/layout-static");
        return modelAndView;
    }

}
