package com.aca.exam.exam3.facade;

import com.aca.exam.exam3.entity.UserPlateNumber;

public interface UserPlateNumberFacade {
    UserPlateNumberResponseDto take(UserPlateNumberPequestDto dto);
}
