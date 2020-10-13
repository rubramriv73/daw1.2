'''
@author: Rubén Ramírez Rivera

6. Calcular la media de tres números 
pedidos por teclado.
'''

print('\n *** PROGRAMA QUE CALCULA LA MEDIA DE TRES NUMEROS *** \n')

#Pedimos al usuario los 3 numeros

num1 = int(input('Introduce el primer numero: '))
num2 = int(input('Introduce el segundo numero: '))
num3 = int(input('Introduce el tercero numero: '))

#Calculamos la media entre los 3 numeros

''' mean = (num1 + num2 + num3) / 3 '''

mean = (num1 + num2 + num3) / 3

#Mostramos el resultado al usuario

print('\nRESULTADO')
print('\nNumero 1= ', num1)
print('Numero 2= ', num2)
print('Numero 3= ', num3)
print('\nMedia= ', mean, '\n')