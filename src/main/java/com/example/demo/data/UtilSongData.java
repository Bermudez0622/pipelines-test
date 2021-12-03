package com.example.demo.data;

import com.example.demo.dto.ReproductionListDto;
import com.example.demo.dto.SongDto;

import java.util.List;
import java.util.ArrayList;


public class UtilSongData {

    public static List<ReproductionListDto> getSongs(){
        List<ReproductionListDto> response = new ArrayList<>();

        ReproductionListDto lista1 = new ReproductionListDto();
        lista1.setName("Guns N Roses (Use Your Illusion I)");
        lista1.setDescription("Esta es la primera lista de reproducción");
        
        SongDto songl1 = new SongDto();
        songl1.setTitle("Sweet Child o' Mine");
        songl1.setYear("1987");
        songl1.setArtist("Guns N Roses");
        lista1.getSongs().add(songl1);

        SongDto song2l1 = new SongDto();
        song2l1.setTitle("November Rain");
        song2l1.setYear("1990");
        song2l1.setArtist("Guns N Roses");
        lista1.getSongs().add(song2l1);

        SongDto song3l1 = new SongDto();
        song3l1.setTitle("Welcome to the Jungle");
        song3l1.setYear("1987");    
        song3l1.setArtist("Guns N Roses");
        lista1.getSongs().add(song3l1);

        ReproductionListDto lista2 = new ReproductionListDto();
        lista2.setName("PEACEFUL PIANO");
        lista2.setDescription("Esta es la segunda lista de reproducción");

        response.add(lista1);
        response.add(lista2);

        return response;
    } 
    
}
