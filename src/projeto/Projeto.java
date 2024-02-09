/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto;

import java.util.Random;

public class Projeto {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ASNSI_GREEN_BACKGROUND = "\u001B[42m";

    public static void main(String[] args) {
        //System.out.print(ASNSI_GREEN_BACKGROUND + ANSI_RED );

        /**
         * obj mundo
         */
        Mundo m = new Mundo();

        /**
         * obj virus
         */
        Virus vii = new Virus(true);

        /**
         * faz pessoa saudavel
         */
        for (int i = 0; i < 100; i++) {
            Random aleatorio = new Random();
            int x = aleatorio.nextInt(1, 28);
            int y = aleatorio.nextInt(1, 88);
            PessoaSaudavel PS = new PessoaSaudavel(x, y, 0);
           
            
            

            m.faz(PS);

        }

        /**
         * faz pessoas doente
         */
        Random aleatorio = new Random();
        int x1 = aleatorio.nextInt(1, 28);
        int y1 = aleatorio.nextInt(1, 88);

        ///////
        int x2 = aleatorio.nextInt(1, 28);
        int y2 = aleatorio.nextInt(1, 88);

        PessoaDoente pd = new PessoaDoente(x1, x2, 30, vii);
        PessoaDoente pd2 = new PessoaDoente(x2, y2, 31, vii);

        m.fazpd(pd);
        m.fazpd(pd2);

        /**
         * faz hospitais
         */
        for (int x = 1; x < 5; x++) {
            for (int y = 1; y < 5; y++) {
                Hospital h = new Hospital(x, y, 7);
                m.fazH(h);

            }
        }

        for (int x = 21; x < 25; x++) {
            for (int y = 21; y < 25; y++) {
                Hospital h = new Hospital(x, y, 7);
                m.fazH(h);

            }
        }

        for (int x = 11; x < 15; x++) {
            for (int y = 61; y < 65; y++) {
                Hospital h = new Hospital(x, y, 7);
                m.fazH(h);

            }
        }

        /**
         * loop infito que gera tudo
         */
        while (true) {

            m.desenhaMundo();

            m.atualiza();

            try {
                Thread.sleep(300);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
