from math import sqrt

'''
@author: Rubén Ramírez Rivera

3. Dados los catetos de un triángulo rectángulo, 
calcular su hipotenusa.
'''

print('\n *** PROGRAMA QUE CALCULA LA HIPOTENUSA DE UN TRIANGULO RECTÁNGULO *** \n')

#Pedimos al usuario los catetos del triangulo

cat1 = int(input('Introduce el primer cateto de tu triangulo: '))
cat2 = int(input('Introduce el segundo cateto de tu triangulo: '))

#Calculamos la hipotenusa del triangulo

''' hypotenuse = sqrt((cat1 ** 2) + (cat2 ** 2)) '''

hypotenuse = sqrt((cat1 ** 2) + (cat2 ** 2))

#Mostramos el resultado al usuario

print('\nDATOS TRIANGULO:')
print('\nCateto 1 = ', cat1)
print('Cateto 2 = ', cat2)
print('\n\nRESULTADO HIPOTENUSA:')
print('\nHipotenusa= ', hypotenuse, '\n')