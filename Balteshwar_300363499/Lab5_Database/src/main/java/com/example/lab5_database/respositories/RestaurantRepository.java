    package com.example.lab5_database.respositories;


    import com.example.lab5_database.entities.Restaurants;
    import com.example.lab5_database.entities.sales;
    import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.List;

    public interface RestaurantRepository extends JpaRepository<sales,Long> {

    List<sales> findRestaurantsById(long kw);


    }
