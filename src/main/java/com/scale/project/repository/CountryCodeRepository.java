package com.scale.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scale.project.model.CountryCode;

@Repository
public interface CountryCodeRepository extends JpaRepository<CountryCode, Long>{

}
