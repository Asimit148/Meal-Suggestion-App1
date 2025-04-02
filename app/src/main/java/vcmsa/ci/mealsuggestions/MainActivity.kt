package vcmsa.ci.mealsuggestions

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val resultText: TextView = findViewById(R.id.MealSuggestions)


        // Retrieve UI elements from the layout of their IDs
        // EditText for user to input the name of the exercise
        val TimeoftheDayInput: EditText = findViewById(R.id.TimeofthedayInput)
        // Button when clicked displays suggestions based on Time of the day and meal.
        val displayButton: Button = findViewById(R.id.DisplayButton)
        //Button when clicked resets all input fields and the result display.
        val resetButton: Button = findViewById(R.id.ResetButtoon)

        // Set an onClickListener for the for the display Button
       displayButton.setOnClickListener {
           // Retrieving the name of the Time of day from the input as a string.
           val userInput: String =
               TimeoftheDayInput.text.toString() // Stores the input text as a String.
            // Checking which time of day the user has inputted, and outputting a suitable meal for that time.
           if (userInput == "Morning" || userInput == "morning") {
               resultText.text = "Pancakes are the best in the morning"
           }

           else if (userInput == "Mid-morning" || userInput == "mid-morning") {
               resultText.text = "Apples are the best in mid-morning"
           }

           else if (userInput == "Afternoon" || userInput == "afternoon") {
               resultText.text = "Pizzas are the best in the Afternoon"
           }

           else if (userInput == "Mid-afternoon" || userInput == "mid-afternoon") {
               resultText.text = "Burgers are the best in the Mid-afternoon"
           }

           else if (userInput == "Dinner" || userInput == "Dinner") {
               resultText.text = "Pasta is the best at Dinner"
           }
        // Checking if the user has left the text blank and outputting an error statement.
           else if (userInput.isEmpty())
           {
               resultText.text = "Please enter a time of day"
           }
           // Checking if the user has entered the incorrect text and outputting an error statement.
           else
           {
              resultText.text = "Invalid text entered. Please enter a time of day."
           }

           // Title: Meal Suggestion App
           // Author: Asimit Shrivastava
           // 2 April 2025
           // Version: 1,0
           //Available: https://www.w3schools.com/programming/prog_if.php
       }}}