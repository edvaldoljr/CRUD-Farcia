package com.generationn.farmacia.repository;

import com.generationn.farmacia.model.CategoriaModel;
import com.generationn.farmacia.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

    List<ProdutoModel> findAllByNomeContainingIgnoreCase(@Param("tipo") String nome);
}
