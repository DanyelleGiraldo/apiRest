package com.api.api.domain.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @Column(name = "id_person", columnDefinition= "VARCHAR(20)", nullable= false)
    private String idPerson;

    @Column(name = "fist_name", columnDefinition = "VARCHAR(50)", nullable = false)
    private String firstname;

    @Column(name = "last_name", columnDefinition = "VARCHAR(50)", nullable=false)
    private String lastname;

    @ManyToOne
    City cities;

    @OneToMany(cascade=CascadeType.ALL, orphanRemoval= true, mappedBy = "persons")
    private Set<TypePerson> typePersons;

    public Person() {
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public City getCities() {
        return cities;
    }
    public void setCities(City cities) {
        this.cities = cities;
    }

    public Set<TypePerson> getTypePersons() {
        return typePersons;
    }

    public void setTypePersons(Set<TypePerson> typePersons) {
        this.typePersons = typePersons;
    }

    
}
