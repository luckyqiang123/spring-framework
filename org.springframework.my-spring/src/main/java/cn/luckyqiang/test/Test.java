package cn.luckyqiang.test;

import cn.luckyqiang.annotation.Logger;
import cn.luckyqiang.app.AppConfig;
import cn.luckyqiang.service.CityService;
import cn.luckyqiang.servlet.Example1;
import cn.luckyqiang.servlet.Example2;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: luckyqiang
 * @company: www.luckyqiang.cn
 * @Date: 2019/6/29 15:06
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		/**
		 * doGetBean------------- Object sharedInstance = getSingleton(beanName);
		 */

		CityService cityService = ac.getBean(CityService.class);
		cityService.queryAll();
		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();

		System.out.println(ac.getBean(Example1.class));
		System.out.println(ac.getBean(Example1.class));
	}
}
