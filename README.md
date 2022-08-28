# Food Truck Project

## Details
This food truck project was completed while I was attending Skill Distillery. The requirements of the project were to prompt the user for information on 5 food trucks; to include truck name, type of food and rating. The program automatically serializes the trucks with a unique numerical identifier. After all info has been input to the program, the user will get a menu prompt where they can decide to look up all food trucks, the average rating of all the food trucks, or just see the info of the top rated truck.  

##Summary of each class
I made a Food truck class where the four attributes mentioned could be captured. These were created as private variables, so I also had to use setters and getters. I also made a toString method to output the Food Truck data.

I also made a Food Truck App class that contians my main method. The main method starts by prompting the user for a truck name. It captures the user input using a scanner. It the prompts the user for what type of food that truck makes and for a rating, capturing both inputs with the scanner. This is contained in a for loop that executes 5x to collect all 5 truck's data. If at any point the user wants to quit, they can type "quit" as a truck name and it will break out of the loop and move on to the menu. The menu is a while switch that contains three methods. The first method is a list of all trucks in the array. The second method adds all the ratings and divides by the number of trucks provided to give the user an average rating. The final method is showing the user the information of the highest rated food truck. This is a while loop, so the user will be able to select as many options as they want until they would like to quit, where they simply select menu option 4.

## What I learned
This project was designed to remove the "static" training wheels. Additionally, I have been struggling with creating objects/adding them to arrays/calling specific objects from arrays due to certain attributes. This project allowed me to focus on my mentioned weaknesses while expanding my condfidence calling non static methods from other classes. 

##How to run
This was built to run in an IDE. Just import and press run.

## Technologies Used
Git, Atom, Eclipse, Java
