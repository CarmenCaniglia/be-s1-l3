package Es2;

public class Chiamata {
    private NumeroTelefono numeroChiamato;
    private int durataMin;

    public Chiamata (NumeroTelefono numeroChiamato, int durataMin){
        this.numeroChiamato = numeroChiamato;
        this.durataMin = durataMin;
    }

    @Override
    public String toString() {
        return "Numero: " +
                 numeroChiamato +
                ", Durata: " + durataMin +
                "'";
    }
}
