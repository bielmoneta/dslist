package com.projeto.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.dslist.model.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
