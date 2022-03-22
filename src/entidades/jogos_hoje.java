package entidades;

import operações.jogo;

import java.util.ArrayList;

public class jogos_hoje extends jogo {

    private String hora;

    public jogos_hoje( String time, String hora) {
        this.time = time;
        this.hora = hora;
    }

    @Override

    public String toString() {
        String result;

        result = String.format("JOGO DE HOJE: %s\n", time) +
                String.format("HORÁRIO: %s\n", hora);


        return (result);


    }
}