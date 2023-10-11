package com.example.demo.domain.main;

import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.nio.file.Files;
import org.springframework.http.MediaType;
import java.io.IOException;
@Controller
@RequiredArgsConstructor
@RequestMapping("")
public class MainController {

    //메인 페이지
    @GetMapping("/main")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/main/index");
        return modelAndView;
    }

    //로그인
    @GetMapping("/login.html")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/main/login");
        return modelAndView;
    }

    //로그아웃

    @GetMapping("/test")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/main/test");
        return modelAndView;
    }

    @GetMapping("/image1.jpg")
    public ResponseEntity<byte[]> getImage() {
        ClassPathResource imageResource = new ClassPathResource("templates/page/main/image1.jpg");

        try {
            if (imageResource.getFile().exists()) {
                byte[] imageBytes = Files.readAllBytes(imageResource.getFile().toPath());
                return ResponseEntity.ok()
                        .contentType(MediaType.IMAGE_JPEG)
                        .body(imageBytes);
            }
        } catch (IOException e) {
            // 예외 처리
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/image2.jpg")
    public ResponseEntity<byte[]> getImage2() {
        ClassPathResource imageResource = new ClassPathResource("templates/page/main/image2.jpg");

        try {
            if (imageResource.getFile().exists()) {
                byte[] imageBytes = Files.readAllBytes(imageResource.getFile().toPath());
                return ResponseEntity.ok()
                        .contentType(MediaType.IMAGE_JPEG)
                        .body(imageBytes);
            }
        } catch (IOException e) {
            // 예외 처리
        }

        return ResponseEntity.notFound().build();
    }
}