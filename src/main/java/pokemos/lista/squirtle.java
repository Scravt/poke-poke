package pokemos.lista;

import pokemos.clases.acuatico;
import pokemos.pokemonBase;

public class squirtle extends pokemonBase implements acuatico {

    public squirtle() {
    }

    public squirtle(double vida, String nombre, String tipo, int velocidad, int evasion, int precision) {
        super(vida, nombre, tipo, velocidad, evasion, precision);
    }


    @Override
    public String toString() {
        return "squirtle{}";
    }

    @Override
    public void ataqueDeBorbujas() {

    }

    @Override
    public void hidrobomba() {

    }

    @Override
    public void pistolaDeAgua() {

    }

    @Override
    public void AroAgua() {

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
