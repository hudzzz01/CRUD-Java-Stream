package com.enigma.service;

import com.enigma.model.Nasabah;

import java.util.ArrayList;

public interface CRUD {
    Nasabah create(Nasabah nasabah);

    ArrayList<Nasabah> read();

    Nasabah update(Integer id, Nasabah nasabah);

    Nasabah delete(Integer id);
}
