package com.lindsayduncan.pokemon.dto;

import java.util.List;

public class PokemonDto {
    private String name;
    private String number;
    private List types;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List getTypes() {
        return types;
    }

    public void setTypes(List types) {
        this.types = types;
    }

    public void calculateWeaknesses(){
        for(Object type : types){
            String typeName = type.toString().toLowerCase();



        }
    }
}
