package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data //anotação para abstrair getter, setter, equals e hashcode
@NoArgsConstructor //criar um construtor vazio
@AllArgsConstructor //criar um construtor com todos os atributos
@Entity
@Table(name="aluno")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String cpf;
    private String bairro;
    private LocalDate dataDeNascimento;
    @OneToMany(mappedBy = "aluno", fetch=FetchType.LAZY) //um aluno tem muitas avaliações físicas
    @JsonIgnore
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
    //fetchType=Lazy: quando trouxer as informações do aluno, as avaliações físicas daquele aluno NÃO serão
    //carregadas automaticamente.
}

