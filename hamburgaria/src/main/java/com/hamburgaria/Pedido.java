package com.hamburgaria;

import java.util.Arrays;
import java.util.List;

public class Pedido {

    private static final List<String> CARDAPIO = Arrays.asList(
        "Cheeseburger", 
        "Hamburger", 
        "Bacon Burger", 
        "Veggie Burger"
    );

    public String realizarPedido(String nomeHamburguer) {
        if (CARDAPIO.contains(nomeHamburguer)) {
            return "Pedido confirmado: " + nomeHamburguer;
        } else {
            return "Item não está disponível no cardápio: " + nomeHamburguer;
        }
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        System.out.println(pedido.realizarPedido("Cheeseburger")); 
        System.out.println(pedido.realizarPedido("Fish Burger"));
    }
}