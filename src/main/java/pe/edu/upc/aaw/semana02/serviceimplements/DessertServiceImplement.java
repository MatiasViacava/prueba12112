package pe.edu.upc.aaw.semana02.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.semana02.entities.Dessert;
import pe.edu.upc.aaw.semana02.repositories.IDessertRepository;
import pe.edu.upc.aaw.semana02.serviceinterfaces.IDessertService;

import java.time.LocalDate;
import java.util.List;

@Service
public class DessertServiceImplement implements IDessertService {
    @Autowired
    private IDessertRepository dR;

    @Override
    public void insert(Dessert dessert) {
        dR.save(dessert);
    }

    @Override
    public List<Dessert> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDessert) {
        dR.deleteById(idDessert);
    }

    @Override
    public Dessert listId(int idDessert) {
        return dR.findById(idDessert).orElse(new Dessert());
    }

    @Override
    public List<Dessert> findByDueDateDessert(LocalDate dueDateDessert) {
        return dR.findByDueDateDessert(dueDateDessert);
    }

}
