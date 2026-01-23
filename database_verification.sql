-- Movie Booking System - Database Verification Script
-- Run this script in MySQL after starting the application

-- Switch to the database
USE movie_booking_db;

-- Show all tables
SHOW TABLES;

-- View table structures
DESCRIBE movies;
DESCRIBE shows;
DESCRIBE bookings;

-- Sample queries to verify data

-- 1. View all movies
SELECT * FROM movies;

-- 2. View all shows with movie details
SELECT 
    s.show_id,
    s.show_time,
    s.total_seats,
    s.available_seats,
    m.title AS movie_title,
    m.genre,
    m.duration
FROM shows s
JOIN movies m ON s.movie_id = m.movie_id;

-- 3. View all bookings with show and movie details
SELECT 
    b.booking_id,
    b.customer_name,
    b.seats_booked,
    b.booking_date,
    s.show_time,
    m.title AS movie_title
FROM bookings b
JOIN shows s ON b.show_id = s.show_id
JOIN movies m ON s.movie_id = m.movie_id;

-- 4. Check seat availability for all shows
SELECT 
    s.show_id,
    m.title AS movie_title,
    s.show_time,
    s.total_seats,
    s.available_seats,
    (s.total_seats - s.available_seats) AS seats_booked
FROM shows s
JOIN movies m ON s.movie_id = m.movie_id;

-- 5. Get booking summary by show
SELECT 
    s.show_id,
    m.title AS movie_title,
    s.show_time,
    COUNT(b.booking_id) AS total_bookings,
    SUM(b.seats_booked) AS total_seats_booked,
    s.available_seats
FROM shows s
JOIN movies m ON s.movie_id = m.movie_id
LEFT JOIN bookings b ON s.show_id = b.show_id
GROUP BY s.show_id, m.title, s.show_time, s.available_seats;

-- 6. Get booking summary by customer
SELECT 
    b.customer_name,
    COUNT(b.booking_id) AS total_bookings,
    SUM(b.seats_booked) AS total_seats_booked
FROM bookings b
GROUP BY b.customer_name;

-- 7. Find shows with available seats
SELECT 
    s.show_id,
    m.title AS movie_title,
    s.show_time,
    s.available_seats
FROM shows s
JOIN movies m ON s.movie_id = m.movie_id
WHERE s.available_seats > 0
ORDER BY s.show_time;

-- 8. Find fully booked shows
SELECT 
    s.show_id,
    m.title AS movie_title,
    s.show_time,
    s.total_seats
FROM shows s
JOIN movies m ON s.movie_id = m.movie_id
WHERE s.available_seats = 0;

-- Clean up (CAUTION: This will delete all data)
-- Uncomment the following lines only if you want to reset the database

-- DELETE FROM bookings;
-- DELETE FROM shows;
-- DELETE FROM movies;

-- Reset auto-increment counters
-- ALTER TABLE bookings AUTO_INCREMENT = 1;
-- ALTER TABLE shows AUTO_INCREMENT = 1;
-- ALTER TABLE movies AUTO_INCREMENT = 1;
