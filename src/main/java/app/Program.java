package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
//import views.ListarVehiculosView;
import views.AgregarVehiculo;
public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        AgregarVehiculo view = new AgregarVehiculo();
        view.setVisible(true);
        
    }
}
