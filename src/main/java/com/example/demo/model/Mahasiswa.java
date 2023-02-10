package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tbl_mahasiswa")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mahasiswa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;


    @Column(name = "nama_mahasiswa")
    private String namaMahasiswa;

    @Column(name = "jurusan_mahasiswa")
    private String jurusanMahasiswa;

    @Column(name = "usia_mahasiswa")
    private int usia;
    
}
