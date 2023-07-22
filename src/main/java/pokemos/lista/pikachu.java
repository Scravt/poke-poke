package pokemos.lista;

import pokemos.clases.electrico;
import pokemos.pokemonBase;


public class pikachu extends pokemonBase implements electrico {

    public pikachu() {
        this.vida = 150;
        this.tipo = "electrico";
    }

    public pikachu(double vida, String nombre, String tipo, int velocidad, int evasion, int precision) {
        super(vida, nombre, tipo, velocidad, evasion, precision);
        this.vida = 150;
        this.tipo = "electrico";
    }

    @Override
    public String toString() {
        return "pikachu{}";
    }

    @Override
    public void curar() {
        this.vida = vida + 50;

    }

    @Override
    protected void recibirDanio() {

    }


    public void recibirDanio(int danio) {
        if (this.vida>danio){
            this.vida = vida - danio;
            System.out.println( "la vida actual de pikachu es de " + vida);
        } else {
            incapacitar();
        }
    }

    @Override
    public void incapacitar() {
        this.vida = 0;
        System.out.println("Pîkachu ya no puede continuar");

    }
    @Override
    public int impacTrueno() {

        System.out.println("he realizado un ataque electric");
        return 50;
    }

    @Override
    public int cargar() {
        System.out.println("he realizado una carga");
        return 0;
    }

    @Override
    public int gigarayo() {
        System.out.println("he realizado un gigarayo");
        return 75;

    }

    @Override
    public int punioRayo() {
        System.out.println("he realizado un punioRayo");
        return 40;

    }
    @Override
    public int atacar(int i) {
        int ataque = 0;
        switch (i) {
            case 1:
                ataque = impacTrueno();
                break;
            case 2:
                ataque = cargar();
                break;
            case 3:
                ataque = gigarayo();
                break;
            case 4:
                ataque = punioRayo();
                break;
            default:
                System.out.println("pikachu no entendio la orden y no hizo nada");
        }
        return ataque;
    }
}
