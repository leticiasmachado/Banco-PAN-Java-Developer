package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data //anotação para abstrair getter, setter, equals e hashcode
@NoArgsConstructor //criar um construtor vazio
@AllArgsConstructor //criar um construtor com todos os atributos
@Entity
@Table(name="matricula")
public class Matricula {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade =CascadeType.ALL) //apagar a matrícula também apaga o aluno
    @JoinColumn(name="aluno_id")
    private Aluno aluno;
    private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
