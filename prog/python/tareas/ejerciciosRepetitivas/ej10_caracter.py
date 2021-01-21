'''
Author: Rubén Ramírez Rivera
Date: 02/11/2020

Ejercicio 10: Pide una cadena y un carácter por teclado y muestra cuantas
              veces aparece el carácter en la cadena.
'''

'''
Variables:
phrase <- user's string
char <- character to find in phrase 
times <- times the character appears in phrase
'''

# Presentation
print('\n   *** CHARACTER FINDER *** \n')

# We ask the user the phrase and the character
phrase = input('Insert your phrase: ')

# We ask the user to give just 1 character
while True:
    char = input('Insert a character: ')
    if len(char) == 1:
        break

# We initialize our counter and the start position on the phrase
position = 0
times = 0

# We go throw the phrase to find the times we see the character
while position < len(phrase):
    if phrase[position] == char:
        times += 1

    position += 1

print(f"Times '{char}' appears in phrase: {times}")

