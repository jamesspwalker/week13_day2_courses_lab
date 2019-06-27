package com.codeclan.example.BookingSystem.projections;

import com.codeclan.example.BookingSystem.models.Booking;
import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedCustomer", types = Booking.class)
public interface EmbedCustomer {
    String getCustomerName();
    Customer getCustomer();
    Course getCourse();

}
