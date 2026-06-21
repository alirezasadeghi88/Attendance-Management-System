# 🕒 Attendance Management System

A robust backend solution designed to streamline and manage employee attendance tracking, department organization, user roles, and daily attendance records.

---

## 🚀 Key Features

*   **Employee Management:** Efficiently handle employee profiles and organizational data.
*   **Attendance Tracking:** Precise logging of clock-in and clock-out times via the `AttendanceRecord` service.
*   **Department Organization:** Structured management of employees within different organizational departments.
*   **Role-Based Access Control:** Secure management of user roles and permissions.
*   **Clean Architecture:** Developed with a modular approach to ensure scalability and maintainability.

---

## 🛠 Tech Stack

*   **Language:** Java
*   **Framework:** Spring Framework (IoC & Dependency Injection)
*   **Build Tool:** Maven/Gradle
*   **Version Control:** Git

---

## 📂 Project Structure

The project is organized to maintain a clear separation of concerns:
```text
src/main/java/
├── models/             # Core entities
│   ├── Employee.java    # Employee entity
│   ├── Department.java  # Department entity
│   ├── Role.java        # User role entity
│   ├── User.java        # User authentication/details entity
│   └── Attendance.java  # Attendance model
└── services/           # Business logic
└── AttendanceRecord.java # Service for managing attendance logs
