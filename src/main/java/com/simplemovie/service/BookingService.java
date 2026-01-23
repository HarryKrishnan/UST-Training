package com.simplemovie.service;

import com.simplemovie.entity.Booking;
import com.simplemovie.entity.Show;
import com.simplemovie.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ShowService showService;

    @Transactional
    public Booking bookTickets(Booking booking) {
        if (booking.getShow() != null && booking.getShow().getShowId() != null) {
            Show show = showService.getShowById(booking.getShow().getShowId());

            if (booking.getSeatsBooked() > show.getAvailableSeats()) {
                throw new RuntimeException("Not enough seats available. Available seats: " + show.getAvailableSeats());
            }

            show.setAvailableSeats(show.getAvailableSeats() - booking.getSeatsBooked());
            showService.updateShow(show);

            booking.setShow(show);
            booking.setBookingDate(LocalDate.now());

            return bookingRepository.save(booking);
        }

        throw new RuntimeException("Show information is required for booking");
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Transactional
    public String cancelBooking(Long bookingId) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found with id: " + bookingId));

        Show show = booking.getShow();
        show.setAvailableSeats(show.getAvailableSeats() + booking.getSeatsBooked());
        showService.updateShow(show);

        bookingRepository.deleteById(bookingId);

        return "Booking cancelled successfully";
    }
}
