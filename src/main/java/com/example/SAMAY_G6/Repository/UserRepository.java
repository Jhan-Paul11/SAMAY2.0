package com.example.SAMAY_G6.Repository;

import com.example.SAMAY_G6.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {
//  @Query("SELECT t FROM todo t WHERE t.terminada =true")
//  List<ToDo> findTodasTareasCompletadas();
Optional<Usuario> findByEmail(String email);
}
