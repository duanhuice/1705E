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

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/** 
 * @ClassName: GoodsController 
 * @Description: TODO
 * @author:Administrator
 * @date: 2019年10月14日 上午9:14:28  
 */
@Controller
public class GoodsController {
  
	
   public  String  getList( Model m, Integer pageSize ,Integer page ) {
	      
	   
	     
	   
	   
	   return "list";
	   
	   
   }	
}
