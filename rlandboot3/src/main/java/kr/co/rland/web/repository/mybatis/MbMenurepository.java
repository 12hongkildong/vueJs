package kr.co.rland.web.repository.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

//@Repository //0309이거 추가 함 // 0309추가 후 다음 진도를 위해 주석처리함
public class MbMenuRepository implements MenuRepository {
	

	private SqlSession session;
	private MenuRepository repository;
	
	public MbMenuRepository() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public MbMenuRepository(SqlSession session) {
		this.session = session;
		this.repository = session.getMapper(MenuRepository.class);
		
	}

//	@Override
//	public List<Menu> findAll() {
//		MenuRepository repository = session.getMapper(MenuRepository.class); // 생성자에서 만들어주고 있으니 굳이 쓸 필요가 없다.
//		//return repository.findAll(0,10,null,null,null,null,null);   // 33번 줄 처럼 쉽게 할 수 있는데 굳이 34번줄로 할 필요가 있나?
//		return session.selectList("kr.co.rland.web.repository.MenuRepository.findAll");
//	}
//	
//	@Override
//	public List<Menu> findAll(Integer offset, Integer size) {
//		//MenuRepository repository = session.getMapper(MenuRepository.class);
//		// TODO Auto-generated method stub
//		return repository.findAll(offset,size,null,null,null,null,null);
//	}
//	
	@Override
	public List<Menu> findAll(Integer offset, Integer size, String query, Integer categoryId, Integer price,
			String orderField, String orderDir) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> findAllByIds(List<Long> ids) {
		//MenuRepository repository = session.getMapper(MenuRepository.class);
		//List<Menu> list = session.selectList("kr.co.rland.web.repository.MenuRepository.findAllByIds", ids);
		
		//return list;
		return repository.findAllByIds(ids);
	}

	@Override
	public Menu findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu insert(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu update(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}
	

}
