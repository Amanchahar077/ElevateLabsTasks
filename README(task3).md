# 📚 Library Management System (CLI-Based in Java)

## 🚀 Project Overview
This is a **Command Line Interface (CLI)-based Library Management System** built using **Java and Object-Oriented Programming (OOP)** concepts.  
It allows you to manage **books** and **users**, issue and return books, and display lists of all registered books and users.  

The project is kept simple to demonstrate OOP design with classes (`Book`, `User`, `Library`) and interactions via a CLI menu.

---

## 🛠️ Features
- ➕ **Add Books** with title, author, and unique ID  
- ➕ **Add Users** with name and user ID  
- 📖 **View all Books** (along with availability status)  
- 👤 **View all Users**  
- 📗 **Issue Books** to users (only if available)  
- 📕 **Return Books** (updates availability)  
- ❌ Prevents issuing unavailable books  
- Simple, interactive **menu-driven CLI**  

---

## 🏗️ Project Structure
- **`Book`** → Represents a book (title, author, ID, availability).  
- **`User`** → Represents a user (name, user ID).  
- **`Library`** → Manages collections of books and users, handles issue/return logic.  
- **`task3`** → Main class containing CLI menu to interact with the system.  

---

## 📂 Example Usage
When you run the program, you’ll see a menu like this:
