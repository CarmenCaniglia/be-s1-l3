package Es2;

public class Sim {
    //Attributi
    private NumeroTelefono numeroTelefono;
    private double credito;
    private Chiamata[] ultimaChiamata;

    //costruttore
    public Sim(NumeroTelefono numeroTelefono){
        this.numeroTelefono= numeroTelefono;
        this.credito = 0;
        this.ultimaChiamata= new Chiamata[5];
    }


    //Metodi
    public void aggiungiChiamata (Chiamata chiamata){
        for (int i =0; i < ultimaChiamata.length - 1; i++){
            ultimaChiamata[i] = ultimaChiamata[i + 1];
        }
        ultimaChiamata[ultimaChiamata.length - 1]= chiamata;
    }

    public void stampaSim(){
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito: " + credito + "€");
        System.out.println("Ultima chiamata: ");
        for(Chiamata chiamata : ultimaChiamata){
            if (chiamata != null){
                System.out.println(chiamata);
            }
        }
    }
}
