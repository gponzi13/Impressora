package br.com.digitalhouse;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {

        Contrato contrato = new Contrato("contrato legal", "txt");
        Foto selfie = new Foto("foto", "foto");
        Documento doc = new Documento("documento legal", "doc");
        Impressora hp = new Impressora();
        hp.adicionarImprimivel(contrato);
        hp.adicionarImprimivel(doc);
        hp.adicionarImprimivel(selfie);
        hp.imprimirTudo();

    }
}
