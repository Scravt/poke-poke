package pokemos.lista;

import pokemos.clases.tierra;
import pokemos.pokemonBase;

public class diglett extends pokemonBase implements tierra {
    public diglett() {
    }

    public diglett(double vida, String nombre, String tipo, int velocidad, int evasion, int precision) {
        super(vida, nombre, tipo, velocidad, evasion, precision);
    }

    @Override
    public String toString() {
        return "diglett{}";
    }

    @Override
    protected void curar() {

    }

    @Override
    protected void recibirDanio() {

    }

    @Override
    protected void incapacitar() {

    }

    @Override
    public void ataqueArena() {

    }

    @Override
    public void terremoto() {

    }

    @Override
    public void excavar() {

    }

    @Override
    public void dispararLodo() {

    }
}