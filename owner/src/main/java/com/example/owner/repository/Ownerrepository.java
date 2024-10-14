package com.example.owner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.owner.models.Atmcards;


@Repository
public interface Ownerrepository extends JpaRepository<Atmcards, Integer>{
	

}
