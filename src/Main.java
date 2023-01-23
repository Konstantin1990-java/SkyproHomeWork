public class Main {
    public static void main(String[] args) {
        //задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //задача 6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println("Общий вес двух бойцов " + (boxerWeight1 + boxerWeight2));
        System.out.println("Разница веса двух бойцов " + (boxerWeight2 - boxerWeight1));
        //задача 7
        System.out.println("Разница веса двух бойцов " + (boxerWeight2 - boxerWeight1));
        System.out.println("Разница веса двух бойцов " + (boxerWeight2 % boxerWeight1));
        //задача 8
        var totalTimeWorking = 640;
        var totalTimeEmployee = 8;
        var totalCompanyEmployee = totalTimeWorking / totalTimeEmployee;
        System.out.println("Всего работников в компании — " + totalCompanyEmployee + " человек.");
        totalCompanyEmployee = totalCompanyEmployee + 94;
        totalTimeWorking = totalCompanyEmployee * totalTimeEmployee;
        System.out.println("Если в компании работает " + totalCompanyEmployee + " человек, то всего "
        + totalTimeWorking + " часов работы может быть поделено между сотрудниками");


    }
}