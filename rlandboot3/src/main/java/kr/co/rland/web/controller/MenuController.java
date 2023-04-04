package kr.co.rland.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.rland.web.entity.Category;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.service.CategoryService;
import kr.co.rland.web.service.MenuService;


@Controller
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuService service; // 메뉴가 주인이니까 그냥 이름을 service로 한 것이다, 만약 다른 걸 넣게 되면
	
	@Autowired
	private CategoryService categoryService; 
	
	
	
	@GetMapping("list") //@RequestMapping("list") 
	public String list(
				@RequestParam(name = "p", defaultValue="1", required = false)int page,
				@RequestParam(name = "c", required = false) Integer categoryId,
				@RequestParam(name = "q", required = false) String query,  // 널일 필요가 있으니 디폴드값을 안 준다.				
				Model model) {
		
		List<Category> categoryList= categoryService.getList();
		
		List<MenuView> list = service.getViewList(page, categoryId, query);
		
		
		model.addAttribute("list", list);
		model.addAttribute("category", categoryList);
		
//		service.getList(); //1, quert:"", category:null
//		service.getList(1);
//		service.getList(1, "");
//		service.getList(1, 1 );
//		service.getList(1, 1,"" );
		
		
		//model.addAttribute("data", "hello");
		//return "menu list";
		//return "/WEB-INF/view/menu/list.jsp";
		//return "/WEB-INF/view/inc/layout.jsp";
		return "menu/list";//타일에게 조립해달라는 조합에 대한 이름을 반환
		
	}

	@GetMapping("detail") 
	public String detail(int id, Model model) {
		
		Menu menu = service.getById(id);
		
		model.addAttribute("menu", menu);
		
		return "menu/detail";
	}
}
