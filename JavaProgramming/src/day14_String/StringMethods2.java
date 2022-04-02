package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");//"Python is fun, I love programming Python."

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = " JohnSmith@yahoo.com";
        email = email.replace("yahoo","gmail");//"JohnSmith@gmail.com

        System.out.println("email = " + email);
        
        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python",""); //"Java Java C# C# C++ C++
                           
        System.out.println("sentence2 = " + sentence2);

        System.out.println("==================");
        
        String s = "Dog Dog Dog Dog Dog Dog ";
        s = s.replace("Dog","Cat");
        System.out.println("s = " + s);
        
        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace("C# is f "," Java is ");
        System.out.println("s2 = " + s2);
        
        String s3 = "Java";
        s3 = s3.replace("a","e");
        System.out.println("s3 = " + s3);

        System.out.println("===============================");
        
        String result = "Java Java Java";
        result = result.replace("Java","Python");
        System.out.println("result = " + result);

        String result1 = "Java Java Java";
        result1 = result1.replaceFirst("Java","Python");
        System.out.println("result1 = " + result1);
        
        String result2 = "C# is fun, C# is cooler.";
        result2 = result2.replaceFirst(" C# ","Java ");
        System.out.println("result2 = " + result2);

        
        
    }
}
