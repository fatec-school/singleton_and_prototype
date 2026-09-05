package com.nickolss;

public class Certificado implements Cloneable {

    private String nomeCurso;
    private String nomeAluno;

    public Certificado(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.nomeAluno = "";
    }

    public Certificado clonar() {
        try {
            return (Certificado) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setNomeAluno(String nome) {
        this.nomeAluno = nome;
    }

    public String getDados() {
        return "Certificado de Conclusao\nCurso: " + nomeCurso + "\nAluno: " + nomeAluno;
    }
}
