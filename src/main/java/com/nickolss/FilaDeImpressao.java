package com.nickolss;

public class FilaDeImpressao {

    private static FilaDeImpressao instance;

    private FilaDeImpressao() {
    }

    public static FilaDeImpressao getInstance() {
        if (instance == null) {
            instance = new FilaDeImpressao();
        }
        return instance;
    }

    public void imprimir(String documento) {
        System.out.println("[Impressora Central] Imprimindo:");
        System.out.println(documento);
        System.out.println("----------------------------------------");
    }
}
