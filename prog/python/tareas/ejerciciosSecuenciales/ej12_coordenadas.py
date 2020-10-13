from math import sqrt

'''

@author: Rubén Ramírez Rivera

12. Pide al usuario dos pares de números x1,y2 y x2,y2, que 
representen dos puntos en el plano. Calcula y muestra la 
distancia entre ellos.

'''

print('\n *** PROGRAMA QUE MUESTRA LA DISTANCIA ENTRE 2 PUNTOS SOBRE EL PLANO *** \n')

#Pedimos al usuario los 2 puntos del plano al usuario

'''Valores del primer punto'''

print('Valores del primer punto:')

x1 = int(input('Introduce el valor de x: '))
y1 = int(input('Introduce el valor de y: '))

'''Valores del segundo punto'''

print('Valores del segundo punto:')

x2 = int(input('Introduce el valor de x: '))
y2 = int(input('Introduce el valor de y: '))

#Calculamos la diferencia entre los 2 puntos

'''

dif = sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2))

'''

dif = sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2))

#Mostramos el resultado al usuario

print('\nPUNTOS:')

print('\nPrimer Punto:')
print('\nx = ', x1)
print('y = ', y1)

print('\nSegundo Punto:')
print('\nx = ', x2)
print('y = ', y2)


print('\n\nRESULTADO:')
print('\nLa destancia entre los puntos es ',dif, '\n')