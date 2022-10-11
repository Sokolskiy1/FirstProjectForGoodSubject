package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //Animalism animalism = new Animalism(1, "fff", "ggg");

        Animalism animalism1 = new Animalism(1, "Mogelan", "cat");
        AllegoricalGenre allegoricalgenre1 = new AllegoricalGenre(200, "jordj", "Boryn");
        list.add(animalism1);
        list.add(allegoricalgenre1);
        list.add(new Animalism(28, "Advard", "dog"));
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        while (exit == false) {

            System.out.println("Выберите, что сделать");
            System.out.println("1) Добавить эллемент");
            System.out.println("2) Удалить эллемент");
            System.out.println("5) Выход");
            //in = new Scanner(System.in);
            int num = in.nextInt();
            if (num == 1) {
                System.out.println("Добавить Аннимализм или Аллигорический жанр?");
                System.out.println("1) Аннимализм");
                System.out.println("2) Аллигорический жанр");
                int cnum = in.nextInt();
                if (cnum == 1) {
                    try {
                    System.out.println("Введите возраст");
                    int age = in.nextInt();
                    System.out.println("Введите Имя автора");
                    String autorName = in.next();
                    System.out.println("Введите животное автора");
                    String animal = in.next();

                    Animalism animalism = new Animalism(age, autorName, animal);
                    System.out.println("Создан обьект:\n" + "\nс возрастом: " +
                            animalism.getAge() + "\nс именем автора: " + animalism.getAutore() + "\nи на изображении: " + animalism.getAnimal());
                    list.add(animalism);
                    }
                    catch (InputMismatchException e){System.out.println("введите число, а не букву"); in.close();}
                }

                if (cnum == 2) {
                    System.out.println("Введите возраст");
                    int age = in.nextInt();
                    System.out.println("Введите Имя автора");
                    String autorName = in.next();
                    System.out.println("Введите тайный смысл");
                    String SecretMeaning = in.next();

                    AllegoricalGenre allegoricalgenre = new AllegoricalGenre(age, autorName, SecretMeaning);
                    oPostrof();
                    System.out.println("Создан обьект:\n" + "\nс возрастом: " +
                            allegoricalgenre.getAge() + "\nс именем автора: " + allegoricalgenre.getAutore() + "\nи тайна изображения заключается в: " + allegoricalgenre.getSecretMeaning());
                    oPostrof();
                    list.add(allegoricalgenre);
                }

            }
            if (num==2)
            {
                //printList(list);
                if (list.size()==0)
                {System.out.println("В листе нету обьектов");}
                else {
                    printList1(list);
                    System.out.println("Введите номер, который вы хотите удалить");
                    int code = in.nextInt();
                    if (code <= list.size()) {
                        list.remove(code - 1);
                    }
                }
            }
            if(num == 5){
                System.out.println("Спасибо что воспользовались утилитой. Деньги кидать на номер +79806306743");
                exit = true;}
        }
       // Animalism animals = new Animalism(in.nextInt(),"hhh", "cat");
       // System.out.println(animals.animal);
        in.close();
    }
    public static void oPostrof()
    {
        System.out.println(" ");
        System.out.println("--------------------");
    }


    public static void printList1(ArrayList<PaintingInterface> list) {
        oPostrof();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+1+") " + list.get(i).getTextName());
            System.out.println("Год создания: "+list.get(i).getAge());
            System.out.println("Автор творения: "+list.get(i).getAutore());
            System.out.println(list.get(i).getText() + list.get(i).getObject());
            oPostrof();
        }}
}
