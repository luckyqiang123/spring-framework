package cn.luckyqiang.service;

import cn.luckyqiang.annotation.Logger;
import org.springframework.stereotype.Component;

/**
 * @author: luckyqiang
 * @company: www.luckyqiang.cn
 * @Date: 2019/6/29 14:28
 * @Description:
 */

@Component
public class CityService {

	public CityService() {
		System.out.println("cityservice construct");
	}

	@Logger
	public void queryAll() {
		System.out.println("query------cityservice------------------");
	}
}
