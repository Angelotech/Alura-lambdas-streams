package org.example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);


        IntSummaryStatistics num = numeros.stream()
                        .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("o maior numero é: " + num.getMax() );

        /*1 - Dada a lista de números inteiros a seguir, encontre o maior número dela. */
        // código do agrupamento
    }




}
