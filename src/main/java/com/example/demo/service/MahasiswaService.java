package com.example.demo.service;

import com.example.demo.model.Mahasiswa;
import com.example.demo.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MahasiswaService {
    @Autowired
    private MahasiswaRepository mahasiswaRepository;
    public Mahasiswa saveMahasiswa(Mahasiswa request){

        Mahasiswa setter = new Mahasiswa();
            setter.setNamaMahasiswa(request.getNamaMahasiswa());
            setter.setJurusanMahasiswa(request.getJurusanMahasiswa());
            setter.setUsia(request.getUsia());
            mahasiswaRepository.save(setter);

            return Mahasiswa.builder()
                    .namaMahasiswa(setter.getNamaMahasiswa())
                    .jurusanMahasiswa(setter.getJurusanMahasiswa())
                    .usia(setter.getUsia())
                    .build();



    }

}
