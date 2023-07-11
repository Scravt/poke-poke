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
        System.out.println("he realizado una carga");

    }

    @Override
    public void gigarayo() {
        System.out.println("he realizado un gigarayo");

    }

    @Override
    public void punioRayo() {
        System.out.println("he realizado un punioRayo");

    }
    @Override
    public void atacar(int i) {
        switch (i) {
            case 1:
                impacTrueno();
                break;
            case 2:
                cargar();
                break;
            case 3:
                gigarayo();
                break;
            case 4:
                punioRayo();
                break;
        }
    }


}
