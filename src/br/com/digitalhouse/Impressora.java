package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Impressora {

    private List<Imprimivel> imprimiveis = new ArrayList<>();

    public void adicionarImprimivel(Imprimivel imprimivel) {
        imprimiveis.add(imprimivel);
    }

    public void imprimirTudo() {
        for (int i = 0; i < imprimiveis.size(); i++) {
            imprimiveis.get(i).imprimir();
        }

    }

}
