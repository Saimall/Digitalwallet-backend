package com.example.owner.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.owner.models.Ottdetails;

@Repository
public interface Ottdetailsrepository  extends BaseRepository<Ottdetails, Integer>{

	List<Ottdetails> findByUserid(int id);

	Ottdetails findByNumber(int number);

}
