package com.example.arqdsis.provaint81521928;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.TreeSet;

/**
 * Vinicius Lopes de Oliveira
 * Ra:81521928.
 */

public class SectionIndexBuilder {

    public static Object[] buildSectionHeaders(Times[] paises){
        ArrayList<String> resultado = new ArrayList<>();
        TreeSet<String> usados = new TreeSet<>();
        for(Times times:paises){
            String letra = times.getNome().substring(0,1);
            if((!usados.contains(letra))){
                resultado.add(letra);
            }
            usados.add(letra);
        }
        return resultado.toArray(new Object[0]);
    }
    /**
     * Vinicius Lopes de Oliveira
     * Ra:81521928.
     */
        public static Hashtable<Integer, Integer> buildSectionForPositionMap(Times[] times){
        Hashtable<Integer, Integer> resultados = new Hashtable<>();
        TreeSet<String> usados = new TreeSet<>();

        int secao = -1;

        for(int i = 0; i < times.length; i++){
            String letra = times[i].getNome().substring(0,1);

            if(!usados.contains(letra)){
                secao++;
                usados.add(letra);
            }
            resultados.put(i, secao);
        }
        return resultados;
    }

    /**
     * Vinicius Lopes de Oliveira
     * Ra:81521928.
     */
    public static Hashtable<Integer, Integer> buildPositionForSectionMap(Times[] times){
        Hashtable<Integer, Integer> resultados = new Hashtable<>();
        TreeSet<String> usados = new TreeSet<>();

        int secao = -1;

        for(int i = 0; i < times.length; i++){
            String letra = times[i].getNome().substring(0,1);

            if(!usados.contains(letra)){
                secao++;
                usados.add(letra);
                resultados.put(secao, i);
            }
        }
        return resultados;
    }
}
