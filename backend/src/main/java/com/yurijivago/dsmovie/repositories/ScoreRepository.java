package com.yurijivago.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurijivago.dsmovie.entities.Score;
import com.yurijivago.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
