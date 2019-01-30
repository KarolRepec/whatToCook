package org.repec.karol.superstar;

public class Ingredient {
    int id;
    String name;
    String description;

    public Ingredient(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Integer getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(){
        this.description = description;
    }

    @Override
    public String toString() {
        return ("id:"+this.getId()+
                " name: "+ this.getName() +
                " description: "+ this.getDescription());
    }
}