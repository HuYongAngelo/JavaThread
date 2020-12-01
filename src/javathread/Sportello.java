package javathread;

public class Sportello implements Runnable {
    Conto conto;

    public Sportello(Conto conto) {
        this.conto = conto;
    }
    
    public void run() {
    }
    
    public void versa(int somma) {
        conto.versa(somma);
    }
}
