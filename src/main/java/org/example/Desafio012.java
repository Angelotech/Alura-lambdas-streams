package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio012 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> result = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n %2 == 0));
        System.out.println("OS NUMEROS PARES SÃO: " + result.get(true));
        System.out.println("OS NUMEROS IMPARES SÃO: " + result.get(false) );


        // código do particionamento da lista
    }
    /*5 - Dada uma lista de números inteiros, separe os números pares dos ímpares.*/
}
