package com.example.arqdsis.provaint81521928;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Vinicius Lopes de Oliveira
 * Ra:81521928.
 */
public class Data {
    Times [] lista;
    public static ArrayList<ArrayList<String>> listatimes(Times[] times){
        ArrayList<ArrayList<String>> nome = new ArrayList<>();
        for (Times time : times) {
            nome.add(time.getNome());
        }
        return nome;
    }
    lista = paises.toArray(new Pais[0]);
    //ordena baseado no compareTo sobrescrito na classe Pais
    //para funcionar, a classe pais precisa implementar a interface Comparable
        Arrays.sort(lista);

        return lista;
}
