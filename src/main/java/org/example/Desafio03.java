package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);


        List<Integer> convertidos = numeros.stream()
                .filter(n -> n %2 !=0) /* filtro */
                .map(n -> n * 2) /*modifiquei*/
                .collect(Collectors.toList()); /*converção para lista*/
                System.out.println(convertidos); /*percorri a lista*/
        // código para filtragem e coleta

    }

    /*3 - Dada a lista de números inteiros abaixo,
    filtre os números ímpares, multiplique cada um
    por 2 e colete os resultados em uma nova lista.*/

}
