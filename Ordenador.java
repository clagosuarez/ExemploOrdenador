/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

/**
 *
 * @author clagosuarez
 */
public class Ordenador {
    private Rato objRato;
    private Pantalla objPantalla;
    private Cpu objCpu;
    
    public Ordenador(){
        
    }
    public Ordenador(Rato objRato, Pantalla objPantalla, Cpu objCpu){
        this.objRato = objRato;
        this.objPantalla = objPantalla;
        this.objCpu = objCpu;
    }
    
    public Rato getRato(){
        return objRato;
    }
    public Pantalla getPantalla(){
        return objPantalla;
    }
    public Cpu getCpu(){
        return objCpu;
    }
    public void setRato(Rato objRato){
        this.objRato = objRato;
    }
    public void setPantalla(Pantalla objPantalla){
        this.objPantalla = objPantalla;
    }
    public void setCpu(Cpu objCpu){
        this.objCpu = objCpu;
    }
    public void amosar(){
        System.out.println("Tipo rato: "+objRato.getTipo()+"\n Marca pantalla: "+objPantalla.getMarca()+"\n Pulgadas pantalla: "+objPantalla.getPulgadas()+"\n Velocidade cpu: "+objCpu.getVelocidade()+"\n Memoria cpu: "+objCpu.getMemoria());
    } 
}
