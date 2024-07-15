package com.example.SAMAY_G6.Repository;

import com.example.SAMAY_G6.model.Orden;
import com.example.SAMAY_G6.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdenRepository extends JpaRepository<Orden,Long> {
  List<Orden> findByUsuario (Usuario usuario);
}
