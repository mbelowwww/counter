package com.clicker.counter.repositories;

import com.clicker.counter.entity.Clicker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClickerRepository extends JpaRepository<Clicker, Long> {

    @Query("select count(e) from Clicker e")
    Long countAll();

}
