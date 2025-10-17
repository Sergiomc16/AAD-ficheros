package modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaIncidencias {
    //lista de Incidencias objeto en la que se operará y se realizarán las búsquedas
    private List<Incidencia> lista;

    public ListaIncidencias() {
        lista = new ArrayList<>();
    }

    public List<Incidencia> getLista() {
        return lista;
    }

    public void setLista(List<Incidencia> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaIncidencias{" +
                "lista=" + lista +
                '}';
    }

}