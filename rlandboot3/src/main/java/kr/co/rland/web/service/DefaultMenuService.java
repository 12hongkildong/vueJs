package kr.co.rland.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.repository.MenuRepository;

@Service
public class DefaultMenuService implements MenuService {

	@Autowired
	private MenuRepository repository;
	
	public void setRepository(MenuRepository repository) {
		this.repository = repository;
	}


//	@Transactional(propagation = )
	@Override
	public void pointUp() {

//		Menu menu = new Menu();
//		menu.setId(774L);
//		menu.setPrice(8000);
//		repository.update(menu);
//		
//		
//		menu.setId(774L);
//		menu.setPrice(20000);
//		repository.update(menu);
		
		
		
	}

	@Override
	public List<Menu> getList() {
		
//		return repository.findAll(0,10,"",1,3000,"regDate","desc");
		return repository.findAll(0,10,"",null,null,null,null);
	}

	@Override
	public List<Menu> getList(int page) {
		// TODO Auto-generated method stub
		int size = 10;
		List<Menu> list = repository.findAll(page,size,"",null,null,null,null);
				
		return list;
	}

	@Override
	public List<Menu> getList(int page, String query) {
		// TODO Auto-generated method stub
		int size = 10;
		List<Menu> list = repository.findAll(page,size,query,null,null,null,null);
		
		return list;
	}

	@Override
	public List<Menu> getList(int page, Integer categoryId) {
		int size = 10;
		List<Menu> list = repository.findAll(page,size,"",categoryId,null,null,null);
		
		return list;
	}

	@Override
	public List<Menu> getList(int page, Integer categoryId, String query) {
		int size = 10;
		List<Menu> list = repository.findAll(page,size,query,categoryId,null,null,null);
		
		return list;
	}

	
	
	
	
	@Override
	public List<MenuView> getViewList() {
		// TODO Auto-generated method stub
		
		return repository.findViewAll(0,10,null,null,null,null,null);
	}

	@Override
	public List<MenuView> getViewList(int page) {
		int size = 10;
		List<MenuView> Viewlist = repository.findViewAll(page,10,null,null,null,null,null);
				
		return Viewlist;
	}

	@Override
	public List<MenuView> getViewList(int page, String query) {
		int size = 10;
		List<MenuView> Viewlist = repository.findViewAll(page,size,query,null,null,null,null);
		
		return Viewlist;
	}

	@Override
	public List<MenuView> getViewList(int page, Integer categoryId) {
		int size = 10;
		List<MenuView> Viewlist = repository.findViewAll(page,size,"",categoryId,null,null,null);
		
		return Viewlist;
	}

	@Override
	public List<MenuView> getViewList(int page, Integer categoryId, String query) {
		// TODO Auto-generated method stub
		int size = 9;
		int offset = (page-1)*size; // 1->0 , 2->10, 3->20
		
		List<MenuView> Viewlist = repository.findViewAll(offset,size,query,categoryId,null,null,null);
		
		return Viewlist;
	}


	@Override
	public Menu getById(int id) {
		Menu menu = repository.findById(id);
		return menu;
	}

}
