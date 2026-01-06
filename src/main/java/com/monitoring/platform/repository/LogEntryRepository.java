package com.monitoring.platform.repository;

import com.monitoring.platform.model.LogEntry;
import com.monitoring.platform.model.LogLevel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogEntryRepository extends JpaRepository<LogEntry, Long> {

    List<LogEntry> findByLevel(LogLevel level);
}
