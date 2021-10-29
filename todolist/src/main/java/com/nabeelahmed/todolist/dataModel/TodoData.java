package com.nabeelahmed.todolist.dataModel;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TodoData {
    private Long id;
    private String task;
    private boolean done;
    private Date updateDate;

    public TodoData() {
        //Empty constructor
    }

    public TodoData(Long id, String task, boolean done) {
        this.id = id;
        this.task = task;
        this.done = done;
    }

    /**
     * This shall automatically generate id on every entry of POST
     *
     * @return
     */
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    /**
     * This updates time stamp on every POST and PUT operation
     *
     * @return
     */
    @UpdateTimestamp
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
