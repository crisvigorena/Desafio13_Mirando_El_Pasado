package com.inforcap.main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

    public static void main(String[] args) {

        Set<String> invitados = new TreeSet<>();
        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        invitados.forEach(System.out::println);

        Set<String> posiblesInvitados = new TreeSet<>(Arrays.asList("Jorge","Francisco","Marcos"));

        Set<String> todosLosInvitados = new TreeSet<>();

        todosLosInvitados.addAll(invitados);
        todosLosInvitados.addAll(posiblesInvitados);

        System.out.println("------------------------------------");
        todosLosInvitados.forEach(System.out::println);

        todosLosInvitados.remove("Jorge");
        System.out.println("------------------------------------");
        todosLosInvitados.forEach(System.out::println);








    }

}
