package jpa.selfjoin.repository;

import jpa.selfjoin.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findAllByMainCategoryIsNull();

    @Query("select c from Category c where c.mainCategory.id = :mainCategoryId")
    List<Category> findAllByMainCategoryId(Long mainCategoryId);
}
