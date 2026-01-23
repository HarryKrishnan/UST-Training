# 🚀 Quick Start Guide - Movie Booking System

## ✅ What Has Been Created

Your complete Spring Boot Movie Booking System is ready with:

### 📁 Project Structure
```
ust java project/
├── src/main/java/com/simplemovie/
│   ├── controller/
│   │   ├── MovieController.java       ✅ REST endpoints for movies
│   │   ├── ShowController.java        ✅ REST endpoints for shows
│   │   └── BookingController.java     ✅ REST endpoints for bookings
│   ├── service/
│   │   ├── MovieService.java          ✅ Business logic for movies
│   │   ├── ShowService.java           ✅ Business logic for shows
│   │   └── BookingService.java        ✅ Seat management & booking logic
│   ├── repository/
│   │   ├── MovieRepository.java       ✅ JPA repository for movies
│   │   ├── ShowRepository.java        ✅ JPA repository for shows
│   │   └── BookingRepository.java     ✅ JPA repository for bookings
│   ├── entity/
│   │   ├── Movie.java                 ✅ Movie entity with validation
│   │   ├── Show.java                  ✅ Show entity with relationships
│   │   └── Booking.java               ✅ Booking entity with auto-date
│   └── SimpleMovieApplication.java    ✅ Main Spring Boot application
├── src/main/resources/
│   └── application.properties         ✅ MySQL & JPA configuration
├── pom.xml                            ✅ Maven dependencies
├── README.md                          ✅ Complete documentation
├── API_TESTING_GUIDE.md              ✅ API testing examples
└── .gitignore                        ✅ Git ignore file

```

## 🎯 All 8 APIs Implemented

✅ **API 1**: POST `/api/movies` - Add Movie  
✅ **API 2**: GET `/api/movies` - Get All Movies  
✅ **API 3**: POST `/api/shows` - Create Show  
✅ **API 4**: GET `/api/shows` - Get All Shows  
✅ **API 5**: GET `/api/shows/movie/{movieId}` - Get Shows by Movie  
✅ **API 6**: POST `/api/bookings` - Book Tickets  
✅ **API 7**: GET `/api/bookings` - Get All Bookings  
✅ **API 8**: DELETE `/api/bookings/{bookingId}` - Cancel Booking  

## 🎯 Business Rules Implemented

✅ Seats booked cannot exceed available seats (with validation)  
✅ Available seats reduce automatically after booking  
✅ Available seats restore automatically after cancellation  
✅ Booking date is auto-generated (current date)  
✅ Transactional operations for data consistency  

## 📋 Prerequisites Checklist

Before running the application, ensure you have:

- [ ] **Java 17 or higher** installed
  - Check: `java -version`
  - Download from: https://www.oracle.com/java/technologies/downloads/

- [ ] **Maven 3.6+** installed
  - Check: `mvn -version`
  - Download from: https://maven.apache.org/download.cgi

- [ ] **MySQL 8.0+** installed and running
  - Check: MySQL should be running on port 3306
  - Download from: https://dev.mysql.com/downloads/mysql/

## 🔧 Setup Steps

### Step 1: Configure MySQL

1. Start MySQL server
2. Open `src/main/resources/application.properties`
3. Update these lines if your MySQL credentials are different:
   ```properties
   spring.datasource.username=root
   spring.datasource.password=root
   ```

### Step 2: Build the Project

Open terminal in project directory and run:

```bash
mvn clean install
```

This will:
- Download all dependencies
- Compile the code
- Run tests
- Create the executable JAR

### Step 3: Run the Application

```bash
mvn spring-boot:run
```

Or run the JAR directly:
```bash
java -jar target/simple-movie-booking-1.0.0.jar
```

### Step 4: Verify Application Started

You should see:
```
Started SimpleMovieApplication in X.XXX seconds
```

The application runs on: **http://localhost:8080**

## 🧪 Testing the APIs

### Option 1: Using Postman

1. Download Postman: https://www.postman.com/downloads/
2. Import the requests from `API_TESTING_GUIDE.md`
3. Test each endpoint in sequence

### Option 2: Using cURL

See `API_TESTING_GUIDE.md` for complete cURL commands.

Example:
```bash
curl -X POST http://localhost:8080/api/movies -H "Content-Type: application/json" -d "{\"title\":\"Inception\",\"genre\":\"Sci-Fi\",\"duration\":148}"
```

### Option 3: Using Browser (for GET requests)

- Get all movies: http://localhost:8080/api/movies
- Get all shows: http://localhost:8080/api/shows
- Get all bookings: http://localhost:8080/api/bookings

## 📊 Database Verification

After running the application, check MySQL:

```sql
USE movie_booking_db;

SHOW TABLES;
-- Should show: movies, shows, bookings

SELECT * FROM movies;
SELECT * FROM shows;
SELECT * FROM bookings;
```

## 🎬 Complete Test Workflow

Follow this sequence to test the entire system:

1. **Add a movie** (Inception)
2. **Add another movie** (Interstellar)
3. **Get all movies** - verify both are listed
4. **Create a show** for Inception (100 seats)
5. **Get all shows** - verify show is created
6. **Book 2 tickets** for the show
7. **Get all shows** - verify available seats = 98
8. **Get all bookings** - verify booking exists
9. **Cancel the booking**
10. **Get all shows** - verify available seats = 100 (restored)

Detailed requests are in `API_TESTING_GUIDE.md`

## 🐛 Troubleshooting

### Issue: "Cannot connect to database"
**Solution**: 
- Ensure MySQL is running
- Check credentials in `application.properties`
- Verify MySQL is on port 3306

### Issue: "Port 8080 already in use"
**Solution**: 
- Change port in `application.properties`:
  ```properties
  server.port=8081
  ```

### Issue: Maven not found
**Solution**: 
- Install Maven from https://maven.apache.org/download.cgi
- Add Maven to PATH environment variable

### Issue: Java version error
**Solution**: 
- Install Java 17 or higher
- Set JAVA_HOME environment variable

## 📚 Additional Resources

- **Spring Boot Docs**: https://spring.io/projects/spring-boot
- **Spring Data JPA**: https://spring.io/projects/spring-data-jpa
- **MySQL Connector**: https://dev.mysql.com/doc/connector-j/en/

## 🎓 Learning Outcomes

By completing this project, you've learned:

✅ RESTful API design principles  
✅ Spring Boot layered architecture (Controller → Service → Repository)  
✅ JPA entity relationships (One-to-Many, Many-to-One)  
✅ Transaction management with @Transactional  
✅ Bean validation with Jakarta Validation  
✅ MySQL database integration  
✅ Business logic implementation  
✅ JSON request/response handling  

## 📝 Next Steps

1. ✅ Verify all prerequisites are installed
2. ✅ Configure MySQL credentials
3. ✅ Build the project with Maven
4. ✅ Run the application
5. ✅ Test all 8 APIs using Postman or cURL
6. ✅ Verify business rules work correctly
7. ✅ Check database tables and data

## 💡 Tips for Presentation

- Demonstrate the layered architecture
- Show how entities are related
- Explain the transaction management in BookingService
- Demonstrate seat validation (try to overbook)
- Show automatic seat restoration on cancellation
- Explain the auto-generated booking date

Good luck with your capstone project! 🚀
