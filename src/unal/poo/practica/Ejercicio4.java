package unal.poo.practica;

import becker.robots.*; //import=include


public class Ejercicio4 //nombre clase=nombre Java Class
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
        estudiante = new Robot(objetos, 0, 1, Direction.SOUTH, 0);//Obligatoria
        
        int i;
        int j;
        int a;
        
        for (i=0;i<4;i++){
            estudiante.move();
            while(estudiante.canPickThing()){
                estudiante.pickThing();
            }
            estudiante.turnLeft();
            a=estudiante.countThingsInBackpack();
            for(j=a;j>0;j--){
                estudiante.putThing();
                estudiante.move();
            }
            estudiante.turnLeft();
            estudiante.turnLeft();
            for(j=a;j>0;j--){
                estudiante.move();
            }
            estudiante.turnLeft();     
        }   
    }
}
