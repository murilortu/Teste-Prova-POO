/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefa;
/**
 *
 * @author alenc
 */
public class Tarefa {
    private String titulo;
    private String descricao;
    
    public Tarefa(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setcescricao(String descricao){
        this.descricao = descricao;
    }
}


