package br.com.fiap.entities;

import javax.persistence.*;

@Table(name = "TB_TIME")
@Entity
@SequenceGenerator(name="time", sequenceName = "SQ_TB_TIME", allocationSize = 1)
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "time")
    @Column(name = "cd_time")
    private Integer id;

    @Column(name = "nm_time", length = 50, nullable = false)
    private String nome;

    @Column(name = "nm_estadio", length = 50, nullable = true)
    private String nomeEstadio;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "cd_tecnico", nullable = false )
    private Tecnico tecnico;

    public Time() {
    }

    public Time(Integer id, String nome, String nomeEstadio, Tecnico tecnico) {
        this.id = id;
        this.nome = nome;
        this.nomeEstadio = nomeEstadio;
        this.tecnico = tecnico;
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

    public String getNomeEstadio() {
        return nomeEstadio;
    }

    public void setNomeEstadio(String nomeEstadio) {
        this.nomeEstadio = nomeEstadio;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setCodigoTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	@Override
	public String toString() {
		return "Time [id=" + id + ", nome=" + nome + ", nomeEstadio=" + nomeEstadio + ", tecnico=" + tecnico + "]";
	}
}
