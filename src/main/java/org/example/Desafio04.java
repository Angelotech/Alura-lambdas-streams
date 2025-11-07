package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio04 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        List<String> unicas = palavras.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unicas);


    }
    /* 4 - Dada a lista de Strings abaixo, remova as duplicatas
    (palavras que aparecem mais de uma vez) e imprima o resultado. */
}
