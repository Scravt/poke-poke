package jugador;

public class jugadorPC {
    private String nombre = "Lucius";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int atacar(){
        return (int) (Math.random() * 5) + 1;
    }


}
