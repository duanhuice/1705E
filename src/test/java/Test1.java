import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.duanhuice.common.utils.StreamUtil;
import com.duanhuice.common.utils.StringUtil;
import com.duanhuice.senior2.week2.domain.Goods;

/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Test.java 
 * @Prject: duanhuice-senior2-week2
 * @Package:  
 * @Description: TODO
 * @author: Administrator
 * @date: 2019年10月14日 上午10:35:19 
 * @version: V1.0   
 */

/** 
 * @ClassName: Test 
 * @Description: TODO
 * @author:Administrator
 * @date: 2019年10月14日 上午10:35:19  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class Test1 {
    @Autowired
   RedisTemplate  redisTemplate; 
    
    //往list的存入数据
    @Test
    public void list() throws IOException {
    	//加载一个文件对象
    	  File  f = new  File("D:\\sshm\\duanhuice-senior2-week2\\src\\\\test\\\\resources\\\\Goods.txt");
    	//使用工具读取文件
    	  String txt = StreamUtil.readTextFile(f);
    	  BufferedReader br =  new BufferedReader(new FileReader(f));
    	//把¥替换成空串
  		txt.replace(" ¥", "");
  	    //把％替换成空串
  		 txt.replace("%", "");
  		//声明一个字符串类型的字符串
  		 String  num =null;
  		 int i = 1;
  		 while((num=br.readLine())!=null) {
	    	 //根据==切割文本内容，每次读取一行数据
	    	String[] split = num.split("==");
	    	//调用构造方法，生成106个对象
	    	//调用工具包的hashtest方法判断是否有值
	    	if(StringUtil.hasText(split[1])&&StringUtil.hasText(split[3])) {
	    		Goods g = new Goods(i, split[1], split[2], split[3]);	    		
	    		System.out.println(g);
	    		redisTemplate.opsForList().leftPush("goods_list", g);
	    	}else {
	    		System.out.println("id不是数字或者商品名称不是一个有效文本!");
	    		continue;
	    	}
            //输出测试
            //使用redis模板存入list集合
            i++;
	     }
		System.out.println("List序列化成功!");
  		
    }
    
    
 
  
    @Test
    public void list2() throws IOException {
    	//加载一个文件对象
    	  File  f = new  File("D:\\sshm\\duanhuice-senior2-week2\\src\\\\test\\\\resources\\\\Goods.txt");
    	//使用工具读取文件
    	  String txt = StreamUtil.readTextFile(f);
    	  BufferedReader br =  new BufferedReader(new FileReader(f));
    	//把¥替换成空串
  		txt.replace(" ¥", "");
  	    //把％替换成空串
  		 txt.replace("%", "");
  		//声明一个字符串类型的字符串
  		 String  num =null;
  		 int i = 1;
  		 while((num=br.readLine())!=null) {
	    	 //根据==切割文本内容，每次读取一行数据
	    	String[] split = num.split("==");
	    	//调用构造方法，生成106个对象
	    	//调用工具包的hashtest方法判断是否有值
	    	if(StringUtil.hasText(split[1])&&StringUtil.hasText(split[3])) {
	    		Goods g = new Goods(i, split[1], split[2], split[3]);	    		
	    		System.out.println(g);
	    		redisTemplate.opsForSet().add("goods_zset", g,i);
	    	}else {
	    		System.out.println("id不是数字或者商品名称不是一个有效文本!");
	    		continue;
	    	}
            //输出测试
            //使用redis模板存入zset集合
            i++;
	     }
		System.out.println("Zset序列化成功!");
  		
    }
    
     
    
    
}
