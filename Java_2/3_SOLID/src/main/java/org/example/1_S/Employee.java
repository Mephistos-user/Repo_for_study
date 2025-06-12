// 1. Принцип единственной ответственности (Single Responsibility Principle - SRP):
/*
public class Employee {
    public void calculateSalary() {
        // вычисление зарплаты
    }
    public void saveEmployeeData() {
        // сохранение данных о сотруднике
    }
    public void generateReport() {
        // генерация отчета о сотруднике
    }
}
*/
// В этом примере класс Employee нарушает принцип единственной ответственности, так как содержит методы, отвечающие за разные аспекты работы с сотрудниками.
// Рефакторинг:
public class Employee {
    private String name;
    private Integer age;
}
public class CalculateSalary {
        public void calculateSalary(Employee employee) {
        // вычисление зарплаты
    }
}
public class EmployeeRepository {
    public void saveEmployeeData(Employee employee) {
        // сохранение данных о сотруднике
    }
}
public class EmployeeReport {
    public void generateReport(Employee employee) {
        // генерация отчета о сотруднике
    }
}
// Каждый класс теперь отвечает только за одну конкретную область ответственности.