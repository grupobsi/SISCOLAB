/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;

import java.util.Calendar;


/**
 *
 * @author 20070BSI0278
 */

// Forma da data = int[dd, mm, aaaa]

public class Exames {
    private String tipoExame;
    private int[] dataPrazo;
    private String materia;
    private Paciente paciente; //Exceção: paciente inexistente
    private Medico medico; //Exceção: medico inexistente
    private String reagente;
    private String resultado;
    private int[] dataRequerimento;
    private int[] dataExecucao;
    private int[] dataResultado;
    private String estado;
    
    public Exames(){}
    
    public Exames(String tipoExame, int[] dataPrazo, String materia, Paciente paciente, Medico medico, String reagente, String resultado, int[] dataRequerimento, int[] dataExecucao, int[] dataResultado, String estado) throws Exception{
        this.setTipoExame(tipoExame);
        this.setDataPrazo(dataPrazo);
        this.setMateria(materia);
        this.setPaciente(paciente);
        this.setMedico(medico);
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

    public void setDataPrazo(int[] dataPrazo) throws Exception{
        int dia = Calendar.getInstance().get(Calendar.DATE);
        int mes = Calendar.getInstance().get(Calendar.MONTH);
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        
        if (dataPrazo[0] < dia){
            if (dataPrazo[1] < mes){
                if (dataPrazo[2] < ano){
                    throw new Exception("Data Inválida");
                }
            }
        }
        else{
            if (dataPrazo[1] < mes){
                if (dataPrazo[2] < ano){
                    throw new Exception("Data Inválida");
                }
            }
            else{
                if (dataPrazo[2] < ano){
                    throw new Exception("Data Inválida");
                }
                else{
                    this.dataPrazo = dataPrazo;
                }
            }    
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
    
    public void setDataRequerimento(int[] dataRequerimento) throws Exception{
        int dia = Calendar.getInstance().get(Calendar.DATE);
        int mes = Calendar.getInstance().get(Calendar.MONTH);
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        
        if (dataRequerimento[0] < dia){
            if (dataRequerimento[1] < mes){
                if (dataRequerimento[2] < ano){
                    throw new Exception("Data Inválida");
                }
            }
        }
        else{
            if (dataRequerimento[1] < mes){
                if (dataRequerimento[2] < ano){
                    throw new Exception("Data Inválida");
                }
            }
            else{
                if (dataRequerimento[2] < ano){
                    throw new Exception("Data Inválida");
                }
                else{
                    this.dataRequerimento = dataRequerimento;
                }
            }    
        }
    }

    public void setDataExecucao(int[] dataExecucao) throws Exception{
        int dia = Calendar.getInstance().get(Calendar.DATE);
        int mes = Calendar.getInstance().get(Calendar.MONTH);
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        
        if (dataExecucao[0] < dia){
            if (dataExecucao[1] < mes){
                if (dataExecucao[2] < ano){
                    throw new Exception("Data Inválida");
                }
            }
        }
        else{
            if (dataExecucao[1] < mes){
                if (dataExecucao[2] < ano){
                    throw new Exception("Data Inválida");
                }
            }
            else{
                if (dataExecucao[2] < ano){
                    throw new Exception("Data Inválida");
                }
                else{
                    this.dataExecucao = dataExecucao;
                }
            }    
        }
    }

    public void setDataResultado(int[] dataResultado) throws Exception{
        int dia = Calendar.getInstance().get(Calendar.DATE);
        int mes = Calendar.getInstance().get(Calendar.MONTH);
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        
        if (dataResultado[0] < dia){
            if (dataResultado[1] < mes){
                if (dataResultado[2] < ano){
                    throw new Exception("Data Inválida");
                }
            }
        }
        else{
            if (dataResultado[1] < mes){
                if (dataResultado[2] < ano){
                    throw new Exception("Data Inválida");
                }
            }
            else{
                if (dataResultado[2] < ano){
                    throw new Exception("Data Inválida");
                }
                else{
                    this.dataResultado = dataResultado;
                }
            }    
        }
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
}
