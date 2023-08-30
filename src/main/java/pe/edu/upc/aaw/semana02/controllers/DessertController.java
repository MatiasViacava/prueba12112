package pe.edu.upc.aaw.semana02.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.semana02.dtos.DessertDTO;
import pe.edu.upc.aaw.semana02.entities.Dessert;
import pe.edu.upc.aaw.semana02.serviceinterfaces.IDessertService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/desserts")
public class DessertController {
    @Autowired
    private IDessertService dS;
    @PostMapping
    public void registrar(@RequestBody DessertDTO dto){
        ModelMapper m = new ModelMapper();
        Dessert d = m.map(dto, Dessert.class);
        dS.insert(d);
    }
    @GetMapping
    public List<DessertDTO> listar(){
        return dS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, DessertDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        dS.delete(id);
    }

    @GetMapping("/{id}")
    public DessertDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        DessertDTO d = m.map(dS.listId(id), DessertDTO.class);
        return d;
    }
    @PostMapping("/buscar")
    public List<DessertDTO> buscar(@RequestBody LocalDate fecha){
        return dS.findByDueDateDessert(fecha).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, DessertDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody DessertDTO dto){
        ModelMapper m = new ModelMapper();
        Dessert d = m.map(dto, Dessert.class);
        dS.insert(d);
    }

}
