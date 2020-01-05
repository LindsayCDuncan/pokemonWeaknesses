package com.lindsayduncan.pokemon.model;

import java.util.HashMap;
import java.util.Map;

public class Weaknesses {

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

    public Weaknesses(double normal, double fire, double water, double electric, double grass, double ice, double fighting,
                      double poison, double ground, double flying, double psychic, double bug, double rock, double ghost,
                      double dragon, double dark, double steel, double fairy) {
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

    public Map<String, Double> weaknessAsMap(){
        Map<String, Double> weaknessMap = new HashMap<>();

        weaknessMap.put("normal", normal);
        weaknessMap.put("fire", fire);
        weaknessMap.put("water", water);
        weaknessMap.put("electric", electric);
        weaknessMap.put("grass", grass);
        weaknessMap.put("ice", ice);
        weaknessMap.put("fighting", fighting);
        weaknessMap.put("poison", poison);
        weaknessMap.put("ground", ground);
        weaknessMap.put("flying", flying);
        weaknessMap.put("psychic", psychic);
        weaknessMap.put("bug", bug);
        weaknessMap.put("rock", rock);
        weaknessMap.put("ghost", ghost);
        weaknessMap.put("dragon", dragon);
        weaknessMap.put("dark", dark);
        weaknessMap.put("steel", steel);
        weaknessMap.put("fairy", fairy);

        return weaknessMap;
    }

    @Override
    public String toString() {
        return "Weaknesses{" +
                "normal=" + normal +
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
