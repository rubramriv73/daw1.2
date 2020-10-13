'''

@author: Rubén Ramírez Rivera

20. Diseñar un algoritmo que nos diga el dinero que tenemos 
(en euros y céntimos) después de pedirnos cuantas monedas 
tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos).

'''

print('\n *** PROGRAMA QUE NOS MUESTRA EL DINERO QUE TENEMOS *** \n')

#Pedimos al usuario las monedas de 2€, 1€, 50cent, 20cent o 10cent que tenga

euro2 = int(input('Monedas de 2€: '))
euro1 = int(input('Monedas de 1€: '))
cent50 = int(input('Monedas de 50cent: '))
cent20 = int(input('Monedas de 20cent: '))
cent10 = int(input('Monedas de 10cent: '))


#Calculamos el total en centimos

'''
Calculamos los euros totales y estos los pasamos a centimos
Despues sumamos todos los centimos y los dividimos entre 100
para mostrar los euros y centimos totales

total_euro = (euro2 * 2) + euro1
total_cents = (total_euro * 100) + (cent50 * 50) + (cent20 * 20) + (cent10 * 10)

money = total_cents / 100
'''

total_euro = (euro2 * 2) + euro1
total_cents = (total_euro * 100) + (cent50 * 50) + (cent20 * 20) + (cent10 * 10)

money = total_cents / 100

#Mostramos el resultado al usuario

print('\nMONEDAS')
print('\n2€= ', euro2,' monedas')
print('1€= ', euro1,' monedas')
print('50cent= ', cent50,' monedas')
print('20cent= ', cent20,' monedas')
print('10cent= ', cent10,' monedas')

print('\nDinero total: ', money, '€\n')