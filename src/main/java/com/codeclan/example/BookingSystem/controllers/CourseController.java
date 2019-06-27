package com.codeclan.example.BookingSystem.controllers;

import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.repositories.CourseRepository;
import com.codeclan.example.BookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getRating(@PathVariable int rating){
        return courseRepository.findByRating(rating);
    }

    @GetMapping(value = "/customer/{customerId}")
    public List<Course> getByCustomerId(@PathVariable Long customerId){
        return courseRepository.findByBookings_CustomerId(customerId);
    }
}
