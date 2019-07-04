/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

import java.util.Calendar;
import siscolab.SISCOLAB;
import siscolab.cruds.HasCrud;


/**
 *
 * @author 20070BSI0278
 */

// Forma da data = int[dd, mm, aaaa]

public class Exame implements HasCrud {
    private String tipoExame;
    private int[] dataPrazo;
    private String materia;
    private Paciente paciente; //Exceção: paciente inexistente
    private Medico medico; //Exceção: medico inexistente
    private String reagente;
    private String resultado;
    private Laboratorio laboratorio;
    private int[] dataRequerimento;
    private int[] dataExecucao;
    private int[] dataResultado;
    private String estado;
    
    public Exame(){}
    
    public Exame(String tipoExame, int[] dataPrazo, String materia, Paciente paciente, Medico medico, String reagente, String resultado, Laboratorio laboratorio, int[] dataRequerimento, int[] dataExecucao, int[] dataResultado, String estado){
        this.setTipoExame(tipoExame);
        this.setDataPrazo(dataPrazo);
        this.setMateria(materia);
        this.setPaciente(paciente);
        this.setMedico(medico);
        this.setLaboratorio(laboratorio);
        this.setReagente(reagente);
        this.setResultado(resultado);
        this.setDataRequerimento(dataRequerimento);
        this.setDataExecucao(dataExecucao);
        this.setDataResultado(dataResultado);
        this.setEstado(estado);
    }
  
    // Getters
    
    public String getTipoExame() {
        return tipoExame;
    }

    public int[] getDataPrazo() {
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
    
    public int[] getDataRequerimento() {
        return dataRequerimento;
    }
    
    public int[] getDataExecucao() {
        return dataExecucao;
    }
    
    public int[] getDataResultado() {
        return dataResultado;
    }
    
    public String getEstado() {
        return estado;
    }

    // Setters
    
    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public void setDataPrazo(int[] dataPrazo){
        try{
            if(Validacao.validaData(dataPrazo)){
                this.dataPrazo = dataPrazo;
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
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
    
    public void setDataRequerimento(int[] dataRequerimento){
        try{
            if(Validacao.validaData(dataRequerimento)){
                this.dataRequerimento = dataRequerimento;
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setDataExecucao(int[] dataExecucao){
        try{
            if(Validacao.validaData(dataExecucao)){
                this.dataExecucao = dataExecucao;
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setDataResultado(int[] dataResultado){
        try{
            if(Validacao.validaData(dataResultado)){
                this.dataResultado = dataResultado;
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }

    private void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
}
