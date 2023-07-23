package logic.battle;

import logic.jugador.jugadorPC;
import logic.pokemos.lista.pikachu;

public class batalla {
    pikachu pika = new pikachu();



    jugadorPC jugadorPC = new jugadorPC();
    public void ejecutarAtaque() {
        int opcion = jugadorPC.atacar();
        System.out.println("eligio la opcion numero   " + opcion);




    }



}
