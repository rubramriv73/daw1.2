'''

@author: Rubén Ramírez Rivera

15. Dadas dos variables numéricas A y B, que el usuario 
debe teclear, se pide realizar un algoritmo que intercambie 
los valores de ambas variables y muestre cuanto valen al 
final las dos variables.

'''

print('\n *** PROGRAMA QUE INTERCAMBIA EL VALOR DE 2 VARIABLES *** \n')

#Pedimos al usuario 2 numeros

numA = int(input('Introduce un numero: '))
numB = int(input('Introduce otro numero: '))

print('\nINICIO')

print('\nPrimer numero = ' , numA)
print('Segundo numero = ' , numB, '\n')

#Intercambiamos los valores de los numeros

'''
Guardamos el primer numero en una variable auxiliar
aux = numA

Intercambiamos los valores uso de la variable auxiliar
numA = numB
numB = aux

'''

aux= numA
numA = numB
numB = aux

#Mostramos el resultado del intercambio

print('\nINTERCAMBIO')

print('\nPrimer numero = ' , numA)
print('Segundo numero = ' , numB, '\n')
