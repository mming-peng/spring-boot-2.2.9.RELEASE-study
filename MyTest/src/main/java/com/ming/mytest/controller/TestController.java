package com.ming.mytest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by ming.
 */
@RestController
public class TestController {

	@Resource
	RestTemplate restTemplate;
	@Resource
	private RestTemplate httpClientTemplate;

	@GetMapping("/test")
	public String test(){
		String forEntity = restTemplate.getForObject("https://zhuanlan.zhihu.com/api/columns/zhihuadmin", String.class);
		return forEntity;
	}

	@GetMapping("/testa")
	public String testA(){
		String forEntity = httpClientTemplate.getForObject("https://zhuanlan.zhihu.com/api/columns/zhihuadmin", String.class);
		return forEntity;
	}
}
