package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio05 {
    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> numerosPrimos = listaDeNumeros.stream()
                .flatMap(l -> l.stream())  // Achatar as sublistas em uma única stream
                .filter(EhPrimo::ehPrimo)  // Filtrar apenas números primos
                .sorted()               // Ordenar em ordem crescente
                .collect(Collectors.toList()); // Coletar em uma lista

        System.out.println(numerosPrimos); // Saída esperada: [2, 3, 5, 7, 11]
    }




}
