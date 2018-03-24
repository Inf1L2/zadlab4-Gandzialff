/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.studenci;
import pl.edu.ur.polab4.Main;

import java.util.Scanner;

public class Smenu {

    public static void sMenu()
    {
        int w;
        Studenci st = new Studenci();
        st.tabadd();

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("1. Dodaj Studenta, 2.Edytuj studenta, 3.Usun studenta, 4.Wyswietl studenta, 5.Wyswietl wszystkich studentow, " +
                    "6.Wyswietl zakres studentow, 7.Koniec Zadania");
            w = s.nextInt();
            switch (w)
            {
                case 1:
                    st.addStud();
                    break;
                case 2:
                    st.editStud();
                    break;
                case 3:
                    st.delete();
                    break;
                case 4:
                    st.showStud();
                    break;
                case 5:
                    st.showall();
                    break;
                case 6:
                    st.zakres();
                    break;
                case 7:
                    Main.main(new String[0]);
                    break;
                    default:
                        break;


            }
        }while(w!=7);

        }

}
