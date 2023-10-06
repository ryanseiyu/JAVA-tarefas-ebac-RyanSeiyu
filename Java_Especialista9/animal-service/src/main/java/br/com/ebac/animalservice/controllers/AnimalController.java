package br.com.ebac.animalservice.controllers;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ebac.animalservice.entidades.Animal;
import br.com.ebac.animalservice.repositorios.AnimalRepository;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    private List<Animal> findAll() {
        return repository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return repository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return repository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return repository.findAdopted();
    }

    @GetMapping("/gatos")
    private List<Animal> findGatos() {
        return repository.findGatos();
    }

    @GetMapping("/cachorros")
    private List<Animal> findCachorros() {
        return repository.findCachorros();
    }

    // URL de exemplo:
    // http://localhost:8081/animais/resgatadores?dataEntrada=2023-01-01&dataSaida=2023-12-31
    @GetMapping("/resgatadores")
    public List<Object[]> countAnimaisResgatadosPorFuncionario(
            @RequestParam("dataEntrada") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dataEntrada,
            @RequestParam("dataSaida") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dataSaida) {
        Instant instantEntrada = dataEntrada.toInstant();
        Instant instantSaida = dataSaida.toInstant();
        LocalDate localDateEntrada = instantEntrada.atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localDateSaida = instantSaida.atZone(ZoneId.systemDefault()).toLocalDate();

        if (localDateEntrada.isAfter(localDateSaida)) {
            throw new IllegalArgumentException("A data de início não pode ser posterior à data de término.");
        }

        if (localDateEntrada.plusYears(1).isBefore(localDateSaida)) {
            throw new IllegalArgumentException("O intervalo máximo de datas é de um ano.");
        }

        Date dateEntrada = Date.from(instantEntrada);
        Date dateSaida = Date.from(instantSaida);

        return repository.countAnimaisResgatadosPorFuncionario(dateEntrada, dateSaida);
    }

}
