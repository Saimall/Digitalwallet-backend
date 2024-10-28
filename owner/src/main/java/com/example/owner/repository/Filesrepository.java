package com.example.owner.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.owner.models.Files;

@Repository
public interface Filesrepository extends BaseRepository<Files, Integer> {

	List<Files> findByFamilyid(int familyid);

	Files findByNumber(int number);

}
