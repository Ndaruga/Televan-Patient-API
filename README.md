# Televan-Patient-API 
### Patient Management System
A Spring boot REST API to enter patient data CRUD Patient data to a PostgreSQL database

This Spring Boot application provides a robust and user-friendly interface for managing patient records through CRUD (Create, Read, Update, Delete) operations. It is designed to interact with a PostgreSQL database and offers a simple web interface for efficient patient management.

## Features

- **Create Patient**: Add new patient records with essential details.
- **Read Patient**: Retrieve specific patient information or view all patients.
- **Update Patient**: Modify existing patient records.
- **Delete Patient**: Remove patient records from the database.
- **Responsive Web Interface**: User-friendly HTML/CSS pages for seamless interaction.

## Technologies Used

- **Spring Boot**: Framework for building the application.
- **PostgreSQL**: Database for storing patient records.
- **HTML/CSS**: Frontend for user interaction.
- **JavaScript**: For handling API calls and form submissions.

## Getting Started

Follow these steps to set up and run the Patient Management System on your local machine:

### Prerequisites

- **Java 11 or higher**: Ensure you have Java installed. You can check your Java version by running:
  ```bash
  java -version
  ```

- **Maven**: Make sure Maven is installed for managing dependencies. Check your Maven version:
  ```bash
  mvn -v
  ```

### Clone the Repository

Clone this repository to your local machine using:

```bash
git clone  https://github.com/Ndaruga/Televan-Patient-API.git
```



### Downloading and Installing PostgreSQL

You need a PostgreSQL database set up. Download and install PostgreSQL from [PostgreSQL Official Site](https://www.postgresql.org/download/).
1. **Download PostgreSQL**: Visit the [PostgreSQL Downloads page](https://www.postgresql.org/download/) and choose the installer for your operating system.
2. **Install PostgreSQL**: Follow the installation instructions provided on the site. Make sure to remember the username and password you set during installation.

### Exposing PostgreSQL to the Internet with ngrok

To expose your PostgreSQL database to the internet for testing purposes, you can use [ngrok](https://ngrok.com/):

1. **Download ngrok**: Go to the [ngrok website](https://ngrok.com/download) and download the appropriate version for your operating system.
2. **Install ngrok**: Follow the installation instructions on the ngrok website.
3. **Expose PostgreSQL**: Run the following command in your terminal, replacing `5432` with your PostgreSQL port if different:
   ```bash
   ngrok tcp 5432
   ```
   This will provide you with a public URL that you can use to connect to your PostgreSQL database remotely.

### Installing Dummy Data

To populate the database with initial dummy data, run the `data.sql` file in the `src/main/resources` directory, within the postgres database with a tool such as `pg-admin` or any other tool to interact with your database. 

### Configure Database Connection

Before running the application, you need to configure the database connection settings in the `src/main/resources/application.properties` file:

```properties
# Application Name
spring.application.name=telvan

# Server Port
server.port=5500

# JPA and Hibernate Settings
spring.jpa.hibernate.ddl-auto=update  # Change to 'create' for testing but will drop existing data
spring.datasource.driver-class-name=org.postgresql.Driver

# Database Connection Details
spring.datasource.url=jdbc:postgresql://your-ngrok-host:your-ngrok-port/your-db-name
spring.datasource.username=your-username
spring.datasource.password=your-password

# Additional Settings
spring.jpa.generate-ddl=true
spring.jpa.show-sql=true
```

### Running the Application

To run the application, navigate to the root directory of the project and execute the following command:

```bash
mvn spring-boot:run
```

Alternatively, you can build the project into a JAR file and run it:

```bash
mvn clean package
java -jar target/patient-management-system-0.0.1-SNAPSHOT.jar
```

### Accessing the Application

Once the application is running, open your web browser and navigate to:

```
http://localhost:5500/
```

You will see the landing page with links to manage patient records.

### API Endpoints

The application exposes the following API endpoints for direct interaction:

- **GET /api/v1/patient/{id}**: Retrieve patient details by ID.
- **GET /api/v1/patient**: Retrieve all patients.
- **POST /api/v1/patient**: Create a new patient.
- **PUT /api/v1/patient**: Update an existing patient.
- **DELETE /api/v1/patient/{id}**: Delete a patient by ID.

## Contributing

Contributions are welcome! If you have suggestions for improvements or new features, feel free to fork the repository and submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or feedback, please reach out to:

- **Your Name**: [your.email@example.com](mailto:your.email@example.com)

---

Thank you for using the Patient Management System! We hope it helps you manage patient records efficiently. Happy coding!

--- 

This README now includes detailed instructions for downloading PostgreSQL, exposing it with ngrok, and running the `users.sql` file to populate the database with dummy data. Feel free to customize any sections further to better fit your project's needs!