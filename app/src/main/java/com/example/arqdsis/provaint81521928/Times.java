package com.example.arqdsis.provaint81521928;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Vinicius Lopes de Oliveira
 * Ra:81521928.
 */
public class Times implements Serializable {
    public ArrayList<String> getNome() {
        return nome;
    }
    /**
     * Vinicius Lopes de Oliveira
     * Ra:81521928.
     */
    public void setNome(ArrayList<String> nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Times{" +
                "nome=" + nome +
                ", pontos=" + pontos +
                '}';
    }
    /**
     * Vinicius Lopes de Oliveira
     * Ra:81521928.
     */
    public ArrayList<String> getPontos() {
        return pontos;
    }
    /**
     * Vinicius Lopes de Oliveira
     * Ra:81521928.
     */
    public void setPontos(ArrayList<String> pontos) {
        this.pontos = pontos;
    }

    private ArrayList<String> nome;
    private ArrayList<String> pontos;
}
