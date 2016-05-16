/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Entidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     clsPersona p=new clsPersona();
        p.ID(1);
        p.Nombres("Sara");
        p.Apellidos("Tapuy");
        p.Direccion("Los Angeles");
        p.Ciudad("Puyo");
        p.Edad(23);
        p.Peso(125);
        p.Telefono("0998449258");
        
        //imprimir(p);
        //llenar mas datos
        
        clsPersona p1=new clsPersona();
        p1.ID(2);
        p1.Nombres("Jean");
        p1.Apellidos("Torres");
        p1.Direccion("Obrero");
        p1.Ciudad("Puyo");
        p1.Peso(190);
        p1.Telefono("0998663572");
        
        clsPersona p2=new clsPersona();
        p2.ID(3);
        p2.Nombres("Alexandra");
        p2.Apellidos("Reyes");
        p2.Direccion("El Dorado");
        p2.Ciudad("Puyo");
        p2.Peso(175);
        p2.Telefono("0998765572");
        
        clsPersona p3=new clsPersona();
        p3.ID(4);
        p3.Nombres("Diana");
        p3.Apellidos("Guzman");
        p3.Direccion("La Merced");
        p3.Ciudad("Puyo");
        p3.Peso(250);
        p3.Telefono("0998663231");
        
        clsPersona p4=new clsPersona();
        p4.ID(5);
        p4.Nombres("David");
        p4.Apellidos("Lopez");
        p4.Direccion("Cumanda");
        p4.Ciudad("Puyo");
        p4.Peso(190);
        p4.Telefono("0998356472");
        
        clsPersona p5=new clsPersona();
        p5.ID(6);
        p5.Nombres("David");
        p5.Apellidos("Lopez");
        p5.Direccion("Cumanda");
        p5.Ciudad("Puyo");
        p5.Peso(190);
        p5.Telefono("0998356472");
        
        clsPersona p6=new clsPersona();
        p6.ID(7);
        p6.Nombres("David");
        p6.Apellidos("Lopez");
        p6.Direccion("Cumanda");
        p6.Ciudad("Puyo");
        p6.Peso(190);
        p6.Telefono("0998356472");
        
        clsPersona p7=new clsPersona();
        p7.ID(8);
        p7.Nombres("David");
        p7.Apellidos("Lopez");
        p7.Direccion("Cumanda");
        p7.Ciudad("Puyo");
        p7.Peso(190);
        p7.Telefono("0998356472");
        
        //imprimir(p1);
        
    }
   public void imprimir(clsPersona p)
    {
      System.out.println("Nombre:"+p.Nombres());
      System.out.println("Edad:"+p.Edad());
      System.out.println("Direccion:"+p.Direccion());
      System.out.println("Sexo:"+p.isSexo());
      
    }
    }

