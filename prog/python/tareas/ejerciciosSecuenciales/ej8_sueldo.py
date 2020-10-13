'''
@author: Rubén Ramírez Rivera

8. Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, 
el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
tres ventas que realiza en el mes y el total que recibirá en el mes tomando en 
cuenta su sueldo base y comisiones.

Recibe: 
sueldo + 10% comision de ventas

'''

print('\n *** PROGRAMA QUE CALCULA EL DINERO QUE OBTENDRA UN VENDEDOR *** \n')

#Pedimos al usuario su sueldo base, y las 3 ventas

salary = float(input('Introduce tu salario base: '))
purchase1 = float(input('Introduce el valor de la primera compra: '))
purchase2 = float(input('Introduce el valor de la segunda compra: '))
purchase3 = float(input('Introduce el valor de la tercera compra: '))

#Calculamos el 10% de cada compra

'''
commission1 = (10 * purchase1)/ 100
commission2 = (10 * purchase2)/ 100
commission3 = (10 * purchase3)/ 100
'''

commission1 = (10 * purchase1)/ 100
commission2 = (10 * purchase2)/ 100
commission3 = (10 * purchase3)/ 100

#Calculamos el total de las comisiones y el total del salario que gana

''' 
total_commission =  commission1 + commission2 + commission3
total_salary = salary + total_commission
'''

total_commission =  commission1 + commission2 + commission3
total_salary = salary + total_commission

#Mostramos el resultado al usuario

print('\nDATOS USUARIO:')
print('\nSalario base= ', round(salary, 2),'€')
print('Primera compra= ', round(purchase1, 2),'€')
print('Segunda compra= ', round(purchase2, 2),'€')
print('Tercera compra= ', round(purchase3, 2),'€')
print('\n\nRESULTADOS:')
print('\nComision por primera compra= ', round(commission1, 2),'€')
print('Comision por segunda compra= ', round(commission2, 2),'€')
print('Comision por tercera compra= ', round(commission3, 2),'€')
print('\nTotal comisiones= ', round(total_commission, 2),'€')
print('Total sueldo= ', round(total_salary, 2), '€\n')