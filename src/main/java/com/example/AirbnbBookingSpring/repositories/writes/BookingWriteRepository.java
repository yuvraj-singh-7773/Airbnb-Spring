package com.example.AirbnbBookingSpring.repositories.writes;

import com.example.AirbnbBookingSpring.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingWriteRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findById(Long id);

    List<Booking> findByAirbnbId(String airbnbId);

    Optional<Booking> findByIdempotencyKey(String idempotencyKey);
}
