    package com.example.lab5_database;

    import com.example.lab5_database.entities.Restaurants;
    import com.example.lab5_database.respositories.RestaurantRepository;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.context.annotation.Bean;

    import java.util.Date;

    @SpringBootApplication
    public class Lab5DatabaseApplication {

        public static void main(String[] args) {
            SpringApplication.run(Lab5DatabaseApplication.class, args);
        }


    }