package Es2;

public class NumeroTelefono {
    private int numero;

    public NumeroTelefono(int numero){
        this.numero= numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero telefono: " +
                 numero ;
    }
}
