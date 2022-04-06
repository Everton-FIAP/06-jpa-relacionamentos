package br.com.fiap.entities;

import javax.persistence.*;
import java.util.Calendar;

@Table(name = "TB_PATROCINIO")
@Entity
@SequenceGenerator(name="patrocinio", sequenceName = "SQ_TB_PATROCICNIO", allocationSize = 1)
public class Patrocinio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patrocinio")
    @Column(name = "cd_patrocinio")
    private Integer id;

    @Column(name = "nm_marca", length = 100, nullable = false)
    private String nomeMarca;

    @Temporal(TemporalType.TIME)
    @Column(name = "dt_fim_contrato", nullable = false)
    private Calendar dataFimContrato;

    public Patrocinio() {
    }

    public Patrocinio(Integer id, String nomeMarca, Calendar dataFimContrato) {
        this.id = id;
        this.nomeMarca = nomeMarca;
        this.dataFimContrato = dataFimContrato;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public Calendar getDataFimContrato() {
        return dataFimContrato;
    }

    public void setDataFimContrato(Calendar dataFimContrato) {
        this.dataFimContrato = dataFimContrato;
    }
}
