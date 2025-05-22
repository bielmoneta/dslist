package com.projeto.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.dslist.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
