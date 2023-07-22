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
    public void aroAgua() {

    }

    @Override
    protected void curar() {

    }

    @Override
    protected void recibirDanio() {

    }

    @Override
    public void recibirDanio(int danio) {

    }

    @Override
    protected void incapacitar() {

    }

    @Override
    protected int atacar(int i) {
        switch (i) {
            case 1:
                ataqueDeBorbujas();
                break;
            case 2:
                hidrobomba();
                break;
            case 3:
                pistolaDeAgua();
                break;
            case 4:
                aroAgua();
                break;
        }

        return i;
    }


}
