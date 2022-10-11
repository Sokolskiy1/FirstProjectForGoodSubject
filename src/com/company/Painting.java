package com.company;

public abstract class Painting {

    Integer age;
    String autore;

    public Painting(Integer age, String autore) {
        this.age = age;
        this.autore = autore;
    }
    public Painting() {
        this.age = 0;
        this.autore = "пусто";
    }

    public Integer getAge() {
        return age;
    }

    public String getAutore() {
        return autore;
    }
    public Painting(Painting painting)
    {
        this.age =painting.age;
        this.autore=painting.autore;
    }

}
