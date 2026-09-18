# Problem Statement
Students often have multiple academic tasks such as assignments, projects, submissions and other study activities to manage. Keeping track of these tasks manually can make it difficult to remember deadlines, priorities and completion status.

StudySync aims to provide a simple command line based solution that allows students to create, organize, update and track their academic tasks in one place. The application also stores task information locally so that the data remains available when the program is restarted.

# Scope of the Project

The scope of StudySync includes basic academic task management through a Java command line application.

The system allows users to:

- Add academic tasks
- Record the subject, task name, deadline and priority
- View all available tasks
- Mark tasks as completed
- Delete tasks
- View overall task progress
- Store and retrieve task information using local file storage

The current version focuses on individual student task management and does not include online collaboration, cloud synchronization or multiuser functionality.
Targeted Audience

Primary Users-
* School and college students managing coursework across multiple subjects.
* Students who want a quick, simple, nosetup way to track tasks and deadlines.
* Engineering and computer science students comfortable with a command line interface.

Secondary Users-
* Beginner Java learners studying classes, ArrayList, serialization, menus and exception handling.
* Teachers and evaluators looking for a simple Java project demonstrating core concepts.
* Self learners and online course students managing personal study deadlines.

# High-Level Features
Task Management
- Add Task: Add subject, task name, deadline and priority.
- Show Tasks: View all tasks with their details and status.
- Complete Task: Mark a selected task as Completed.
- Delete Task: Permanently remove a task.
 
Progress Tracking
- Shows total, completed and pending tasks.
- Calculates the overall completion percentage.
- Safely handles an empty task list.
 
Data Persistence
- Saves tasks to tasks.dat using Java Serialisation.
- Automatically saves changes after task operations.
- Loads saved tasks when the application starts.

User Interaction & Reliability
- Uses a six option menu until Exit is selected.
- Handles invalid inputs and task numbers without crashing.
- Provides confirmation messages for operations.

Design Characteristics
- Uses Object Oriented Programming with a serialisable Task class.
- Uses modular methods for each operation.
- Zero external dependencies  requires only a JDK.

# Project Scope
Included-
- Academic task management
- Task priority chronization
- Deadline information
- Completion tracking
- Progress calculation
- Local persistent storage
- Basic input validation
- 
Not Included in Current Version-
- User authentication
- Cloud storage
- Multi-user access
- Notifications and reminders
- Graphical user interface
- Database integration
- Automatic deadline alerts
- Online synchronisation
