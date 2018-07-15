Code Wars: https://www.codewars.com/kata/prize-draw/train/java

To participate in a prize draw each one gives his/her first name.

Each letter of a first name has a value which is its rank in the English alphabet. 
A and a have rank 1, B and b rank 2 and so on.

The length of the first name is added to the sum of these ranks hence a number n. 
An array of random weights is linked to the first names and each n is multiplied by its corresponding weight to get what they call a winning number.

Example: names: 

COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH weights: [1, 4, 4, 5, 2, 1]

PAUL -> n = length of first name + 16 + 1 + 21 + 12 = 4 + 50 -> 54 
The weight associated with PAUL is 2 so Paul's winning number is 54 * 2 = 108.

Now one can sort the first names in decreasing order of the winning numbers. 
When two people have the same winning number sort them alphabetically by their first names.

#Task:

parameters: st a string of first names, we an array of weights, n a rank

return: the first name of the participant whose rank is n (ranks are numbered from 1)

#Example: names: 

COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH weights: [1, 4, 4, 5, 2, 1] n: 4

The function should return: PauL

#Note: 
If st is empty return "No participants".

If n is greater than the number of participants then return "Not enough participants".
