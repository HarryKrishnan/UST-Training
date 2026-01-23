-- Quick Setup Script for Movie Booking Database
-- Run this in MySQL Workbench to create the database manually

-- Step 1: Create the database
CREATE DATABASE IF NOT EXISTS movie_booking_db;

-- Step 2: Use the database
USE movie_booking_db;

-- Step 3: Verify database is created
SELECT DATABASE();

-- Step 4: Show all databases (you should see movie_booking_db in the list)
SHOW DATABASES;

-- Note: The tables (movies, shows, bookings) will be created automatically 
-- by Spring Boot when you run the application for the first time.

-- After running your Spring Boot app, you can verify tables with:
-- SHOW TABLES;
