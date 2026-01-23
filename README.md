# 🎬 Simple Online Movie Booking System

A RESTful web service built with Spring Boot for managing movie bookings.

## 📋 Features

- ✅ Movie Management (Add, View)
- ✅ Show Scheduling (Create, View by Movie)
- ✅ Ticket Booking (Book, View, Cancel)
- ✅ Automatic Seat Management
- ✅ Business Rules Implementation

## 🛠 Technology Stack

- **Spring Boot 3.2.1**
- **Spring MVC (REST)**
- **Spring Data JPA**
- **MySQL 8.0+**
- **Maven**
- **Java 17**

## 📁 Project Structure

```
simple-movie-booking/
├── src/main/java/com/simplemovie/
│   ├── controller/
│   │   ├── MovieController.java
│   │   ├── ShowController.java
│   │   └── BookingController.java
│   ├── service/
│   │   ├── MovieService.java
│   │   ├── ShowService.java
│   │   └── BookingService.java
│   ├── repository/
│   │   ├── MovieRepository.java
│   │   ├── ShowRepository.java
│   │   └── BookingRepository.java
│   ├── entity/
│   │   ├── Movie.java
│   │   ├── Show.java
│   │   └── Booking.java
│   └── SimpleMovieApplication.java
└── src/main/resources/
    └── application.properties
```

## 🚀 Setup Instructions

### Prerequisites
- Java 17 or higher
- MySQL 8.0 or higher
- Maven 3.6+

### Database Setup
1. Start MySQL server
2. The application will automatically create the database `movie_booking_db`
3. Update credentials in `application.properties` if needed:
   ```properties
   spring.datasource.username=root
   spring.datasource.password=root
   ```

### Running the Application

```bash
# Navigate to project directory
cd "c:\Users\krish\Desktop\ust java project"

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## 📡 REST API Endpoints

### 1️⃣ Add Movie
**POST** `/api/movies`

```json
{
  "title": "Inception",
  "genre": "Sci-Fi",
  "duration": 148
}
```

### 2️⃣ Get All Movies
**GET** `/api/movies`

### 3️⃣ Create Show
**POST** `/api/shows`

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

### 4️⃣ Get All Shows
**GET** `/api/shows`

### 5️⃣ Get Shows by Movie
**GET** `/api/shows/movie/{movieId}`

### 6️⃣ Book Tickets
**POST** `/api/bookings`

```json
{
  "customerName": "Akash",
  "seatsBooked": 2,
  "show": {
    "showId": 1
  }
}
```

### 7️⃣ Get All Bookings
**GET** `/api/bookings`

### 8️⃣ Cancel Booking
**DELETE** `/api/bookings/{bookingId}`

## 🎯 Business Rules Implemented

✅ **Seat Validation**: Seats booked cannot exceed available seats  
✅ **Automatic Seat Reduction**: Available seats decrease after booking  
✅ **Automatic Seat Restoration**: Available seats increase after cancellation  
✅ **Auto-generated Booking Date**: Booking date is automatically set to current date  
✅ **Transaction Management**: Booking and cancellation operations are atomic

## 🧪 Testing with Postman/cURL

### Example: Add a Movie
```bash
curl -X POST http://localhost:8080/api/movies \
  -H "Content-Type: application/json" \
  -d '{"title":"Inception","genre":"Sci-Fi","duration":148}'
```

### Example: Book Tickets
```bash
curl -X POST http://localhost:8080/api/bookings \
  -H "Content-Type: application/json" \
  -d '{"customerName":"Akash","seatsBooked":2,"show":{"showId":1}}'
```

## 📊 Database Schema

The application uses three main tables:
- **movies**: Stores movie information
- **shows**: Stores show schedules with movie reference
- **bookings**: Stores booking details with show reference

## 🔧 Configuration

Edit `src/main/resources/application.properties` to customize:
- Database connection
- Server port
- JPA settings

## 📝 Notes

- The application uses `@Transactional` for booking operations to ensure data consistency
- Validation is implemented using Jakarta Bean Validation
- All entities use auto-generated IDs
- Date/time handling uses Java 8 Time API
