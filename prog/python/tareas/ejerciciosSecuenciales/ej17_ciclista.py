'''Salida de la hora formateada''''''Salida de la hora formateada'''

from datetime import time 

'''

@author: Rubén Ramírez Rivera

17. Un ciclista parte de una ciudad A a las HH horas, 
MM minutos y SS segundos. El tiempo de viaje hasta llegar 
a otra ciudad B es de T segundos. Escribir un algoritmo 
que determine la hora de llegada a la ciudad B.

'''

print('\n *** PROGRAMA QUE MUESTRA EL TIEMPO QUE TARDA UN CICLISTA EN LLEGAR DE UNA CIUDAD \'A\' A UNA CIUDAD \'B\' *** \n')

#Pedimos al usuario la hora a la que sale el ciclista(HH:MM:SS) y el tiempo(s) que tarda en llegar

print('\nINTRODUCE LA HORA DE SALIDA (HH:MM:SS): ')
hours = int(input('Introduce la hora de salida (HH): '))
mins = int(input('Introduce los minutos de salida (MM): '))
secs = int(input('Introduce los segundos de salida (SS): '))

start = time(hours, mins, secs)

print('\nINTRODUCE EL TIEMPO INVERTIDO (s): ')
secs_spent = int(input('Introduce los segundos invertidos en llegar a la ciudad B: '))

print('HORA DE SALIDA: ', start)

#Pasamos la hora de salida a segundos

'''

secs += ((hours * 3600) + (mins * 60))

'''

secs += ((hours * 3600) + (mins * 60))

#Sumamos los segundos inicales a los segundos que invierte en llegar a la ciudad
#y transformamos estos segundos totales a horas minutos y segundos

total_secs = secs + secs_spent

total_mins = total_secs // 60
total_secs %= 60
total_hours = total_mins // 60
total_mins %= 60

end = time(total_hours, total_mins, total_secs)

#Mostramos el resultado al usuario

print('HORA DE LLEGADA: ', end, '\n')