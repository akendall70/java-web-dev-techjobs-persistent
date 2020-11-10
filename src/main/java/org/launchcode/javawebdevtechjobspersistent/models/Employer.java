package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @Valid
    @NotNull
    @Size(min=3, max=255, message="Please enter a valid location.")
    String location;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();


    public Employer(String location) {
        this.location = location;
    }

    public Employer(){};


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
