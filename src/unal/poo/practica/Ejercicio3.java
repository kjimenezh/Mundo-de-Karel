package unal.poo.practica;

import becker.robots.*; //import=include


public class Ejercicio3 //nombre clase=nombre Java Class
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
        estudiante = new Robot(objetos, 1, 0, Direction.EAST, 0);//Obligatoria
        
        int i;
        int j;
        int k;
        int a=0;
        
        for (i=0;i<=9;i++){
            if(i%2==0&&i!=0){
                a++;
            }
            for(j=a;j<5;j++){
                estudiante.move();
                estudiante.pickThing();
            }
            if(i!=9){
                for(k=0;k<3;k++){
                   estudiante.turnLeft();
                }
            }
        }
    }
}
