# 🚀 How to Run Your Movie Booking Project

## ✅ Prerequisites Checklist

Before running, make sure:
- [x] MySQL is installed and running ✓
- [x] Database `movie_booking_db` is created ✓
- [ ] MySQL password in `application.properties` matches your actual password
- [ ] Java 17 is installed
- [ ] Maven is installed

---

## 🎯 Step-by-Step: Running Your Project

### Step 1: Verify MySQL Password

1. Open: `src/main/resources/application.properties`
2. Check line 5: `spring.datasource.password=root`
3. **If your MySQL password is different**, change it to your actual password
4. Save the file

**Common MySQL passwords:**
- XAMPP default: (empty) → use `spring.datasource.password=`
- MySQL Installer: whatever you set during installation

### Step 2: Open Command Prompt

1. Press `Win + R`
2. Type `cmd` and press Enter
3. Navigate to your project:
   ```cmd
   cd "c:\Users\krish\Desktop\ust java project"
   ```

### Step 3: Build and Run the Project

Run this command:
```cmd
mvn clean spring-boot:run
```

**What this does:**
- `mvn clean` - Cleans previous builds
- `spring-boot:run` - Compiles and runs your Spring Boot application

### Step 4: Wait for Application to Start

You'll see a lot of output. **Look for these success messages:**

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.1)

...
Started SimpleMovieApplication in X.XXX seconds
```

**When you see "Started SimpleMovieApplication"** → ✅ **SUCCESS!**

### Step 5: Verify Tables Were Created

Go back to **MySQL Workbench**:

1. Right-click on `movie_booking_db` in the left panel
2. Click **Refresh All**
3. Expand `movie_booking_db` → `Tables`
4. You should see:
   - `movies`
   - `shows`
   - `bookings`

---

## 🧪 Testing Your APIs

### Option 1: Using Browser (for GET requests)

Open your browser and go to:
- http://localhost:8080/api/movies
- http://localhost:8080/api/shows
- http://localhost:8080/api/bookings

You should see `[]` (empty arrays) - this is correct!

### Option 2: Using Postman (Recommended)

1. **Download Postman** (if you don't have it):
   - https://www.postman.com/downloads/

2. **Import the collection:**
   - Open Postman
   - Click "Import"
   - Select: `Movie_Booking_API.postman_collection.json`
   - All APIs will be imported!

3. **Test the APIs in order:**
   - Add Movie - Inception
   - Add Movie - Interstellar
   - Get All Movies
   - Create Show - Inception
   - Book Tickets
   - etc.

### Option 3: Using cURL (Command Line)

**Add a movie:**
```cmd
curl -X POST http://localhost:8080/api/movies -H "Content-Type: application/json" -d "{\"title\":\"Inception\",\"genre\":\"Sci-Fi\",\"duration\":148}"
```

**Get all movies:**
```cmd
curl http://localhost:8080/api/movies
```

---

## 🐛 Common Issues & Solutions

### Issue 1: "mvn is not recognized"

**Solution:** Maven is not installed or not in PATH

1. Download Maven: https://maven.apache.org/download.cgi
2. Extract to `C:\Program Files\Maven`
3. Add to PATH:
   - Right-click "This PC" → Properties
   - Advanced → Environment Variables
   - System Variables → Path → Edit → New
   - Add: `C:\Program Files\Maven\bin`
4. Restart Command Prompt

### Issue 2: "Access denied for user 'root'@'localhost'"

**Solution:** Wrong password in `application.properties`

1. Open MySQL Workbench
2. Check what password you use to connect
3. Update `application.properties` line 5 with that password
4. Save and run again

### Issue 3: "Port 8080 already in use"

**Solution:** Another application is using port 8080

**Option A:** Stop the other application

**Option B:** Change port in `application.properties`:
```properties
server.port=8081
```

### Issue 4: "Cannot connect to database"

**Solution:** MySQL is not running

1. Open Services (`Win + R` → `services.msc`)
2. Find "MySQL80" or "MySQL"
3. Right-click → Start

### Issue 5: Build fails with compilation errors

**Solution:** Java version mismatch

Check Java version:
```cmd
java -version
```

Should be Java 17 or higher. If not, install Java 17:
- https://www.oracle.com/java/technologies/downloads/

---

## 📊 Verifying Everything Works

### 1. Check Application is Running

In Command Prompt, you should see:
```
Tomcat started on port(s): 8080 (http)
Started SimpleMovieApplication in X.XXX seconds
```

**Don't close this window!** The application is running here.

### 2. Check Database Tables

In MySQL Workbench:
```sql
USE movie_booking_db;
SHOW TABLES;
```

Should show:
- bookings
- movies
- shows

### 3. Test an API

Open browser: http://localhost:8080/api/movies

Should see: `[]`

### 4. Add Sample Data

Use Postman or cURL to add a movie (see examples above)

Then check browser again - you should see the movie!

---

## 🎯 Quick Reference Commands

### Start the application:
```cmd
cd "c:\Users\krish\Desktop\ust java project"
mvn spring-boot:run
```

### Stop the application:
Press `Ctrl + C` in the Command Prompt window

### Restart the application:
1. Stop it (Ctrl + C)
2. Run again: `mvn spring-boot:run`

### Check if running:
Open browser: http://localhost:8080/api/movies

---

## 📝 What Happens When You Run

1. **Maven downloads dependencies** (first time only - takes a few minutes)
2. **Compiles your Java code**
3. **Starts Spring Boot application**
4. **Connects to MySQL database**
5. **Creates tables automatically** (movies, shows, bookings)
6. **Starts web server on port 8080**
7. **APIs are now accessible!**

---

## ✨ Success Indicators

You'll know it's working when:

✅ Command Prompt shows: "Started SimpleMovieApplication"
✅ MySQL Workbench shows 3 tables in `movie_booking_db`
✅ Browser shows `[]` when you visit http://localhost:8080/api/movies
✅ No error messages in Command Prompt

---

## 🆘 Still Having Issues?

### Check the logs in Command Prompt for errors

**Common error patterns:**

1. **Red text with "Exception"** → Something went wrong
2. **"Access denied"** → Wrong MySQL password
3. **"Port already in use"** → Change port or stop other app
4. **"ClassNotFoundException"** → Maven dependency issue, run `mvn clean install`

### Get detailed help

Run with debug mode:
```cmd
mvn spring-boot:run -X
```

This shows detailed logs to help identify the problem.

---

## 🎉 Next Steps After Successful Run

1. ✅ Test all 8 APIs using Postman
2. ✅ Add sample movies and shows
3. ✅ Test booking functionality
4. ✅ Verify seat management works
5. ✅ Check database tables have data
6. ✅ Prepare your presentation!

---

**Good luck! Your project is ready to run! 🚀**
