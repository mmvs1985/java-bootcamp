package com.globant.bootcamp.shoppingcart.controller;


import com.globant.bootcamp.shoppingcart.persistence.model.Costumer;
import com.globant.bootcamp.shoppingcart.service.CostumerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(
        path = "/costumer",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class CostumerController {

    private final CostumerService service;

    public CostumerController(final CostumerService service) {
        this.service = service;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Costumer> getCostumers() {
        return service.findAllCostumers();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private Costumer getCostumerById(@PathVariable("id") final Long id) {
        final Costumer costumer = service.findCostumerById(id);
        if (Objects.isNull(costumer)) {
            throw new CostumerNotFoundException("PERSON ID NOT FOUND: " + id);
        }
        return costumer;
    }



    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Costumer postCostumer(@RequestBody final Costumer costumer) {
        return service.createCostumer(costumer);
    }


    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Costumer putPerson(@PathVariable(name = "id") final Long id,
                            @RequestBody final Costumer person) {
        person.setId(id);
        final Costumer updated = service.updateCostumer(person);
        if (Objects.isNull(updated)) {
            throw new CostumerNotFoundException("PERSON ID NOT FOUND: " + id);
        }
        return updated;
    }




    @ResponseStatus(HttpStatus.NOT_FOUND)
    public static class CostumerNotFoundException extends RuntimeException {
        public CostumerNotFoundException(String message) {
            super(message);
        }
    }


    /*@GetMapping("/{mail}")
    @ResponseStatus(HttpStatus.OK)

    private Costumer getCostumerBymail(@PathVariable("mail") final String mail) {
        final Costumer costumer = service.findCostumerByEmail(mail);
        if (Objects.isNull(costumer)) {
            throw new CostumerNotFoundException("PERSON ID NOT FOUND: " + mail);
        }
        return costumer;
    }*/

}
