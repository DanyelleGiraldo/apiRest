package com.api.api.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class City {
    @Id
    @Column(name = "code_city",columnDefinition="VARCHAR(5)", nullable= false )
    private String codecity;
    @Column(columnDefinition = "VARCHAR(50)", nullable= false )
    private String namecity;

    @ManyToOne
    private Region region;
    
    public City() {
    }
    
    public City(String codecity, String namecity, Region region) {
        this.codecity = codecity;
        this.namecity = namecity;
        this.region = region;
    }

    public String getCodecity() {
        return codecity;
    }
    public void setCodecity(String codecity) {
        this.codecity = codecity;
    }
    public String getNamecity() {
        return namecity;
    }
    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }

    

}
