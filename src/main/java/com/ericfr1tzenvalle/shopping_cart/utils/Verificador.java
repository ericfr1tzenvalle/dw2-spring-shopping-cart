package com.ericfr1tzenvalle.shopping_cart.utils;

import java.util.regex.Pattern;

/**
 * Classe utilitária para verificar características de texto.
 */
public  class Verificador {

    private static final Pattern TEM_NUMEROS = Pattern.compile("\\d");

    public static boolean temNumeros(String texto) {
        return TEM_NUMEROS.matcher(texto).find();
    }
}
