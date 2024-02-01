package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Songs;

public interface SongService {
	
	String addSong(Songs song);
	boolean isNameExist(String name);
	List<Songs> readAllSongs();
	
}
