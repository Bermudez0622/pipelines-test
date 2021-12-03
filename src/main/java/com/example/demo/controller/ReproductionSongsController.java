package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import com.example.demo.data.UtilSongData;
import com.example.demo.dto.ReproductionListDto;


@RestController
@RequestMapping("/song-list")
public class ReproductionSongsController {

    @GetMapping()
    public ResponseEntity<List<ReproductionListDto>> getSongLists() {
        return new ResponseEntity<>(UtilSongData.getSongs(),HttpStatus.OK);
    }
    
    
}
