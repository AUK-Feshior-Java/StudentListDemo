// Group 1

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> Students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;


        while (true) {
            System.out.println("Enter student as \'Name\' \'Surname\' \'birth date\' or Enter to stop ");
            input = sc.nextLine().trim();
            if (input.equals("")) break;

            // Fancy trimming technique
            String temp="";
            for(int i=0;i<input.length();i++)
                if(input.charAt(i) != ' ' || input.charAt(i+1) != ' ')
                    temp += input.charAt(i);

            input = temp;

            // Trimming technique 2
            /*
            while (true){
                int length = input.length();
                input = input.replaceAll("  "," ");
                if (length == input.length()) break;
            }
            */


            String[] splitInput = input.split(" ");

            if (splitInput.length < 3) {
                System.out.println("You entered wrong data!");
                continue;
            }
            try {

                int yearOfBirth = Integer.parseInt(splitInput[2]);
                Students.add(new Student(splitInput[0], splitInput[1], yearOfBirth));

            } catch (Exception ex) {
                System.out.println("You entered wrong birth date!");
            }
        }

        for (Student s : Students) {
            System.out.println(s);
        }

    }
}