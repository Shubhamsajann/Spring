package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Vaccine;

// Service layer interface – defines the operations we support

public interface IVaccineService {

    public Iterable<Vaccine> featchDetailBySorting(Boolean status,String...properties);
    
    public List<Vaccine> featchDetailByPagination(int pgno,int pgsize,Boolean status,String...properties);
	
	public void fetchDeatilsByPagination(int pageSize);
	
}
