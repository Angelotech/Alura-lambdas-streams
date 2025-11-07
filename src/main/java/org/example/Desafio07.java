package org.example;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio07 {
    public static void main(String[] args) {
        List<Produto07> Produto = Arrays.asList(
                new Produto07("Smartphone", 800.0, "Eletrônicos"),
                new Produto07("Notebook", 1500.0, "Eletrônicos"),
                new Produto07("Teclado", 200.0, "Eletrônicos"),
                new Produto07("Cadeira", 300.0, "Móveis"),
                new Produto07("Monitor", 900.0, "Eletrônicos"),
                new Produto07("Mesa", 700.0, "Móveis")
        );

        /*List<Produto07>*/
        List<Produto07> Pbaixo = Produto.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos") && p.getPreco() < 1000)
                .sorted(Comparator.comparingDouble(p -> p.getPreco()))
                /*.limit(3)  limitar os 3 primeiros da lista*/
                .collect(Collectors.toList());

        System.out.println(Pbaixo);


        /*7 - Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos nome (String), preco (double)
         e categoria (String). Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000, ordene-os pelo
         preço em ordem crescente e colete o resultado em uma nova lista.*/

    }
}
