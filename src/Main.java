import Es1.Rettangolo;

public class Main {

    public static void main(String[] args){
        //creo il rettangolo in base al costruttore creato in Rettangolo.java
        Rettangolo rettangolo1 = new Rettangolo(5,9);
        Rettangolo rettangolo2 = new Rettangolo(3,10);

        //Riutilizzo la funzione per stampare a video
        stampaRettangolo(rettangolo1);

        stampaDueRettangoli(rettangolo1, rettangolo2);
    }


    public static void stampaRettangolo(Rettangolo rettangolo){
        //richiamo i metodi scritti in Rettangolo.java
        System.out.println("L'area del rettangolo è: " + rettangolo.calcoloArea());
        System.out.println("Il perimetro del rettangolo è: " + rettangolo.calcoloPerimetro());
    }

    public static void stampaDueRettangoli (Rettangolo rettangolo1, Rettangolo rettangolo2){
        System.out.println("Primo rettangolo");
        stampaRettangolo(rettangolo1);
        System.out.println("Secondo rettangolo");
        stampaRettangolo(rettangolo2);

        System.out.println("Somma dei rettangoli:");
        System.out.println("Somma delle aree: " + (rettangolo1.calcoloArea()+ rettangolo2.calcoloArea()));
        System.out.println("Somma dei perimetri: "+ (rettangolo1.calcoloPerimetro()+ rettangolo2.calcoloPerimetro()));
    }
}
