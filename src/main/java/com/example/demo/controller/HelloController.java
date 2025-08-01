package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class HelloController {

  @GetMapping("/")
  public String index(Map<String, Object> model) {
    model.put("message", "Welcome to the Demo App!");
    return "index";
  }

  @ResponseBody
  @GetMapping("/api/hello")
  public String helloApi() {
    return "Hello from API!";
  }
}