package org.repec.karol.superstar;

public class Ingredient {
    private int id;
    private String name;
    private String description;

    Ingredient(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    private Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    private String getDescription() {
        return description;
    }

    public void setDescription() {
        this.description = description;
    }

    @Override
    public String toString() {
        return ("id:" + this.getId() +
                " name: " + this.getName() +
                " description: " + this.getDescription());
    }
}
