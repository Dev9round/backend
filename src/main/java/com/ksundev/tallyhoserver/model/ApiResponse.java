package com.ksundev.tallyhoserver.model;

import java.time.LocalDateTime;

public class ApiResponse {
  private String message;
  private LocalDateTime timestamp;
  private boolean success;

  // 기본 생성자
  public ApiResponse() {
    this.timestamp = LocalDateTime.now();
  }

  public ApiResponse(String message, boolean success) {
    this.message = message;
    this.success = success;
    this.timestamp = LocalDateTime.now();
  }

  // Getter와 Setter
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }
}