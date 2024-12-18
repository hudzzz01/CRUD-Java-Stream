package com.enigma.view;

import com.enigma.model.Nasabah;

import java.util.ArrayList;
import java.util.List;

public class View {
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
}
