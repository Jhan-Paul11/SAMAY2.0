package com.example.SAMAY_G6.Repository;

import com.example.SAMAY_G6.model.CarritoCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoCompraRepository extends JpaRepository<CarritoCompra, Long> {
}
