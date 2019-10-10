package com.xiaofengczy.tools;

import lombok.Data;

@Data
public class RRException extends RuntimeException {

  private String msg;
  private int code = 500;

  public RRException(String msg) {
    super(msg);
    this.msg = msg;
  }

  public RRException(String msg, Throwable cause) {
    super(msg, cause);
    this.msg = msg;
  }

  public RRException(String msg, int code) {
    super(msg);
    this.msg = msg;
    this.code = code;
  }

  public RRException(String msg, int code, Throwable e) {
    super(msg, e);
    this.msg = msg;
    this.code = code;
  }

}
