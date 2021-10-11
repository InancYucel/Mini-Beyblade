package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("BEYBLADE");
        System.out.println("Çıkış için q'ya basın");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz?");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else{

                BeybladeFabrikası fabrika = new BeybladeFabrikası();
                Beyblade beyblade = fabrika.beybladeÜret(islem);

                if(beyblade == null){

                    System.out.println("Lütfen geçerli bir beyblade ismi girin...");
                }

                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldiri();
                    beyblade.kutsalCanavarOrtayaCikar();
                }

            }

        }
    }
}
