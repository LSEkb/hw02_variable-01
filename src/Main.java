public class Main {
    public static void main(String[] args) {
        // задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        // задача 2
        // в реальной жизни при использовании ввода одинакового числа для исключения
        // случайной ошибки при вводе я бы сделала дополнительную переменную для этой константы - c
        var c = 4;
        dog = dog + c;
        cat = cat + c;
        paper = paper + c;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        // задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        // задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        // задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog  * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);



    }
}