package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio09 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");


        Map<Integer, List<String>> resultado = palavras.stream()
                        .collect(Collectors.groupingBy(String::length));/*p -> lenght*/
        System.out.println(" A ordem do agupamento é essa: " + resultado);

    }

/*2 -Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho.
 No código a seguir, há um exemplo prático do resultado esperado.*/
}
