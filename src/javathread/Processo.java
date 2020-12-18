package javathread;

public class Processo extends Thread {
    private String s;

    public Processo(String s) {
        this.s = s;
        this.start();
    }

    public void run() {
        int i=0;
        for (;;i++) {
            System.out.println(s+i);
        }
    }
}