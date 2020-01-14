package pl.camp.it;

import java.util.Scanner;

public class Gui {

    Fifo fifo = new Fifo();
    Lifo lifo = new Lifo();

    private void printMenu(){
        System.out.println("\n------------------ MENU -----------------------");
        System.out.println("1. Wyświetl ementy z listy - FIFO.");
        System.out.println("2. Dodaj element do listy - FIFO.");
        System.out.println("3. Usuń element z listy - FIFO. ");
        System.out.println("4. Wyświetl ementy z listy - LIFO.");
        System.out.println("5. Dodaj element do listy - LIFO.");
        System.out.println("6. Usuń element z listy - LIFO. ");
        System.out.println("7. Wyjście z programu.");
        System.out.println("-----------------------------------------------\n");
        System.out.print("Wybrano opcję: ");
    }

    private void Menu(){
        printMenu();
        switch(new Scanner(System.in).nextLine()){
            case "1":
                fifo.showFifo();
                break;
            case "2":
                System.out.print("\nWprowadź dane: ");
                fifo.fifo.add(fifo.push());
                break;
            case "3":
                fifo.pop();
                break;
            case "4":
                lifo.showLifo();
                break;
            case "5":
                System.out.print("\nWprowadź dane: ");
                lifo.lifo.add(lifo.push());
                break;
            case "6":
                lifo.pop();
                break;
            case "7":
                System.exit(0);
                break;
            default:
                System.out.println("\nWprowadzono niepoprawną opcję MENU!!! Spróbuj jeszcze raz!!!");
                break;
        }
        Menu();
    }

    public void showMenu(){
        Menu();
    }
}
