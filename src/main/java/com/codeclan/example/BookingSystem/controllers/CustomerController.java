package com.codeclan.example.BookingSystem.controllers;

import com.codeclan.example.BookingSystem.models.Customer;

import com.codeclan.example.BookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;


    @GetMapping(value = "/course/{course_id}")
    public List<Customer> getByCourseId(@PathVariable long course_id){
        return customerRepository.findByBookings_CourseId(course_id);
    }

    @GetMapping(value = "/course/{course_id}/customerTown/{customer_town}")
    public List<Customer> getByCourseIdAndCustomerTown(@PathVariable long course_id, @PathVariable String customer_town){
        return customerRepository.findByBookings_CourseIdAndCustomerTown(course_id, customer_town);
    }


    @GetMapping(value = "/course/{course_id}/customerTown/{customer_town}/greaterThanAge/{age}")
    public List <Customer> getByCourseIdAndCustomerTownAndAgeGreaterThan(@PathVariable long course_id, @PathVariable String customer_town, @PathVariable int age){
        return customerRepository.findByBookings_CourseIdAndCustomerTownAndAgeGreaterThan(course_id, customer_town, age);
    }


}
