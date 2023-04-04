package kr.co.rland.web.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.rland.web.entity.MenuView;


@SpringBootTest
@AutoConfigureMybatis
class DefaultMenuServiceTest {

	@Autowired
	private MenuService service;
	
	
	
	@Test
	void test() {
		//service.pointUp();
		List<MenuView> list = service.getViewList();
		System.out.println(list);		
		System.out.println("작업완료");
	}

	
}
