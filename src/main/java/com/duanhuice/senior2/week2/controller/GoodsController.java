/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: GoodsController.java 
 * @Prject: duanhuice-senior2-week2
 * @Package: com.duanhuice.senior2.week2.controller 
 * @Description: TODO
 * @author: Administrator
 * @date: 2019年10月14日 上午9:14:28 
 * @version: V1.0   
 */
package com.duanhuice.senior2.week2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/** 
 * @ClassName: GoodsController 
 * @Description: TODO
 * @author:Administrator
 * @date: 2019年10月14日 上午9:14:28  
 */
@Controller
public class GoodsController {
	@Autowired
	 RedisTemplate  redisTemplate; 
	
	@RequestMapping("findlist")
   public  String  getList( Model model, @RequestParam(defaultValue = "10") Integer pageSize ,@RequestParam(defaultValue = "1")Integer page ) {
		List list = redisTemplate.opsForList().range("goods_List", (page-1)*pageSize, (page-1)*pageSize+pageSize-1);
		model.addAttribute("list", list);
		if(page!=1) {
			model.addAttribute("prePage",page-1);
		}else {
			model.addAttribute("prePage",1);
		}
		
		model.addAttribute("nextPage",page+1);
		return "list";
	}
	
	@RequestMapping("findlistset")       
	     
	public  String  getListSet( Model model, @RequestParam(defaultValue = "10") Integer pageSize ,@RequestParam(defaultValue = "1")Integer page ) {
		List list = redisTemplate.opsForList().range("goods_List", (page-1)*pageSize, (page-1)*pageSize+pageSize-1);
		model.addAttribute("list", list);
		if(page!=1) {
			model.addAttribute("prePage",page-1);
		}else {
			model.addAttribute("prePage",1);
		}
		
		model.addAttribute("nextPage",page+1);
		return "listZset";
	}   
	   
	   
	   
	   
   	
	
	
	
	
	
}
