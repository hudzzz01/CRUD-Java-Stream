package com.enigma;

import com.enigma.model.Nasabah;
import com.enigma.service.NasabahService;
import com.enigma.view.View;

public class Main {
    public static void main(String[] args) {
        NasabahService service = new NasabahService();
//        service.create(new Nasabah(1,"hudzaifah",24,100000.01,"baik",5));
//        service.create(new Nasabah(2,"miya",25,2000000.01,"baik",50));
//        service.create(new Nasabah(3,"balmon",30,5000000.01,"baik",12));
//        service.create(new Nasabah(4,"angela",14,20000000.01,"baik",23));
//        service.create(new Nasabah(5,"hanabi",23,22000000.01,"buruk",45));
//        service.create(new Nasabah(6,"hudzaifah",24,200000.01,"baik",5));
//        service.create(new Nasabah(7,"roger",23,22000000.01,"buruk",45));
//        service.create(new Nasabah(8,"Ling",30,22000000.01,"buruk",45));
//        service.create(new Nasabah(9,"Nana",30,22000000.01,"buruk",45));
//        service.create(new Nasabah(10,"Beneta",30,22000000.01,"buruk",45));
//        service.create(new Nasabah(11,"Hilos",30,22000000.01,"buruk",45));
//        service.create(new Nasabah(12,"Estes",30,22000000.01,"buruk",45));
////        service.read();
////        service.update(1,new Nasabah(1,"hudzaifah2",24,200000000.01,"baik",5));
////        service.read();
////        service.delete(1);
//        service.read();
//
//        service.rataRataSaldoNasabah();
//        service.rataRataSaldoNasabahBerdasarkanStatusKredit("baik");
//        service.getNasabahSaldoTertinggiDanTerendah();
//        service.getNasabahUmurTertinggiDanTerendah();
//        service.getNasabahTerlama();
//        service.jumlahNasabahBerdasarkanKategoriSaldo();
//        service.temukanBeberapaNasabahUsiaTertinggi();
//
//        service.getSaldoTertinggi();
//        service.getSaldoTerendah();
//        service.temukanBeberapaNasabahSaldoTertinggi();
//
//        service.nasabahTertua();
//        service.nasabahTermuda();


        View view = new View();

        Integer input = 0;
        try {
            while (!input.equals(99)) {
                input = view.menu(service);
                if (input.equals(1)) {
                    Nasabah nasabahBaru = view.createData();
                    service.create(nasabahBaru);
                } else if (input.equals(2)) {
                    service.read();

                } else if (input.equals(3)) {
                    Nasabah nasabahBaru = view.updateData(service);
                    service.update(nasabahBaru.getId(),nasabahBaru);

                } else if (input.equals(4)) {
                    Integer id = view.delete(service);
                    service.delete(id);
                } else if (input.equals(5)) {
                    view.readById(service);
                } else if (input.equals(6)) {
                    service.rataRataSaldoNasabah();
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }





    }


}
