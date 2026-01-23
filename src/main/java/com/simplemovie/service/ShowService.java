package com.simplemovie.service;

import com.simplemovie.entity.Movie;
import com.simplemovie.entity.Show;
import com.simplemovie.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private MovieService movieService;

    public Show createShow(Show show) {
        if (show.getMovie() != null && show.getMovie().getMovieId() != null) {
            Movie movie = movieService.getMovieById(show.getMovie().getMovieId());
            show.setMovie(movie);
        }

        if (show.getAvailableSeats() == null) {
            show.setAvailableSeats(show.getTotalSeats());
        }

        return showRepository.save(show);
    }

    public List<Show> getAllShows() {
        return showRepository.findAll();
    }

    public List<Show> getShowsByMovieId(Long movieId) {
        return showRepository.findByMovieMovieId(movieId);
    }

    public Show getShowById(Long showId) {
        return showRepository.findById(showId)
                .orElseThrow(() -> new RuntimeException("Show not found with id: " + showId));
    }

    public void updateShow(Show show) {
        showRepository.save(show);
    }
}
