package cn.luckyqiang.servlet;

import cn.luckyqiang.service.CityService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: luckyqiang
 * @company: www.luckyqiang.cn
 * @Date: 2019/6/29 14:34
 * @Description:
 */

@Component
//@Scope("prototype")
public class Example1 implements InitializingBean {

	@Autowired
	CityService cityService;

//	@PostConstruct
	public void initTest() {
		System.out.println("example1--------life callback test");
	}

	public Example1() {
		System.out.println("example1 construct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("example------implements ---------- life callback test");
	}
}
