package kr.co.rland.web.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kr.co.rland.web.entity.Category;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;

@Mapper      //실제로 우리가 만들어보자  //0309 이거 주석처리
public interface CategoryRepository {
   List<Category> findAll();
   Category findById(int id);

   int insert(Category category);
   int update(Category category);
   void delete(int id);
   
}