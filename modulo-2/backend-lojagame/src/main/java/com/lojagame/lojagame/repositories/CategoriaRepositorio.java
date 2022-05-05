package com.lojagame.lojagame.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.lojagame.lojagame.models.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
