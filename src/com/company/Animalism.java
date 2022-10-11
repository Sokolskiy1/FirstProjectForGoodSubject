package com.company;

public class Animalism implements PaintingInterface {

    String animal;
    Integer age;
    String autore;
    public Animalism(Integer age, String autore,String animal) {
        //super(age, autore);
        this.animal = animal;
        this.age=age;
        this.autore = autore;
    }
    public Animalism() {
        this.animal = "hhh";
        this.age=0;
        this.autore = "hhh";
    }
    public Animalism(Animalism animalism) {
        this.animal = animalism.animal;
        this.age=animalism.age;
        this.autore = animalism.autore;
    }
    public String getAnimal() {
        return animal;
    }

    public String getText()
    {return "Животное на рисунке: ";}

    public String getTextName()
    {return "Анимализм ";}

    @Override
    public void destructor() {
        System.gc();
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

    @Override
    public String getObject() {
        return animal;
    }
}
