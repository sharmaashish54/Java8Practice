public class StringExamples {

    private int i;
    private int j;

    public StringExamples(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) {

        StringExamples m1 = new StringExamples(10, 20);

        StringExamples m2 = m1;
        m2.i = 111;
        m2.j = 222;

        System.out.println(m1.i + " " + m1.j);


        String s1= "abc";
        String s2= "abc";

        String s3 = new String("abc").intern();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1 == s3);

    }
    

}
