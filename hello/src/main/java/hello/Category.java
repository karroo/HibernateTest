package hello;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {
	private Long id;
	private String name;
	private Category parentCategory;
	private Set childCategories = new HashSet();
	private Set categories = new HashSet();
	
	private Set items = new HashSet();
	
	
	@Id
	@GeneratedValue
	@Column(name="CATEGORY_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}
	public Set getChildCategories() {
		return childCategories;
	}
	public void setChildCategories(Set childCategories) {
		this.childCategories = childCategories;
	}
	public void addChildCategory(Category childCategory){
		if(childCategory == null){
			throw new IllegalArgumentException("Null child category!");
		}
		if(childCategory.getParentCategory() != null){
			childCategory.getParentCategory().getChildCategories().remove(childCategory);
			childCategory.setParentCategory(this);
			childCategories.add(childCategory);
		}
	}
	public Set getItems() {
		return items;
	}
	public void setItems(Set items) {
		this.items = items;
	}
	public Set getCategories() {
		return categories;
	}
	public void setCategories(Set categories) {
		this.categories = categories;
	}
	
	public void addCategory(Category category){
		if(category == null){
			throw new IllegalArgumentException("Null category");
		}
		category.getItems().add(this);
		categories.add(category);
	}
	
}
