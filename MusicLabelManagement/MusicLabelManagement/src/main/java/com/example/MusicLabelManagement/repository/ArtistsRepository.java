package com.example.MusicLabelManagement.repository;

import com.example.MusicLabelManagement.entity.Artists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistsRepository extends JpaRepository<Artists , Integer> {

}