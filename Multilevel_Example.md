Write a Python program to demonstrate Multilevel Inheritance using the classes Employee, Manager, and SeniorManager.

Class Structure
1. Base Class: Employee  :
Create a class named Employee with the following attributes:
                emp_id → Employee ID
                name → Employee Name
                salary → Employee Salary
Methods:
          
            calculate_annual_bonus() :Calculates and displays the annual bonus as 10% of salary.
            promote() : Increases the employee salary by 5000 and displays the updated salary.
            display_info():  Displays employee details such as ID, name, and salary.

2. Derived Class: Manager

Create a class named Manager that inherits from Employee.

Additional Attributes:
            department → Department name
            projects_handled → List of projects handled by the manager
Additional Methods:
            assign_project(project) : Adds a new project to the manager’s project list.
            display_manager_info() : Displays all employee details along with manager-specific information.

3. Derived Class: SeniorManager

Create a class named SeniorManager that inherits from Manager.

Additional Attributes:
                team_size → Number of employees in the team
                initial_approved_budget → Maximum budget approval limit
Additional Methods:
approve_budget(amount): Approves the budget if the amount is within the approved limit; otherwise displays an error message.
display_senior_manager_info() :Displays complete senior manager details including employee, manager, and senior manager information.

Requirements
            Use constructors (__init__) to initialize all attributes.
            Use the super() function to call parent class constructors.
            Demonstrate multilevel inheritance properly.


Employee:
101 Rahul 50000

Manager:
201 Sneha 80000 IT Website_Project

SeniorManager:
301 Amit 120000 Operations ERP_System 25 500000


Employee ID: 101
Name: Rahul
Salary: 50000
Annual Bonus: 5000.0
Rahul has been promoted!
New Salary: 55000




Employee ID: 201
Name: Sneha
Salary: 80000
Department: IT
Projects Handled: ['Website_Project']
Project assigned: Mobile App



Employee ID: 301
Name: Amit
Salary: 120000
Department: Operations
Projects Handled: ['ERP_System']
Team Size: 25
Approved Budget Limit: 500000
Budget Approved: 300000
Budget exceeds approval limit!

