package com.projeto.ecomerce.repository;

import com.projeto.ecomerce.model.States;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<States, Long> {
}
