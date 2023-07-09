package pokemos.lista;

import pokemos.clases.roca;
import pokemos.pokemonBase;

public class onix extends pokemonBase implements roca {
    public onix() {
    }

    public onix(double vida, String nombre, String tipo, int velocidad, int evasion, int precision) {
        super(vida, nombre, tipo, velocidad, evasion, precision);
    }

    @Override
    public String toString() {
        return "onix{}";
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
    public void avalancha() {

    }

    @Override
    public void lanzaRocas() {

    }

    @Override
    public void Endurecer() {

    }

    @Override
    public void Pedrada() {

    }
}
