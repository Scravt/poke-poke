package logic.pokemos;

public abstract class pokemonBase {
    protected int vida;
    protected String nombre;
    protected String tipo;
    protected int velocidad;
    protected int evasion;
    protected int precision;

    protected abstract void curar();
    protected abstract void recibirDanio();

    public abstract void recibirDanio(int danio);

    protected abstract void incapacitar();

    protected abstract int atacar(int i);



    public pokemonBase() {
    }

    public pokemonBase(double vida, String nombre, String tipo, int velocidad, int evasion, int precision) {
        this.vida = (int) vida;
        this.nombre = nombre;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.evasion = evasion;
        this.precision = precision;
    }



    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = (int) vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
}
