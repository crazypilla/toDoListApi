package org.harshita.Categories;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    private CategoryService catService;
    @RequestMapping("/categories")
    public List<Category> categories(){
        return catService.getAllCategories();
    }
    @RequestMapping("/categories/{categoryId}")
    public Category getTopic(@PathVariable int categoryId)
    {  // int idd=Integer.parseInt(id);
        return catService.getCategory(categoryId);
    }

    @RequestMapping(method=RequestMethod.POST,value="/categories")
    public void addTopic(@RequestBody Category cat)
    {
        catService.addCategory(cat);
    }

    @RequestMapping(method=RequestMethod.PUT,value="/categories/{categoryId}")
    public void updateTopic(@RequestBody Category cat,@PathVariable int categoryId)
    {
        catService.updateCategory(cat,categoryId);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/categories/{categoryId}")
    public void deleteTopic(@RequestBody Category cat,@PathVariable int categoryId)
    {
        catService.deleteTopic(cat,categoryId);
    }



}
