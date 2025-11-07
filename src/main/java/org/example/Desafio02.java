package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio02 {

        public static void main(String[] args) {
            List<String> palavras = Arrays.asList("java", "stream", "lambda");

            palavras.stream()
                    .map(p -> p.toUpperCase())
                    .collect(Collectors.toList())
                    .forEach(System.out::println);



        }
        /*2 - Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.*/

}
