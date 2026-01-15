package org.example;

public class UserError extends RuntimeException {
  public UserError() {
  }

  public UserError(String message) {
        super(message);
    }
}
