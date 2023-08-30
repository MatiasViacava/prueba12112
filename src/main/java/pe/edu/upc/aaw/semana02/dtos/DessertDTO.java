package pe.edu.upc.aaw.semana02.dtos;

import java.time.LocalDate;

public class DessertDTO {
    private int idDessert;
    private String nameDessert;
    private LocalDate dueDateDessert;
    private  String typeDessert;
    private double caloryDessert;

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
