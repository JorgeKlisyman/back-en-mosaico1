<<<<<<< HEAD
package br.unicap.si.poo.project.demo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdministratorDto {

    @NotBlank
    @Size(max = 100)
    private String nameAdministrator;

    @NotBlank
    private String emailAdministrator;

    @NotBlank
    @Size(max = 200)
    private String passwordAdministrator;
}
=======
package br.unicap.si.poo.project.demo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdministratorDto {

    @NotBlank
    @Size(max = 100)
    private String nameAdministrator;

    @NotBlank
    private String emailAdministrator;

    @NotBlank
    @Size(max = 200)
    private String passwordAdministrator;
}
>>>>>>> 0132d4a7878da37e1af32b083c959138a8595292
