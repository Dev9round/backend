package com.ksundev.tallyhoserver.controller;

import com.ksundev.tallyhoserver.model.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/api/test")
  public String testApi() {
    return "API 테스트 성공!";
  }

  @GetMapping("/api/ping")
  public String ping() {
    return "pong";
  }

  @GetMapping("/api/json")
  public ApiResponse jsonResponse() {
    return new ApiResponse("API 연결 성공!", true);
  }
}