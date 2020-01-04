package com.lindsayduncan.pokemon.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("pokedata")
public class Pokemon {
    @Id
    private ObjectId _id;
    private String name;
    private String number;
    private List types;

    public Pokemon(){}

    public Pokemon(ObjectId _id, String name, String number, List types) {
        this._id = _id;
        this.name = name;
        this.number = number;
        this.types = types;
    }

    public String get_id(){
        return _id.toHexString();
    }

    public void set_id(ObjectId _id){
        this._id = _id;
    }

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

    @Override
    public String toString() {
        return "Pokemon{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", types=" + types +
                '}';
    }
}
