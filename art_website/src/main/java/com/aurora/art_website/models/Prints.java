package com.aurora.art_website.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Prints {
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    private Integer price;

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
