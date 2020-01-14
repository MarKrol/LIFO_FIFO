package pl.camp.it;

import java.util.ArrayList;
import java.util.Scanner;

public class Lifo implements IInterfejs {

    ArrayList<String> lifo = new ArrayList<>();

    @Override
    public void pop() {
        if (lifo.isEmpty()){
            System.out.println("\nKolejka jest pusta !!!");
        }else {
            lifo.remove(lifo.size()-1);
            System.out.println("\nUsunięto element z listy!!!");
        }
    }

    @Override
    public String push() {
        return new Scanner(System.in).nextLine();
    }

    public void showLifo(){
        if (lifo.isEmpty()){
            System.out.println("\nKolejka LIFO pusta!!! Wprowadź dane!!!");
        } else{
            System.out.println("\nElemety w liście: ");
            for(int i = 0; i < lifo.size(); i++) {
                System.out.println(i + 1 + ". " + lifo.get(i));
            }
        }
    }
}
