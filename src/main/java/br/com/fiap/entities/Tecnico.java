package br.com.fiap.entities;

import javax.persistence.*;
import java.util.Calendar;

@Table(name = "TB_TECNICO")
@Entity
@SequenceGenerator(name="tecnico", sequenceName = "SQ_TB_TECNICO", allocationSize = 1)
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tecnico")
    @Column(name = "cd_tecnico")
    private Integer id;

    @Column(name = "nm_tecnico", length = 100, nullable = false)
    private String nome;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_nascimento")
    private Calendar dataNascimento;

    @Column(name = "nr_tempo_carreira")
    private Integer tempoCarreira;
    
    @OneToOne(mappedBy = "tecnico")
    private Time time;

    public Tecnico() {
    }

    public Tecnico(Integer id, String nome, Calendar dataNascimento, Integer tempoCarreira) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tempoCarreira = tempoCarreira;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getTempoCarreira() {
        return tempoCarreira;
    }

    public void setTempoCarreira(Integer tempoCarreira) {
        this.tempoCarreira = tempoCarreira;
    }

	@Override
	public String toString() {
		return "Tecnico [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", tempoCarreira="
				+ tempoCarreira + "]";
	}
}
