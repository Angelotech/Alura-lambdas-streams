package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio01 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        numeros.stream()
                .filter(n -> n %2 == 0)
                .collect(Collectors.toList())
                        .forEach(System.out::println);
















    }
    /*1 - Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.
    *
    * Conhecemos a API de streams do Java, que usa bastante o conceito de expressões lambda para realizar
    * várias operações encadeadas em coleções. Saber distinguir os diversos métodos dos streams Java permite
    * que sejamos capazes de resolver cada vez mais problemas na programação.
    * Vamos colocar mais métodos dos streams em prática? Dica: caso não se lembre de nenhum método usado em
    * vídeo, pesquise na documentação . Você também pode usar ferramentas de IA para auxiliar a descobrir qual
    * o melhor método a ser utilizado.
    *
    * */

}
