package com.inforcap.main;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {

    public static void main(String[] args) {

        Map<String, Integer> golosinas = new TreeMap<>();
        golosinas.put("Chocman",100);
        golosinas.put("Trululu",100);
        golosinas.put("Centella",100);
        golosinas.put("Kilate",50);
        golosinas.put("Miti miti",30);
        golosinas.put("Trago Traga",150);
        golosinas.put("Tableton",5);

        golosinas.forEach((key,value) -> System.out.println(key + " | " + value));

        System.out.println("----------------------");
        for(Map.Entry<String,Integer> elemento : golosinas.entrySet()){
            System.out.println(elemento.getKey() + " | " + elemento.getValue());
        }

        System.out.println("----------------------");
        golosinas.entrySet().stream().filter(precio -> precio.getValue() < 100).forEach(System.out::println);





    }
}
