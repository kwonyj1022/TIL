package jpa.selfjoin.service;

import jpa.selfjoin.dto.request.CategoryRequest;
import jpa.selfjoin.dto.response.CategoryResponse;
import jpa.selfjoin.entity.Category;
import jpa.selfjoin.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category saveMainCategory(CategoryRequest mainCategoryRequest) {
        Category category = new Category(mainCategoryRequest.getName());
        return categoryRepository.save(category);
    }

    public Category saveSubCategory(Long mainCategoryId, CategoryRequest subCategoryRequest) {
        Category mainCategory = categoryRepository.findById(mainCategoryId).get();
        return mainCategory.addSubCategory(new Category(subCategoryRequest.getName()));
    }

    public List<CategoryResponse> getMainCategories() {
        List<Category> mainCategories = categoryRepository.findAllByMainCategoryIsNull();
        return mainCategories.stream()
                .map(category -> new CategoryResponse(category.getId(), category.getName()))
                .toList();
    }

    public List<CategoryResponse> getSubCategories(Long mainCategoryId) {
        Category mainCategory = categoryRepository.findById(mainCategoryId).get();
        List<Category> subCategories = categoryRepository.findAllByMainCategory(mainCategory);
        return subCategories.stream()
                .map(category -> new CategoryResponse(category.getId(), category.getName()))
                .toList();
    }
}
