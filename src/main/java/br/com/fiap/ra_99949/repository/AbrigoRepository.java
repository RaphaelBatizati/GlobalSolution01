package br.com.fiap.ra_99949.repository;

import br.com.fiap.ra_99949.entity.Abrigo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbrigoRepository extends JpaRepository<Abrigo, Long> { }
