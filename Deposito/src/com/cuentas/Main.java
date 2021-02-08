package com.cuentas;

public class Main {
	public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = operativa_cuenta(1);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	/**
	 * @deprecated Use {@link #operativa_cuenta(float)} instead
	 */
	private static CCuenta operativa_cuenta() {
		return operativa_cuenta(1);
	}

	private static CCuenta operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio L�pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
		return cuenta1;
	}
}



