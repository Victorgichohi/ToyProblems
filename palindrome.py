# Solve the problem below using python
# Find largest palindrome
# A string is called palindrome when it is same while reading character by character from left side or right side. 
# Given any arbitrary string find out the largest substring in it which is a palindrome.
# For example "anevitativehondacivic" returns "evitative"
def palindrome(text):
    #change the input to lower case first
    text = text.lower()
    #create an empty list with the result where it will be 
    all_palindromes = []

    #get all the numbers between 0 and the length of our string in our case 21 assigning them to a
    for a in range(len(text)):
        #give each number in a value b
        for b in range(0, a):
            #the function itterates over the variable and returns a string ahead of it.
            palind = text[b:a + 1]
            #return the reverse of what you got in the first section
            if palind == palind[::-1]:
                all_palindromes.append(palind)
                
    #return the maximum of all the palindromes in the array
    return max(all_palindromes,key=len)
print (palindrome("anevitativehondacivic"))
