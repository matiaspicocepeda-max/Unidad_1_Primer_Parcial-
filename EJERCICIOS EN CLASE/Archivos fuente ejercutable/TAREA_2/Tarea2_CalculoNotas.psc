Algoritmo Tarea2_CalculoNotas	
	Definir nota Como Real
	Escribir "Ingrese la nota del estudiante (0.0 a 10.0):"
	Leer nota
	Si nota < 0.0 O nota > 10.0 Entonces
		Escribir "Error: La nota ingresada esta fuera del rango valido (0.0 - 10.0)."
	Sino
		Si nota >= 7.0 Entonces
			Escribir "Estado: Aprobado"
		Sino
			Si nota >= 4.0 Entonces
				Escribir "Estado: Supletorio"
			Sino
				Escribir "Estado: Reprobado"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
