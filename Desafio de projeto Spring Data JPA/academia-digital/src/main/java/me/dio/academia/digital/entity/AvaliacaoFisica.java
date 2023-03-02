package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data //anotação para abstrair getter, setter, equals e hashcode
@NoArgsConstructor //criar um construtor vazio
@AllArgsConstructor //criar um construtor com todos os atributos
@Entity
@Table(name="avaliacao_fisica")
public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL) //a alteração da avaliação física será refletida em aluno
    @JoinColumn(name="aluno_id")
    private Aluno aluno;
    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
    @Column(name="peso_atual")
    private double peso;
    @Column(name="altura_atual")
    private double altura;
}
