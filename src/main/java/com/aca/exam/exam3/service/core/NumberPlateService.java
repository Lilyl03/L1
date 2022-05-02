package com.aca.exam.exam3.service.core;

import java.sql.SQLException;
import java.util.Set;

public interface NumberPlateService {
    Set<String> create() throws SQLException;
}
