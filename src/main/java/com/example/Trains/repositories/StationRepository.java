package com.example.Trains.repositories;

import com.example.Trains.entities.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StationRepository extends JpaRepository<Station, Long> {
    @Query("SELECT s FROM Station s WHERE " +
           "LOWER(s.name) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
           "LOWER(s.city) LIKE LOWER(CONCAT('%', :query, '%')) " +
           "ORDER BY s.city, s.name")
    List<Station> searchStations(@Param("query") String query);
}

