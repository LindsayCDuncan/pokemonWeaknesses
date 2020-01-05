package com.lindsayduncan.pokemon.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("typedata")
public class Type {
    @Id
    private ObjectId _id;
    private String type;
    private Weaknesses weaknesses;

    public Type(){}

    public Type(ObjectId _id, String type, Weaknesses weaknesses) {
        this._id = _id;
        this.type = type;
        this.weaknesses = weaknesses;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Weaknesses getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(Weaknesses weaknesses) {
        this.weaknesses = weaknesses;
    }

    @Override
    public String toString() {
        return "Type{" +
                "_id=" + _id +
                ", type='" + type + '\'' +
                ", weaknesses=" + weaknesses +
                '}';
    }
}
