print("Hello Wolrd")


import Foundation 
import Glibc

// Function to find the sum of even numbers 
func sumEvenNum(a : Int) -> Int{
   var sum = 0
   print("Even numbers from 0 to \(a):")
   for j in 0...a{

      // Check if the specified number is even number or not 
      if j % 2 == 0{

         // Calculating the sum of even numbers 
         sum += j 
         print(j, terminator: " ,") 
      } 
   } 
   return sum 
}
var num = 16

// Calling the function and displaying the sum 
print("\nSum of all the even numbers from 0 to \(num): ", sumEvenNum(a:num))
