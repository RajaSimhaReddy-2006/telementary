package com.ecogrid.telemetry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecogrid.telemetry.entity.Telemetry;

public interface TelemetryRepository extends JpaRepository<Telemetry, Long> {
}