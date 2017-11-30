/**  
 * File Name:TestRestServiceImpl.java  
 * Package Name:com.zhoufb.rest.impl  
 * Description: (That's the purpose of the file)
 * Date:2017年11月28日上午11:44:07  
 * Copyright (c) 2017, forint.lee@qq.com All Rights Reserved.  
 *  
*/  
/**  
 * File Name:TestRestServiceImpl.java  
 * Package Name:com.zhoufb.rest.impl  
 * Description: That's the purpose of the file
 * Date:2017年11月28日上午11:44:07  
 * Copyright (c) 2017, forint.lee@qq.com All Rights Reserved.  
 *  
 */  
  
package com.zhoufb.rest.impl;  

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhoufb.api.rest.TestRestService;
import com.zhoufb.consumer.service.TestConsumer;
import com.zhoufb.model.ResultMsg;

/**  
 * ClassName:TestRestServiceImpl <br/>  
 * Description:That's the purpose of the class
 * Date:     2017年11月28日 上午11:44:07 <br/>  
 * @author   zhoufengbo  
 * @version  V1.0  
 * @see        
 */

@Service
@Path("zhoufb")
public class TestRestServiceImpl implements TestRestService{
	
	@Autowired
	private TestConsumer testConsumer;
	
	@GET
    @Path("test")
	@Consumes("application/json")
	@Produces("application/json")
	public ResultMsg  hello(){
		ResultMsg msg=new ResultMsg();//返回参数
		List<Object> ls=new ArrayList<Object>();//返回集合
		ls.add(testConsumer.test());//进入返回
		msg.setData(ls);//设置返回
		return msg;
	}
}
  