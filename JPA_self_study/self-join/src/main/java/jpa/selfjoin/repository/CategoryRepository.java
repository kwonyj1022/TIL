package jpa.selfjoin.repository;

import jpa.selfjoin.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findAllByMainCategoryIsNull();

    List<Category> findAllByMainCategory(Category mainCategory);
}
