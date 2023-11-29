package Es1;

public class Rettangolo {

    //Attributi
    private int altezza;
    private int larghezza;

    //Costruttore
    public Rettangolo(int altezza, int larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    //Metodi
    public int calcoloArea(){
        return altezza*larghezza;

    }

    public int calcoloPerimetro(){
        return 2 * (altezza + larghezza);
    }


}
