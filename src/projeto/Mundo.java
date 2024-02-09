/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import java.util.ArrayList;
import java.util.List;
import static projeto.Projeto.ANSI_RED;
import static projeto.Projeto.ASNSI_GREEN_BACKGROUND;
import java.util.Random;

/**
 *
 * @author unifamedrano
 */
/**
 * 
 * @author alessandro
 */



public class Mundo {

    Zumbi z;
    Hospital h;
    PessoaDoente pd;
    PessoaSaudavel ps;
    Pessoa p;
    /**
     * lista do tempo de cada pessoa doente
     */
    
    /**
     * sexo
     */
    long[] tempo = new long[202];
    int contal1 = 0;

    int cont2 = 200;
    ////contador pessoa doente  /
    int c_pessoa_doete = 32;

    
    

    int l = 0;
    int c = 0;
    int salvacao = 0;
    /*
    tempo inicial da cura 
    */
    long ini_cura;

    //matriz mapa
    private Integer mapa[][] = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        //20
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    
    };

    /**
     * /0u2 pessoa //7 hospital //1 ou 11 mapa //10 pessoa doente //5 ou 6
     * zumbin 8 ou 9 pessoa em recuperaçao
     *
     *
     * /
     *
     * /**
     *
     * Metodo faz pessoal saudavel
     *
     * @param ps
     */
    public void faz(PessoaSaudavel ps) {
        this.ps = ps;
        mapa[ps.x][ps.y] = ps.cor;

    }

    /**
     * metodo faz zumbi
     *
     * @param z
     */
    public void fazZumbi(Zumbi z) {
        this.z = z;
        mapa[z.x][z.y] = z.cor;

    }

    /**
     * metodo para fazer o hospital
     *
     * @param h
     */
    public void fazH(Hospital h) {
        this.h = h;
        mapa[h.x][h.y] = h.cor;

    }

    /**
     * metodo para fazer a pessoa doente
     *
     * @param pd
     */
    public void fazpd(PessoaDoente pd) {
        this.pd = pd;
        mapa[pd.x][pd.y] = pd.cor;

    }

    public void desenhaMundo() {

        int contaP = 0;
        int contaZ = 0;
        int contaPd = 0;
        int P_em_cura = 0;

        ///cura salvação
        ///e finaliza o codigo
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 90; j++) {

                /**
                 * ifs pra tranformar pessoa saudevel 0 ou 2 em pessoaDoente
                 */
                if (mapa[i][j] == 6 || mapa[i][j] == 5 || mapa[i][j] >= 200) {
                    if (i < 29 && j < 89) {

                        //System.out.println(i);
                        // System.out.println(j);
                        if (mapa[i + 1][j + 1] == 0 || mapa[i + 1][j + 1] == 2) {
                            mapa[i + 1][j + 1] = c_pessoa_doete;
                            c_pessoa_doete++;

                        }
                        if (mapa[i + 1][j] == 0 || mapa[i + 1][j] == 2) {
                            mapa[i + 1][j] = c_pessoa_doete;
                            c_pessoa_doete++;

                        }
                        if (mapa[i][j + 1] == 0 || mapa[i][j + 1] == 2) {
                            mapa[i][j + 1] = c_pessoa_doete;
                            c_pessoa_doete++;

                        }
                    }

                    if (i < 29 && j > 0) {
                        if (mapa[i + 1][j - 1] == 0) {
                            mapa[i + 1][j - 1] = c_pessoa_doete;
                            c_pessoa_doete++;
                            
                        }
                    }

                    if (i > 0 && j < 89) {
                        if (mapa[i - 1][j + 1] == 0 || mapa[i - 1][j + 1] == 2) {
                            mapa[i - 1][j + 1] = c_pessoa_doete;
                            c_pessoa_doete++;
                            
                        }

                    }
                    if (i > 0 && j > 0) {
                        if (mapa[i - 1][j] == 0 || mapa[i - 1][j] == 2) {
                            mapa[i - 1][j] = c_pessoa_doete;
                            c_pessoa_doete++;
                            
                        }
                        if (mapa[i][j - 1] == 0 || mapa[i][j - 1] == 2) {
                            mapa[i][j - 1] = c_pessoa_doete;
                            c_pessoa_doete++;
                            
                        }
                        if (mapa[i - 1][j - 1] == 0 || mapa[i - 1][j - 1] == 2) {
                            mapa[i - 1][j - 1] = c_pessoa_doete;
                            c_pessoa_doete++;
                            

                        }
                    }
                }

                /**
                 * capita o tempo inicial em que a pessoa se tranformaou
                 */
                for (int z = 30; z < 199; z++) {
                    ///demarcar tam lista
                    //int contal = 0;

                    if (mapa[i][j] == z) {
                        mapa[i][j] = cont2;
                        tempo[contal1] = System.currentTimeMillis();

                        contal1++;
                        cont2++;

                    }

                }

                /**
                 * verifica se passou os 15 segundos
                 */
                for (int z = 200; z < 403; z++) {

                    if (mapa[i][j] == z) {
                        int contal = z - 200;
                        long fim1 = System.currentTimeMillis() - tempo[contal];

                        if (fim1 >= 15000) {
                            mapa[i][j] = 6;

                        }

                        //contal++;
                    }
                }

                /**
                 * termina o processo de cura verificando se passou 15 segundos
                 * assim a pessoa que estava sendo curada (8 ou 9) vira pessoa
                 * saudavel
                 */
                if (mapa[i][j] == 9 || mapa[i][j] == 8) {
                    long fim_cura = System.currentTimeMillis() - ini_cura;

                    if (fim_cura >= 15000) {
                        mapa[i][j] = 0;

                    } else {

                        mapa[i][j] = 8;
                    }

                }
                /**
                 * faz a impreçao no mapa
                 */
                if (mapa[i][j] == 2) {
                    mapa[i][j] = 0;
                }
                //mapa
                if (mapa[i][j] == 1) {
                    if (i == 0 || i == 29 || j == 0 || j == 89) {
                        System.out.print("\33[41m \33[0m");

                    } else {
                        System.out.print("\33[42m \33[0m");
                    }
                }

                if (mapa[i][j] == 0) {
                    System.out.print("\33[45m \33[0m");
                    contaP = contaP + 1;

                }
                if (mapa[i][j] == 5) {
                    mapa[i][j] = 6;

                }
                if (mapa[i][j] == 6) {
                    System.out.print("\33[44m \33[0m");
                    contaZ = contaZ + 1;

                }
                if (mapa[i][j] == 7) {
                    System.out.print("\33[46m \33[0m");

                }

                /////
                if (mapa[i][j] == 10) {
                    System.out.print("\33[40m \33[0m");
                }

                if (mapa[i][j] >= 200) {
                    System.out.print("\33[40m \33[0m");
                    contaPd = contaPd + 1;
                }

                if (mapa[i][j] == 8) {
                    System.out.print("\33[43m \33[0m");
                    P_em_cura = P_em_cura + 1;

                }

            }
            System.out.println();

        }
        /**
         * Conta os seres do tabuleiro
         */
        System.out.println();
        System.out.print("Pessoa Saudavel ");
        System.out.print("\33[45m \33[0m ");
        System.out.print(contaP);
        System.out.print(" Zumbi ");
        System.out.print("\33[44m \33[0m ");
        System.out.print(contaZ);
        System.out.print(" Pessoa em cura ");
        System.out.print("\33[43m \33[0m");
        System.out.print(P_em_cura);
        System.out.print(" Pessoa Doente ");
        System.out.print("\33[40m \33[0m ");
        System.out.println(contaPd);
        System.out.println();

        /**
         * Quango o numero de pessoas for 0 a variavel salvacao fica em 1
         */
        if (contaP == 0 && contaPd == 0 && salvacao == 0) {
            salvacao = 1;
            ini_cura = System.currentTimeMillis();
        }
    }

    public void atualiza() {

        /**
         * movimenta pessoa saudavel
         */
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 90; j++) {
                //acha a pessoa

                if (mapa[i][j] == 0) {
                    /**
                     * gera a possiçao aleatoria futura
                     */
                    Random aleatorio = new Random();
                    int valor = aleatorio.nextInt(2);
                    int valor2 = aleatorio.nextInt(2);
                    l = 0;
                    c = 0;
                    /**
                     * posiçao futura = l c
                     */

                    l = i + valor;
                    c = j + valor2;
                    /* 
                    condiçao para nao passar da bora e ir para o outro lado
               
                     */

                    if (l < 1) {
                        l = 29;

                    }
                    if (l > 28) {
                        l = 1;
                    }

                    if (c < 1) {
                        c = 88;

                    }
                    if (c > 88) {
                        c = 1;
                    }

                    /**
                     * faz pessoa a nao se mover caso tenho alguem na posiçao
                     * futura
                     */
                    if (mapa[l][c] == 0 || mapa[l][c] == 6 || mapa[l][c] > 30 || mapa[l][c] == 2 || mapa[l][c] == 8) {
                        mapa[i][j] = 0;

                    }
                    /**
                     * caso seja mapa = 1 ou hospital = 7 se move normalmente
                     */
                    if (mapa[l][c] == 1) {
                        if (i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3 || i == 1 && j == 4 || i == 2 && j == 1 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4 || i == 3 && j == 1 || i == 3 && j == 2 || i == 3 && j == 3 || i == 3 && j == 4 || i == 4 && j == 1 || i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4 || i == 21 && j == 21 || i == 21 && j == 22 || i == 21 && j == 23 || i == 21 && j == 24 || i == 22 && j == 21 || i == 22 && j == 22 || i == 22 && j == 23 || i == 22 && j == 24 || i == 23 && j == 21 || i == 23 && j == 22 || i == 23 && j == 23 || i == 23 && j == 24 || i == 24 && j == 21 || i == 24 && j == 22 || i == 24 && j == 23 || i == 24 && j == 24 || i == 21 && j == 21 || i == 21 && j == 22 || i == 21 && j == 23 || i == 21 && j == 24 || i == 21 && j == 21 || i == 22 && j == 22 || i == 22 && j == 23 || i == 22 && j == 24 || i == 23 && j == 21 || i == 23 && j == 22 || i == 23 && j == 23 || i == 23 && j == 24 || i == 24 && j == 21 || i == 24 && j == 22 || i == 24 && j == 23 || i == 24 && j == 24 || i == 11 && j == 61 || i == 11 && j == 62 || i == 11 && j == 63 || i == 11 && j == 64 || i == 12 && j == 61 || i == 12 && j == 62 || i == 12 && j == 63 || i == 12 && j == 64 || i == 13 && j == 61 || i == 13 && j == 62 || i == 13 && j == 63 || i == 13 && j == 64 || i == 14 && j == 61 || i == 14 && j == 62 || i == 14 && j == 63 || i == 14 && j == 64) {
                            mapa[i][j] = 7;
                            mapa[l][c] = 2;
                        } else {
                            mapa[i][j] = 1;
                            mapa[l][c] = 2;

                        }

                    }

                    if (mapa[l][c] == 7) {
                        mapa[i][j] = 7;
                        mapa[l][c] = 2;
                        if (i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3 || i == 1 && j == 4 || i == 2 && j == 1 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4 || i == 3 && j == 1 || i == 3 && j == 2 || i == 3 && j == 3 || i == 3 && j == 4 || i == 4 && j == 1 || i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4 || i == 21 && j == 21 || i == 21 && j == 22 || i == 21 && j == 23 || i == 21 && j == 24 || i == 22 && j == 21 || i == 22 && j == 22 || i == 22 && j == 23 || i == 22 && j == 24 || i == 23 && j == 21 || i == 23 && j == 22 || i == 23 && j == 23 || i == 23 && j == 24 || i == 24 && j == 21 || i == 24 && j == 22 || i == 24 && j == 23 || i == 24 && j == 24 || i == 21 && j == 21 || i == 21 && j == 22 || i == 21 && j == 23 || i == 21 && j == 24 || i == 21 && j == 21 || i == 22 && j == 22 || i == 22 && j == 23 || i == 22 && j == 24 || i == 23 && j == 21 || i == 23 && j == 22 || i == 23 && j == 23 || i == 23 && j == 24 || i == 24 && j == 21 || i == 24 && j == 22 || i == 24 && j == 23 || i == 24 && j == 24 || i == 11 && j == 61 || i == 11 && j == 62 || i == 11 && j == 63 || i == 11 && j == 64 || i == 12 && j == 61 || i == 12 && j == 62 || i == 12 && j == 63 || i == 12 && j == 64 || i == 13 && j == 61 || i == 13 && j == 62 || i == 13 && j == 63 || i == 13 && j == 64 || i == 14 && j == 61 || i == 14 && j == 62 || i == 14 && j == 63 || i == 14 && j == 64) {
                            mapa[i][j] = 7;
                            mapa[l][c] = 2;

                        } else {
                            mapa[i][j] = 1;
                            mapa[l][c] = 2;

                        }

                    }

                }

            }

        }
        /**
         * movimentaçao zombi
         */
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 90; j++) {
                //acha a pessoa

                if (mapa[i][j] == 6) {
                    l = 0;
                    c = 0;

                    Random aleatorio = new Random();
                    int valor3 = aleatorio.nextInt(2);
                    int valor4 = aleatorio.nextInt(2);

                    l = i + valor3;
                    c = j + valor4;
                    /* 
                    
               
                     */
                    //caso ele va para a borda
                    if (l < 1) {
                        l = 28;

                    }
                    if (l > 28) {
                        l = 1;
                    }

                    if (c < 1) {
                        c = 88;

                    }
                    if (c > 88) {
                        c = 1;
                    }

                    //nova pociçapo da pessoa
                    if (mapa[l][c] == 0 || mapa[l][c] == 6 || mapa[l][c] > 30 || mapa[l][c] == 2 || mapa[l][c] == 5 || mapa[l][c] == 8) {
                        mapa[i][j] = 5;

                    }

                    if (mapa[l][c] == 1) {
                        if (i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3 || i == 1 && j == 4 || i == 2 && j == 1 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4 || i == 3 && j == 1 || i == 3 && j == 2 || i == 3 && j == 3 || i == 3 && j == 4 || i == 4 && j == 1 || i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4 || i == 21 && j == 21 || i == 21 && j == 22 || i == 21 && j == 23 || i == 21 && j == 24 || i == 22 && j == 21 || i == 22 && j == 22 || i == 22 && j == 23 || i == 22 && j == 24 || i == 23 && j == 21 || i == 23 && j == 22 || i == 23 && j == 23 || i == 23 && j == 24 || i == 24 && j == 21 || i == 24 && j == 22 || i == 24 && j == 23 || i == 24 && j == 24 || i == 11 && j == 61 || i == 11 && j == 62 || i == 11 && j == 63 || i == 11 && j == 64 || i == 12 && j == 61 || i == 12 && j == 62 || i == 12 && j == 63 || i == 12 && j == 64 || i == 13 && j == 61 || i == 13 && j == 62 || i == 13 && j == 63 || i == 13 && j == 64 || i == 14 && j == 61 || i == 14 && j == 62 || i == 14 && j == 63 || i == 14 && j == 64) {
                            mapa[i][j] = 7;
                            mapa[l][c] = 5;
                        } else {
                            mapa[i][j] = 1;
                            mapa[l][c] = 5;

                        }

                    }

                    if (mapa[l][c] == 7) {
                        if (i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3 || i == 1 && j == 4 || i == 2 && j == 1 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4 || i == 3 && j == 1 || i == 3 && j == 2 || i == 3 && j == 3 || i == 3 && j == 4 || i == 4 && j == 1 || i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4 || i == 21 && j == 21 || i == 21 && j == 22 || i == 21 && j == 23 || i == 21 && j == 24 || i == 22 && j == 21 || i == 22 && j == 22 || i == 22 && j == 23 || i == 22 && j == 24 || i == 23 && j == 21 || i == 23 && j == 22 || i == 23 && j == 23 || i == 23 && j == 24 || i == 24 && j == 21 || i == 24 && j == 22 || i == 24 && j == 23 || i == 24 && j == 24 || i == 11 && j == 61 || i == 11 && j == 62 || i == 11 && j == 63 || i == 11 && j == 64 || i == 12 && j == 61 || i == 12 && j == 62 || i == 12 && j == 63 || i == 12 && j == 64 || i == 13 && j == 61 || i == 13 && j == 62 || i == 13 && j == 63 || i == 13 && j == 64 || i == 14 && j == 61 || i == 14 && j == 62 || i == 14 && j == 63 || i == 14 && j == 64) {
                            mapa[i][j] = 7;
                            mapa[l][c] = 5;

                        } else {
                            mapa[i][j] = 1;
                            mapa[l][c] = 5;

                        }

                    }

                }

            }
        }

        int cont = 0;
        /**
         * movimentaçao pessoa doente
         */
        int[] repetir = new int[103];
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 90; j++) {

                if (mapa[i][j] > 30 && mapa[i][j] != repetir[0] && mapa[i][j] != repetir[1] && mapa[i][j] != repetir[2] && mapa[i][j] != repetir[3] && mapa[i][j] != repetir[4] && mapa[i][j] != repetir[5] && mapa[i][j] != repetir[6] && mapa[i][j] != repetir[7] && mapa[i][j] != repetir[8] && mapa[i][j] != repetir[9] && mapa[i][j] != repetir[10] && mapa[i][j] != repetir[11] && mapa[i][j] != repetir[12] && mapa[i][j] != repetir[13] && mapa[i][j] != repetir[14] && mapa[i][j] != repetir[15] && mapa[i][j] != repetir[16] && mapa[i][j] != repetir[16] && mapa[i][j] != repetir[18] && mapa[i][j] != repetir[19] && mapa[i][j] != repetir[20] && mapa[i][j] != repetir[21] && mapa[i][j] != repetir[22] && mapa[i][j] != repetir[23] && mapa[i][j] != repetir[24] && mapa[i][j] != repetir[25] && mapa[i][j] != repetir[26] && mapa[i][j] != repetir[27] && mapa[i][j] != repetir[29] && mapa[i][j] != repetir[30] && mapa[i][j] != repetir[31] && mapa[i][j] != repetir[32] && mapa[i][j] != repetir[33] && mapa[i][j] != repetir[34] && mapa[i][j] != repetir[35] && mapa[i][j] != repetir[36] && mapa[i][j] != repetir[37] && mapa[i][j] != repetir[38] && mapa[i][j] != repetir[39] && mapa[i][j] != repetir[40] && mapa[i][j] != repetir[41] && mapa[i][j] != repetir[42] && mapa[i][j] != repetir[43] && mapa[i][j] != repetir[44] && mapa[i][j] != repetir[45] && mapa[i][j] != repetir[46] && mapa[i][j] != repetir[47] && mapa[i][j] != repetir[48] && mapa[i][j] != repetir[49] && mapa[i][j] != repetir[50] && mapa[i][j] != repetir[51] && mapa[i][j] != repetir[52] && mapa[i][j] != repetir[53] && mapa[i][j] != repetir[54] && mapa[i][j] != repetir[55] && mapa[i][j] != repetir[56] && mapa[i][j] != repetir[57] && mapa[i][j] != repetir[58] && mapa[i][j] != repetir[59] && mapa[i][j] != repetir[60] && mapa[i][j] != repetir[61] && mapa[i][j] != repetir[62] && mapa[i][j] != repetir[63] && mapa[i][j] != repetir[64] && mapa[i][j] != repetir[65] && mapa[i][j] != repetir[66] && mapa[i][j] != repetir[67] && mapa[i][j] != repetir[68] && mapa[i][j] != repetir[69] && mapa[i][j] != repetir[70] && mapa[i][j] != repetir[71] && mapa[i][j] != repetir[72] && mapa[i][j] != repetir[73] && mapa[i][j] != repetir[77] && mapa[i][j] != repetir[75] && mapa[i][j] != repetir[76] && mapa[i][j] != repetir[77] && mapa[i][j] != repetir[78] && mapa[i][j] != repetir[79] && mapa[i][j] != repetir[80] && mapa[i][j] != repetir[81] && mapa[i][j] != repetir[82] && mapa[i][j] != repetir[83] && mapa[i][j] != repetir[84] && mapa[i][j] != repetir[85] && mapa[i][j] != repetir[86] && mapa[i][j] != repetir[87] && mapa[i][j] != repetir[88] && mapa[i][j] != repetir[89] && mapa[i][j] != repetir[90] && mapa[i][j] != repetir[91] && mapa[i][j] != repetir[92] && mapa[i][j] != repetir[93] && mapa[i][j] != repetir[94] && mapa[i][j] != repetir[95] && mapa[i][j] != repetir[96] && mapa[i][j] != repetir[97] && mapa[i][j] != repetir[98] && mapa[i][j] != repetir[99] && mapa[i][j] != repetir[100] && mapa[i][j] != repetir[101] && mapa[i][j] != repetir[102]) {
                    repetir[cont] = mapa[i][j];
                    cont++;

                    Random aleatorio = new Random();
                    int valor = aleatorio.nextInt(2);
                    int valor2 = aleatorio.nextInt(2);
                    l = 0;
                    c = 0;

                    l = i + valor;
                    c = j + valor2;
                    /* 
                    
               
                     */
                    //caso ele va para a borda

                    if (l < 1) {
                        l = 28;

                    }
                    if (l > 28) {
                        l = 1;
                    }

                    if (c < 1) {
                        c = 88;

                    }
                    if (c > 88) {
                        c = 1;
                    }

                    //coloca o espaço em vazio onde estava a pesoa
                    if (mapa[l][c] == 0 || mapa[l][c] == 6 || mapa[l][c] > 30 || mapa[l][c] == 5 || mapa[l][c] == 2) {
                        mapa[i][j] = mapa[i][j];

                    }
                    //nova pociçapo da pessoa
                    if (mapa[l][c] == 1) {
                        //mapa[i][j] = 1;
                        //mapa[l][c] = 10;
                        if (i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3 || i == 1 && j == 4 || i == 2 && j == 1 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4 || i == 3 && j == 1 || i == 3 && j == 2 || i == 3 && j == 3 || i == 3 && j == 4 || i == 4 && j == 1 || i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4 || i == 21 && j == 21 || i == 21 && j == 22 || i == 21 && j == 23 || i == 21 && j == 24 || i == 22 && j == 21 || i == 22 && j == 22 || i == 22 && j == 23 || i == 22 && j == 24 || i == 23 && j == 21 || i == 23 && j == 22 || i == 23 && j == 23 || i == 23 && j == 24 || i == 24 && j == 21 || i == 24 && j == 22 || i == 24 && j == 23 || i == 24 && j == 24 || i == 11 && j == 61 || i == 11 && j == 62 || i == 11 && j == 63 || i == 11 && j == 64 || i == 12 && j == 61 || i == 12 && j == 62 || i == 12 && j == 63 || i == 12 && j == 64 || i == 13 && j == 61 || i == 13 && j == 62 || i == 13 && j == 63 || i == 13 && j == 64 || i == 14 && j == 61 || i == 14 && j == 62 || i == 14 && j == 63 || i == 14 && j == 64) {

                            mapa[l][c] = mapa[i][j];
                            mapa[i][j] = 7;
                        } else {

                            mapa[l][c] = mapa[i][j];
                            mapa[i][j] = 1;

                        }

                    }
                    /**
                     * caso ele entre no hospital (7) ele vira pessoaSauvel(2)
                     */
                    if (mapa[l][c] == 7) {
                        if (i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3 || i == 1 && j == 4 || i == 2 && j == 1 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4 || i == 3 && j == 1 || i == 3 && j == 2 || i == 3 && j == 3 || i == 3 && j == 4 || i == 4 && j == 1 || i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4 || i == 21 && j == 21 || i == 21 && j == 22 || i == 21 && j == 23 || i == 21 && j == 24 || i == 22 && j == 21 || i == 22 && j == 22 || i == 22 && j == 23 || i == 22 && j == 24 || i == 23 && j == 21 || i == 23 && j == 22 || i == 23 && j == 23 || i == 23 && j == 24 || i == 24 && j == 21 || i == 24 && j == 22 || i == 24 && j == 23 || i == 24 && j == 24 || i == 11 && j == 61 || i == 11 && j == 62 || i == 11 && j == 63 || i == 11 && j == 64 || i == 12 && j == 61 || i == 12 && j == 62 || i == 12 && j == 63 || i == 12 && j == 64 || i == 13 && j == 61 || i == 13 && j == 62 || i == 13 && j == 63 || i == 13 && j == 64 || i == 14 && j == 61 || i == 14 && j == 62 || i == 14 && j == 63 || i == 14 && j == 64) {

                            mapa[i][j] = 7;
                            mapa[l][c] = 2;

                        } else {
                            mapa[i][j] = 1;//1
                            mapa[l][c] = 2;

                        }

                    }

                }

            }

        }
        /**
         * faz a salvaçao tranforma todos em pessoas em processo de cura
         *
         */
        if (salvacao == 1) {
            /**
             * movimentaçao pessoa em recuperaçao
             */
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 90; j++) {
                    //acha a pessoa

                    if (mapa[i][j] == 6 || mapa[i][j] == 5 || mapa[i][j] == 8) {
                        Random aleatorio = new Random();
                        int valor = aleatorio.nextInt(2);
                        int valor2 = aleatorio.nextInt(2);
                        l = 0;
                        c = 0;

                        l = i + valor;
                        c = j + valor2;
                        /* 
                    
               
                         */
                        //caso ele va para a borda

                        if (l < 1) {
                            l = 29;

                        }
                        if (l > 28) {
                            l = 1;
                        }

                        if (c < 1) {
                            c = 88;

                        }
                        if (c > 88) {
                            c = 1;
                        }

                        //coloca o espaço em vazio onde estava a pesoa
                        if (mapa[l][c] == 0 || mapa[l][c] == 6 || mapa[l][c] > 30 || mapa[l][c] == 2 || mapa[l][c] == 8 || mapa[l][c] == 9) {
                            mapa[i][j] = 9;

                        }

                        if (mapa[l][c] == 1) {
                            if (i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3 || i == 1 && j == 4 || i == 2 && j == 1 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4 || i == 3 && j == 1 || i == 3 && j == 2 || i == 3 && j == 3 || i == 3 && j == 4 || i == 4 && j == 1 || i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4 || i == 21 && j == 21 || i == 21 && j == 22 || i == 21 && j == 23 || i == 21 && j == 24 || i == 22 && j == 21 || i == 22 && j == 22 || i == 22 && j == 23 || i == 22 && j == 24 || i == 23 && j == 21 || i == 23 && j == 22 || i == 23 && j == 23 || i == 23 && j == 24 || i == 24 && j == 21 || i == 24 && j == 22 || i == 24 && j == 23 || i == 24 && j == 24 || i == 21 && j == 21 || i == 21 && j == 22 || i == 21 && j == 23 || i == 21 && j == 24 || i == 21 && j == 21 || i == 22 && j == 22 || i == 22 && j == 23 || i == 22 && j == 24 || i == 23 && j == 21 || i == 23 && j == 22 || i == 23 && j == 23 || i == 23 && j == 24 || i == 24 && j == 21 || i == 24 && j == 22 || i == 24 && j == 23 || i == 24 && j == 24 || i == 11 && j == 61 || i == 11 && j == 62 || i == 11 && j == 63 || i == 11 && j == 64 || i == 12 && j == 61 || i == 12 && j == 62 || i == 12 && j == 63 || i == 12 && j == 64 || i == 13 && j == 61 || i == 13 && j == 62 || i == 13 && j == 63 || i == 13 && j == 64 || i == 14 && j == 61 || i == 14 && j == 62 || i == 14 && j == 63 || i == 14 && j == 64) {
                                mapa[i][j] = 7;
                                mapa[l][c] = 9;
                            } else {
                                mapa[i][j] = 1;
                                mapa[l][c] = 9;

                            }

                        }

                        if (mapa[l][c] == 7) {
                            mapa[i][j] = 7;
                            mapa[l][c] = 2;
                            if (i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3 || i == 1 && j == 4 || i == 2 && j == 1 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4 || i == 3 && j == 1 || i == 3 && j == 2 || i == 3 && j == 3 || i == 3 && j == 4 || i == 4 && j == 1 || i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4 || i == 21 && j == 21 || i == 21 && j == 22 || i == 21 && j == 23 || i == 21 && j == 24 || i == 22 && j == 21 || i == 22 && j == 22 || i == 22 && j == 23 || i == 22 && j == 24 || i == 23 && j == 21 || i == 23 && j == 22 || i == 23 && j == 23 || i == 23 && j == 24 || i == 24 && j == 21 || i == 24 && j == 22 || i == 24 && j == 23 || i == 24 && j == 24 || i == 21 && j == 21 || i == 21 && j == 22 || i == 21 && j == 23 || i == 21 && j == 24 || i == 21 && j == 21 || i == 22 && j == 22 || i == 22 && j == 23 || i == 22 && j == 24 || i == 23 && j == 21 || i == 23 && j == 22 || i == 23 && j == 23 || i == 23 && j == 24 || i == 24 && j == 21 || i == 24 && j == 22 || i == 24 && j == 23 || i == 24 && j == 24 || i == 11 && j == 61 || i == 11 && j == 62 || i == 11 && j == 63 || i == 11 && j == 64 || i == 12 && j == 61 || i == 12 && j == 62 || i == 12 && j == 63 || i == 12 && j == 64 || i == 13 && j == 61 || i == 13 && j == 62 || i == 13 && j == 63 || i == 13 && j == 64 || i == 14 && j == 61 || i == 14 && j == 62 || i == 14 && j == 63 || i == 14 && j == 64) {
                                mapa[i][j] = 7;
                                mapa[l][c] = 9;

                            } else {
                                mapa[i][j] = 1;
                                mapa[l][c] = 9;

                            }

                        }

                    }

                }

            }

        }

    }

}
