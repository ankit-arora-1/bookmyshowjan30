package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.exceptions.UserNotFoundException;
import com.scaler.bookmyshow.models.*;
import com.scaler.bookmyshow.repositories.BookingRepository;
import com.scaler.bookmyshow.repositories.ShowRepository;
import com.scaler.bookmyshow.repositories.ShowSeatRepository;
import com.scaler.bookmyshow.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private UserRepository userRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private BookingRepository bookingRepository;
    private PriceCalculatorService priceCalculatorService;

//    public BookingService(
//            UserRepository userRepository,
//            ShowRepository showRepository,
//            ShowSeatRepository showSeatRepository,
//            PriceCalculatorService priceCalculatorService,
//            BookingRepository bookingRepository
//    ) {
//        this.userRepository = userRepository;
//        this.showRepository = showRepository;
//        this.showSeatRepository = showSeatRepository;
//        this.priceCalculatorService = priceCalculatorService;
//        this.bookingRepository = bookingRepository;
//    }

    @Transactional
    public Booking issueTicket(Long userId, Long showId, List<Long> showSeatIds) throws UserNotFoundException {
       /*
       * ---------- START TRANSACTION ---------------
       * 1. Get the user details from the DB
       * 2. Get the show details from the DB
       * ---------- START TRANSACTION ---------------
       * 3. Get the show seats from the DB
       * 4. Check if the seats are available
       * 5. If not, throw exception
       * 6. If yes, change the status to locked and update locked at
       * ---------- END TRANSACTION ---------------
       * 7. return booking object
       * ---------- END TRANSACTION ---------------
       * */

//        Optional<User> userOptional = userRepository.findById(userId);
//        if(userOptional.isEmpty()) {
//            throw new UserNotFoundException();
//        }
//
//        User bookedby = userOptional.get();
//
//        Optional<Show> showOptional = showRepository.findById(showId);
//        if(showOptional.isEmpty()) {
//            throw new RuntimeException(); // TODO: Create a custom exception for this
//        }
//
//        Show show = showOptional.get();
//
//        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);
//        for(ShowSeat showSeat: showSeats) {
//            if(!(showSeat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE) ||
//                    (showSeat.getShowSeatStatus().equals(ShowSeatStatus.BLOCKED)) &&
//                            Duration.between(showSeat.getLockedAt().toInstant(), new Date().toInstant()).toMinutes() > 15)) {
//               throw new RuntimeException();
//            }
//        }
//
//        for(ShowSeat showSeat: showSeats) {
//            showSeat.setShowSeatStatus(ShowSeatStatus.BLOCKED);
//            showSeat.setLockedAt(new Date());
//            showSeatRepository.save(showSeat); // HW: Check how saveAll() method works
//        }
//
//        Booking booking = new Booking();
//        booking.setBookingStatus(BookingStatus.PENDING);
//        booking.setUser(bookedby);
//        booking.setBookedAt(new Date());
//        booking.setShowSeats(showSeats);
//        booking.setShow(show);
//        booking.setAmount(priceCalculatorService.calculatePrice(show, showSeats));
//
//        return bookingRepository.save(booking);
        return null;
    }
}

















