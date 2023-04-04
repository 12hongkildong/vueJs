package kr.co.rland.web.di;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.rland.web.entity.JSONParser;
import kr.co.rland.web.entity.Menu;

public class Program {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
//		어노테이션 기반의 DI-----------------------------------------
		
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
				
//				AnnotationConfigapplicationContext(config.class);
		String hello = (String) context.getBean("hello");
		System.out.println(hello);
		
//		xml기반의 DI------------------------------------------
		
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("kr/co/rland/web/di/context.xml");
		
//		MenuRepository menuRepository = context.getBean(MenuRepository.class);
//		List<Menu> list = menuRepository.findAll();
		
//		MenuService service = context.getBean(MenuService.class);
//		MenuService service = (MenuService)context.getBean("service"); // 이름으로 뽑을 때는 형식변환 해줘야 하기 때문에 class로 뽑는 것
//		List<Menu> list = service.getList();
//		
//		System.out.println(list);
//		---------------------------------------------------------
//		Menu menu = new Menu();
//		menu.setId(1);
//		menu.setName("아메리카노");
//		menu.setPrice(3000);
////		menu.setRegDate(new Date("2023-11-23")); // ㄱ객체를 제이슨으로 바꾸겠다.
////		JSONParser<Menu> json = new JSONParser<Menu>(menu);   // 제이슨 형식으로 만들고 싶다.
//		JSONParser parser = new JSONParser(menu);
//		String json = parser.toJSON();
//		
//		System.out.println(json);	
	}
}