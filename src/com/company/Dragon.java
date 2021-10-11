package com.company;

public class Dragon extends Beyblade{

    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu, kutsalCanavar);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {

        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor");
        System.out.println(getBeybladeci() + " ın Saldırısı : Hayalet Kasırgası");
        //System.out.println(getBeybladeci() + "'ın gizli yeteneği:");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();

        System.out.println("Kutsal Canavar Adı: " + kutsalCanavar );
        System.out.println("Gizli yetenek : " + gizliYetenek);
    }


}
