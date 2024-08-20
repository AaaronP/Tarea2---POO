import java.util.ArrayList;

public class Cuentas{
    private string name;
    private int identificador;
    private ArrayList<Cuentas> listaCuentas = new ArrayList<>();

    Cuentas(string name, int identificador){
        this.name = name;
        this.identificador = identificador;
    }

    public void crearCuentaCorriente(string name, int identificador){
        Cuentas nuevaCuenta = new Cuentas(name, identificador);
        listaCuentas.add(nuevaCuenta);
    }

    public Cuentas buscarCuenta(int identificador){
        for (Cuentas cuenta : listaCuentas) {
            if (cuenta.getIdentificador() == identificador) {
                return cuenta;
            }
        }

        return null;
    }

    public void eliminarCuenta(int identificador){
        for (int i = 0; i < listaCuentas.size(); i++){
            if (listaCuentas.get(i).identificador == identificador){
                listaCuentas.remove(i);
            }
        }
    }

    public void mostrar(){
        for (Cuentas cuenta : listaCuentas) {
            System.out.println(cuenta.getName() + " " + cuenta.getIdentificador());
        }
    }

    public int getIdentificador() {
        return identificador;
    }
    public string getName() {
        return name;
    }
}