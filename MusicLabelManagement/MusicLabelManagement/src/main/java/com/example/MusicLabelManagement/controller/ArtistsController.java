package com.example.MusicLabelManagement.controller;

import com.example.MusicLabelManagement.entity.Artists;
import com.example.MusicLabelManagement.repository.ArtistsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArtistsController {
    @Autowired
    private ArtistsRepository repository;

    @GetMapping("/Artists")
    public String viewArtist(Model model) {
        model.addAttribute("ArtistsList", repository.findAll());
        return "Artists";
    }
    @PostMapping("/addArt")
    public String addArtist(Artists artists, Model model) {
        model.addAttribute("artist", new Artists());
        repository.save(artists);
        return "redirect:/Artists";
    }

    @GetMapping("/delete1/{id}")
    public String delArtist(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return "redirect:/Artists";
    }

    @GetMapping("/edit1/{id}")
    public String editProducer(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("artist", repository.findById(id).get());
        model.addAttribute("ArtistsList", repository.findAll());
        return "editArtists";
    }
}