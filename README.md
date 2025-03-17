 Quiz Application

Overview
The Quiz Application is a Java-based console game that allows users to answer multiple-choice questions read from a file. The program evaluates answers and displays the final score.
 Features
- Reads quiz questions from a `questions.txt` file.
- Displays multiple-choice options for each question.
- Accepts user input and validates the answer.
- Provides immediate feedback on correct and incorrect answers.
- Calculates and displays the final score.

Technologies Used
- Java
- File handling (`BufferedReader` & `FileReader`)
- Collections (`List`, `ArrayList`)
- Scanner for user input

 How to Run
1. Ensure you have Java installed.
2. Prepare a `questions.txt` file with questions in the following format:
   Question text;Option1;Option2;Option3;Option4;CorrectOptionIndex
 
   Example:
  
   What is the capital of France?;Berlin;Madrid;Paris;Rome;2
   Which planet is known as the Red Planet?;Earth;Venus;Mars;Jupiter;2
  
3. Compile the Java file:

   javac QuizApp.java
  
4. Run the program:
  
   java QuizApp
 
5. Answer the questions as prompted.

 Example Gameplay

What is the capital of France?
1. Berlin
2. Madrid
3. Paris
4. Rome
Enter your answer (1-4): 3
✅ Correct!

Which planet is known as the Red Planet?
1. Earth
2. Venus
3. Mars
4. Jupiter
Enter your answer (1-4): 2
❌ Wrong! Correct answer: Mars

Your final score: 1/2

 License
This project is open-source and free to use.

