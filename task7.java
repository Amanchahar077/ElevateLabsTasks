// You are using Java
import java.sql.*;
import java.util.Scanner;

class EmployeeDBApp {

    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root";  // replace with your MySQL username
    private static final String PASSWORD = "password"; // replace with your MySQL password

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Add Employee
    public void addEmployee(String name, String dept, double salary) {
        String query = "INSERT INTO employee(name, department, salary) VALUES (?, ?, ?)";
        try (Connection con = connect(); PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, name);
            pst.setString(2, dept);
            pst.setDouble(3, salary);
            pst.executeUpdate();
            System.out.println("Employee added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // View Employees
    public void viewEmployees() {
        String query = "SELECT * FROM employee";
        try (Connection con = connect(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + 
                                   " | " + rs.getString("department") + " | " + rs.getDouble("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update Employee
    public void updateEmployee(int id, double newSalary) {
        String query = "UPDATE employee SET salary = ? WHERE id = ?";
        try (Connection con = connect(); PreparedStatement pst = con.prepareStatement(query)) {
            pst.setDouble(1, newSalary);
            pst.setInt(2, id);
            pst.executeUpdate();
            System.out.println("Employee updated successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {
        String query = "DELETE FROM employee WHERE id = ?";
        try (Connection con = connect(); PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Employee deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Main Program
    public static void main(String[] args) {
        EmployeeDBApp app = new EmployeeDBApp();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Employee\n2. View Employees\n3. Update Salary\n4. Delete Employee\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double sal = sc.nextDouble();
                    app.addEmployee(name, dept, sal);
                    break;
                case 2:
                    app.viewEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter New Salary: ");
                    double newSal = sc.nextDouble();
                    app.updateEmployee(id, newSal);
                    break;
                case 4:
                    System.out.print("Enter Employee ID to Delete: ");
                    int delId = sc.nextInt();
                    app.deleteEmployee(delId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
