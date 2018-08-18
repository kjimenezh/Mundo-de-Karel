package unal.poo.practica;

import becker.robots.*; //import=include

public class Ejercicio1 //nombre de la clase=nombre de Java class
{    
    //Declaracion de Variables -- Forma temporal - No es buena practica tener
    //variables estaticas
   
    public static City objetos;
    public static Robot estudiante;
        
    //Método Main
    
    public static void main (String[] args){ 
        
        //Declarar la creacion de la ciudad
        objetos = new City("Field.txt"); 
	objetos.showThingCounts(true);
            
        //Direction.NORTH, EAST, SOUTH, WEST
        //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
        estudiante = new Robot(objetos, 0, 2, Direction.WEST, 0);//Obligatoria
            
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.move();
        
        for (int i=0; i<=2; i++){
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft(); 
            estudiante.move();
            estudiante.move(); 
            estudiante.move(); 
        }   
        
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.move();
        estudiante.move();
        estudiante.turnLeft();
        estudiante.turnLeft();
    }
     
}
