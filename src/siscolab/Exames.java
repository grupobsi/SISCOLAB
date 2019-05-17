/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab;

import java.util.Date;

/**
 *
 * @author 20171BSI0278
 */
public class Exames {
    private String tipoExame;
    private Date dataPrazo;
    private String materia;
    private Paciente paciente;
    private Medico medico;
    private String reagente;
    private String resultado;
    private Date dataRequerimento;
    private Date dataExecucao;
    private Date dataResultado;
    private String estado;
    
    public Exames(String tipoExame, Date dataPrazo, String materia, Paciente paciente, Medico medico, String reagente, String resultado, Date dataRequerimento, Date dataExecucao, Date dataResultado, String estado){
        this.tipoExame = tipoExame;
        this.dataPrazo = dataPrazo;
        this.materia = materia;
        this.paciente = paciente;
        this.medico = medico;
        this.reagente = reagente;
        this.resultado = resultado;
        this.dataRequerimento = dataRequerimento;
        this.dataExecucao = dataExecucao;
        this.dataResultado = dataResultado;
        this.estado = estado;
    }
  
    // Getters
    
    public String getTipoExame() {
        return tipoExame;
    }

    public Date getDataPrazo() {
        return dataPrazo;
    }
    
    public String getMateria() {
        return materia;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public Medico getMedico() {
        return medico;
    }
    
    public String getReagente() {
        return reagente;
    }
    
    public String getResultado() {
        return resultado;
    }
    
    public Date getDataRequerimento() {
        return dataRequerimento;
    }
    
    public Date getDataExecucao() {
        return dataExecucao;
    }
    
    public Date getDataResultado() {
        return dataResultado;
    }
    
    public String getEstado() {
        return estado;
    }

    // Setters
    
    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public void setDataPrazo(Date dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setReagente(String reagente) {
        this.reagente = reagente;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setDataRequerimento(Date dataRequerimento) {
        this.dataRequerimento = dataRequerimento;
    }

    public void setDataExecucao(Date dataExecucao) {
        this.dataExecucao = dataExecucao;
    }

    public void setDataResultado(Date dataResultado) {
        this.dataResultado = dataResultado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
