package com.enigma;

import com.enigma.model.Nasabah;
import com.enigma.service.NasabahService;

public class Main {
    public static void main(String[] args) {
        NasabahService service = new NasabahService();
        service.create(new Nasabah(1,"hudzaifah",24,100.01,"baik",5));
        service.create(new Nasabah(2,"miya",25,200.01,"baik",50));
        service.create(new Nasabah(3,"balmon",30,500.01,"baik",12));
        service.create(new Nasabah(4,"angela",14,200.01,"baik",23));
        service.create(new Nasabah(5,"hanabi",23,20.01,"buruk",45));
//        service.read();
//        service.update(1,new Nasabah(1,"hudzaifah2",24,200000000.01,"baik",5));
//        service.read();
//        service.delete(1);
        service.read();

        service.rataRataSaldoNasabah();
        service.rataRataSaldoNasabahBerdasarkanStatusKredit("baik");
        service.getNasabahSaldoTertinggiDanTerendah();
        service.getNasabahUmurTertinggiDanTerendah();
        service.getNasabahTerlama();


    }


}
