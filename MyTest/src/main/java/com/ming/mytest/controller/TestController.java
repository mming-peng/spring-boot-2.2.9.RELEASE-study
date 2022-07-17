package com.ming.mytest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ming.
 */
@RestController
public class TestController {

	@GetMapping("/test")
	public String test(){
		System.out.println("源码环境构建成功...");
		return "ok";
	}
}
