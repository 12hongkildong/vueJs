package kr.co.rland.web.aop;

public interface Calculator {
//	int plus(int x, int y); // 함수호출마다 넘겨주는 값을 쓴다. 
	int plus(); // 맴버것을 쓴다.
	
	int sub();
	int multi();
}
