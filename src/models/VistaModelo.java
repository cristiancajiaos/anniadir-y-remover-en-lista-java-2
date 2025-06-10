package models;

import java.util.List;
import java.util.ArrayList;

public class VistaModelo {

    private List<String> lista = new ArrayList();

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public boolean estaTextoEnLista(String texto) {
        return this.lista.contains(texto);
    }

    public List<String> agregarLista(String texto) {
        this.lista.add(texto);
        return this.getLista();
    }

    public List<String> removerTextoDeLista(String texto) {
        do {
            int indiceTexto = this.lista.indexOf(texto);
            this.lista.remove(indiceTexto);
        } while (this.estaTextoEnLista(texto));
        return this.getLista();
    }

}
