// L - Liskov substritution princple - принцип подстановки Барбары Лисков
// функции, которые используют базовый тип, должны иметь возможность использовать подтипы базового типа, не зная об этом.
// простыми словами классы-гаследники не должны противоречить базовому классу. Например, они не могут продоставлять интерфейс уже базового.

/*class Employee {
    accessYoSecureSource() {
        console.log('Access granted');
    }
}

class FrontProgrammer extends Employee {

}
class BackProgrammer extends Employee {

}
// проблема - нужно добавить еще один подкласс, но при этом метод базового не подойдет.
class Designer extends Employee {
    accessYoSecureSource() { // придется переопределять метод базового класса
        console.log('Access denied')
    }
}

function getSecureSource(employee) {
    employee.accessYoSecureSource();
}

getSecureSource(new FrontProgrammer);

getSecureSource(new Designer);*/

// решение - решается на этапе проектирования проекта продумыванием всех уровней абстракции

class Employee {

}
// добавляем промежуточный уровень абстракции:
class ProgrammerDepartment extends Employee {
    accessYoSecureSource() {
        console.log('Access granted');
    }
}

class DesignerDepartment extends Employee {
    isDesigner = true;
}

class FrontProgrammer extends ProgrammerDepartment {

}
class BackProgrammer extends ProgrammerDepartment {

}

class Designer extends DesignerDepartment {
    accessYoSecureSource() { // в этом случае не нарушая принципа и не переписывая методы базового класса, мы можем переопределить метод для подкласса
        console.log('Access denied')
    }
}

function getSecureSource(employee) {
    employee.accessYoSecureSource();
}

getSecureSource(new FrontProgrammer);

getSecureSource(new Designer);