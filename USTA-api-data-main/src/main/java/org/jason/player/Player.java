package org.jason.player;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player {
    @Id
    private Integer id;
    private String name;
    private double rating;

    public Player() {}

    public Player(Integer id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void SetId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
