/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pjtcotesquimicos2.bdconexao;

/**
 *
 * @author JessicaMontero
 */
abstract class Trabalho {
    public abstract void concluirTrabalho();
}

class TrabalhoConcluido extends Trabalho {
    @Override
    public void concluirTrabalho() {
        System.out.println("Trabalho concluído com sucesso");
    }
}
