package com.aca.exam.exam3.facade;

import com.aca.exam.exam3.repository.NumberPlateRepository;

public class UserPlateNumberFacadeImpl implements UserPlateNumberFacade{
    private NumberPlateRepository numberPlateRepository;

    @Override
    public UserPlateNumberResponseDto take(UserPlateNumberPequestDto dto) {
        if(check(dto.getNumberPlate())){
            return new UserPlateNumberResponseDto();
        }
        return null;
    }

    public boolean check(String numberPlate){
        if(numberPlateRepository.findByNumberPlate(numberPlate).getPassportId().isEmpty()){
            return true;
        }
        return false;
    }
}
