package com.xiaofengczy.tools;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpStatus;

public class ExtResult extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	public ExtResult() {
		put("code", 0);
		put("msg", "success");
	}

	public static ExtResult error() {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
	}

	public static ExtResult error(String msg) {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
	}

	public static ExtResult error(int code, String msg) {
		ExtResult r = new ExtResult();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static ExtResult ok(String msg) {
		ExtResult r = new ExtResult();
		r.put("msg", msg);
		return r;
	}

	public static ExtResult ok(Map<String, Object> map) {
		ExtResult r = new ExtResult();
		r.putAll(map);
		return r;
	}

	public static ExtResult ok() {
		return new ExtResult();
	}

	public ExtResult put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
