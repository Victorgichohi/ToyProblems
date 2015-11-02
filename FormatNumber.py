#FORMAT STRING
#Using PYTHON make a program that can format any number to add a comma to its appropriate position
#For example (1000000) becomes (1,000,000)

def FormatComma(x):
    #check whether the number is an integer or not
    if type(x) is not int and type(x) is not long:
        raise TypeError("please enter an integer")
    #if the number is less than zero,return it with a negative sign before it since it is negative
    if x < 0:
       return '-' + FormatComma(-x)
    #if the number is less than 1000,theres no need for a comma
    elif x < 1000:
        return str(x)
    #devide the number by 1000,then add a comma after three numbers,then add the modulus of x divide by 
    #the %03d is just a style format which places a comma after every three digits
    else:
        return FormatComma(x / 1000) + ',' + '%03d' % (x % 1000)

print (FormatComma(1000000))
