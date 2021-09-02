package com.clicker.counter.controller;

import com.clicker.counter.service.ClickerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class ClickerController {

    private final ClickerService clickerService;

    @GetMapping("/test")
    public String test(HttpServletRequest request) {
        return "TEST";
    }

    @PostMapping("/increment")
    public Long increment() {
        return clickerService.increment();
    }
}
