package com.enigma;

import com.enigma.model.Nasabah;
import com.enigma.service.NasabahService;

public class Main {
    public static void main(String[] args) {
        NasabahService service = new NasabahService();
        service.create(new Nasabah(1,"hudzaifah",24,200000000.01,"baik",5));
        service.read();
        service.update(1,new Nasabah(1,"hudzaifah2",24,200000000.01,"baik",5));
        service.read();
        service.delete(1);
        service.read();
    }


}
