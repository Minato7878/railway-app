package com.nulp.railway.repository;

import com.nulp.railway.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findAllByIsAvailableIsTrue();

    Seat findByCarriageAndSeatNumberAndRailwayId(String carriage, String seatNumber, Long railwayId);
}