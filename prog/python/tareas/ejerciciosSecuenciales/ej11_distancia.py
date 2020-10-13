'''
@author: Rubén Ramírez Rivera

11. Pide al usuario dos números y muestra la "distancia" entre ellos 
(el valor absoluto de su diferencia, de modo que el resultado sea 
siempre positivo).

'''

print('\n *** PROGRAMA QUE MUESTRA LA DISTANCIA ENTRE 2 NUMEROS *** \n')

#Pedimos al usuario los 2 numeros

num1 = int(input('Introduce el primer numero: '))
num2 = int(input('Introduce el segundo numero: '))

#Calculamos la diferencia entre los 2 numeros 

'''

dif = num2 - num1

'''

dif = num2 - num1

#Mostramos el resultado al usuario

print('\nNUMEROS:')
print('\nNumero 1 = ', num1)
print('Numero 2 = ', num2)


print('\n\nRESULTADOS:')
print('\nLa destancia entre los numeros es ', abs(dif), '\n')