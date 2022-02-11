
package br.com.walescko.aula03.model;

import java.util.Objects;

public class Jogador {
    private String nome;
    private int qtGol;
    private int qtAssistencia;
    
    public Jogador(String nome){
        this.nome = nome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return nome.equals(jogador.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtGol() {
        return qtGol;
    }

    public void setQtGol(int qtGol) {
        this.qtGol = qtGol;
    }

    public int getQtAssistencia() {
        return qtAssistencia;
    }

    public void setQtAssistencia(int qtAssistencia) {
        this.qtAssistencia = qtAssistencia;
    }
}
