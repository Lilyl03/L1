package com.aca.exam.exam3;

import com.aca.exam.exam3.service.impl.NumberPlateServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.sql.SQLException;

@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class Main {
    public static void main(String[] args) throws SQLException {
        new NumberPlateServiceImpl().create();
    }
}
