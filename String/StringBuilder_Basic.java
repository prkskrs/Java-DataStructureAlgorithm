public class StringBuilder_Basic {
    public static void main(String[] args) {
        // declaration
        StringBuilder sb = new StringBuilder("Apna College");
        System.out.println(sb);

        // get a char from index
        StringBuilder sc = new StringBuilder("Tony");
        System.out.println(sc.charAt(0));

        // set a char at index
        sc.setCharAt(0, 'P');
        System.out.println(sc);

        //Insert a char at some index
        //Insert char
        sc.insert(0, 'S');
        System.out.println(sc);

        //delete char at some index
        //delete char
        sc.delete(0, 1);
        System.out.println(sc);

        //append
        sc.append(" Stark");
        System.out.println(sc); 

        //length
        System.out.println(sc.length());

        



        

    }
}
