package com.enigma.model;
public class Nasabah {
    /*
     * Data nasabah mencakup nama, umur, saldo tabungan, status kredit, dan lama waktu menjadi nasabah (dalam tahun).
     * */
    private Integer id;
    private String nama;
    private Integer umur;
    private Double saldo;
    private String statusKredit;
    private Integer lamaWaktuMenjadiNasabah;
    public Nasabah() {
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", umur=" + umur +
                ", saldo=" + saldo +
                ", statusKredit='" + statusKredit + '\'' +
                ", lamaWaktuMenjadiNasabah=" + lamaWaktuMenjadiNasabah +
                '}';
    }

    public Nasabah(Integer id, String nama, Integer umur, Double saldo, String statusKredit, Integer lamaWaktuMenjadiNasabah) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.saldo = saldo;
        this.statusKredit = statusKredit;
        this.lamaWaktuMenjadiNasabah = lamaWaktuMenjadiNasabah;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getStatusKredit() {
        return statusKredit;
    }

    public void setStatusKredit(String statusKredit) {
        this.statusKredit = statusKredit;
    }

    public Integer getLamaWaktuMenjadiNasabah() {
        return lamaWaktuMenjadiNasabah;
    }

    public void setLamaWaktuMenjadiNasabah(Integer lamaWaktuMenjadiNasabah) {
        this.lamaWaktuMenjadiNasabah = lamaWaktuMenjadiNasabah;
    }
}

