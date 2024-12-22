package com.inforcap.main;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {

        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("Free");
        marcas.add("Odontine");
        marcas.add("Sega");
        marcas.add("Cohache");
        marcas.add("Sip Sup");
        marcas.add("Smartcom");
        marcas.add("Camay");
        marcas.add("Sorbete Letelier");
        marcas.add("Atari");
        marcas.add("Conmodore");
        marcas.add("Sinclair");

        marcas.forEach(System.out::println);

        marcas.add("Blockbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");
        System.out.println("------------------------------------");
        marcas.forEach(marca->System.out.println(marca));

        marcas.set(11,"Blockbuster");

        marcas.remove("Carrefour");

        System.out.println("------------------------------------");
        marcas.forEach(marca->System.out.println(marca));

        List<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("Salo");
        posiblesMarcas.add("Banco de Talca");
        posiblesMarcas.add("Filitos");

        marcas.addAll(posiblesMarcas);

        System.out.println("------------------------------------");
        marcas.forEach(marca->System.out.println(marca));









    }
}
