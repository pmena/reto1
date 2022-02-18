package com.bootcamp.services;

import org.springframework.stereotype.Service;

@Service
public class VerificadorServiceImpl implements  VerificadorService{

    private int c_error = -1;

    public int CalcularVerificador(int dni){
        int[] serie = {3, 2, 7, 6, 5, 4, 3, 2};
        String[] listaDni =String.valueOf(dni).split("");

        if(listaDni.length!=8)
            return c_error;

        int verificador = serie[0]*Integer.parseInt(listaDni[0])
                + serie[1]*Integer.parseInt(listaDni[1])
                + serie[2]*Integer.parseInt(listaDni[2])
                + serie[3]*Integer.parseInt(listaDni[3])
                + serie[4]*Integer.parseInt(listaDni[4])
                + serie[5]*Integer.parseInt(listaDni[5])
                + serie[6]*Integer.parseInt(listaDni[6])
                + serie[7]*Integer.parseInt(listaDni[7]) ;
        int sobrante = verificador%11;
        int defecto = 11 - sobrante;

        if (sobrante == 0)
            defecto = 0;

        defecto++;

        int[] serieNumerica = { 6, 7, 8, 9, 0, 1, 1, 2, 3, 4, 5};
        char[] serieAlfabetica = { 'K', 'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        //El arreglo empieza en el indice 0
        return serieNumerica[defecto-1];

    }

    @Override
    public int CalcularDigitoVerificador(int dni) {
        try {
            return CalcularVerificador(dni);
        }catch (Exception ex){
            return c_error;
        }

    }
}
