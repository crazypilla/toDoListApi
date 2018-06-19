package org.harshita.Categories;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CategoryService {

    public static List<Category> categories=new ArrayList<>(Arrays.asList(new Category(1,"bills",
            "bill related tasks"),new Category(2,"job hunt","prep for job hunt")));

    public static List<Category> getAllCategories(){
        return categories;
    }

    public static Category getCategory(int id){
       // return categories;
       return categories.stream().filter(c->c.getCategoryId()==id).findFirst().get();
    }

    public static void addCategory(Category cat){
        // return categories;
        //return categories.stream().filter(c->c.getId()==id).findFirst().get();
        categories.add(cat);
    }
    public static void updateCategory(Category cat,int id)
    {
        for(int i=0;i<categories.size();i++)
        {
            if(categories.get(i).getCategoryId()==id)
            {
                categories.set(i,cat);
                return;
            }
        }

    }

    public static void deleteTopic(Category cat, int id) {
        categories.removeIf(t->t.getCategoryId()==(id));
    }

}
