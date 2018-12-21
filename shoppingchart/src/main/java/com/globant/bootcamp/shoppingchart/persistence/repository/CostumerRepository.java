package com.globant.bootcamp.shoppingchart.persistence.repository;

import com.globant.bootcamp.shoppingchart.persistence.model.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CostumerRepository extends JpaRepository<Costumer,Long> {
    @Override
    Optional<Costumer> findById(Long aLong);

    @Override
    List<Costumer> findAll();

    Optional<Costumer> findByEmail(String email);
}
