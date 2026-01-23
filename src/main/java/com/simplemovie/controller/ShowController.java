package com.simplemovie.controller;

import com.simplemovie.entity.Show;
import com.simplemovie.service.ShowService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    @Autowired
    private ShowService showService;

    @PostMapping
    public ResponseEntity<Show> createShow(@Valid @RequestBody Show show) {
        Show savedShow = showService.createShow(show);
        return new ResponseEntity<>(savedShow, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Show>> getAllShows() {
        List<Show> shows = showService.getAllShows();
        return new ResponseEntity<>(shows, HttpStatus.OK);
    }

    @GetMapping("/movie/{movieId}")
    public ResponseEntity<List<Show>> getShowsByMovie(@PathVariable Long movieId) {
        List<Show> shows = showService.getShowsByMovieId(movieId);
        return new ResponseEntity<>(shows, HttpStatus.OK);
    }
}
