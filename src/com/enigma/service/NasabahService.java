package com.enigma.service;

import com.enigma.model.Nasabah;
import com.enigma.view.View;

import java.util.ArrayList;
import java.util.Comparator;
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

    public Nasabah getNasabahById(Integer id) throws Exception {
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

    public Nasabah getNasabahSaldoTertinggi(){
        Nasabah nasabahTertinggi = null;
        Nasabah dumpNasabah = new Nasabah();
        dumpNasabah.setSaldo(0.0);

        List<Nasabah> passNasabah = items.stream().filter(x -> {
            if (x.getSaldo() > dumpNasabah.getSaldo()) {
                dumpNasabah.setSaldo(x.getSaldo());
                return true;
            }
            return false;
        }).toList();

        if(!passNasabah.isEmpty()){

            nasabahTertinggi = passNasabah.get(passNasabah.size()-1);
        }

//        System.out.println(nasabahTertinggi);
//        view.saldoNasabahTertinggiDanTerendahSucess(nasabahTertinggi.getSaldo(),0.0);



        return  nasabahTertinggi;
    }





    public void jumlahNasabahBerdasarkanKategoriSaldo(){
        List<Nasabah> terendah = myFilterSaldoKurangDari(1000000.0);
        List<Nasabah> menengah = myFilterSaldoRangeDari(1000000.0,10000000.0);
        List<Nasabah> tertinggi = myFilterSaldoNasabahLebihBesarDari(10000000.00);

//        System.out.println(terendah);
//        System.out.println(menengah);
//        System.out.println(tertinggi);

        view.kastaNasabah(tertinggi,menengah,terendah);
    }


    public List<Nasabah> temukanBeberapaNasabahSaldoTertinggi(){

        Double saldoTertinggi = getNasabahSaldoTertinggi().getSaldo();

        List<Nasabah> daftarNasabahDenganSaldoTertinggi = items.stream().filter(x-> x.getSaldo().equals(saldoTertinggi)).limit(5).toList();

        view.listNasabahSaldoTertinggiSucess(daftarNasabahDenganSaldoTertinggi);

        return daftarNasabahDenganSaldoTertinggi;
    }

    public void usiaDiatas50(){
        List<Nasabah> usiaDiatas50 = items.stream().filter(x -> {
            return x.getUmur() > 50;
        }).toList();

        view.listNasabahUmurTertinggiSucess(usiaDiatas50);
    }

    public List<Nasabah> temukanBeberapaNasabahUsiaTertinggi(){

        Integer umurTertinggi = getNasabahUmurTertinggi().getUmur();


        List<Nasabah> daftarNasabahDenganUmurTertinggi = items.stream().filter(x-> x.getUmur().equals(umurTertinggi)).toList();

        view.listNasabahUmurTertinggiSucess(daftarNasabahDenganUmurTertinggi);

        return daftarNasabahDenganUmurTertinggi;
    }


    public Nasabah getNasabahUmurTertinggi(){
        Nasabah nasabahTertinggi = null;
        Nasabah dumpNasabah = new Nasabah();
        dumpNasabah.setUmur(0);

        List<Nasabah> passNasabah = items.stream().filter(x -> {
            if (x.getUmur() > dumpNasabah.getUmur()) {
                dumpNasabah.setUmur(x.getUmur());
                return true;
            }
            return false;
        }).toList();

        if(!passNasabah.isEmpty()){

            nasabahTertinggi = passNasabah.get(passNasabah.size()-1);
        }

//        System.out.println(nasabahTertinggi);



        return  nasabahTertinggi;
    }

    ArrayList<Nasabah> jumlahNasabahSaldoRendah(){


        return null;
    }

    List<Nasabah> myFilterSaldoNasabahLebihBesarDari(Double targetSaldo)
    {
        Nasabah dumpNasabah = new Nasabah();
        dumpNasabah.setSaldo(targetSaldo);

        return items.stream().filter(x -> {
            if (x.getSaldo() > dumpNasabah.getSaldo()) {
                return true;
            }
            return false;
        }).toList();

    }

    List<Nasabah> myFilterSaldoKurangDari(Double targetSaldo)
    {
        Nasabah dumpNasabah = new Nasabah();
        dumpNasabah.setSaldo(targetSaldo);

        return items.stream().filter(x -> {
            if (x.getSaldo() < dumpNasabah.getSaldo()) {
                return true;
            }
            return false;
        }).toList();

    }

    List<Nasabah> myFilterSaldoRangeDari(Double targetSaldoRendah,Double targetSaldoTinggi)
    {
        Nasabah dumpNasabahRendah = new Nasabah();
        dumpNasabahRendah.setSaldo(targetSaldoRendah);
        Nasabah dumpNasabahTinggi = new Nasabah();
        dumpNasabahTinggi.setSaldo(targetSaldoTinggi);

        return items.stream().filter(x -> {
            if (x.getSaldo() > dumpNasabahRendah.getSaldo() && x.getSaldo() < dumpNasabahTinggi.getSaldo()) {
                return true;
            }
            return false;
        }).toList();

    }


    public Nasabah getNasabahTerlama(){
        Nasabah nasabahTerlama = null;
        Nasabah dumpNasabah = new Nasabah();
        dumpNasabah.setLamaWaktuMenjadiNasabah(0);

        List<Nasabah> passNasabah = items.stream().filter(x -> {
            if (x.getLamaWaktuMenjadiNasabah() > dumpNasabah.getLamaWaktuMenjadiNasabah()) {
                dumpNasabah.setLamaWaktuMenjadiNasabah(x.getLamaWaktuMenjadiNasabah());
                return true;
            }
            return false;
        }).toList();

        if(!passNasabah.isEmpty()){

            nasabahTerlama = passNasabah.get(passNasabah.size()-1);
        }

        view.nasabahTerlama(nasabahTerlama);



        return  nasabahTerlama;
    }

    public Nasabah getNasabahSaldoTerendah(){
        Nasabah nasabahDenganSaldoTertinggi = getNasabahSaldoTertinggi();
        Nasabah dumpNasabah = new Nasabah();
        dumpNasabah.setSaldo(nasabahDenganSaldoTertinggi.getSaldo());
        Nasabah nasabahTerendah = null;

        List<Nasabah> passNasabah = items.stream().filter(x -> {
            if (x.getSaldo() < dumpNasabah.getSaldo()) {
                dumpNasabah.setSaldo(x.getSaldo());
                return true;
            }
            return false;
        }).toList();

        if(!passNasabah.isEmpty()){

            nasabahTerendah = passNasabah.get(passNasabah.size()-1);
        }

//        System.out.println(nasabahTerendah);
        return nasabahTerendah;




    }


    public List<Nasabah> getNasabahTertinggiLimit(Integer limit){
        Nasabah nasabahDenganSaldoTertinggi = getNasabahSaldoTertinggi();
        Nasabah dumpNasabah = new Nasabah();
        dumpNasabah.setSaldo(nasabahDenganSaldoTertinggi.getSaldo());

        ArrayList<Double> seluruhSaldo = null;

        List<Nasabah> nasabahSaldoTertinggi= items.stream()
                        .sorted(Comparator
                        .comparing(Nasabah::getSaldo).reversed())
                        .limit(limit)
                        .toList();


//        System.out.println(nasabahSaldoTertinggi);

//        System.out.println(passNasabah);
        view.listNasabahSaldoTertinggiSucess(nasabahSaldoTertinggi);
        return nasabahSaldoTertinggi;




    }


    public Nasabah getNasabahUmurTerendah(){
        Nasabah nasabahDenganUmurTertinggi = getNasabahUmurTertinggi();
        Nasabah dumpNasabah = new Nasabah();
        dumpNasabah.setUmur(nasabahDenganUmurTertinggi.getUmur());
        Nasabah nasabahTerendah = null;

        List<Nasabah> passNasabah = items.stream().filter(x -> {
            if (x.getUmur() < dumpNasabah.getUmur()) {
                dumpNasabah.setUmur(x.getUmur());
                return true;
            }
            return false;
        }).toList();

        if(!passNasabah.isEmpty()){

            nasabahTerendah = passNasabah.get(passNasabah.size()-1);
        }

//        System.out.println(nasabahTerendah);
        return nasabahTerendah;




    }



    public void getSaldoTerendah(){
        Nasabah terendah = getNasabahSaldoTerendah();
        view.saldoNasabahTerendahSucess(terendah);
    }

    public void getSaldoTertinggi(){
        Nasabah tertinggi = getNasabahSaldoTertinggi();
        view.saldoNasabahTertinggiSucess(tertinggi);
    }


    public void getNasabahSaldoTertinggiDanTerendah(){
        Nasabah tertinggi = getNasabahSaldoTertinggi();
        Nasabah terendah = getNasabahSaldoTerendah();
        view.saldoNasabahTertinggiDanTerendahSucess(tertinggi,terendah);
    }

    public void getNasabahUmurTertinggiDanTerendah(){
        Nasabah tertinggi = getNasabahUmurTertinggi();
        Nasabah terendah = getNasabahUmurTerendah();
        view.umurNasabahTertinggiDanTerendahSucess(tertinggi,terendah);
    }

    public void nasabahTermuda(){
        Nasabah terendah = getNasabahUmurTerendah();
        view.umurNasabahTerendahSucess(terendah);
    }

    public void nasabahTertua(){
        Nasabah tertinggi = getNasabahUmurTertinggi();
        view.umurNasabahTertinggiSucess(tertinggi);
    }

    void isEmpty() throws Exception {
        if(items.isEmpty()) throw new Exception("Data nasabah kosong");
    }

    public double rataRataSaldoNasabah(){
        Nasabah nasabahResult = new Nasabah();
        Boolean flag = false;
        try {
            isEmpty();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            flag = true;
        }

        if(flag) return 0.0;


        long count = items.stream().count();

        Double nasabah = items.stream().reduce((x,y)->{
            Double xSaldo = x.getSaldo();
            Double ySaldo = y.getSaldo();
            Double result = xSaldo + ySaldo;
            nasabahResult.setSaldo(result);
            return nasabahResult;
        }).get().getSaldo();

        double result = nasabah/count;
        view.saldoRataRataSeluruhNasabahSucess(result,"Saldo seluruh nasabah");

//        System.out.println(items);

        return result ;
    };


    public double rataRataSaldoNasabahBerdasarkanStatusKredit(String statusKredit){
        Nasabah saldoNasabahResult = new Nasabah();
        List<Nasabah> nasabahBerdasarkanStatusKreditTertentu = items.stream().filter(x->x.getStatusKredit().equals(statusKredit)).toList();
//        System.out.println(nasabahBerdasarkanStatusKreditTertentu);

        long count = nasabahBerdasarkanStatusKreditTertentu.stream().count();
        Double nasabah = nasabahBerdasarkanStatusKreditTertentu.stream().reduce((x,y)->{
            Double xSaldo = x.getSaldo();
            Double ySaldo = y.getSaldo();
            Double result = xSaldo + ySaldo;
            saldoNasabahResult.setSaldo(result);
            return saldoNasabahResult;
        }).get().getSaldo();

        double result = nasabah/count;
//        System.out.println(nasabah);
//        System.out.println(count);
        view.saldoRataRataSeluruhNasabahSucess(result,"saldo nasabah dengan kategori kredit : " +statusKredit);

        return 0.0;
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
