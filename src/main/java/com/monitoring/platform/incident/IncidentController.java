package com.monitoring.platform.incident;

import org.springframework.web.bind.annotation.*;

import com.monitoring.platform.exception.ResourceNotFoundException;

import java.util.List;

@RestController
@RequestMapping("/incidents")
public class IncidentController {

    private final IncidentRepository incidentRepository;

    public IncidentController(IncidentRepository incidentRepository) {
        this.incidentRepository = incidentRepository;
    }

    @GetMapping
    public List<Incident> getAllIncidents() {
        return incidentRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Incident getIncident(@PathVariable Long id) {
        return incidentRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Incident not found with id: " + id));
    }

}
