package com.company.ada_jpa.java.com.aca.facade;

import com.aca.entity.User;
import com.aca.service.core.DiplomaService;
import com.aca.service.core.UserService;
import com.aca.service.core.parameters.CreateUserParams;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UniversityFacadeImplTest {
    private UniversityFacade universityFacade;
    @Mock
    private UserService userService;
    @Mock
    private DiplomaService diplomaService;

    @BeforeEach
    void setUp() {
        universityFacade = new UniversityFacadeImpl(userService,diplomaService);
    }

    @Test
    public void testAdmit() {
        Mockito.when(userService.create(new CreateUserParams("Armen_Grigoryan", "Armen", "Grigoryan"))).thenReturn(new User());
       final UserAdmissionResponseDto response = universityFacade.admit(new UserAdmissionRequestDto("Armen","Grigoryan"));
    }
}