📝 Notes Manager - Java Console App

📌 About:
This is a simple Notes Manager application written in Java. 
It allows you to:
1️⃣ Create and write a note to a file.
2️⃣ Read an existing note from a file.
3️⃣ Exit the program when finished.

⚙️ How It Works:
- The program runs in a loop until you choose to exit.
- You can give any filename while writing or reading notes.
- Notes are stored as plain text files.

📖 Menu Options:
👉 Press 1 → Write a new note (creates/overwrites the file).
👉 Press 2 → Read an existing note (displays contents on console).
👉 Press 0 → Exit the application.

🚀 Example Run:
--------------------------------
---Welcome to notes manager---
To write note Press-1
To read note Press-2
To exit Press-0

Enter choice: 1
Enter Note name you want to write: mynote.txt
Enter your note in string: Hello World! 🌍
---File successfully created!!---

Enter choice: 2
Enter Note name you want to read: mynote.txt
Reading...Hello World! 🌍
---File successfully read!!---

Enter choice: 0
Exiting...
--------------------------------

⚠️ Important:
- If you enter a filename that does not exist while reading, 
  an error will be shown.
- Writing a note will overwrite the existing content 
  of the file with the same name.

💻 Requirements:
- Java 8 or above
- Any IDE or terminal to run the program

✨ Enjoy taking notes with your own Java Notes Manager! ✨
