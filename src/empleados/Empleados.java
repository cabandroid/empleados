
package empleados;

import javax.swing.JOptionPane;

public class Empleados {

    public static void main(String[] args) {
        
        int selec;
        
        LlenadoEmpleados empleado1 = new LlenadoEmpleados("", 0, "", 0);
        LlenadoEmpleados empleado2 = new LlenadoEmpleados("", 0, "", 0);
        LlenadoEmpleados empleado3 = new LlenadoEmpleados("", 0, "", 0);
        LlenadoEmpleados empleado4 = new LlenadoEmpleados("", 0, "", 0);
        LlenadoEmpleados empleado5 = new LlenadoEmpleados("", 0, "", 0);
       
        
        empleado1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado 1: "));
        empleado1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado 1: ")));
        empleado1.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion del empleado 1: "));
        empleado1.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Ingrese el telefono del empleado 1: ")));
        
        empleado2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado 2: "));
        empleado2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado 2: ")));
        empleado2.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion del empleado 2: "));
        empleado2.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Ingrese el telefono del empleado 2: ")));
        
        empleado3.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado 3: "));
        empleado3.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado 3: ")));
        empleado3.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion del empleado 3: "));
        empleado3.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Ingrese el telefono del empleado 3: ")));
        
        empleado4.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado 4: "));
        empleado4.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado 4: ")));
        empleado4.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion del empleado 4: "));
        empleado4.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Ingrese el telefono del empleado 4: ")));
        
        empleado5.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado 5: "));
        empleado5.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado 5: ")));
        empleado5.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion del empleado 5: "));
        empleado5.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Ingrese el telefono del empleado 5: ")));
        
         String desea;
        do{
        selec = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleado que desea saber: \n 1. Empleado 1 \n 2. Empleado 2 \n 3. Empleado 3 \n 4. Empleado 4 \n 5. Empleado 5 \n "));
        switch (selec){
        //Empleado 1
            case 1:
        System.out.println("El nombre del empleado 1 es: "+empleado1.getNombre());
        System.out.println("La edad del empleado 1 es: "+empleado1.getEdad());
        System.out.println("La direccion del empleado 1 es: "+empleado1.getDireccion());
        System.out.println("El telefono del empleado 1 es: "+empleado1.getTelefono());
        break;
        
        //Empleado 2
            case 2:
        System.out.println("El nombre del empleado 2 es: "+empleado2.getNombre());
        System.out.println("La edad del empleado 2 es: "+empleado2.getEdad());
        System.out.println("La direccion del empleado 2 es: "+empleado2.getDireccion());
        System.out.println("El telefono del empleado 2 es: "+empleado2.getTelefono());
        break;
      
        //Empleado 3
            case 3:
        System.out.println("El nombre del empleado 3 es: "+empleado3.getNombre());
        System.out.println("La edad del empleado 3 es: "+empleado3.getEdad());
        System.out.println("La direccion del empleado 3 es: "+empleado3.getDireccion());
        System.out.println("El telefono del empleado 3 es: "+empleado3.getTelefono());
        break;
        //Empleado 4
            case 4:
        System.out.println("El nombre del empleado 4 es: "+empleado4.getNombre());
        System.out.println("La edad del empleado 4 es: "+empleado4.getEdad());
        System.out.println("La direccion del empleado 4 es: "+empleado4.getDireccion());
        System.out.println("El telefono del empleado 4 es: "+empleado4.getTelefono());
        break;
        //Empleado 5
            case 5:
        System.out.println("El nombre del empleado 5 es: "+empleado5.getNombre());
        System.out.println("La edad del empleado 5 es: "+empleado5.getEdad());
        System.out.println("La direccion del empleado 5 es: "+empleado5.getDireccion());
        System.out.println("El telefono del empleado 5 es: "+empleado5.getTelefono());
        break;
            default:
                JOptionPane.showMessageDialog(null, "EMPLEADO INGRESADO NO VALIDO.");
        }
        
        desea = JOptionPane.showInputDialog("Desea saber datos de otro empleado? si/no");
        }while(desea.equals("si") || desea.equals("SI") || desea.equals("Si"));
    }
}