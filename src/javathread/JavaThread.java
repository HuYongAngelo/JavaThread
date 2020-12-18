package javathread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaThread {

    public static void main(String[] args) {
//        Processo T1 = new Processo("T1");
//        Processo T2 = new Processo("T2");

        Conto conto =new Conto(1000);
        Sportello ATM1=new Sportello(conto,"mamma");
        Sportello ATM2=new Sportello(conto,"papa");
        Thread mamma=new Thread(ATM1);
        Thread papa=new Thread(ATM2);
        mamma.start();
        papa.start();
        int qualeThread;// 0 = mamma ; 1 = papà
        int cheOperazione;// 0 = versa ; 1 = preleva
        int quanto;
        while(true){
            qualeThread = (int) (Math.random()*2);
            if(qualeThread==0){
                System.out.println("\nthread: Mamma");
            }else{
                System.out.println("\nthread: Papà");
            }

            cheOperazione = (int)(Math.random()*2);
            if(cheOperazione==0){
                System.out.println("operazione: Versa");
            }else{
                System.out.println("operazione: Preleva");
            }
            
            
            quanto = (int)(Math.random()*501);
            System.out.println("valore: "+quanto);
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(JavaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}