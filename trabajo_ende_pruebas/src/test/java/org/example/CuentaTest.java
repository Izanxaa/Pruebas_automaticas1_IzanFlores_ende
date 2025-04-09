package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaTest {

    private Cuenta cuenta;

    @BeforeEach
    public void setUp() {
        cuenta = new Cuenta("Juan", 100.0);
    }

    @Test
    public void testTitularNoEsNull() {
        assertNotNull(cuenta.getTitular());
    }

    @Test
    public void testSaldoInicialCorrecto() {
        assertEquals(100.0, cuenta.getSaldo());
    }

    @Test
    public void testIngresarDinero() {

    }

    @Test
    public void testNoPermiteIngresoNegativo() {

    }

    @Test
    public void testRetirarDinero() {

    }

    @Test
    public void testNoPermiteRetiroExcesivo() {

    }

    @Test
    public void testNoPermiteRetiroNegativo() {

    }

    @Test
    void getNumero() {
    }

    @Test
    void getSaldo() {
    }

    @Test
    void setNumero() {
    }

    @Test
    void setSaldo() {
    }

    @Test
    void ingresarDinero() {
    }

    @Test
    void extraerDinero() {
    }

    @Test
    void mostrarCuenta() {
    }

    @Test
    void testGetNumero() {
    }

    @Test
    void testGetSaldo() {
    }

    @Test
    void testSetNumero() {
    }

    @Test
    void testSetSaldo() {
    }

    @Test
    void testIngresarDinero1() {
    }

    @Test
    void testExtraerDinero() {
    }

    @Test
    void testMostrarCuenta() {
    }
}
}