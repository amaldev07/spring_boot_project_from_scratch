package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class YourEntityController {

    @Autowired
    private YourEntityRepository repository;

    @GetMapping("/entities/{id}")
    public YourEntity getEntityById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/entities")
    public YourEntity createEntity(@RequestBody YourEntity entity) {
        return repository.save(entity);
    }

    @PutMapping("/entities/{id}")
    public YourEntity updateEntity(@PathVariable int id, @RequestBody YourEntity entity) {
        entity.setId(id);
        return repository.save(entity);
    }

    @DeleteMapping("/entities/{id}")
    public void deleteEntity(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
