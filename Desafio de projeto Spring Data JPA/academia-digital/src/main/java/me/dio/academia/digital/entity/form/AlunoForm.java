package me.dio.academia.digital.entity.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data //para ter métodos get e set
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

    @NotBlank(message="Preencha o campo corretamente.")
    @Size(min = 3, max = 50, message =  "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;
    @NotBlank(message="Preencha o campo corretamente.")
    @CPF(message="Valor do CPF é inválido")
    private String cpf;
    @NotBlank(message="Preencha o campo corretamente.")
    @Size(min = 3, max = 50, message =  "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String bairro;
    @NotBlank(message="Preencha o campo corretamente.")
    @Past(message = "Data '${validatedValue}' é inválida.")
    private LocalDate dataDeNascimento;

}
