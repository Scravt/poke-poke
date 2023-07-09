package pokemos.lista;


import pokemos.clases.fantasma;
import pokemos.pokemonBase;

public class gastly extends pokemonBase implements fantasma {
    public gastly() {
    }

    public gastly(double vida, String nombre, String tipo, int velocidad, int evasion, int precision) {
        super(vida, nombre, tipo, velocidad, evasion, precision);
    }

    @Override
    public String toString() {
        return "gastly{}";
    }

    @Override
    public void rayoConfuso() {

    }

    @Override
    public void tinieblas() {

    }

    @Override
    public void lenguatazo() {

    }

    @Override
    public void orbesEspectro() {

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
