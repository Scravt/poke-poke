package pokemos.lista;

import pokemos.clases.fuego;
import pokemos.pokemonBase;

public class charmander extends pokemonBase implements fuego {
    public charmander() {
    }

    public charmander(double vida, String nombre, String tipo, int velocidad, int evasion, int precision) {
        super(vida, nombre, tipo, velocidad, evasion, precision);
    }

    @Override
    public String toString() {
        return "charmander{}";
    }

    @Override
    public void ascuas() {

    }

    @Override
    public void lansallamas() {

    }

    @Override
    public void punioDeFuego() {

    }

    @Override
    public void llamarada() {

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
}