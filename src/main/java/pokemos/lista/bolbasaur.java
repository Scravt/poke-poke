package pokemos.lista;


import pokemos.clases.planta;
import pokemos.pokemonBase;

public class bolbasaur extends pokemonBase implements planta {
    public bolbasaur() {
    }

    public bolbasaur(double vida, String nombre, String tipo, int velocidad, int evasion, int precision) {
        super(vida, nombre, tipo, velocidad, evasion, precision);
    }

    @Override
    public String toString() {
        return "bolbasaur{}";
    }

    @Override
    public void hojasNavaja() {

    }

    @Override
    public void absorverVida() {

    }

    @Override
    public void paralisis() {

    }

    @Override
    public void follaje() {

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
