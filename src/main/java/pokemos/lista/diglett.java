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
    public void recibirDanio(int danio) {

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
    @Override
    protected int atacar(int i) {
        switch (i) {
            case 1:
                ataqueArena();
                break;
            case 2:
                terremoto();
                break;
            case 3:
                excavar();
                break;
            case 4:
                dispararLodo();
                break;
        }

        return i;
    }


}
