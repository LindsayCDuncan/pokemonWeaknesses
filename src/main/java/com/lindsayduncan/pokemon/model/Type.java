package com.lindsayduncan.pokemon.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("typedata")
public class Type {
    @Id
    private ObjectId _id;
    private String typeName;
    private double normal;
    private double fire;
    private double water;
    private double electric;
    private double grass;
    private double ice;
    private double fighting;
    private double poison;
    private double ground;
    private double flying;
    private double psychic;
    private double bug;
    private double rock;
    private double ghost;
    private double dragon;
    private double dark;
    private double steel;
    private double fairy;

    public Type(){}

    public Type(ObjectId _id, String typeName, double normal, double fire, double water, double electric, double grass,
                double ice, double fighting, double poison, double ground, double flying, double psychic, double bug,
                double rock, double ghost, double dragon, double dark, double steel, double fairy) {
        this._id = _id;
        this.typeName = typeName;
        this.normal = normal;
        this.fire = fire;
        this.water = water;
        this.electric = electric;
        this.grass = grass;
        this.ice = ice;
        this.fighting = fighting;
        this.poison = poison;
        this.ground = ground;
        this.flying = flying;
        this.psychic = psychic;
        this.bug = bug;
        this.rock = rock;
        this.ghost = ghost;
        this.dragon = dragon;
        this.dark = dark;
        this.steel = steel;
        this.fairy = fairy;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public double getNormal() {
        return normal;
    }

    public void setNormal(double normal) {
        this.normal = normal;
    }

    public double getFire() {
        return fire;
    }

    public void setFire(double fire) {
        this.fire = fire;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getElectric() {
        return electric;
    }

    public void setElectric(double electric) {
        this.electric = electric;
    }

    public double getGrass() {
        return grass;
    }

    public void setGrass(double grass) {
        this.grass = grass;
    }

    public double getIce() {
        return ice;
    }

    public void setIce(double ice) {
        this.ice = ice;
    }

    public double getFighting() {
        return fighting;
    }

    public void setFighting(double fighting) {
        this.fighting = fighting;
    }

    public double getPoison() {
        return poison;
    }

    public void setPoison(double poison) {
        this.poison = poison;
    }

    public double getGround() {
        return ground;
    }

    public void setGround(double ground) {
        this.ground = ground;
    }

    public double getFlying() {
        return flying;
    }

    public void setFlying(double flying) {
        this.flying = flying;
    }

    public double getPsychic() {
        return psychic;
    }

    public void setPsychic(double psychic) {
        this.psychic = psychic;
    }

    public double getBug() {
        return bug;
    }

    public void setBug(double bug) {
        this.bug = bug;
    }

    public double getRock() {
        return rock;
    }

    public void setRock(double rock) {
        this.rock = rock;
    }

    public double getGhost() {
        return ghost;
    }

    public void setGhost(double ghost) {
        this.ghost = ghost;
    }

    public double getDragon() {
        return dragon;
    }

    public void setDragon(double dragon) {
        this.dragon = dragon;
    }

    public double getDark() {
        return dark;
    }

    public void setDark(double dark) {
        this.dark = dark;
    }

    public double getSteel() {
        return steel;
    }

    public void setSteel(double steel) {
        this.steel = steel;
    }

    public double getFairy() {
        return fairy;
    }

    public void setFairy(double fairy) {
        this.fairy = fairy;
    }

    @Override
    public String toString() {
        return "Type{" +
                "_id=" + _id +
                ", typeName='" + typeName + '\'' +
                ", normal=" + normal +
                ", fire=" + fire +
                ", water=" + water +
                ", electric=" + electric +
                ", grass=" + grass +
                ", ice=" + ice +
                ", fighting=" + fighting +
                ", poison=" + poison +
                ", ground=" + ground +
                ", flying=" + flying +
                ", psychic=" + psychic +
                ", bug=" + bug +
                ", rock=" + rock +
                ", ghost=" + ghost +
                ", dragon=" + dragon +
                ", dark=" + dark +
                ", steel=" + steel +
                ", fairy=" + fairy +
                '}';
    }
}
