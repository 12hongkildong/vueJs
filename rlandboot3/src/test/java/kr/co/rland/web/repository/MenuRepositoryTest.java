package kr.co.rland.web.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.rland.web.entity.Menu;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@MybatisTest
//@AutoConfigureMybatis
//@SpringBootTest

class MenuRepositoryTest {

	@Autowired
	private MenuRepository repository;
	
	@Test
	void testFindAll() {
		List<Menu> list = repository.findAll(0,10,null,null,null,null,null);
		System.out.println(list);
	}
	
	/* 출력
	  아메리카노 / 5000원 / 음료 / 함께하면 좋은 메뉴: 5개 / 좋아요: 2
	  소금라떼 / 20000원 / 음료 / 함께하면 좋은 메뉴: 5개 /  
	  초코쿠키 / 5000원 / 스낵 / 함께하면 좋은 메뉴: 5개 / 
	  아메리카노 / 5000원 / 음료 / 함께하면 좋은 메뉴: 5개 /
	  */
	
	//@Test
	//void testFindAll() {
	//	List<Menu> list = repository.findAll(0, 10, null, null, null, "regDate", "desc");
	//	System.out.println(list);
	//}

//	@Test
	void testUpdate() {
		Menu menu = new Menu();
		menu.setId(856L);
		menu.setName("러시아노");
		
		repository.update(menu);
	}
	
	//@Test  // 이부분을 주석처리해주면 실행을 안한다.
	void testFindAllByIds() { //이름은 아무거나 해도 되는데 알아보기 슆게 그냥
		List<Long> ids = new ArrayList<>();
		ids.add(616L);
		ids.add(617L);
		ids.add(713L);
		ids.add(737L);
		
		List<Menu> list = repository.findAllByIds(ids);
		System.out.println(list); //리스트컬렉션
	}
	//@Test
	void testCount() {
		int count = repository.count(null, null, null);
		System.out.println(count);
		
	}
	
}
