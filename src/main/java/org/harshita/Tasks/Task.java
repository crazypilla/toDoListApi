package org.harshita.Tasks;

import java.util.Date;

public class Task {
    int id;
    String name;
    String desc;
    Date deadLine;
    int categoryId;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Task(int id, String name, String desc, Date deadLine, int categoryId) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.deadLine = deadLine;
        this.categoryId=categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }
}
