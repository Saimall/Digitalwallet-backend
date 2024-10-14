package com.example.owner.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.owner.models.HeatlthCard;

@Repository
public interface HelathcardsRepository extends JpaRepository<HeatlthCard, Integer> {

	List<HeatlthCard> findByUserid(int id);

	HeatlthCard findByNumber(int number);

}
