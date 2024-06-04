public class stringjava {
    public static void main(String[] args) {
        String str1 = "hello sir";
        int length = str1.length();
        System.out.println("lennght"+length);

        String str2 ="bye sir ";
        String con = str1+str2;
        System.out.println("Concatrned"+con);

        String subString=str1.substring(3,7);
        System.out.println("substring"+subString);

        String uppercase= str1.toUpperCase();
        String lowercase= str2.toLowerCase();
        System.out.println(lowercase);
        System.out.println(uppercase);

        String rep = str2.replace("sir ", "madam");
        System.out.println(rep);

    }
    
}
