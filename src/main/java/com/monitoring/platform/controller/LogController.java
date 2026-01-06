package com.monitoring.platform.controller;

import com.monitoring.platform.incident.Incident;
import com.monitoring.platform.incident.IncidentRepository;
import com.monitoring.platform.model.LogEntry;
import com.monitoring.platform.model.LogLevel;
import com.monitoring.platform.repository.LogEntryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class LogController {

	private final LogEntryRepository logEntryRepository;
	private final IncidentRepository incidentRepository;

	public LogController(LogEntryRepository logEntryRepository, IncidentRepository incidentRepository) {
		this.logEntryRepository = logEntryRepository;
		this.incidentRepository = incidentRepository;
	}


	@PostMapping
	public LogEntry ingestLog(@RequestBody LogEntry logEntry) {

	    LogEntry savedLog = logEntryRepository.save(logEntry);

	    if (logEntry.getLevel() == LogLevel.ERROR) {
	        Incident incident = new Incident();
	        incident.setApplicationName(logEntry.getApplicationName());
	        incident.setMessage(logEntry.getMessage());
	        incident.setSeverity("HIGH");

	        incidentRepository.save(incident);
	    }

	    return savedLog;
	}


	@GetMapping
	public List<LogEntry> getAllLogs() {
		return logEntryRepository.findAll();
	}

	@GetMapping("/level/{level}")
	public List<LogEntry> getLogsByLevel(@PathVariable LogLevel level) {
		return logEntryRepository.findByLevel(level);
	}
}
