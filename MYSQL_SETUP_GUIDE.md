# 🗄️ MySQL Setup & Troubleshooting Guide

## 🔍 Checking if MySQL is Installed

### Method 1: Check via Command Line

Open **Command Prompt** or **PowerShell** and run:

```cmd
mysql --version
```

**Expected Output if installed:**
```
mysql  Ver 8.0.xx for Win64 on x86_64 (MySQL Community Server - GPL)
```

**If you get an error:**
- `'mysql' is not recognized...` → MySQL is NOT installed or not in PATH

### Method 2: Check MySQL Service

Open **Command Prompt as Administrator** and run:

```cmd
sc query MySQL80
```

Or check for any MySQL service:
```cmd
sc query state= all | findstr /i "mysql"
```

### Method 3: Check via Services GUI

1. Press `Win + R`
2. Type `services.msc` and press Enter
3. Look for services starting with "MySQL"
4. Common names: `MySQL80`, `MySQL`, `MySQL Server`

### Method 4: Check Installation Directory

Look for MySQL in these common locations:
- `C:\Program Files\MySQL\MySQL Server 8.0\`
- `C:\Program Files (x86)\MySQL\`
- `C:\MySQL\`

---

## 📥 Installing MySQL (If Not Installed)

### Option 1: MySQL Installer (Recommended for Windows)

1. **Download MySQL Installer:**
   - Go to: https://dev.mysql.com/downloads/installer/
   - Download: `mysql-installer-community-8.0.xx.msi`

2. **Run the Installer:**
   - Choose "Developer Default" or "Server only"
   - Click "Execute" to download and install

3. **Configure MySQL Server:**
   - **Type and Networking:**
     - Config Type: Development Computer
     - Port: 3306 (default)
     - Check "Open Windows Firewall port"
   
   - **Authentication Method:**
     - Choose: "Use Strong Password Encryption"
   
   - **Accounts and Roles:**
     - Set root password: `root` (or your preferred password)
     - Remember this password!
   
   - **Windows Service:**
     - Service Name: MySQL80
     - Check "Start the MySQL Server at System Startup"
     - Run as: Standard System Account

4. **Apply Configuration:**
   - Click "Execute" to apply settings
   - Click "Finish"

5. **Verify Installation:**
   ```cmd
   mysql --version
   ```

### Option 2: XAMPP (Easier Alternative)

If you want an easier setup with MySQL included:

1. **Download XAMPP:**
   - Go to: https://www.apachefriends.org/
   - Download XAMPP for Windows

2. **Install XAMPP:**
   - Run the installer
   - Select at least: Apache, MySQL, PHP

3. **Start MySQL:**
   - Open XAMPP Control Panel
   - Click "Start" next to MySQL
   - MySQL runs on port 3306

4. **Default Credentials:**
   - Username: `root`
   - Password: (empty/blank)

---

## 🚀 Starting MySQL Service

### Method 1: Via Services GUI

1. Press `Win + R`
2. Type `services.msc` and press Enter
3. Find "MySQL80" (or your MySQL service)
4. Right-click → Start
5. Set Startup type to "Automatic" if you want it to start with Windows

### Method 2: Via Command Line (Run as Administrator)

```cmd
net start MySQL80
```

Or for other versions:
```cmd
net start MySQL
```

### Method 3: Via XAMPP (if using XAMPP)

1. Open XAMPP Control Panel
2. Click "Start" next to MySQL

---

## 🔧 Connecting to MySQL

### Method 1: MySQL Command Line Client

```cmd
mysql -u root -p
```

Then enter your password when prompted.

**If successful, you'll see:**
```
Welcome to the MySQL monitor...
mysql>
```

### Method 2: MySQL Workbench (GUI Tool)

1. Download from: https://dev.mysql.com/downloads/workbench/
2. Install and open
3. Create new connection:
   - Connection Name: Local MySQL
   - Hostname: localhost
   - Port: 3306
   - Username: root
   - Password: (your password)

---

## 🗃️ Creating the Database

Once connected to MySQL, run:

```sql
CREATE DATABASE movie_booking_db;
SHOW DATABASES;
```

**Expected Output:**
```
+--------------------+
| Database           |
+--------------------+
| information_schema |
| movie_booking_db   |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
```

**Note:** The Spring Boot application will create this database automatically if it doesn't exist (because of `createDatabaseIfNotExist=true` in `application.properties`).

---

## ⚙️ Configuring application.properties

Update your `src/main/resources/application.properties`:

### If using MySQL Installer:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/movie_booking_db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
```
(Replace `root` with your actual password)

### If using XAMPP:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/movie_booking_db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=
```
(Empty password for XAMPP default)

---

## 🐛 Common Issues & Solutions

### Issue 1: "mysql is not recognized as an internal or external command"

**Solution:** Add MySQL to PATH

1. Find MySQL bin directory (e.g., `C:\Program Files\MySQL\MySQL Server 8.0\bin`)
2. Add to PATH:
   - Right-click "This PC" → Properties
   - Advanced system settings → Environment Variables
   - Under System Variables, find "Path"
   - Click Edit → New
   - Add: `C:\Program Files\MySQL\MySQL Server 8.0\bin`
   - Click OK
3. Restart Command Prompt

### Issue 2: "Can't connect to MySQL server on 'localhost'"

**Solutions:**
- Check if MySQL service is running (see "Starting MySQL Service" above)
- Verify port 3306 is not blocked by firewall
- Check if another application is using port 3306

### Issue 3: "Access denied for user 'root'@'localhost'"

**Solutions:**
- Verify password is correct
- Reset root password:
  ```cmd
  mysqladmin -u root -p password newpassword
  ```

### Issue 4: MySQL service won't start

**Solutions:**
1. Check if port 3306 is already in use:
   ```cmd
   netstat -ano | findstr :3306
   ```

2. Check MySQL error log:
   - Location: `C:\ProgramData\MySQL\MySQL Server 8.0\Data\*.err`

3. Reinstall MySQL service:
   ```cmd
   "C:\Program Files\MySQL\MySQL Server 8.0\bin\mysqld" --install
   ```

### Issue 5: "No databases showing"

**Solutions:**
1. Make sure you're connected:
   ```cmd
   mysql -u root -p
   ```

2. List databases:
   ```sql
   SHOW DATABASES;
   ```

3. If empty, create the database:
   ```sql
   CREATE DATABASE movie_booking_db;
   ```

---

## ✅ Verification Checklist

Before running your Spring Boot application:

- [ ] MySQL is installed
- [ ] MySQL service is running
- [ ] Can connect via `mysql -u root -p`
- [ ] Can see databases with `SHOW DATABASES;`
- [ ] `application.properties` has correct credentials
- [ ] Port 3306 is accessible

---

## 🧪 Testing MySQL Connection

### Test 1: Command Line Connection

```cmd
mysql -u root -p
```

Enter password, then:
```sql
SHOW DATABASES;
SELECT VERSION();
SELECT CURRENT_USER();
```

### Test 2: Create Test Database

```sql
CREATE DATABASE test_db;
USE test_db;
CREATE TABLE test_table (id INT, name VARCHAR(50));
INSERT INTO test_table VALUES (1, 'Test');
SELECT * FROM test_table;
DROP DATABASE test_db;
```

### Test 3: Spring Boot Connection

Run your Spring Boot application:
```cmd
mvn spring-boot:run
```

**Look for in logs:**
```
HikariPool-1 - Starting...
HikariPool-1 - Start completed.
```

**If you see this, connection is successful!**

---

## 🔄 Alternative: Use H2 Database (For Testing)

If MySQL is too complicated, you can temporarily use H2 (in-memory database):

### Step 1: Update pom.xml

Replace MySQL dependency with:
```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

### Step 2: Update application.properties

```properties
spring.datasource.url=jdbc:h2:mem:movie_booking_db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

### Step 3: Access H2 Console

- URL: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:movie_booking_db
- Username: sa
- Password: (leave empty)

**Note:** H2 data is lost when application stops (in-memory only).

---

## 📞 Getting Help

### Check MySQL Status

```cmd
sc query MySQL80
```

### View MySQL Error Log

```cmd
type "C:\ProgramData\MySQL\MySQL Server 8.0\Data\*.err"
```

### Check if Port 3306 is in Use

```cmd
netstat -ano | findstr :3306
```

---

## 🎯 Quick Setup Summary

**For beginners, I recommend XAMPP:**

1. Download XAMPP from https://www.apachefriends.org/
2. Install with MySQL selected
3. Open XAMPP Control Panel
4. Start MySQL
5. Update `application.properties`:
   ```properties
   spring.datasource.username=root
   spring.datasource.password=
   ```
6. Run your Spring Boot app: `mvn spring-boot:run`

**That's it!** The database will be created automatically.

---

## 📝 What to Do Right Now

1. **Check if MySQL is installed:**
   - Open Command Prompt
   - Run: `mysql --version`

2. **If NOT installed:**
   - Download XAMPP (easier) or MySQL Installer
   - Follow installation steps above

3. **If installed but not running:**
   - Open Services (`services.msc`)
   - Find MySQL service
   - Start it

4. **Test connection:**
   ```cmd
   mysql -u root -p
   ```

5. **Update application.properties** with correct password

6. **Run your Spring Boot app:**
   ```cmd
   mvn spring-boot:run
   ```

The database `movie_booking_db` will be created automatically!

---

**Need more help? Let me know what error message you're seeing!**
