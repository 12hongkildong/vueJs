package kr.co.rland.web.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class program {

	public static void main(String[] args) {

	   Calculator calc = new DefaultCalculator(3,4);
		      
	   
	   Calculator 가짜 = (Calculator) Proxy.newProxyInstance(
			   DefaultCalculator.class.getClassLoader()
			   ,new Class[] {Calculator.class}
			   ,(Object proxy, Method method, Object[] arg)->{
				   
				   System.out.printf("호출되고 있는 매소드 이름: %s\n", method.getName());
				   System.out.printf("%s호출 전\n", method.getName()); // 곁다리?
				   Object result = method.invoke(calc);
				   System.out.printf("결과값: %d\n", result);
				   System.out.printf("%s호출 후\n",method.getName());  // 곁다리?
					return result;
			});
	   
	   
      int result = 0;
      
      result = 가짜.plus();
      System.out.printf("plus result : %d\n", result);
      result = 가짜.sub();
      System.out.printf("sub result : %d\n", result);
      result = 가짜.multi();
      System.out.printf("multi result : %d\n", result);
	}

}
