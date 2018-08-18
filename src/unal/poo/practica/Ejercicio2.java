package unal.poo.practica;

import becker.robots.*; //import=include


public class Ejercicio2 //nombre clase=nombre Java Class
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
        estudiante = new Robot(objetos, 1, 2, Direction.SOUTH, 0);//Obligatoria
            
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.move();
        estudiante.turnLeft();
        estudiante.move();
        estudiante.turnLeft();
        estudiante.move();
        estudiante.pickThing();
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.move();
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.move();
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.move();
        estudiante.turnLeft();
        estudiante.turnLeft();
        estudiante.turnLeft();
    }
}
