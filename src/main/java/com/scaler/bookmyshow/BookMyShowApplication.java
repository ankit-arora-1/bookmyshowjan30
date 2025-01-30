package com.scaler.bookmyshow;

import com.scaler.bookmyshow.controllers.BookingController;
import com.scaler.bookmyshow.controllers.UserController;
import com.scaler.bookmyshow.dtos.UserRequestDto;
import com.scaler.bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowApplication implements CommandLineRunner {
    @Autowired
    private UserController userController;

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setName("dhananjay");
        userRequestDto.setEmail("dhananjay@gmail.com");
        userRequestDto.setPassowrd("password");

        userController.signup(userRequestDto);
    }
}
