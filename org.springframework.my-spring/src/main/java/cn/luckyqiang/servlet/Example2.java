package cn.luckyqiang.servlet;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author: luckyqiang
 * @company: www.luckyqiang.cn
 * @Date: 2019/6/29 14:34
 * @Description:
 */

@Lazy
@Component
public class Example2 {
	Example2() {
		System.out.println("222222222222222222");
	}
}
