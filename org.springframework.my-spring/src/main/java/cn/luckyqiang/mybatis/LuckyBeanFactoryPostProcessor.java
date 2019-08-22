package cn.luckyqiang.mybatis;

import cn.luckyqiang.servlet.Example2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author: luckyqiang
 * @company: www.luckyqiang.cn
 * @Date: 2019/6/29 14:32
 * @Description:
 */


public class LuckyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("example1");
		beanDefinition.setBeanClass(Example2.class);
	}
}
