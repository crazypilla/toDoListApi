package org.harshita.Tasks;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class TaskService {

    public static List<Task> tasks=new ArrayList<>(Arrays.asList(new Task(1,"leetcode",
            "prepare leet code",new Date(2018,7,31),2),new Task(2,"resume","update resume",
                    new Date(2018,6,30),2),
            new Task(3,"discover","pay discover card",new Date(2018,7,1),1)));

    public static List<Task> getAllTasks(){
        return tasks;
    }

    public static Task getTask(int id){
        // return categories;
        return tasks.stream().filter(c->c.getId()==id).findFirst().get();
    }

    public static void addTask(Task cat){
        // return categories;
        //return categories.stream().filter(c->c.getId()==id).findFirst().get();
        tasks.add(cat);
    }
    public static void updateTask(Task cat,int id)
    {
        for(int i=0;i<tasks.size();i++)
        {
            if(tasks.get(i).getId()==id)
            {
                tasks.set(i,cat);
                return;
            }
        }

    }



    public static void deleteTopic(Task cat, int id) {
        tasks.removeIf(t->t.getId()==(id));
    }



}
