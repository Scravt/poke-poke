package logic.pokemos.lista;


import logic.pokemos.clases.planta;
import logic.pokemos.pokemonBase;

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
    public void recibirDanio(int danio) {

    }

    @Override
    protected void incapacitar() {

    }

    @Override
    protected int atacar(int i) {
        switch (i) {
            case 1:
                hojasNavaja();
                break;
            case 2:
                absorverVida();
                break;
            case 3:
                paralisis();
                break;
            case 4:
                follaje();
                break;
        }

        return i;
    }


}
