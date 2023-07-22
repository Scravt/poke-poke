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
    public void recibirDanio(int danio) {

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
    public void endurecer() {

    }

    @Override
    public void pedrada() {

    }

    @Override
    protected int atacar(int i) {
        switch (i) {
            case 1:
                avalancha();
                break;
            case 2:
                lanzaRocas();
                break;
            case 3:
                endurecer();
                break;
            case 4:
                pedrada();
                break;
        }

        return i;
    }
}
