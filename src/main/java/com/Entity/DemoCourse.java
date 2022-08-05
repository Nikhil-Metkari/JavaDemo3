package com.Entity;


import org.hibernate.annotations.Table;

import javax.persistence.*;

@Entity
public class DemoCourse {

    @Id
    private int id;
    private String name;
    private String description;

    public DemoCourse(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DemoCourse() {
    }

    @Override
    public String toString() {
        return "DemoCourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
