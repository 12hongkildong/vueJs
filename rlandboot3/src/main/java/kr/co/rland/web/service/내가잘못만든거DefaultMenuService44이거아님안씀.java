package kr.co.rland.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.repository.MenuRepository;

//@Service
public class 내가잘못만든거DefaultMenuService44이거아님안씀 implements MenuService {

	@Autowired
	private MenuRepository repository;
	
	public void setRepository(MenuRepository repository) {
		this.repository = repository;
	}
	
	
	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
		return repository.findAll(0,10,"",1,null,"regDate","desc");
//		return repository.findAll(0,10,"",null,null,"regDate","desc");
	}

	//@Transactional(propagation = )
	@Override
	public void pointUp() {
		Menu menu = new Menu();
		menu.setId(915L);
		menu.setPrice(5000);
		repository.update(menu);
		
//		menu.setId(915L);
//		menu.setPrice(5000000);
//		repository.update(menu);	
		
		menu.setName("러시러시러시아노");
		menu.setRegDate(null);
		//menu.set
			
		repository.insert(menu);
		
//		repository.updateByIds({1,3,6,7},1);
//		repository.update(new Menu());
//		repository.insert(?);
	}


	@Override
	public List<Menu> getList(int page) {
		return null;
	}


	@Override
	public List<Menu> getList(int page, String query) {
		return null;
	}


	@Override
	public List<Menu> getList(int page, int categoryId) {
		return null;
	}


	@Override
	public List<Menu> getList(int page, int categoryId, String query) {
		return null;
	}


	@Override
	public List<MenuView> getViewList() {
		int page = 1;
		int size = 10;
		List<MenuView> list = repository.findViewAll(page, size, null, null, null, null, null);
		return list;
	}


	@Override
	public List<MenuView> getViewList(int page) {
		List<MenuView> list = repository.findViewAll(page, null, null, null, null, null, null);
		return list;
	}


	@Override
	public List<MenuView> getViewList(int page, String query) {
		int size=10;
		List<MenuView> list = repository.findViewAll(page, size, query, null, null, null, null);
		return list;
	}


	@Override
	public List<MenuView> getViewList(int page, int categoryId) {
		int size=10;
		List<MenuView> list = repository.findViewAll(page, size, null, categoryId, null, null, null);
		return list;
	}


	@Override
	public List<MenuView> getViewList(int page, int categoryId, String query) {
		int size=10;
		List<MenuView> list = repository.findViewAll(page, size, query,categoryId, null, null, null);
		return list;
	}


}
