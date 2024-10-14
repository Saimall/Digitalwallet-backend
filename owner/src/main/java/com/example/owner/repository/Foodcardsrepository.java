package com.example.owner.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.owner.models.Foodcards;

@Repository
public interface Foodcardsrepository extends JpaRepository<Foodcards, Integer> {

	List<Foodcards> findByUserid(int id);

	Foodcards findByNumber(int number);

}
