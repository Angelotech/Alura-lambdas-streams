package org.example;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;
import java.util.stream.Collectors;

public class Desafio013 {
    public static void main(String[] args) {
        List<Produto013> produtos = Arrays.asList(
                new Produto013("Smartphone", 800.0, "Eletrônicos"),
                new Produto013("Notebook", 1500.0, "Eletrônicos"),
                new Produto013("Teclado", 200.0, "Eletrônicos"),
                new Produto013("Cadeira", 300.0, "Móveis"),
                new Produto013("Monitor", 900.0, "Eletrônicos"),
                new Produto013("Mesa", 700.0, "Móveis")
        );

        // nova lista
        List<Produto013> eletronicos = produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos") && p.getPreco() < 1000)
                .sorted(Comparator.comparing(p -> p.getPreco()))
                .collect(Collectors.toList());
       System.out.println(eletronicos);
        System.out.println("===================================================================");

//6 -  Dada a lista de produtos acima, agrupe-os por categoria em um Map<String, List<Produto>>.
        Map<String, List<Produto013>> eletronic = produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos")) /*filtro*/
                .collect(Collectors.groupingBy(Produto013::getCategoria)); /*coleção*/
        System.out.println("esses são os eletronicos: " + "\n" + eletronic);/*impresão*/
        System.out.println("===================================================================");


//7 - Dada a lista de produtos acima, conte quantos produtos há em cada categoria e armazene em um Map<String, Long.
        Map<String, Long> classificacao = produtos.stream()
                .collect(Collectors.groupingBy(Produto013::getCategoria,Collectors.counting())); /*Agrupar por categoria (e contar)*/
        System.out.println(classificacao);
        System.out.println("===================================================================");


//8 - Dada a lista de produtos acima, encontre o produto mais caro de cada categoria e armazene o resultado em um Map<String, Optional<Produto>>.
        Map<String, Optional<Produto013>> maximo = produtos.stream()
                .collect(Collectors.groupingBy(Produto013::getCategoria,
                        Collectors.maxBy(Comparator.comparing(Produto013::getPreco))));
        System.out.println(maximo);
        System.out.println("===================================================================");

 //9 - Dada a lista de produtos acima, calcule o total dos preços dos produtos em cada categoria e armazene o resultado em um Map<String, Double>.
        Map<String, Double> somar = produtos.stream()
                .collect(Collectors.groupingBy(Produto013::getCategoria,//Agrupar por categoria
                Collectors.summingDouble(Produto013::getPreco)));//faz a somar de cada valor
        System.out.println(somar);
        System.out.println("===================================================================");





    }
}