'''
@author: Rubén Ramírez Rivera

5. Escribir un programa que convierta un 
valor dado en grados Fahrenheit a grados Celsius.
'''

print('\n *** PROGRAMA QUE CONVIERTE GRADOS FAHRENHEIT A CELSIUS *** \n')

#Pedimos al usuario los grados en Fahrenheit

degreesFah = float(input('Introduce los grados en Fahrenheit: '))

#Convertimos los dados del usuario a Celsius

''' degreesCel = (degreesFah - 32) / 1.8 '''

degreesCel = (degreesFah - 32) / 1.8

#Mostramos el resultado al usuario

print('\n   CONVERSION DE GRADOS')
print('\nFahrenheit= ', round(degreesFah, 2), 'ºF')
print('Celsius= ', round(degreesCel, 2), 'ºC\n')