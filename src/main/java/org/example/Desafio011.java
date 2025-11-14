package org.example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio011 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        int soma = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(soma);



        // código da filtragem e agrupamento dos dados
    }
    /*4 - Dada a lista de números inteiros abaixo,
     calcule a soma dos quadrados dos números pares.1 pares 2 quadrados 3soma*/
}
