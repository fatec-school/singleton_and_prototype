package com.nickolss;

public class Main {
    public static void main(String[] args) {
        FilaDeImpressao fila = FilaDeImpressao.getInstance();

        Certificado certificadoOriginal = new Certificado("Analise e Desenvolvimento de Sistemas");

        Certificado clone1 = certificadoOriginal.clonar();
        Certificado clone2 = certificadoOriginal.clonar();

        clone1.setNomeAluno("Aluno 1");
        clone2.setNomeAluno("Aluno 2");

        fila.imprimir(clone1.getDados());
        fila.imprimir(clone2.getDados());

        System.out.println("clone1 == clone2 : " + (clone1 == clone2));
    }
}
