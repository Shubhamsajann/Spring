package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Vaccine;

// Service layer interface – defines the operations we support

public interface IVaccineService {

    public Vaccine searchVaccineById(int id);
    //public List<Vaccine > searchVaccineByGivenId(Vaccine vac,Boolean status,String... params);
    public List<Vaccine > searchVaccineByGivenId(Vaccine vac);
    public String removeVaccineInfoById(Iterable<Integer> ids);	
}
