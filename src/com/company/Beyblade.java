package com.company;

public class Beyblade {

    private String beybladeci;
    private int donusHizi;
    private  int saldiriGucu;

    //Otomatik Constructor
    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }


    //Getter ve Setter metodları
    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }



    public void saldiri(){

        System.out.println(beybladeci + " " + saldiriGucu + " ve " + donusHizi + "ile saldiriyor...");

    }

    public void kutsalCanavarOrtayaCikar(){

        System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor");

    }

    public void bilgileriGoster(){
        System.out.println("Beybladeci İsmi: " + beybladeci);
        System.out.println("Saldırı Gücü: " + saldiriGucu);
        System.out.println("Donüş Hızı: " + donusHizi);
    }




}
