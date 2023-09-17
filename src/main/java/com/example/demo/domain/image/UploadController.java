package com.example.demo.domain.image;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("")
public class UploadController {

    @GetMapping("/upload.html")
    public ModelAndView uploadList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("image/upload");

        return modelAndView;
    }
}
