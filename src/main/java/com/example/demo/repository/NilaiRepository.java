package com.example.demo.repository;

import com.example.demo.model.Nilai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NilaiRepository extends JpaRepository<Nilai, Long> {
}
