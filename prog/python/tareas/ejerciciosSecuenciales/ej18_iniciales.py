'''

@author: Rubén Ramírez Rivera

18. Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.

'''

print('\n *** PROGRAMA QUE MUESTRA LAS INICIALES DEL USUARIO *** \n')

#Pedimos al usuario su nombre completo

name = input('Introduce tu nombre: ')
surname1 = input('Introduce tu primer apellido: ')
surname2 = input('Introduce tu segundo apellido: ')

#Obtenemos las iniciales del nombre y apellidos

'''
index_name = name[0]
index_surname1 = surname1[0]
index_surname2 = surname2[0]

'''

index_name = name[0]
index_surname1 = surname1[0]
index_surname2 = surname2[0]

#Concatenamos la iniciales

initials = index_name + index_surname1 + index_surname2

#Mostramos el resultado al usuario

print('\nNOMBRE COMPLETO = ' , name, surname1, surname2)
print('INICIALES = ' , initials, '\n')
