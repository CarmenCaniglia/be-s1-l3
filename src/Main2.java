import Es2.Chiamata;
import Es2.NumeroTelefono;
import Es2.Sim;

public class Main2 {
    public static void main(String[] args) {
        Sim sim = new Sim(new NumeroTelefono(333445566));
        sim.aggiungiChiamata(new Chiamata(new NumeroTelefono(333225563), 5));
        sim.aggiungiChiamata(new Chiamata(new NumeroTelefono(123456789), 8));
        sim.stampaSim();
    }
}
