/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab;

/**
 *
 * @author 20171BSI0278
 */
public class Exames {
    private String tipoExame;
    private Data dataPrazo;
    private String materia;
    private Paciente paciente;
    private Medico medico;
    private String reagente;
    private String resultado;
    private Data dataRequerimento;
    private Data dataExecucao;
    private Data dataResultado;
    private String estado;
    
    public Exames(String tipoExame, Data dataPrazo, String materia, Paciente paciente, Medico medico, String reagente, String resultado, Data dataRequerimento, Data dataExecucao, Data dataResultado, String estado){
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
    

}
