package com.yurijivago.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurijivago.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
