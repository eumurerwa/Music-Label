package com.example.MusicLabelManagement.repository;

import com.example.MusicLabelManagement.entity.Tracks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TracksRepository extends JpaRepository<Tracks, Integer> {

}