package com.example.owner.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.owner.models.Rto;

@Repository
public interface Rtorepository extends BaseRepository<Rto, Integer> {

	List<Rto> findByFamilyid(int id);

	Rto findByNumber(int number);

}
