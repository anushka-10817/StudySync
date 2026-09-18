# StudySync
StudySync is a Java-based command-line study planner that helps students manage academic tasks, deadlines, priorities and completion status. It uses ArrayList and Java serialization for task management and persistent local data storage.
# Objective
*  Build a simple and easy to use study planner for students.
* Record tasks, subjects, deadlines and priorities in one place.
* Allow students to mark tasks as completed as they finish them.
* Show overall study progress at a glance.
* Work without a database, internet connection or external libraries.
* Apply core Java concepts such as:
Classes and Objects
ArrayList / Collections
Control Flow
Exception Handling
File I/O and Serialization
* Create a project that solves a practical day to day student problem rather than being just a textbook exercise.
# Features
* Add Task- Add subject, task name, deadline and priority.
* Show Tasks- View all tasks with Pending/Completed status.
* Complete Task- Mark a selected task as completed.
* Delete Task- Remove a selected task.
* Show Progress- View total, completed, pending tasks and progress %.
* Exit-	Save data and exit the application.
# Supporting Features
* Autosave: Saves changes after adding, completing or deleting tasks.
* Autoload: Restores saved tasks when the program starts.
* Input Handling: Handles invalid menu choices and task numbers.
* Menu driven: Runs continuously until the user selects Exit.
# Tools & Technologies Used
* Programming Language: Java
* IDE: Visual Studio Code
* Compiler: javac
* Data Structure: ArrayList
* Storage: Java Serialization (tasks.dat)
* Interface: Command Line / Console
# Installation & Run
* Install Java JDK on your system.
* Verify the installation:
java -version
javac -version
* Download or clone the project repository.
* Open the project folder in VS Code or a terminal.
* Compile the program:
javac StudySync.java
* Run the application:
java StudySync
* Use the numbered menu to access different features.

# Testing Instructions
* Run the application using java StudySync.
* Select 1 – Add Task and enter subject, task name, deadline, and priority.
* Select 2 – Show Tasks to verify that the task was added.
* Select 3 – Complete Task and enter the task number to mark it as completed.
* Select 5 – Show Progress to verify the completed-task percentage.
* Select 4 – Delete Task to test task deletion.
* Select 6 – Exit and restart the application to verify that previously saved tasks are retained.
* Enter invalid menu values or task numbers to test the application's error handling.
# Project Structure
* StudySync.java
* tasks.dat
* README.md
# Screenshots of Output
<img width="926" height="512" alt="Screenshot 2026-09-17 184728" src="https://github.com/user-attachments/assets/7c454821-3c06-4f22-9b01-2c3b45192729" />
<img width="712" height="527" alt="Screenshot 2026-09-17 184744" src="https://github.com/user-attachments/assets/5fda82a5-00a5-4bb3-9e49-1c2ac3b8b786" />
<img width="767" height="497" alt="Screenshot 2026-09-17 184800" src="https://github.com/user-attachments/assets/e0d5b033-3dbf-41b8-bafa-9e63119ae1f4" />
<img width="787" height="506" alt="Screenshot 2026-09-17 184816" src="https://github.com/user-attachments/assets/6fa35d05-7689-46d6-b544-d49a0d0890ef" />
<img width="697" height="490" alt="Screenshot 2026-09-17 184832" src="https://github.com/user-attachments/assets/1583ebda-4b0d-426e-97b7-dde5f7c7f8ae" />
<img width="711" height="512" alt="Screenshot 2026-09-17 184845" src="https://github.com/user-attachments/assets/eb476218-a16c-4342-a408-592e86155051" />
<img width="567" height="521" alt="Screenshot 2026-09-17 184857" src="https://github.com/user-attachments/assets/43412368-b71f-46a8-a32f-c81b65e5bf9c" />
<img width="642" height="532" alt="Screenshot 2026-09-17 184907" src="https://github.com/user-attachments/assets/72b3967c-4698-405b-ab95-ac3803bbdff5" />
<img width="810" height="513" alt="Screenshot 2026-09-17 184922" src="https://github.com/user-attachments/assets/32952449-9e43-4360-8b6b-1603840e10d3" />
<img width="897" height="502" alt="Screenshot 2026-09-17 184933" src="https://github.com/user-attachments/assets/f746b0da-0cdf-451e-b15a-e488c12b6da4" />
<img width="762" height="532" alt="Screenshot 2026-09-17 184945" src="https://github.com/user-attachments/assets/a4970265-75ff-4f17-b49f-eade565662c5" />
<img width="690" height="507" alt="Screenshot 2026-09-17 184954" src="https://github.com/user-attachments/assets/cc05a074-239a-419b-9830-c1df91afd986" />
<img width="517" height="482" alt="Screenshot 2026-09-17 185005" src="https://github.com/user-attachments/assets/e51e4437-0636-497c-a5f4-f70043960a4d" />
<img width="441" height="506" alt="Screenshot 2026-09-17 185037" src="https://github.com/user-attachments/assets/0ec637f6-8c54-4c11-a20e-9b5d8e7e20ac" />

# Limitation
* The application is command-line based and does not have a graphical interface.
* It supports only local file-based storage.
* There is no login or multiple-user system.
* The application does not send deadline reminders or notifications.
* Task deadlines are stored as text and are not automatically validated.
* Tasks cannot currently be sorted or filtered by priority or deadline.

# Future Enhancements
* Add a graphical user interface (GUI).
* Add user login and individual accounts.
* Add task search, sorting, and filtering.
* Add automatic deadline reminders and notifications.
* Add calendar integration.
* Replace file storage with a database.
* Add subject-wise progress tracking.
* Develop web or mobile versions of the application.
# Conclusion
StudySync provides a simple way for students to manage academic tasks through a command line interface. The project demonstrates important Java concepts such as classes and objects, ArrayList, methods, exception handling, file handling and object serialisation, while providing persistent local task storage.
