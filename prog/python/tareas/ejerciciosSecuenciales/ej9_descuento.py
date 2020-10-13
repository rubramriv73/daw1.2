'''
@author: Rubén Ramírez Rivera

9. Una tienda ofrece un descuento del 15% sobre el 
total de la compra y un cliente desea saber cuanto
deberá pagar finalmente por su compra.

'''

print('\n *** PROGRAMA QUE CALCULA EL DESCUENTO EN UNA COMPRA *** \n')

#Pedimos al usuario el total de la compra


price = float(input('Introduce el total de su compra: '))

#Calculamos el 15% de la compra

'''
discount = (15 * price)/ 100
'''

discount = (15 * price)/ 100

#Calculamos el total de la compra

''' 
total_price = price - discount
'''

total_price = price - discount

#Mostramos el resultado al usuario

print('\nDATOS COMPRA:')
print('\nPrecio inicial = ', round(price, 2),'€')

print('\n\nRESULTADOS:')
print('\nDescuento = ', round(discount, 2),'€')
print('Precio a pagar = ', round(total_price, 2), '€\n')