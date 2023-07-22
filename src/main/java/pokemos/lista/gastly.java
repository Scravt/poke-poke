package pokemos.lista;


import pokemos.clases.fantasma;
import pokemos.pokemonBase;

public class gastly extends pokemonBase implements fantasma {
    public gastly() {
        this.vida = 150;
        this.tipo = "Fantasma";
    }

    public gastly(double vida, String nombre, String tipo, int velocidad, int evasion, int precision) {
        super(vida, nombre, tipo, velocidad, evasion, precision);
    }

    @Override
    public String toString() {
        return "gastly{}";
    }

    @Override
    public int rayoConfuso() {
        System.out.println("Gastly ha realizado un rayo confuso");
        return 47;
    }

    @Override
    public int tinieblas() {
        System.out.println("Gastly ha realizado un ataque de tienieblas");
        return 100;
    }

    @Override
    public int lenguatazo() {
        System.out.println("Gastly te dio un Lenguetazo");
        return 30;
    }

    @Override
    public int orbesEspectro() {
        System.out.println("Gastly ha lanzado Orbes espectro");
        return 60;

    }

    @Override
    protected void curar() {
        this.vida = vida + 75;
    }

    @Override
    protected void recibirDanio() {

    }

    @Override
    public void recibirDanio(int danio) {
        if (this.vida>danio){
            this.vida = vida - danio;

            System.out.println("Gastly recibio daño, su vida acutal es  "+vida + "de 150");
        } else {
            incapacitar();
        }

    }

    @Override
    protected void incapacitar() {
        this.vida = 0;
        System.out.println("Gastly ya no puede continuar");
    }

    @Override
    public int atacar(int i) {
        int ataque = 0;
        switch (i) {
            case 1:
                ataque = rayoConfuso();
                break;
            case 2:
                ataque = tinieblas();
                break;
            case 3:
                ataque =lenguatazo();
                break;
            case 4:
                ataque = orbesEspectro();
                break;
            default:
                System.out.println("Gastly no entendio la orden y no hizo nada");
        }

        return ataque;
    }
}
