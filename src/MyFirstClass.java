public class MyFirstClass {
    public static void main(String[] args) { //psvm - main klasei
        System.out.println("Hello world"); //sout - spausdinimui
          int a = 34;

        //sukurtas objektas
        MyFirstClass myFirstClass = new MyFirstClass();

        //ne statinis kvieciamas statiniame per klases objekta
        myFirstClass.myNotStaticMethod(a);

        //tesiog per varda toje pacioje klaseje - statinio kvietimas
        myStaticMethod();

        float b = 4.6f;
        double c = 2.4;

        boolean d = true;//false

        char e = 'A';

        String f = "This is string";

        System.out.println("labas");
    }

    private void myNotStaticMethod(int numb) {
        System.out.println("Jusu skaicius " + numb);
    }

    private static void myStaticMethod(){
        System.out.println("Cia yra statinis metodas");
    }

}

//git init
//git add .
//git commit -m "tektstas
//git remote ad origin....
//git push -u origin master
//git pull
