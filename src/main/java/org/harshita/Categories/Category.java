package org.harshita.Categories;

//import org.harshita.Tasks.Task;

import java.util.List;

public class Category {
    int categoryId;
    String name;
    String desc;
    //List<Task> tasks;
    public Category(){}

    public Category(int categoryId, String name, String desc) {
        this.categoryId = categoryId;
        this.name = name;
        this.desc = desc;
    }


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int id) {
        this.categoryId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
