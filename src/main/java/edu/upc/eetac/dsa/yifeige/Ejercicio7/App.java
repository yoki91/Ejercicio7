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
    	Dato vacio=null;
    	try
    	{
    		FileOutputStream fileOut=new FileOutputStream("datos.txt");
    		ObjectOutputStream out=new ObjectOutputStream(fileOut);
    		out.writeObject(d);
    		out.close();
    		fileOut.close();
    		System.out.print("Los datos ha guardado en /home/yifeige/dsa-projects/Ejercicio7/datos.txt\n");
    		FileInputStream filein=new FileInputStream("datos.txt");
    		ObjectInputStream in=new ObjectInputStream(filein);
    		vacio=(Dato) in.readObject();
    		in.close();
    		filein.close();
    		
    		
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    	System.out.printf("El nombre es %s\n",vacio.nombre);
        System.out.printf("La edad es %d\n" + vacio.edad);
        System.out.printf("El sexo es %c\n" + vacio.sexo);
    	
    }
}
