package br.com.fiap.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "TB_JOGADOR")
@Entity
@SequenceGenerator(name="jogador", sequenceName = "SQ_TB_JOGADOR", allocationSize = 1)
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jogador")
    @Column(name = "cd_jogador")
    private Integer id;

    @Column(name = "nm_jogador", nullable = false, length = 80)
    private String nome;

    @Column(name = "nr_jogador", nullable = true)
    private Integer numero;

    @Column(name = "ds_posicao", nullable = true, length = 20)
    private String posicao;

    @Column(name = "vl_salario", precision = 10, scale = 2)
    private BigDecimal salario;

    @Lob
    @Column(name = "fl_foto")
    private byte[] foto;

    @Column(name = "cd_time", nullable = false)
    private Integer time;

    public Jogador() {
    }

    public Jogador(Integer id, String nome, Integer numero, String posicao, BigDecimal salario, byte[] foto, Integer time) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
        this.salario = salario;
        this.foto = foto;
        this.time = time;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
