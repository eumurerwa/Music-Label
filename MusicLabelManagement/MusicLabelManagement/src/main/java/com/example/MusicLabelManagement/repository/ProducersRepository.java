package com.example.MusicLabelManagement.repository;

import com.example.MusicLabelManagement.entity.Producers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducersRepository extends JpaRepository<Producers, Integer> {

}