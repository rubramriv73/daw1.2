'''

@author: Rubén Ramírez Rivera

19. Escribir un algoritmo para calcular la nota final de un estudiante, 
considerando que por cada respuesta correcta 5 puntos, por una incorrecta
-1 y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.

'''

print('\n *** PROGRAMA QUE CALCULA LA NOTA DE UN TEST *** \n')

#Pedimos al usuario los datos del examen

questions = int(input('Preguntas totales: '))
correct = int(input('Preguntas correctas: '))
wrong = int(input('Preguntas incorrectas: '))
blank = int(input('Preguntas en blanco: '))


#Calculamos la puntuacion total

'''
result = (correct * 5) - wrong

'''

result = (correct * 5) - wrong

#Mostramos el resultado del examen

print('\nDATOS DEL EXAMEN')
print('\nPreguntas totales= ', questions)
print('Preguntas correctas= ', correct)
print('Preguntas incorrectas= ', wrong)
print('Preguntas en blanco= ', blank)
print('\nRESULTADO = ' , result,'/', (questions * 5), '\n')