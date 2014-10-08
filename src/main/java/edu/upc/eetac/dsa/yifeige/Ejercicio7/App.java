package edu.upc.eetac.dsa.yifeige.Ejercicio7;
import java.io.*;

import edu.upc.eetac.dsa.yifeige.Ejercicio7.Dato;
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
    	Dato d=new Dato();
    	d.nombre="yifei";
    	d.edad=21;
    	d.sexo='M';
    	Dato vacio=null;// para injectar datos desde fichero de texto a este objeto vacio
    	try
    	{
    		FileOutputStream fileOut=new FileOutputStream("datos.txt");// construye un fichero de texto
    		ObjectOutputStream out=new ObjectOutputStream(fileOut);
    		out.writeObject(d);// escribe mi objeto d(yifei,21,M) a este fichero
    		out.close();//termino de escribir
    		fileOut.close();//cierro el fichero
    		System.out.print("Los datos ha guardado en /home/yifeige/dsa-projects/Ejercicio7/datos.txt\n");
    		FileInputStream filein=new FileInputStream("datos.txt"); // leo el mismo fichero
    		ObjectInputStream in=new ObjectInputStream(filein);
    		vacio=(Dato) in.readObject(); //los valores que leo lo injecto al objeto
    		in.close(); //cierro el lector
    		filein.close(); //cierro el fichero
    		
    		
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    	System.out.printf("El nombre es %s\n",vacio.nombre); // muestra datos por la pantalla.
        System.out.printf("La edad es %d\n" , vacio.edad);
        System.out.printf("El sexo es %c\n" , vacio.sexo);
    	
    }
}
