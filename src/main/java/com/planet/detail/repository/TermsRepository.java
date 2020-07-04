package com.planet.detail.repository;

import com.planet.detail.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("termsRepository")
public interface TermsRepository extends JpaRepository<Planet, Long> {
}
