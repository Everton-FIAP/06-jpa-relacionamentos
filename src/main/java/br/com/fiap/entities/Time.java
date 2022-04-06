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

    @Column(name = "cd_tecnico", unique = true)
    private Integer codigoTecnico;

    public Time() {
    }

    public Time(Integer id, String nome, String nomeEstadio, Integer codigoTecnico) {
        this.id = id;
        this.nome = nome;
        this.nomeEstadio = nomeEstadio;
        this.codigoTecnico = codigoTecnico;
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

    public Integer getCodigoTecnico() {
        return codigoTecnico;
    }

    public void setCodigoTecnico(Integer codigoTecnico) {
        this.codigoTecnico = codigoTecnico;
    }
}
