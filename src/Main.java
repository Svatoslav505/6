import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Student first = new Student("Bob", 20);
        Student second = new Student("Alice", 22);
        Student third = new Student("Jack", 20);
        Student fourth = new Student("Svyat", 25);

        Student[] myList = new Student[]{first, second, third, fourth};
        selectionSort(myList);
    }
    public static void selectionSort(Student[] list)
    {
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i].name);
        }
        for (Student st: list) {
            System.out.println(st.name);
        }
        Arrays.stream(list).forEach( student -> System.out.println(student.name) );

        int min;
        Student temp;
        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }

//        Arrays.stream(list).forEach( student -> System.out.println(student.name) );
    }

}
