/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.studenci;

/**
 *
 * @author matkr
 */
public class Student {

    private String imie;
    private String nazwisko;
    private int nr_indeks;
    private String nazwa_specjalnosci;
    private int rok_studiow;
    private boolean exists;




//Get

    public boolean isExists() {
        return exists;
    }
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNr_indeks() {
        return nr_indeks;
    }

    public String getNazwa_specjalnosci() {
        return nazwa_specjalnosci;
    }

    public int getRok_studiow() {
        return rok_studiow;
    }
    //Set
    public void setExists(boolean exists) {
        this.exists = exists;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNr_indeks(int nr_indeks) {
        this.nr_indeks = nr_indeks;
    }

    public void setNazwa_specjalnosci(String nazwa_specjalnosci) {
        this.nazwa_specjalnosci = nazwa_specjalnosci;
    }

    public void setRok_studiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }

    //Constructors
    public Student(String imie, String nazwisko, int nr_indeks, String nazwa_specjalnosci, int rok_studiow,boolean exists) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeks = nr_indeks;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.rok_studiow = rok_studiow;
        this.exists=exists;
    }

    public Student(String imie, String nazwisko, int nr_indeks, String nazwa_specjalnosci) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeks = nr_indeks;
        this.nazwa_specjalnosci = nazwa_specjalnosci;

    }

    public Student(String imie, String nazwisko, int nr_indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeks = nr_indeks;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student()
    {

    }
    //Method
    public void pokazDane() {
        System.out.println("Student");
        System.out.println("Imię: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Nr. indeksu: " + this.nr_indeks);
        System.out.println("Nazwa Specjalności: " + this.nazwa_specjalnosci);
        System.out.println("Rok Studiów: "+ this.rok_studiow);
    }

}

