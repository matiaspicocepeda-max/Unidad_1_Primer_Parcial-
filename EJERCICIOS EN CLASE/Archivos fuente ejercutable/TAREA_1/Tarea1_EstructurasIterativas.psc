Algoritmo Tarea1_EstructurasIterativas
	Definir i, j Como Entero
	Definir contadorInteracciones, sumaSeguimiento Como Entero
	contadorInteracciones <- 0
	sumaSeguimiento <- 0
	Escribir "i | j | Interaccion | Suma Acumulada"
	Para i <- 1 Hasta 3 Con Paso 1 Hacer
		
		Para j <- 1 Hasta 2 Con Paso 1 Hacer
			
			contadorInteracciones <- contadorInteracciones + 1
			sumaSeguimiento <- sumaSeguimiento + (i * j)
			
			Escribir i, " | ", j, " | ", contadorInteracciones, "           | ", sumaSeguimiento
		Fin Para
	Fin Para
	Escribir "Total de interacciones realizadas: ", contadorInteracciones
	Escribir "Resultado de la suma acumulada: ", sumaSeguimiento
FinAlgoritmo