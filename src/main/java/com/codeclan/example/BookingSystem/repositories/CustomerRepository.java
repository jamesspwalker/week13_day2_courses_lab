package com.codeclan.example.BookingSystem.repositories;

import com.codeclan.example.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookings_CourseId(Long course_id);

    List<Customer> findByBookings_CourseIdAndCustomerTown(long course_id, String customer_town);

    List<Customer> findByBookings_CourseIdAndCustomerTownAndAgeGreaterThan(long course_id, String customer_town, int age);
}
