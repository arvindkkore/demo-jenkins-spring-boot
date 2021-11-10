package com.jenkins.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jenkins.demo.entiry.ThemeParkRide;

@Repository
public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {
    List<ThemeParkRide> findByName(String name);
}
