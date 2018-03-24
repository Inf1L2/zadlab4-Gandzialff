package pl.edu.ur.polab4;

import java.util.Scanner;
import pl.edu.ur.polab4.obliczanieFigur.*;
import pl.edu.ur.polab4.studenci.Smenu;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        int w = 0;
        Scanner s = new Scanner(System.in);

        while (w!= 3){
            System.out.println("1.Zadanie 4, 2.Zadanie 5, 3.Koniec Programu");
            System.out.print("Wybierz zadanie: ");
            w = s.nextInt();
            switch (w) {

                case 1:
                    Figury.figury();
                    break;
                case 2:
                    Smenu.sMenu();
                    break;
                case 3:
                    System.out.println("Koniec Programu");
                    break;
                default:
                    System.err.println("Error!Nieprawidlowy numer Zadania!");

                    break;
            }
        }
    }
    
}
