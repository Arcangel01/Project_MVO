package com.project.mvo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.mvo.models.Lista;

@Repository("repositorio")
public interface ListaRepository extends JpaRepository<Lista, Integer> {

	public List<Lista> findAll();
}
