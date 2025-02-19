package br.edu.ifpb.testeunitario.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

public class ExemploServiceTest {
    
    @Test
    void testeSomarValorVerificarSeIgualENaoIgual(){

        ExemploService exemploService = new ExemploService();
        int resultadoEsperado = 6;

        int resultadoReal = exemploService.somaValores(2,4);

        Assertions.assertEquals(resultadoEsperado, resultadoReal, "2 + 4 deve ser 6");
    }

    @Test void testVerificarSeObjetoNulo(){

        ExemploService exemploService = new ExemploService();
        assertNull(exemploService.verificarNulo(null));  
        assertNotNull(exemploService.verificarNulo("string")); 
    }
    
    @Test void testVerificarSeValorMaiorQue(){

        ExemploService exemploService = new ExemploService();
        assertTrue(exemploService.verificarSeMaiorQue(10,5));
        assertFalse(exemploService.verificarSeMaiorQue(5,50));
    }

    @BeforeAll
    static void configurarAntesDeTudo(){
        System.out.println("Executando BeforeAll");
    }

    @AfterAll
    static void executarDepoisDeTudo(){
        System.out.println("Executando After All");
    }

    @BeforeEach
    void configurarAntesDeCadaMetodoDeTeste(){
        System.out.println("Executando o método com BeforeEach");
    }

    @AfterEach
    void executarDepoisDeCadaMetodoDeTeste(){
        System.out.println("Executando o método com BeforeEach");
    }

    @Test 
    void testeVerificarTimeOut(){
        ExemploService exemploService = new ExemploService();
        System.out.println("Método: testeVerificarTimeOut");
        assertTimeoutPreemptively(
            Duration.ofSeconds(6),
            () -> {exemploService.checarTimeOut();},
            "o método deve executar em 5 segundos no máximo"
        );    
    }


}



