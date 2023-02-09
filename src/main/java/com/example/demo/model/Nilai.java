package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tbl_nilai")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Nilai implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nama_mahasiswa")
    private String namaMahasiswa;

    @Column(name = "nilai")
    private Integer nilai;

    @Column(name = "id_mahasiswa")
    private Long idMahasiswa;

}
