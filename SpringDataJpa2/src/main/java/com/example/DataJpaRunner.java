package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Vaccine;
import com.example.service.VaccineServie;

@SpringBootApplication
public class DataJpaRunner {

    public static void main(String[] args) {

        // Start Spring Boot container
        ConfigurableApplicationContext container =
                SpringApplication.run(DataJpaRunner.class, args);

        // Get Service bean
        VaccineServie service = container.getBean(VaccineServie.class);


        /*
        =====================================================
        1) SAVE A SINGLE VACCINE
        =====================================================
        String status = service.registerVaccineInfo(
                new Vaccine("phizer", "moderena", 4545.2));
        System.out.println(status);
        */

        
        
//        =====================================================
//        2) SAVE MULTIPLE VACCINES
//        =====================================================
        
        Vaccine v1 = new Vaccine("HepB", "WHO", 40);
        Vaccine v2 = new Vaccine("Java", "Telusko", 500);
        Vaccine v3 = new Vaccine("Spring", "Telusko", 600);
        Vaccine v4 = new Vaccine("Sql", "shubham", 1000000);

        List<Vaccine> list = List.of(v1, v2, v3, v4);
        service.registrerMultipleVaccineInfo(list);

        list.forEach(System.out::println);
        


        /*
        =====================================================
        3) COUNT TOTAL VACCINES
        =====================================================
        Long count = service.vaccineCount();
        System.out.println("Total Vaccines = " + count);
        */


        /*
        =====================================================
        4) CHECK IF A VACCINE EXISTS
        =====================================================
        int id = 10;
        boolean exists = service.checkVaccineAvailibilty(id);

        if (exists)
            System.out.println("Vaccine " + id + " exists");
        else
            System.out.println("Vaccine " + id + " does NOT exist");
        */


        /*
        =====================================================
        5) FETCH ALL VACCINES
        =====================================================
        Iterable<Vaccine> all = service.getAllVaccineInfo();
        all.forEach(System.out::println);
        */


        /*
        =====================================================
        6) FETCH MULTIPLE VACCINES BY IDS
        =====================================================
        List<Integer> ids = List.of(1, 3);
        Iterable<Vaccine> selected = service.getAllVaccines(ids);

        selected.forEach(System.out::println);
        */


        /*
        =====================================================
        7) FETCH SINGLE VACCINE USING OPTIONAL
        =====================================================
        int id = 10;
        Optional<Vaccine> optional = service.getVaccinesById(id);

        if(optional.isPresent())
            System.out.println(optional.get());
        else
            System.out.println("Vaccine with id " + id + " not found");
        */


        /*
        =====================================================
        8) DELETE VACCINE BY ID
        =====================================================
        int id = 7;
        String result = service.removeVaccineById(id);
        System.out.println(result);
        */


        /*
        =====================================================
        9) DELETE USING VACCINE OBJECT
        =====================================================
        int id = 5;
        Optional<Vaccine> optional = service.getVaccinesById(id);

        if(optional.isPresent()) {
            Vaccine obj = optional.get();   // contains ID
            String result = service.removeVaccineByVaccine(obj);
            System.out.println(result);
        } else {
            System.out.println("ID not found");
        }
        */


        // =====================================================
        // 10) DELETE MULTIPLE VACCINES BY IDS
        // =====================================================
//        List<Integer> ids = List.of(2, 4);
//        String status = service.removeAllVaccineById(ids);
//        System.out.println(status);
//
//
//        // Close container
//        container.close();
    }
}
