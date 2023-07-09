package pokemos.lista;

import pokemos.clases.electrico;
import pokemos.pokemonBase;

public class pikachu extends pokemonBase implements electrico {
    public pikachu() {
    }

    public pikachu(double vida, String nombre, String tipo, int velocidad, int evasion, int precision) {
        super(vida, nombre, tipo, velocidad, evasion, precision);
    }

    @Override
    public String toString() {
        return "pikachu{}";
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
    public void impacTrueno() {
        System.out.println("he realizado un ataque electric");
    }

    @Override
    public void cargar() {

    }

    @Override
    public void gigarayo() {

    }

    @Override
    public void punioRayo() {

    }
}
