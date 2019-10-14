import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
    public void list() {
    	
    }
}
