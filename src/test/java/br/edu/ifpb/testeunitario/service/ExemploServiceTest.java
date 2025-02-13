package br.edu.ifpb.testeunitario.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExemploServiceTest {
    
    @Test
    void testeSomarValorVerificarSeIgualENaoIgual(){

        ExemploService exemploService = new ExemploService();
        int resultadoEsperado = 6;

        int resultadoReal = exemploService.somaValores(2,4);

        Assertions.assertEquals(resultadoEsperado, resultadoReal, "2 + 4 deve ser 6");
    }
}
