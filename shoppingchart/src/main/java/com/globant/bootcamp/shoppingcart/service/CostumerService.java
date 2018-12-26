package com.globant.bootcamp.shoppingcart.service;

import com.globant.bootcamp.shoppingcart.persistence.model.Costumer;
import com.globant.bootcamp.shoppingcart.persistence.repository.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CostumerService {

    private final CostumerRepository repository;

    @Autowired
    public CostumerService(final CostumerRepository repository) {
        this.repository = repository;
    }

    public List<Costumer> findAllCostumers() {
        return repository.findAll();
    }


    public Costumer findCostumerById(final Long id) {
        return repository.findById(id)
                .orElse(null);
    }

    public Costumer findCostumerByEmail(final String email) {
        return repository.findByEmail(email)
                .orElse(null);
    }

    public Costumer createCostumer(final Costumer costumer) {
        costumer.setId(null);
        return repository.save(costumer);
    }

    public Costumer updateCostumer(final Costumer costumer) {
        final Costumer original = findCostumerById(costumer.getId());
        if (Objects.isNull(original)) {
            return null;
        }
        return repository.save(costumer);
    }
}
