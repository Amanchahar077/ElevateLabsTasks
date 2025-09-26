📚 Library Management System - Java Console App

📌 About:
This is a simple Library Management System written in Java.  
It allows you to manage:
1️⃣ Books  
2️⃣ Users  
3️⃣ Issue & Return of books  

⚙️ Features:
- Add new books 📖  
- Add new users 👤  
- View all books in the library  
- View all registered users  
- Issue books to users  
- Return books to the library  

📖 Menu Options:
👉 Press 1 → Add a new Book  
👉 Press 2 → Add a new User  
👉 Press 3 → View all Books  
👉 Press 4 → View all Users  
👉 Press 5 → Issue a Book  
👉 Press 6 → Return a Book  
👉 Press 0 → Exit  

🚀 Example Run:
--------------------------------
To add book Press-1  
To add user Press-2  
To view all books Press-3  
To view all users Press-4  
To issue book Press-5  
To return book Press-6  
To Exit Press-0  

Enter choice: 3  
---Books list---  
Book{title='java programming', author='james gosling', id=1, isAvailable=true}  
Book{title='Data structure', author='Robert lafore', id=2, isAvailable=true}  

Enter choice: 5  
Enter book id: 1  
Enter user name: Aman  
---Book successfully issued to: Aman---  

Enter choice: 6  
Enter book id: 1  
---Book successfully returned!!---  

Enter choice: 0  
Exiting...  
--------------------------------

⚠️ Notes:
- If you try to issue an unavailable book, the system will notify you.  
- Returning a book that is already available will give a "Book not found!!" message.  
- Book IDs and User IDs must be unique.  

💻 Requirements:
- Java 8 or above  
- Any IDE or terminal to compile and run the program  

✨ Enjoy managing your Library with this simple Java console app! ✨
