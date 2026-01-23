# 🎬 Movie Booking System - API Testing Guide

## Quick Test Sequence

Follow this sequence to test all APIs in order:

### Step 1: Add Movies

**POST** `http://localhost:8080/api/movies`

Movie 1:
```json
{
  "title": "Inception",
  "genre": "Sci-Fi",
  "duration": 148
}
```

Movie 2:
```json
{
  "title": "Interstellar",
  "genre": "Sci-Fi",
  "duration": 169
}
```

### Step 2: Get All Movies

**GET** `http://localhost:8080/api/movies`

Expected: List of 2 movies with IDs 1 and 2

### Step 3: Create Shows

**POST** `http://localhost:8080/api/shows`

Show 1 (for Inception):
```json
{
  "showTime": "2026-02-10T18:30",
  "totalSeats": 100,
  "availableSeats": 100,
  "movie": {
    "movieId": 1
  }
}
```

Show 2 (for Interstellar):
```json
{
  "showTime": "2026-02-11T20:00",
  "totalSeats": 150,
  "availableSeats": 150,
  "movie": {
    "movieId": 2
  }
}
```

### Step 4: Get All Shows

**GET** `http://localhost:8080/api/shows`

Expected: List of all shows with movie details

### Step 5: Get Shows by Movie

**GET** `http://localhost:8080/api/shows/movie/1`

Expected: Shows for "Inception" only

### Step 6: Book Tickets

**POST** `http://localhost:8080/api/bookings`

Booking 1:
```json
{
  "customerName": "Akash",
  "seatsBooked": 2,
  "show": {
    "showId": 1
  }
}
```

Booking 2:
```json
{
  "customerName": "Priya",
  "seatsBooked": 3,
  "show": {
    "showId": 1
  }
}
```

After these bookings, Show 1 should have 95 available seats (100 - 2 - 3)

### Step 7: Get All Bookings

**GET** `http://localhost:8080/api/bookings`

Expected: List of all bookings with auto-generated booking dates

### Step 8: Cancel Booking

**DELETE** `http://localhost:8080/api/bookings/1`

Expected: "Booking cancelled successfully"

After cancellation, Show 1 should have 97 available seats (95 + 2)

### Step 9: Verify Seat Restoration

**GET** `http://localhost:8080/api/shows`

Check that Show 1 now has 97 available seats

## Testing Business Rules

### Test 1: Overbooking Prevention

Try to book more seats than available:

**POST** `http://localhost:8080/api/bookings`
```json
{
  "customerName": "Test User",
  "seatsBooked": 200,
  "show": {
    "showId": 1
  }
}
```

Expected: Error message "Not enough seats available"

### Test 2: Validation

Try to add a movie without required fields:

**POST** `http://localhost:8080/api/movies`
```json
{
  "title": "",
  "genre": "Action"
}
```

Expected: Validation error

## Using cURL Commands

### Add Movie
```bash
curl -X POST http://localhost:8080/api/movies -H "Content-Type: application/json" -d "{\"title\":\"Inception\",\"genre\":\"Sci-Fi\",\"duration\":148}"
```

### Get All Movies
```bash
curl http://localhost:8080/api/movies
```

### Create Show
```bash
curl -X POST http://localhost:8080/api/shows -H "Content-Type: application/json" -d "{\"showTime\":\"2026-02-10T18:30\",\"totalSeats\":100,\"availableSeats\":100,\"movie\":{\"movieId\":1}}"
```

### Book Tickets
```bash
curl -X POST http://localhost:8080/api/bookings -H "Content-Type: application/json" -d "{\"customerName\":\"Akash\",\"seatsBooked\":2,\"show\":{\"showId\":1}}"
```

### Cancel Booking
```bash
curl -X DELETE http://localhost:8080/api/bookings/1
```
