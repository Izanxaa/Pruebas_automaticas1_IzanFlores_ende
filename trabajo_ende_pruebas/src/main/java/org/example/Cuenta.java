package org.example;

public class Cuenta {
    private String numero;
    private static float saldo;

    public Cuenta (String numCta, float saldoCta) {
        numero = numCta;
        saldo = saldoCta;
    }

    public String getNumero(){
        return numero;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setNumero(String numCta){
        numero = numCta;
    }

    public void setSaldo(float saldoCta){
        saldo = saldoCta;
    }

    public static void ingresarDinero(float importe){
        saldo = saldo + importe;
    }

    public void extraerDinero(float importe){
        saldo = saldo - importe;
    }

    public void mostrarCuenta(){
        System.out.println ("N° cuenta: "+ getNumero());
        System.out.println ("Saldo: "+ getSaldo()+ " C");
    }
}

