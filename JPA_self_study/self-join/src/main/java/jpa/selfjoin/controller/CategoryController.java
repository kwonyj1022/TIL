package jpa.selfjoin.controller;

import jpa.selfjoin.dto.request.CategoryRequest;
import jpa.selfjoin.dto.response.CategoryResponse;
import jpa.selfjoin.entity.Category;
import jpa.selfjoin.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<Void> addMainCategory(@RequestBody CategoryRequest mainCategoryRequest) {
        Category mainCategory = categoryService.saveMainCategory(mainCategoryRequest);
        return ResponseEntity.created(URI.create("/categories/" + mainCategory.getId())).build();
    }

    @PostMapping("/{mainCategoryId}")
    public ResponseEntity<Void> addSubCategory(@PathVariable Long mainCategoryId,
                                               @RequestBody CategoryRequest subCategoryRequest) {
        Category subCategory = categoryService.saveSubCategory(mainCategoryId, subCategoryRequest);
        return ResponseEntity
                .created(URI.create("/categories/" + subCategory.getMainCategoryId() + "/" + subCategory.getId()))
                .build();
    }

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> showMainCategories() {
        List<CategoryResponse> mainCategories = categoryService.getMainCategories();
        return ResponseEntity.ok(mainCategories);
    }

    @GetMapping("/{mainCategoryId}")
    public ResponseEntity<List<CategoryResponse>> showSubCategories(@PathVariable Long mainCategoryId) {
        List<CategoryResponse> subCategories = categoryService.getSubCategories(mainCategoryId);
        return ResponseEntity.ok(subCategories);
    }
}
