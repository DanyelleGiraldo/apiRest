package com.api.api.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Region {
    @Id
    @Column(name = "code_region",columnDefinition="VARCHAR(5)", nullable= false )
    private String coderegion;
    @Column(columnDefinition = "VARCHAR(50)", nullable= false )
    private String nameregion;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    
    public Region() {
    }
    
    public Region(String coderegion, String nameregion, Country country) {
        this.coderegion = coderegion;
        this.nameregion = nameregion;
        this.country = country;
    }

    public String getCoderegion() {
        return coderegion;
    }
    public void setCoderegion(String coderegion) {
        this.coderegion = coderegion;
    }
    public String getNameregion() {
        return nameregion;
    }
    public void setNameregion(String nameregion) {
        this.nameregion = nameregion;
    }

    
}
