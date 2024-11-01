package com.emsi.mabanque.repositories;

import com.emsi.mabanque.entities.Compte;
import org.springframework.data.repository.CrudRepository;

public interface CompteRepository extends CrudRepository<Compte, Long> {
}
