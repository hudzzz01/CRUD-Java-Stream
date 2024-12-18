package com.enigma.view;

import com.enigma.model.Nasabah;
import com.enigma.service.InputHandler;
import com.enigma.service.NasabahService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private InputHandler inputHandler = new InputHandler(new Scanner(System.in));

    public void saldoRataRataSeluruhNasabahSucess(double saldo , String action){
        System.out.println("----------------------------------------");
        System.out.println("rata-rata saldonya adalah : " + saldo);
        System.out.println("----------------------------------------");
        System.out.println("Berhasil menghitung rata-rata saldo " + action + "  ദ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println("----------------------------------------");
        System.out.println("\n\n");
    }
    public void saldoNasabahTertinggiDanTerendahSucess(Nasabah nasabahTertinggi, Nasabah nasabahTerendah){
        System.out.println("----------------------------------------");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Saldo tertinggi : " + nasabahTertinggi.getSaldo());
        System.out.println("pemilik  \t : " + nasabahTertinggi.getNama());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Saldo terendah : " + nasabahTerendah.getSaldo());
        System.out.println("pemilik  \t : " + nasabahTerendah.getNama());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("----------------------------------------");
        System.out.println("Berhasil mendapatkan saldo tertinggi dan terendah ദ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println("----------------------------------------");
        System.out.println("\n\n");
    }

    public void saldoNasabahTerendahSucess(Nasabah nasabahTerendah){
        System.out.println("----------------------------------------");
        System.out.println("Saldo terendah : " + nasabahTerendah.getSaldo());
        System.out.println("pemilik  \t : " + nasabahTerendah.getNama());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Berhasil mendapatkan saldo terendah ദ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println("----------------------------------------");
        System.out.println("\n\n");
    }

    public void saldoNasabahTertinggiSucess(Nasabah nasabahTertinggi){
        System.out.println("----------------------------------------");
        System.out.println("Saldo terendah : " +nasabahTertinggi.getSaldo());
        System.out.println("pemilik  \t : " + nasabahTertinggi.getNama());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Berhasil mendapatkan saldo terendah ദ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println("----------------------------------------");
        System.out.println("\n\n");
    }

    public void umurNasabahTerendahSucess(Nasabah nasabahTerendah){
        System.out.println("----------------------------------------");
        System.out.println("Saldo terendah : " + nasabahTerendah.getUmur());
        System.out.println("pemilik  \t : " + nasabahTerendah.getNama());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Berhasil mendapatkan umur termuda ദ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println("----------------------------------------");
        System.out.println("\n\n");
    }

    public void umurNasabahTertinggiSucess(Nasabah nasabahTertinggi){
        System.out.println("----------------------------------------");
        System.out.println("Saldo terendah : " +nasabahTertinggi.getUmur());
        System.out.println("pemilik  \t : " + nasabahTertinggi.getNama());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Berhasil mendapatkan Umur termuda ദ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println("----------------------------------------");
        System.out.println("\n\n");
    }


    public void nasabahTerlama (Nasabah nasabahTerlama){
        System.out.println("----------------------------------------");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Berhasil mendapatkan data nasabah terlama ്ദി ( ᵔ ᗜ ᵔ )");
        readOneSuccess(nasabahTerlama);
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("\n\n");
    }

    public void kastaNasabah(List<Nasabah> tertinggi, List<Nasabah> menengah, List<Nasabah> bawah){
        System.out.println( "Jumlah nasabah Tinggi : " + tertinggi.stream().count());
        System.out.println( "Jumlah nasabah Menengah : " + menengah.stream().count());
        System.out.println( "Jumlah nasabah Bawah : " + bawah.stream().count());
        System.out.println("----------------------------------------");
        System.out.println("Berhasil mendapatkan data Kasta nasabah ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println();
        System.out.println();
    }

    public void umurNasabahTertinggiDanTerendahSucess(Nasabah nasabahTertinggi, Nasabah nasabahTerendah){
        System.out.println("----------------------------------------");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Umur Paling tua : " + nasabahTertinggi.getUmur());
        System.out.println("nama  \t : " + nasabahTertinggi.getNama());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("umur Paling muda : " + nasabahTerendah.getUmur());
        System.out.println("nama  \t : " + nasabahTerendah.getNama());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("----------------------------------------");
        System.out.println("Berhasil mendapatkan umur Paling tua dan Paling muda ദ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println("----------------------------------------");
        System.out.println("\n\n");
    }
    
    public void createSucess(Nasabah nasabah){
        readOneSuccess(nasabah);
        System.out.println("----------------------------------------");
        System.out.println("Berhasil membuat data baru ദ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println("----------------------------------------");
        System.out.println("\n\n");
    }

    public void listNasabahSaldoTertinggiSucess(List<Nasabah> nasabah){
        nasabah.stream().forEach(
                x->{
                    System.out.println("----------------");
                    System.out.println("---------------------------");
                    System.out.println("ID \t\t\t\t\t : " + x.getId());
                    System.out.println("Name \t\t\t\t : " + x.getNama());
                    System.out.println("Age \t\t\t\t : " + x.getUmur());
                    System.out.println("Status Kredit \t\t : " + x.getStatusKredit());
                    System.out.println("Lama waktu  \t\t : " + x.getLamaWaktuMenjadiNasabah());
                    System.out.println("saldo \t\t\t\t : " + x.getSaldo());
                    System.out.println("---------------------------");
                    System.out.println("----------------");
                }
        );
        System.out.println("----------------------------------------");
        System.out.println("Berhasil mengambil data2 nasabah dengan saldo tertinggi ദ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println("----------------------------------------");
        System.out.println("\n\n");
    }

    public void listNasabahUmurTertinggiSucess(List<Nasabah> nasabah){
        nasabah.stream().forEach(
                x->{
                    System.out.println("----------------");
                    System.out.println("---------------------------");
                    System.out.println("ID \t\t\t\t\t : " + x.getId());
                    System.out.println("Name \t\t\t\t : " + x.getNama());
                    System.out.println("Age \t\t\t\t : " + x.getUmur());
                    System.out.println("Status Kredit \t\t : " + x.getStatusKredit());
                    System.out.println("Lama waktu  \t\t : " + x.getLamaWaktuMenjadiNasabah());
                    System.out.println("saldo \t\t\t\t : " + x.getSaldo());
                    System.out.println("---------------------------");
                    System.out.println("----------------");
                }
        );
        System.out.println("----------------------------------------");
        System.out.println("Berhasil mengambil data2 nasabah dengan umur tertinggi ദ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println("----------------------------------------");
        System.out.println("\n\n");
    }
    public void createFail(){
        System.out.println("----------------------------------------");
        System.out.println("Gagal membuat data baru (,,>﹏<,,)");
        System.out.println("----------------------------------------");
        System.out.println();
    }
    void readFail(){
        System.out.println("----------------------------------------");
        System.out.println("Gagal mengambil data (｡>﹏<)");
        System.out.println("----------------------------------------");
        System.out.println();
    }
    void readOneSuccess(Nasabah nasabah){
        System.out.println("---------------------------");
        System.out.println("berhasil mengambil data : ");
        System.out.println("---------------------------");
        System.out.println("ID \t\t\t\t\t : " + nasabah.getId());
        System.out.println("Name \t\t\t\t : " + nasabah.getNama());
        System.out.println("Age \t\t\t\t : " + nasabah.getUmur());
        System.out.println("Status Kredit \t\t : " + nasabah.getStatusKredit());
        System.out.println("Lama waktu  \t\t : " + nasabah.getLamaWaktuMenjadiNasabah());
        System.out.println("saldo \t\t\t\t : " + nasabah.getSaldo());
        System.out.println("---------------------------");
        System.out.println(" (˵ •̀ ᴗ •́ ˵ ) ✧ ");
        System.out.println("---------------------------");
        System.out.println();
    }
    public void readAllSuccess(ArrayList<Nasabah> items){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Berikut ini adalah seluruh data yang tersimpan :");
        items.forEach(this::readOneSuccess);
        System.out.println("Selesai bos @ seluruh data tersimpan telah ditampilkan @");
        System.out.println("-----------------------------------------------------------");
    }
    public void updateSuccess(Nasabah nasabah){
        readOneSuccess(nasabah);
        System.out.println("---------------------------");
        System.out.println("berhasil memperbaharui data ദ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println("---------------------------");
        System.out.println();
    }
    public void updateFail(){
        System.out.println("---------------------------");
        System.out.println("gagal memperbaharui data (｡>﹏<)");
        System.out.println("---------------------------");
        System.out.println();
    }
    public void deleteSuccess(Nasabah nasabah){
        readOneSuccess(nasabah);
        System.out.println("---------------------------");
        System.out.println("berhasil menghapus data ദ്ദി ( ᵔ ᗜ ᵔ )");
        System.out.println("---------------------------");
        System.out.println();
    }
    public void deleteFail(){
        System.out.println("---------------------------");
        System.out.println("gagal menghapus data (｡>﹏<)");
        System.out.println("---------------------------");
        System.out.println();
    }

    public Integer menu(NasabahService service){

        System.out.println("----------- Selamat Datang di program Crud Nasabah by Hudzaifah");
//        service.read();
        System.out.println("silakah pilih menu yang anda inginkan");
        System.out.println("1. Create Nasabah");
        System.out.println("2. Read Nasabah");
        System.out.println("3. Update Nasabah");
        System.out.println("4. Delete Nasabah");
        System.out.println("5. Read Nasabah by ID ");
        System.out.println("6.  Hitung rata-rata saldo tabungan dari semua nasabah ");

        System.out.println("99. keluar");
        System.out.println("-------------------------------------");

        try{
            Integer id = inputMenu("Masukan pilihan kamu : ");
            return id;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }


    }

    public Nasabah createData(){
        Nasabah nasabah = new Nasabah();
        try{
            Integer id = inputMenu("Masukan id nasabah baru : ");
            nasabah.setId(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }


        String fullNmae = inputHandler.getString("Masukan Nama :");
        nasabah.setNama(fullNmae);

        Integer age = inputHandler.getInt("Masukan Usia :");
        nasabah.setUmur(age);
        Double saldo = inputHandler.getDouble("Masukan saldo nasabah :");
        nasabah.setSaldo(saldo);
        String statusKredit = inputHandler.getString("Masukan status kredit :");
        nasabah.setStatusKredit(statusKredit);

        Integer lamaMenjadiNasabah = inputHandler.getInt("Lama menjadi nasabah :");
        nasabah.setLamaWaktuMenjadiNasabah(lamaMenjadiNasabah);





        return nasabah;
    }

    public Nasabah updateData(NasabahService service) throws Exception {

        Nasabah nasabah = new Nasabah();
        Integer id = null;
        id = inputMenu("Masukan id nasabah yang ingin di ubah : ");
        Nasabah nasabahLama = service.getNasabahById(id);
        try{
            nasabahLama.getId();
        }catch (Exception e){
            throw new Exception("");
        }
        nasabah.setId(id);





        String fullNmae = inputHandler.getString("Masukan Nama baru :");
        nasabah.setNama(fullNmae);

        Integer age = inputHandler.getInt("Masukan Usia baru :");
        nasabah.setUmur(age);
        Double saldo = inputHandler.getDouble("Masukan saldo nasabah baru :");
        nasabah.setSaldo(saldo);
        String statusKredit = inputHandler.getString("Masukan status kredit baru :");
        nasabah.setStatusKredit(statusKredit);

        Integer lamaMenjadiNasabah = inputHandler.getInt("Lama menjadi nasabah yang baru :");
        nasabah.setLamaWaktuMenjadiNasabah(lamaMenjadiNasabah);

        return nasabah;
    }

    public Integer delete(NasabahService service){
        Integer id = inputHandler.getInt("Masukan id nasabah yang ingin kamu hapus : ");
        return id;

    }

    public void readById(NasabahService service) {
//        Nasabah nasabahLama = service.getById(id);
//        try{
//            nasabahLama.getId();
//        }catch (Exception e){
//            throw new Exception("Id tidak ditemukan");
//        }
//
//        System.out.println("isi data nasabah kamu sekarang adalah : ");
        Integer id = inputMenu("Masukan id yang ingin di cari : ");
        Nasabah nasabah = new Nasabah();
        try {
            nasabah = service.getNasabahById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if(nasabah.getId() != null){
            readOneSuccess(nasabah);
        }else {
            readFail();
        }
    }






    Integer inputMenu(String prompt){
        Integer pilihan = inputHandler.getInt(prompt);
        if(pilihan < 1) throw new IllegalArgumentException("input tidak boleh kurang dari 1");
        return pilihan;
    }



}
