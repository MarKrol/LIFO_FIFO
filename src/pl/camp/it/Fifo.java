package pl.camp.it;

import java.util.ArrayList;
import java.util.Scanner;

public class Fifo implements IInterfejs{

    ArrayList<String> fifo = new ArrayList<>();


    @Override
    public void pop() {
        if (fifo.isEmpty()){
            System.out.println("\nKolejka jest pusta !!!");
        }else {
            fifo.remove(0);
            System.out.println("\nUsunięto element z listy!!!");
        }
    }

    @Override
    public String push() {
        return new Scanner(System.in).nextLine();
    }

    public void showFifo(){
        if (fifo.isEmpty()){
            System.out.println("\nKolejka FIFO pusta!!! Wprowadź dane!!!");
        } else{
            System.out.println("\nElemety w liście: ");
            for(int i = 0; i < fifo.size(); i++) {
                System.out.println(i + 1 + ". " + fifo.get(i));
            }
       }
    }

}
