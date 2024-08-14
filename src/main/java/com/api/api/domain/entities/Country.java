package com.api.api.domain.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @Column(name = "code_country",columnDefinition="VARCHAR(5)", nullable= false )
    private String codecountry;
    @Column(columnDefinition = "VARCHAR(50)", nullable= false )
    private String namecountry;

    @OneToMany
    private List<Region> regions;

    public Country() {
    }
    public Country(String codecountry, String namecountry) {
        this.codecountry = codecountry;
        this.namecountry = namecountry;
    }
    public String getCodecountry() {
        return codecountry;
    }
    public void setCodecountry(String codecountry) {
        this.codecountry = codecountry;
    }
    public String getNamecountry() {
        return namecountry;
    }
    public void setNamecountry(String namecountry) {
        this.namecountry = namecountry;
    }

    
}
