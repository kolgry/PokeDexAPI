package com.example.pokedex.api.response;

import java.io.Serializable;
import java.util.List;

public class Card implements Serializable {
    private String id;
    private String name;
    private int nationalPokedexNumber;
    private String imageUrl;
    private String imageUrlHiRes;
    private List<String> types;
    private String supertype;
    private String subtype;
    private String evolvesFrom;
    private String hp;
    private String number;
    private String artist;
    private String rarity;
    private String series;
    private String set;
    private String setCode;

    private List<Ataque> attacks;
    private List<Fraqueza> weaknesses;
    private List<Resistencia> resistances;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNationalPokedexNumber() {
        return nationalPokedexNumber;
    }

    public void setNationalPokedexNumber(int nationalPokedexNumber) {
        this.nationalPokedexNumber = nationalPokedexNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrlHiRes() {
        return imageUrlHiRes;
    }

    public void setImageUrlHiRes(String imageUrlHiRes) {
        this.imageUrlHiRes = imageUrlHiRes;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getSupertype() {
        return supertype;
    }

    public void setSupertype(String supertype) {
        this.supertype = supertype;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getEvolvesFrom() {
        return evolvesFrom;
    }

    public void setEvolvesFrom(String evolvesFrom) {
        this.evolvesFrom = evolvesFrom;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getSetCode() {
        return setCode;
    }

    public void setSetCode(String setCode) {
        this.setCode = setCode;
    }

    public List<Ataque> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Ataque> attacks) {
        this.attacks = attacks;
    }

    public List<Fraqueza> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<Fraqueza> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public List<Resistencia> getResistances() {
        return resistances;
    }

    public void setResistances(List<Resistencia> resistances) {
        this.resistances = resistances;
    }
}
