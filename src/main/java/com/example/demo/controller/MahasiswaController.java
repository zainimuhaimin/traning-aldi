package com.example.demo.controller;

import com.example.demo.model.Mahasiswa;
import com.example.demo.model.Nilai;
import com.example.demo.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MahasiswaController {

    @Autowired
    MahasiswaService mahasiswaService;

    @PostMapping("/savemahasiswa")
    public Mahasiswa saveMahasiswa(@RequestBody Mahasiswa request) {
        return mahasiswaService.saveMahasiswa(request);
    }
}
