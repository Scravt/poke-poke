package pokemos;

public class pokemonBaseImpl extends pokemonBase {
    @Override
    protected void curar() {

    }

    @Override
    protected void recibirDanio() {

    }

    @Override
    protected void incapacitar() {

    }

    public pokemonBaseImpl(double vida, String nombre, String tipo, int velocidad, int evasion, int precision) {
        super(vida, nombre, tipo, velocidad, evasion, precision);
    }
}
