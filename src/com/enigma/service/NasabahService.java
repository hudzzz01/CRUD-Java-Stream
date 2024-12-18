package com.enigma.service;

import com.enigma.model.Nasabah;
import com.enigma.view.View;

import java.util.ArrayList;
import java.util.List;

public class NasabahService implements CRUD{
    private List<Nasabah> items = new ArrayList<>();
    private View view = new View();


    void cekIdAvaible(Nasabah nasabah) throws Exception {
        boolean isIdAvaible = !items.stream().anyMatch(x-> x.getId().equals(nasabah.getId()));
        if(!isIdAvaible) throw new Exception("Id tidak dapat digunakan");
    }
//    void cekNikAvaible(Nasabah nasabah) throws Exception {
//        boolean isNikAvaible = !items.stream().anyMatch(x-> x.getNik().equals(nasabah.getNik()));
//        if(!isNikAvaible) throw new Exception("nik tidak dapat digunakan");
//    }
//    void cekNoHpAvaible(Nasabah nasabah) throws Exception {
//        boolean isPhoneNumberAvaible = !items.stream().anyMatch(x-> x.getNoHp().equals(nasabah.getNoHp()));
//        if (!isPhoneNumberAvaible) throw new Exception("phone number tidak dapat digunakan");
//    }

    Nasabah getNasabahById(Integer id) throws Exception {
        List<Nasabah> nasabah = items.stream().filter(n -> n.getId() == id).toList();
        if(nasabah.isEmpty()){
            throw new Exception("data tidak ditemukan");
        }

        return nasabah.get(0);
    }

    Integer getIndexItem(Nasabah nasabah) throws Exception {
        Integer index = items.indexOf(nasabah);
        if (index.equals(-1)) throw new Exception("Index tidak ditemukan");
        return  index;
    }


    @Override
    public Nasabah create(Nasabah nasabah) {

        boolean flagOut = false;

        try {
            cekIdAvaible(nasabah);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            flagOut = true;
        }

//        try {
//            cekNikAvaible(nasabah);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            flagOut = true;
//        }

//        try {
//            cekNoHpAvaible(nasabah);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            flagOut = true;
//        }

        if (flagOut) {
            view.createFail();
            return null;
        }

        items.add(nasabah);
        view.createSucess(nasabah);

        return nasabah;
    }

    @Override
    public ArrayList<Nasabah> read() {
        view.readAllSuccess((ArrayList<Nasabah>) items);
        return null;
    }

    @Override
    public Nasabah update(Integer id, Nasabah nasabah) {
        Integer index = -1;
        boolean flagOut = false;
        Nasabah oldNasabah = null;

        try {
            oldNasabah = getNasabahById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            flagOut = true;
        }


        if (flagOut) {
            view.updateFail();
            return null;
        }

        try {
            index = getIndexItem(oldNasabah);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            flagOut = true;
        }

        try {
            if(!id.equals(nasabah.getId())){
                cekIdAvaible(nasabah);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            flagOut = true;
        }
//
//        try {
//            cekNikAvaible(nasabah);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            flagOut = true;
//        }
//
//        try {
//            cekNoHpAvaible(nasabah);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            flagOut = true;
//        }

        if (flagOut) {
            view.updateFail();
            return null;
        }

        items.set(index,nasabah);
        view.updateSuccess(nasabah);

        return nasabah;
    }

    @Override
    public Nasabah delete(Integer id) {
        boolean flagOut = false;
        Nasabah oldNasabah = null;

        try {
            oldNasabah = getNasabahById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            flagOut = true;
        }


        if (flagOut) {
            view.deleteFail();
            return null;
        }

        items.remove(oldNasabah);
        view.deleteSuccess(oldNasabah);

        return oldNasabah;
    }
}
