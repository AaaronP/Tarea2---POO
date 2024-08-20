public class Main {
    public static void main(String[] args) {
        Cuentas controlCuentas = new Cuentas("admin", 123);

        controlCuentas.crearCuentasCorriente("Pepe", 222);
        controlCuentas.crearCuentasCorriente("Aaron", 224);
        controlCuentas.crearCuentasCorriente("Jue", 223);
        controlCuentas.crearCuentasCorriente("Viernes", 2221);

        controlCuentas.mostrar();
    }
}