package com.example.demo.controller;

import com.example.demo.model.Nilai;
import com.example.demo.service.NilaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NilaiController {

    @Autowired
    NilaiService nilaiService;

    @PostMapping("/savenilai")
    public Nilai saveNilai(@RequestBody Nilai request){
        return nilaiService.saveNilai(request);
    }

    /*
    * POST -> HIT API DENGAN REQUEST / SAVE DATA
    * GET -> HIT API TANPA REQUEST / READ DATA
    * PUT -> HIT API DENGAN REQUEST / UPDATE
    * DELETE -> HIT API DENGAN REQUEST / DELETE
    * */
}
