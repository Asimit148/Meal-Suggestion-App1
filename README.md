# Meal Suggestions
## Asimit Shrivastava 

### Overview
This report provides a comprehensive overview of an Android application including its purpose, design considerations, and the utilisation of GitHub and GitHub Actions. The report also includes the code snippets and the app’s layout.

### 1.	Introduction 
My Application is called Meal Suggestions.  The purpose of the Android application is help my friend Hera who is struggling to choose what to eat on busy days, by suggesting meal options based on the time of day while also making the app fun to use. 

### 2.	Design Considerations 
The design of the app follows the Model View Controller (MVC) architectural pattern that divides a project into 3 components:
Data management, user interface and business logic

The app’s design was guided by the following key considerations for the user. User Interface: The UI in the app is very easy to navigate. The buttons are all labelled clearly and instruct the user on what to do. The placement of the buttons and textboxes on the screen are arranged in such a manner that makes it  easy for the user to understand how to use the app (e.g. the reset button is underneath the display button, because the user generally will only reset the textbox contents after they have generated the meal options). Engagement: The design of the UI is very appealing and engaging for the user. The background used shows a variety of meal types, which shows the purpose of the app itself (i.e. it generates meal options for the user). The buttons are all the same colour (purple), and therefore are organised and clearly visible to the user. The UI has many different elements, such as textboxes, buttons, a colourful background, which make the user experience engaging and meaningful and fun. Accessibility: All of the components on the interface are clearly labelled and therefore make all of the components easy to access and understand how to use (i.e. the interface can easily be navigated through and used). 






### 3.	Main Screen (Meal Suggestions UI) 
Due to the simple nature of the program, only one main screen was necessary in creating this project. 
 
The main screen ("App Actual") consists of the following components: A background image, a text view, a display and reset button, and an edit text. The text view is where the user has entered the title of the project. The edit text box, allows the user to enter text, specifically a time of day for a suggested meal (for example, “Morning”, “Mid-afternoon”, etc). The display button, will generate a meal for the user based on the time that the user has entered. However, if the user has entered incorrect text (such as leaving the edit text blank, or entering text that is not a time of day), a sufficient error message will be displayed (for example: “Please enter a time of day”). The reset button, will clear the text that the user has entered in the edit text, so that the user is able to re-enter the time of day , if they wish to try the program again. 

### 4.) Coding Behind Screen
#### 4.1) Standard Code generated for UI Components 
      
















#### 4.2) Main Activity Code – gives program functionality   

The code clearly displays, how the code adds function to the program. Above ("Main Activity 1") shows all of necessary variables that need to be declared, such as the inputted text. Then, in ("Main Activity 2" and "Main Activity 3"), there are “if statements”. These if statements check to see what time the user has entered, and display a meal depending on that time of day. For example, if the user enters “Morning”, the program will suggest “Cereal” as a meal option. However, if the user enters incorrent text, such as leaving the text blank, the if statements show that an error message will appear. 


