package cn.luckyqiang.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: luckyqiang
 * @company: www.luckyqiang.cn
 * @Date: 2019/6/29 14:55
 * @Description:
 */

@ComponentScan("cn.luckyqiang.*")
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

//	@Bean
//	public Example1 example1() {
//		return new Example1();
//	}
//
//	@Bean
//	public CityService cityService() {
//		example1();
//		return new CityService();
//	}
}
