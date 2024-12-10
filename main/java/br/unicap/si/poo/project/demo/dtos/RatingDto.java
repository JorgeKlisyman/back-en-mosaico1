<<<<<<< HEAD
package br.unicap.si.poo.project.demo.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
public class RatingDto {

    @NotBlank
    private String ratingComment;

    @NotBlank
    private Long userId;

    @NotBlank
    private Long partnerId;

}
=======
package br.unicap.si.poo.project.demo.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
public class RatingDto {

    @NotBlank
    private String ratingComment;

    @NotBlank
    private Long userId;

    @NotBlank
    private Long partnerId;

}
>>>>>>> 0132d4a7878da37e1af32b083c959138a8595292
