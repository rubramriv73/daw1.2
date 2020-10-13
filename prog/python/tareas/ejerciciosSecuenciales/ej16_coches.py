'''

@author: Rubén Ramírez Rivera

16. Dos vehículos viajan a diferentes velocidades (v1 y v2) 
y están distanciados por una distancia d. El que está detrás 
viaja a una velocidad mayor. Se pide hacer un algoritmo para 
ingresar la distancia entre los dos vehículos (km) y sus 
respectivas velocidades (km/h) y con esto determinar y mostrar 
en que tiempo (minutos) alcanzará el vehículo más rápido al otro.

'''

print('\n *** PROGRAMA QUE MUESTRA EN CUANTO TIEMPO SE ENCONTRARAN 2 COCHES *** \n')

#Pedimos al usuario la distancia entre los vehiculos, la velocidad del primero 
#y la velocidad del segundo

'''
Hay que tener cuenta que v2 tiene que ser mayor 
que v1 ya que el segundo coche va a mayor velocidad
'''

distance = int(input('Introduce la distancia entre los vehiculos (km): '))
v1 = int(input('Introduce la velocidad del primer vehiculo (km/h): '))
v2 = int(input('Introduce la velocidad del primer vehiculo (km/h): '))


#Calculamos el tiempo que tardan en encontrarse

'''
Para calcular el tiempo que tardan en encontrarse necesitamos dividir
la distancia a la que se encuentran entre la diferencia de las 
velocidades de los 2 vehiculos

time = distance / (v2 - v1)

'''

time = distance / (v2 - v1)

#Mostramos el resultado al usuario

print('\nDATOS:')
print('\nDistancia entre vehiculos = ', distance, 'km')
print('Velocidad del primer vehiculo = ', v1, 'km/h')
print('Velocidad del segundo vehiculo = ', v2, 'km/h')

print('\n\nRESULTADO:')
print('\nTiempo en encontrarse = ', (time * 60), 'min \n')