
public class Driver {

    public static void main(String[] args) {

        ArrayProcessor ap = new ArrayProcessor();

        Object[] arr = {"Java", "Python", "C++", "C#"};

        int length = ap.getArrayLength(arr);

        System.out.println("Array length = " + length);

    }
}