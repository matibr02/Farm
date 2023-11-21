package org.example;

import java.util.Scanner;

public class Animal extends Entity{
    static int nexid = 1;
    public String species;
    @Override
    public String getDescription() {
        return "Id: " + id + " Name: " + name + " Species: " + species;
    }

    public Animal(int id, String name, String species) {
        this.id = id;
        if (id >= nexid){
            nexid = id + 1;
        }
        this.name = name;
        this.species = species;

    }
    public Animal(String name, String species) {
        id = nexid;
        nexid ++;
        this.name = name;
        this.species = species;
    }
    public String getCSV() {
        return id + "," + name + "," + species;
    }
    public String getList() {
        return id + " " + name + " " + species;
    }
}
