'''
@author: Rubén Ramírez Rivera

10. Un alumno desea saber cual será su calificación final
en la materia de Algoritmos. Dicha calificación se 
compone de los siguientes porcentajes:

* 55% del promedio de sus tres calificaciones parciales.

* 30% de la calificación del examen final.

* 15% de la calificación de un trabajo final.

'''

print('\n *** PROGRAMA QUE CALCULA LAS NOTAS DE UN CURSO *** \n')

#Pedimos al usuario los 3 parciales, la nota del examen final y la nota del trabajo final


part1 = float(input('Introduce la nota del primer parcial: '))
part2 = float(input('Introduce la nota del segundo parcial: '))
part3 = float(input('Introduce la nota del tercer parcial: '))
test = float(input('Introduce la nota del examen final: '))
homework = float(input('Introduce la nota del trabajo final: '))

#Calculamos los porcentajes de cada apartado 

'''
mean_part = (part1 + part2 + part3)/ 3

total_part = (55 * mean_part)/ 100
total_test = (30 * test)/ 100
total_homework = (15 * homework)/100
'''

mean_part = (part1 + part2 + part3)/ 3

total_part = (55 * mean_part)/ 100
total_test = (30 * test)/ 100
total_homework = (15 * homework)/100

#Calculamos la nota final

''' 
grade = total_part + total_test + total_homework
'''

grade = total_part + total_test + total_homework

#Mostramos el resultado al usuario

print('\nNOTAS ALUMNO:')
print('\nParcial 1 = ', round(part1, 2))
print('\nParcial 2 = ', round(part2, 2))
print('\nParcial 3 = ', round(part3, 2))
print('Examen final = ', round(test, 2))
print('Trabajo final = ', round(homework, 2))

print('\n\nRESULTADOS (%):')
print('\nParciales = ', round(total_part, 2))
print('Examen final = ', round(total_test, 2))
print('Trabajo final = ', round(total_homework, 2))

print('\nNota final = ', round(grade, 2))

