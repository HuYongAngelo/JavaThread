package javathread;

public class Sportello implements Runnable {
    private Conto conto;
    private String utente;
    public Sportello(Conto c,String utente){
        conto=c;
        this.utente=utente;
    }

    @Override
    public void run(){

        System.out.println("Sono partito : "+conto.saldo());

    }
    public void versa(int somma){
        conto.versa(somma);

    }
    public void preleva(int somma){
        conto.preleva(somma);

    }
}
