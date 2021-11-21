package com.javatechie.spring.cache.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class User implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -6912201477750422475L;
    @Id
    private int id;
    private String name;
    private String address;
}
