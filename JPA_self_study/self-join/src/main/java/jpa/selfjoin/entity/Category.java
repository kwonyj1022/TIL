package jpa.selfjoin.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "main_category_id", foreignKey = @ForeignKey(name = "fk_category_main_sub"))
    private Category mainCategory;

    @OneToMany(mappedBy = "mainCategory", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Category> subCategories = new ArrayList<>();

    protected Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Category addSubCategory(Category subCategory) {
        subCategory.mainCategory = this;
        subCategories.add(subCategory);
        return subCategory;
    }

    public Long getId() {
        return id;
    }

    public Long getMainCategoryId() {
        return mainCategory.id;
    }

    public String getName() {
        return name;
    }
}