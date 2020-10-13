'''
@author: Rubén Ramírez Rivera

4. Dados dos números, mostrar la 
suma, resta, división y multiplicación de ambos.
'''

print('\n *** PROGRAMA QUE REALIZA LA SUMA, RESTA, DIVISION Y MULTIPLICACION DE DOS NUMEROS *** \n')

#Pedimos al usuario los 2 numeros

num1 = int(input('Introduce el primer numero: '))
num2 = int(input('Introduce el segundo numero: '))

#Calculamos la suma

''' add = num1 + num2 '''

add = num1 + num2 

#Calculamos la resta

''' sub = num1 - num2 '''

sub = num1 - num2 

#Calculamos la division

''' div = num1 / num2 '''

div = num1 / num2 

#Calculamos la multiplicacion

''' mult = num1 * num2 '''

mult = num1 * num2 

#Mostramos el resultado al usuario

print('\nNUMEROS:')
print('\nNumero 1 = ', num1)
print('Numero 2 = ', num2)
print('\n\nRESULTADOS:')
print('\nSuma= ', add)
print('\nResta= ', sub)
print('\nDivision= ', div)
print('\nMultiplicacion= ', mult, '\n')