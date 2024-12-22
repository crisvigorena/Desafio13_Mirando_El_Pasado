package com.inforcap.main;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {

    public static void main(String[] args) {

        Queue<String> juegos = new LinkedList<>();
        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");

        juegos.forEach(juego -> System.out.println(juego));
        System.out.println(juegos.size());

        juegos.poll();

        String primer = juegos.peek();

        System.out.println("-----------------------------");
        juegos.forEach(juego -> System.out.println(juego));
        System.out.println(juegos.size());

        System.out.println(primer);




    }

}
