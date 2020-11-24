package javathread;

public class Processo extends Thread {
    private String s;
    
    public Processo (String s) {
        this.s = s;
        this.start();
    }
    
    public void run() {
        for (;;) {
            System.out.println(s);
        }
    }
}