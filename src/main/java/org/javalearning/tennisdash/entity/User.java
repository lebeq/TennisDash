package org.javalearning.tennisdash.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table()
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String clubMembership;

    protected User(){}

    public User(String firstName, String lastName, String clubMembership) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clubMembership = clubMembership;
    }

    @Override
    public String toString(){
        return String.format(
                "User[id=%d, firstName='%s', lastName='%s', clubMembership='%s']";
                id, firstName, lastName, clubMembership);
    }

    public Long getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getClubMembership(){
        return clubMembership;
    }
}
