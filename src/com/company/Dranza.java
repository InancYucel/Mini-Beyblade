package com.company;

public class Dranza extends Beyblade {

    private String kutsalCanavar;


    public Dranza(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu, kutsalCanavar);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {

        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor");
        System.out.println(getBeybladeci() + " ın Saldırısı : Kızıl Kılıç");

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();

        System.out.println("Kutsal Canavar Adı: " + kutsalCanavar );

    }


}
