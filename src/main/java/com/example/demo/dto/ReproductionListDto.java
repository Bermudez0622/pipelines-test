package com.example.demo.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ReproductionListDto {

    public ReproductionListDto(){
        songs = new ArrayList<>();
    }

    private String name;
    private String description;
    private List<SongDto> songs;
}
