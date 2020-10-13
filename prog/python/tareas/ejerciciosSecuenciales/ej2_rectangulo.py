'''
@author: Rubén Ramírez Rivera

2. Calcular el perí­metro y área de un rectángulo 
dada su base y su altura.
'''

print('\n *** PROGRAMA QUE CALCULA EL PERÍMETRO Y ÁREA DE UN RECTÁNGULO *** \n')

#Pedimos al usuario la base y altura del rectángulo

base = int(input('Introduce la base de tu rectángulo: '))
height = int(input('Introduce la altura de tu rectángulo: '))

#Calculamos el perímetro del rectangulo

''' perimeter = 2 * base + 2 * height '''

perimeter = 2 * (base + height)

#Calculamos el área del rectángulo

''' area = base * height '''

area = base * height


#Mostramos al usuario el resultado 

print('\nDATOS RECTÁNGULO:')
print('\nBase= ', base)
print('Altura= ', height)
print('\n\nRESULTADOS ÁREA Y PERÍMETRO:')
print('\nÁrea= ', area)
print('Perímetro= ', perimeter, '\n')