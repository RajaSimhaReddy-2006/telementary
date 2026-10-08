package com.ecogrid.telemetry.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.ecogrid.telemetry.entity.Telemetry;
import com.ecogrid.telemetry.repository.TelemetryRepository;

@RestController
@RequestMapping("/api/telemetry")
public class TelemetryController {

    private final TelemetryRepository repository;

    public TelemetryController(TelemetryRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Telemetry create(@RequestBody Telemetry telemetry) {
        return repository.save(telemetry);
    }

    @GetMapping
    public List<Telemetry> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Telemetry getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Telemetry deleted successfully";
        }

        return "Telemetry not found";
    }
}