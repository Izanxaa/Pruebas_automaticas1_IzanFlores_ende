package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaTest {

    private Cuenta cuenta;

    @BeforeEach
    public void setUp() {
        cuenta = new Cuenta("Juan", 100.0F);
    }

    @Test
    public void testTitularNoEsNull() {
        assertNotNull(cuenta.getNumero());
    }

    @Test
    public void testSaldoInicialCorrecto() {
        assertEquals(100.0, cuenta.getSaldo());
    }

    @Test
    public void testIngresarDinero() {
        Cuenta.ingresarDinero(50.0F);
        assertEquals(150.0f, cuenta.getSaldo());
    }

    @Test
    public void testNoPermiteIngresoNegativo() {
        cuenta.ingresarDinero(-20.0f);
        assertEquals(100.0f, cuenta.getSaldo());
    }

    @Test
    public void testRetirarDinero() {
        cuenta.extraerDinero(40.0f);
        assertEquals(60.0f, cuenta.getSaldo());
    }

    @Test
    public void testNoPermiteRetiroExcesivo() {
        cuenta.extraerDinero(200.0f);
        assertEquals(100.0f, cuenta.getSaldo());
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
