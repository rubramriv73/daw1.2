from math import sqrt

'''

@author: Rubén Ramírez Rivera

13. Realizar un algoritmos que lea un número y que muestre su raíz 
cuadrada y su raíz cúbica. Python no tiene ninguna función predefinida 
que permita calcular la raíz cúbica, ¿cómo se puede calcular?

'''

print('\n *** PROGRAMA QUE MUESTRA LA RAIZ CUADRADA Y LA RAIZ CUBICA DE UN NUMERO *** \n')

#Pedimos al usuario 1 numero

num = int(input('Introduce un numero: '))

#Calculamos la raiz cuadrada y la raiz cubica

'''

La raiz cuadrada la calcularemos con la funcion sqrt del modulo math

cube = num ** (1 / 3)

'''

cube = (num ** (1 / 3))

#Mostramos el resultado al usuario

print('\nNumero = ' , num)

print('\n\nRESULTADO:')
print('\nRaiz cuadrada = ',sqrt(num))
print('\nRaiz cubica = ',cube, '\n')