package com.enigma;

import com.enigma.model.Nasabah;
import com.enigma.service.NasabahService;

public class Main {
    public static void main(String[] args) {
        NasabahService service = new NasabahService();
        service.create(new Nasabah(1,"hudzaifah",24,100.01,"baik",5));
        service.create(new Nasabah(2,"miya",24,200.01,"baik",5));
        service.create(new Nasabah(3,"balmon",24,500.01,"baik",5));
        service.create(new Nasabah(4,"angela",24,200.01,"baik",5));
        service.create(new Nasabah(5,"angela",24,200.01,"buruk",5));
//        service.read();
//        service.update(1,new Nasabah(1,"hudzaifah2",24,200000000.01,"baik",5));
//        service.read();
//        service.delete(1);
        service.read();

        service.rataRataSaldoNasabah();
        service.rataRataSaldoNasabahBerdasarkanStatusKredit("baik");


    }


}
