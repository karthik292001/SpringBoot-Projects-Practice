package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Songs;
import com.example.demo.services.SongService;

@Controller
public class SongsController {
	
	@Autowired
	SongService songsrv;
	
	@PostMapping("/addsong")
	public String addSong(@ModelAttribute Songs song) {
		boolean isNameExist=songsrv.isNameExist(song.getName());
		if(isNameExist) {
			return "addsongfail";
		}else {
			songsrv.addSong(song);
			return "addsongsuccess";
		}	
	}
	
	
	@GetMapping("/readsongs")
	public String readAllSongs(Model model) {
		List<Songs> listsongs=songsrv.readAllSongs();
		model.addAttribute("songs", listsongs);
		return "listofsongs";
	}
}