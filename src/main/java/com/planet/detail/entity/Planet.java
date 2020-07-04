package com.planet.detail.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "planet")
@Data
public class Planet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_planet")
    private Long idPlanet;

    @JsonIgnore
    private Long angle;
    private boolean direction;
    private String name;
    private Long radio;

    public Long ubicationByDay(Long day){
        /*true = counter-clockwise
          false = clockwise*/
        Long position = day*(this.getAngle());
        while(position>360){
            position = position-360;
        }
        if(this.isDirection()){
            position = this.getOpposite(position);
        }

        return position;
    }
    public Long getOpposite(Long angle){
        if(angle>180){
            return angle-180;
        }
        return angle+180;
    }

}

