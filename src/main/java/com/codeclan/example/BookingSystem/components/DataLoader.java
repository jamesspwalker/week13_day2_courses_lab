package com.codeclan.example.BookingSystem.components;

import com.codeclan.example.BookingSystem.models.Booking;
import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.models.Customer;
import com.codeclan.example.BookingSystem.repositories.BookingRepository;
import com.codeclan.example.BookingSystem.repositories.CourseRepository;
import com.codeclan.example.BookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Course course1 = new Course("Riddles101", "Edinburgh", 5);
        courseRepository.save(course1);

        Course course2 = new Course("Intro to Whisky", "Edinburgh", 4);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Bob", "Dundee", 34);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Jeff", "Omaha", 47);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Brenda", "Islamabad", 19);
        customerRepository.save(customer3);

        Booking booking1 = new Booking("01-02-20", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("02-12-19", course2, customer2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("04-03-77", course2, customer3);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("02-12-19", course2, customer1);
        bookingRepository.save(booking4);
    }

}
