package com.company;

public class AllegoricalGenre implements PaintingInterface {
    String SecretMeaning;
    Integer age;
    String autore;
    public AllegoricalGenre(Integer age, String autore,String SecretMeaning) {
        this.age=age;
        this.SecretMeaning = SecretMeaning;
        this.autore = autore;
    }
    public AllegoricalGenre() {
        this.SecretMeaning = "hhh";
        this.age=0;
        this.autore = "hhh";
    }
    public AllegoricalGenre(AllegoricalGenre allegoricalgenre) {
        this.SecretMeaning = allegoricalgenre.SecretMeaning;
        this.age=allegoricalgenre.age;
        this.autore = allegoricalgenre.autore;
    }
    public String getSecretMeaning() {
        return SecretMeaning;
    }
    public String getElements() {
        return SecretMeaning;
    }


    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public String getAutore() {
        return autore;
    }

    @Override
    public void PaintingInterface(Painting painting) {

    }

    public String getText()
    {return "Скрытый смысл: ";}

    public String getTextName()
    {return "Аллегория ";}

    @Override
    public void destructor() {
        System.gc();
    }

    @Override
    public String getObject() {
        return SecretMeaning;
    }
}
