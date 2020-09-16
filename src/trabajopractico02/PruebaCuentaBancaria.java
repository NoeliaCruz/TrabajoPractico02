package trabajopractico02;

public class PruebaCuentaBancaria {

    public static void main(String[] args) {
        cuentaBancaria miCuenta = new cuentaBancaria("Andres", "Sueldo", 30000);
        System.out.println(miCuenta.getTitular()
                + " " + miCuenta.getTipoCuenta()
                + " " + miCuenta.getSaldo());
        miCuenta.setSaldo(40000);
        System.out.println(miCuenta.getSaldo());
        miCuenta.setTitular("Micaela");
        System.out.println(miCuenta.getTitular());
        miCuenta.setTipoCuenta("Ahorro");
        System.out.println(miCuenta.getTipoCuenta());
        miCuenta.extraer(50000);
        System.out.println(miCuenta.getSaldo());
        miCuenta.extraer(5000);
        System.out.println(miCuenta.getSaldo());
    }

}
