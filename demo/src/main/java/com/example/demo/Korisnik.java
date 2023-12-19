package com.example.demo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Korisnik {
    private StringProperty ime=new SimpleStringProperty("");
    private StringProperty prezime=new SimpleStringProperty("");
    private StringProperty eMail=new SimpleStringProperty("");
    private StringProperty username=new SimpleStringProperty("");
    private StringProperty lozinka=new SimpleStringProperty("");

    public Korisnik(){}

    public Korisnik(String ime, String prezime, String eMail, String username, String lozinka){
        this.ime=new SimpleStringProperty(ime);
        this.prezime=new SimpleStringProperty(prezime);
        this.eMail=new SimpleStringProperty(eMail);
        this.username=new SimpleStringProperty(username);
        this.lozinka=new SimpleStringProperty(lozinka);
    }

    public Korisnik(SimpleStringProperty ime, SimpleStringProperty prezime, SimpleStringProperty eMail, SimpleStringProperty username, SimpleStringProperty lozinka){
        this.ime=ime;
        this.prezime=prezime;
        this.eMail=eMail;
        this.username=username;
        this.lozinka=lozinka;
    }

    @Override
    public String toString() {
        return ime.get() + " " + prezime.get();
    }

    public void setIme(String ime){
        this.ime.set(ime);
   }
    public String getIme(){
        return this.ime.get();
    }
    public StringProperty imeProperty(){
        return ime;
    }

    public void setPrezime(String prezime){
        this.prezime.set(prezime);
    }
    public String getPrezime(){
        return this.prezime.get();
    }
    public StringProperty prezimeProperty(){
        return prezime;
    }

    public void setEmail(String email){
        this.eMail.set(email);
    }
    public String getEmail(){
        return this.eMail.get();
    }
    public StringProperty eMailProperty(){
        return eMail;
    }

    public void setUsername(String username){
        this.username.set(username);
    }
    public String getUsername(){
        return this.username.get();
    }
    public StringProperty usernameProperty(){
        return username;
    }

    public void setLozinka(String pass){
        this.lozinka.set(pass);
    }
    public String getLozinka(){
        return this.lozinka.get();
    }
    public StringProperty lozinkaProperty(){
        return lozinka;
    }
}
