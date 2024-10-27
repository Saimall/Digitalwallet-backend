package com.example.owner.repository;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.example.owner.models.Atmcards;

@Repository
public interface Atmrepository extends BaseRepository<Atmcards, Integer>{
	Atmcards findByNumber(int number);

	List<Atmcards> findByFamilyid(int familyid);



}
