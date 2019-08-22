package cn.luckyqiang.mybatis;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author: luckyqiang
 * @company: www.luckyqiang.cn
 * @Date: 2019/6/30 18:31
 * @Description:
 */
@Component
public class LuckyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("example1")) {
			System.out.println("LuckyBeanPostProcessor-----BeforeInitialization");
		}
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("example1")) {
			System.out.println("LuckyBeanPostProcessor-----AfterInitialization");
		}
		return null;
	}
}
