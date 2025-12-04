package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Vaccine;
import com.example.repo.IVaccineRepo;

@Service
// This class contains business logic and interacts with Repository layer.
public class VaccineServie implements IVaccineService {
	
    // Repository reference (DAO layer)
    private IVaccineRepo repo;
	
    @Autowired 
    // Setter-based Dependency Injection by Spring
    public void setRepo(IVaccineRepo repo) {
        this.repo = repo;
    }

    // ============================================================
    // 1) SAVE A SINGLE VACCINE
    // ============================================================
    @Override
    public String registerVaccineInfo(Vaccine vaccine) {

        /*
         repo.save(vaccine)
         - If vaccine.id is NULL  → INSERT new row
         - If vaccine.id exists   → UPDATE row
         */
        Vaccine saved = repo.save(vaccine);

        return "Vaccine info registered with ID: " + saved.getId();
    }

    // ============================================================
    // 2) SAVE MULTIPLE VACCINES
    // ============================================================
    @Override
    public Iterable<Vaccine> registrerMultipleVaccineInfo(Iterable<Vaccine> vaccines) {

        /*
         saveAll()
         - Inserts/Updates multiple records
         - Returns saved objects with generated IDs
         */
        return repo.saveAll(vaccines);
    }

    // ============================================================
    // 3) COUNT TOTAL VACCINES
    // ============================================================
    @Override
    public Long vaccineCount() {
        return repo.count();
    }

    // ============================================================
    // 4) CHECK VACCINE EXISTENCE BY ID
    // ============================================================
    @Override
    public Boolean checkVaccineAvailibilty(Integer id) {

        /*
         existsById(id)
         - true  → ID found
         - false → ID not found
         */
        return repo.existsById(id);
    }

    // ============================================================
    // 5) FETCH ALL VACCINES
    // ============================================================
    @Override
    public Iterable<Vaccine> getAllVaccineInfo() {
        return repo.findAll();
    }

    // ============================================================
    // 6) FETCH MULTIPLE VACCINES BY LIST OF IDS
    // ============================================================
    @Override
    public Iterable<Vaccine> getAllVaccines(Iterable<Integer> ids) {
        return repo.findAllById(ids);
    }

    // ============================================================
    // 7) FETCH A SINGLE VACCINE BY ID
    // ============================================================
    @Override
    public Optional<Vaccine> getVaccinesById(Integer id) {

        /*
         findById(id)
         - Returns Optional<Vaccine>  
         - Helps avoid NullPointerException
         */
        return repo.findById(id);
    }

    // ============================================================
    // 8) DELETE A VACCINE BY ID
    // ============================================================
    @Override
    public String removeVaccineById(Integer id) {

        // Step 1: Check if ID exists
        boolean exists = repo.existsById(id);

        // Step 2: Delete if exists
        if (exists) {
            repo.deleteById(id);
            return "Record with ID " + id + " has been deleted.";
        }

        return "Record with ID " + id + " is not available.";
    }

    // ============================================================
    // 9) DELETE A VACCINE BY PASSING VACCINE OBJECT
    // ============================================================
    @Override
    public String removeVaccineByVaccine(Vaccine obj) {

        // Extract ID from entity object
        Integer id = obj.getId();

        // Check if that ID exists in DB
        Optional<Vaccine> optional = repo.findById(id);

        if (optional.isPresent()) {
            repo.delete(obj);   // delete based on entity object
            return "Record with ID " + id + " is deleted.";
        } 
        else {
            return "ID " + id + " is not available.";
        }
    }

    // ============================================================
    // 10) DELETE MULTIPLE VACCINES BY LIST OF IDS
    // ============================================================
//    @Override
//    public String removeAllVaccineById(List<Integer> ids) {
//
//        /*
//         findAllById(ids)
//         - Fetches all records that match the given IDs.
//         */
//        List<Vaccine> vaccines = (List<Vaccine>) repo.findAllById(ids);
//
//        int requestedCount = ids.size();  // How many user wants to delete
//        int foundCount = vaccines.size(); // How many exist in DB
//
//        // If all IDs exist → Delete them
//        if (requestedCount == foundCount) {
//            repo.deleteAllById(ids);
//            return "Vaccine info deleted for given IDs.";
//        }
//
//        // If mismatch → Some IDs are invalid
//        return "Not possible to delete. Some IDs are invalid.";
//    }

}
