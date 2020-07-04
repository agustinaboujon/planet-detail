package com.planet.detail.service;

import com.planet.detail.entity.Planet;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TermsService {
    public List<Planet> getPlanet();
    public boolean isAligned(Long day);
    public String isInATriangle(Long day);
    public Long angleBetweenPlanet(Long angle1, Long angle2);
    public boolean itsOptimal(Long day);

}
