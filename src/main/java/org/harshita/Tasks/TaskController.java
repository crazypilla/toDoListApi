package org.harshita.Tasks;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    private TaskService taskService;
    @RequestMapping("/tasks")
    public List<Task> categories(){
        return taskService.getAllTasks();
    }
    @RequestMapping("/tasks/{id}")
    public Task getTopic(@PathVariable int id)
    {  // int idd=Integer.parseInt(id);
        return taskService.getTask(id);
    }

    @RequestMapping(method=RequestMethod.POST,value="/tasks")
    public void addTopic(@RequestBody Task cat)
    {
        taskService.addTask(cat);
    }

    @RequestMapping(method=RequestMethod.PUT,value="/tasks/{id}")
    public void updateTopic(@RequestBody Task cat,@PathVariable int id)
    {
        taskService.updateTask(cat,id);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/tasks/{id}")
    public void deleteTopic(@RequestBody Task cat,@PathVariable int id)
    {
        taskService.deleteTopic(cat,id);
    }



}
