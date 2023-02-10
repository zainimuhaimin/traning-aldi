package com.example.demo.service;

import com.example.demo.model.Nilai;
import com.example.demo.repository.NilaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NilaiService {
    /*logical code*/

    @Autowired
    private NilaiRepository nilaiRepository;

    public Nilai saveNilai(Nilai request) {

        Nilai setter = new Nilai();
        setter.setNamaMahasiswa(request.getNamaMahasiswa());
        setter.setNilai(request.getNilai());
        setter.setIdMahasiswa(request.getIdMahasiswa());
        nilaiRepository.save(setter);

        return Nilai.builder()
                .nilai(setter.getNilai())
                .namaMahasiswa(setter.getNamaMahasiswa())
                .idMahasiswa(setter.getIdMahasiswa())
                .build();
    }

}
