package com.aca.exam.exam3.repository;

import com.aca.exam.exam3.entity.NumberPlate;
import com.aca.exam.exam3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberPlateRepository extends JpaRepository<NumberPlate, Long> {
    User findByNumberPlate(String NumberPlate);
}
