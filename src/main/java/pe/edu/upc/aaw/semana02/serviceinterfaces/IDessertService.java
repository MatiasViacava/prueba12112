package pe.edu.upc.aaw.semana02.serviceinterfaces;

import pe.edu.upc.aaw.semana02.entities.Dessert;

import java.time.LocalDate;
import java.util.List;

public interface IDessertService {
    public void insert(Dessert dessert);
    public List<Dessert> list();
    public void delete(int idDessert);
    public Dessert listId(int idDessert);
    List<Dessert> findByDueDateDessert(LocalDate dueDateDessert);


}
