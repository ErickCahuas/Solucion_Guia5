package com.senati.eti.data;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import com.senati.eti.model.Alumno;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		FileWriter archivo = null;
		PrintWriter pw = null;
		
		try {
			
			archivo = new FileWriter("info.txt", true);
			pw = new PrintWriter(archivo);
			
					String nom = "", ape = "", gen = "";
			int ed = 0;
			
			System.out.println("*****************");
			System.out.println("REGISTRO DE DATOS");
			System.out.println("*****************");
			System.out.print("Nombre: ");
			nom = sc.nextLine();
			System.out.print("Apellido: ");
			ape = sc.nextLine();
			System.out.print("Género [F|M]: ");
			gen = sc.nextLine();
			System.out.print("Edad [14-60]: ");
			ed = sc.nextInt();
			
			Alumno objAlumno = new Alumno (nom, ape, gen, ed);	
			
			pw.println("-----------------");
			pw.println("Datos registrados");
			pw.println("-----------------");
			pw.println("Nombre y Apellido.........: " + objAlumno.NombreCompleto());
			pw.println("Género....................: " + objAlumno.MostrarGenero());
			

		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			
			try {
				if (archivo != null) archivo.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
			}
	}
}
