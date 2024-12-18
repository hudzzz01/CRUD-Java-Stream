package com.enigma.view;

import com.enigma.model.Nasabah;

import java.util.ArrayList;

public class View {
    public void createSucess(Nasabah nasabah){
        readOneSuccess(nasabah);
        System.out.println("----------------------------------------");
        System.out.println("Berhasil membuat data baru ദ്ദി ( ᵔ ᗜ ᵔ )");
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
