'''
@author: Rubén Ramírez Rivera

7. Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a 
cuantas horas y minutos corresponde.
'''

print('\n *** PROGRAMA QUE TRANSFORMA UNOS MINUTOS A HORAS Y MINUTOS *** \n')

#Pedimos al usuario los 3 numeros

mins = int(input('Introduce los minutos: '))


#Calculamos las horas totales y los minutos totales

''' 
total_ hours =  min // 60
total_mins = min % 60
'''

total_hours =  mins // 60
total_mins = mins % 60

#Mostramos el resultado al usuario

print('\n',mins, 'minutos equivalen a ', total_hours, 'horas y ', total_mins, 'minutos')