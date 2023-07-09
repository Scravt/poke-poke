package batalla;

import jugador.jugadorPC;
import pokemos.lista.pikachu;

public class batalla {
    pikachu pika = new pikachu();


    jugadorPC jugadorPC = new jugadorPC();
    public void ejecutarAtaque() {
        int opcion = jugadorPC.atacar();
        System.out.println("eligio la opcion numero   " + opcion);

        switch (opcion) {
            case 1:
                pika.impacTrueno();
                break;
            case 2:
                pika.cargar();
                break;
            case 3:
                pika.gigarayo();
                break;
            case 4:
                pika.punioRayo();
                break;
            case 5:
                pika.toString();
                break;
            default:
                System.out.println("fuera de rango");
                break;
        }
    }



}
