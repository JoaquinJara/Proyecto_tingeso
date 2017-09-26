package edu.usach.studentspring.model;


import javax.persistence.*;
import java.util.Set;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="student")
public class Student {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int rut;
    
    @NotNull
    private String name;
    
    @NotNull
    private String mail;
    
    @NotNull
    private String program;
    
    @NotNull
    private int year;
    

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getRut() {
        return rut;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String getMail() {
        return mail;
    }
    
    public void setProgram(String program) {
        this.program = program;
    }
    
    public String getProgram() {
        return program;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public int getYear() {
        return year;
    }
    
}
