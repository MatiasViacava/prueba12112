package pe.edu.upc.aaw.semana02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.semana02.entities.Dessert;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IDessertRepository extends JpaRepository<Dessert, Integer> {
    // HERENCIAEN JAVA COMPLETO

List<Dessert> findByDueDateDessert(LocalDate dueDateDessert);
}
