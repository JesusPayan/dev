package com.veterian.api.repository;

import com.veterian.api.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

public interface RoomRepository extends JpaRepository<Room, Long> {
    Room getById(Long id);
    Room updatePrice(Long id,Double price);
}
