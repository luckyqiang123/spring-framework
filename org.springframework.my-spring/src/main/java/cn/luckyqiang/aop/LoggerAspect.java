package cn.luckyqiang.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/**
 * @author: zhangzj1103
 * @company: www.chinaunicom.cn
 * @Date: 2019/10/09 14:07
 * @Description:
 */

@Component
@Aspect
public class LoggerAspect {


	@Pointcut("@annotation(cn.luckyqiang.annotation.Logger)")
	public void doAspect() {

	}

	@Before("doAspect()")
	public void doBefore(JoinPoint joinPoint) {
		System.out.println("Before......");
	}


	@AfterReturning("doAspect()")
	public void doAfterReturning(JoinPoint joinPoint) {
		System.out.println("AfterReturning......");
	}

	@AfterThrowing("doAspect()")
	public void ddd() {
		System.out.println("AfterThrowing......");
	}


}
