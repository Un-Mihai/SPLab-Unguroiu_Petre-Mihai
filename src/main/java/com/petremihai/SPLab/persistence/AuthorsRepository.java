package com.petremihai.SPLab.persistence;

import com.petremihai.SPLab.lab1.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepository extends JpaRepository<Author, Integer> {
}
