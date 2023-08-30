package pe.edu.upc.aaw.semana02.entities;

import javax.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Dessert")
public class Dessert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDessert;
    @Column(name = "nameDessert",nullable = false, length = 45)
    private String nameDessert;
    @Column(name = "dueDateDessert",nullable = false)
    private LocalDate dueDateDessert;
    @Column(name = "typeDessert",nullable = false, length = 25)
    private  String typeDessert;
    @Column(name = "caloryDessert",nullable = false)
    private double caloryDessert;

    public Dessert() {
    }

    public int getIdDessert() {
        return idDessert;
    }

    public void setIdDessert(int idDessert) {
        this.idDessert = idDessert;
    }

    public String getNameDessert() {
        return nameDessert;
    }

    public void setNameDessert(String nameDessert) {
        this.nameDessert = nameDessert;
    }

    public LocalDate getDueDateDessert() {
        return dueDateDessert;
    }

    public void setDueDateDessert(LocalDate dueDateDessert) {
        this.dueDateDessert = dueDateDessert;
    }

    public String getTypeDessert() {
        return typeDessert;
    }

    public void setTypeDessert(String typeDessert) {
        this.typeDessert = typeDessert;
    }

    public double getCaloryDessert() {
        return caloryDessert;
    }

    public void setCaloryDessert(double caloryDessert) {
        this.caloryDessert = caloryDessert;
    }
}
