package com.codeclan.example.BookingSystem.repositories;

import com.codeclan.example.BookingSystem.models.Booking;

import com.codeclan.example.BookingSystem.projections.EmbedCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCustomer.class)
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByDate(String date);

}
