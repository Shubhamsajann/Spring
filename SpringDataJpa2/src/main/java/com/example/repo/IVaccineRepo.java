package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import com.example.entity.Vaccine;

// Repository interface for Vaccine entity
// CrudRepository provides basic CRUD methods: save, findById, findAll, deleteById, etc.
public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {
    // No code needed here – Spring Data JPA generates implementation automatically
}
