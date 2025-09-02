package the.number.guesser.from.pkg1.to.pkg127;

import java.util.Scanner;

public class TheNumberGuesserFrom1To127 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int choice;

        String set1
                = "  1  3  5  7\n"
                + "  9 11 13 15\n"
                + " 17 19 21 23\n"
                + " 25 27 29 31\n"
                + " 33 35 37 39\n"
                + " 41 43 45 47\n"
                + " 49 51 53 55\n"
                + " 57 59 61 63\n"
                + " 65 67 69 71\n"
                + " 73 75 77 79\n"
                + " 81 83 85 87\n"
                + " 89 91 93 95\n"
                + " 97 99 101 103\n"
                + "105 107 109 111\n"
                + "113 115 117 119\n"
                + "121 123 125 127";
        String set2
                = "  2  3  6  7\n"
                + " 10 11 14 15\n"
                + " 18 19 22 23\n"
                + " 26 27 30 31\n"
                + " 34 35 38 39\n"
                + " 42 43 46 47\n"
                + " 50 51 54 55\n"
                + " 58 59 62 63\n"
                + " 66 67 70 71\n"
                + " 74 75 78 79\n"
                + " 82 83 86 87\n"
                + " 90 91 94 95\n"
                + " 98 99 102 103\n"
                + "106 107 110 111\n"
                + "114 115 118 119\n"
                + "122 123 126 127";
        String set3
                = "  4  5  6  7\n"
                + " 12 13 14 15\n"
                + " 20 21 22 23\n"
                + " 28 29 30 31\n"
                + " 36 37 38 39\n"
                + " 44 45 46 47\n"
                + " 52 53 54 55\n"
                + " 60 61 62 63\n"
                + " 68 69 70 71\n"
                + " 76 77 78 79\n"
                + " 84 85 86 87\n"
                + " 92 93 94 95\n"
                + "100 101 102 103\n"
                + "108 109 110 111\n"
                + "116 117 118 119\n"
                + "124 125 126 127";
        String set4
                = "  8  9 10 11\n"
                + " 12 13 14 15\n"
                + " 24 25 26 27\n"
                + " 28 29 30 31\n"
                + " 40 41 42 43\n"
                + " 44 45 46 47\n"
                + " 56 57 58 59\n"
                + " 60 61 62 63\n"
                + " 72 73 74 75\n"
                + " 76 77 78 79\n"
                + " 88 89 90 91\n"
                + " 92 93 94 95\n"
                + "104 105 106 107\n"
                + "108 109 110 111\n"
                + "120 121 122 123\n"
                + "124 125 126 127";
        String set5
                = " 16 17 18 19\n"
                + " 20 21 22 23\n"
                + " 24 25 26 27\n"
                + " 28 29 30 31\n"
                + " 48 49 50 51\n"
                + " 52 53 54 55\n"
                + " 56 57 58 59\n"
                + " 60 61 62 63\n"
                + " 80 81 82 83\n"
                + " 84 85 86 87\n"
                + " 88 89 90 91\n"
                + " 92 93 94 95\n"
                + "112 113 114 115\n"
                + "116 117 118 119\n"
                + "120 121 122 123\n"
                + "124 125 126 127";
        String set6
                = " 32 33 34 35\n"
                + " 36 37 38 39\n"
                + " 40 41 42 43\n"
                + " 44 45 46 47\n"
                + " 48 49 50 51\n"
                + " 52 53 54 55\n"
                + " 56 57 58 59\n"
                + " 60 61 62 63\n"
                + " 96 97 98 99\n"
                + "100 101 102 103\n"
                + "104 105 106 107\n"
                + "108 109 110 111\n"
                + "112 113 114 115\n"
                + "116 117 118 119\n"
                + "120 121 122 123\n"
                + "124 125 126 127";
        String set7
                = " 64 65 66 67\n"
                + " 68 69 70 71\n"
                + " 72 73 74 75\n"
                + " 76 77 78 79\n"
                + " 80 81 82 83\n"
                + " 84 85 86 87\n"
                + " 88 89 90 91\n"
                + " 92 93 94 95\n"
                + " 96 97 98 99\n"
                + "100 101 102 103\n"
                + "104 105 106 107\n"
                + "108 109 110 111\n"
                + "112 113 114 115\n"
                + "116 117 118 119\n"
                + "120 121 122 123\n"
                + "124 125 126 127";
        System.out.println(set1);
        System.out.println("is your number in this set ?(type 1 for yes and 0 for no)");
        choice = input.nextInt();
        if (choice == 1) {
            num += 1;
        }
        System.out.println(set2);
        System.out.println("is your number in this set ?(type 1 for yes and 0 for no)");
        choice = input.nextInt();
        if (choice == 1) {
            num += 2;
        }
        System.out.println(set3);
        System.out.println("is your number in this set ?(type 1 for yes and 0 for no)");
        choice = input.nextInt();
        if (choice == 1) {
            num += 4;
        }
        System.out.println(set4);
        System.out.println("is your number in this set ?(type 1 for yes and 0 for no)");
        choice = input.nextInt();
        if (choice == 1) {
            num += 8;
        }
        System.out.println(set5);
        System.out.println("is your number in this set ?(type 1 for yes and 0 for no)");
        choice = input.nextInt();
        if (choice == 1) {
            num += 16;
        }
        System.out.println(set6);
        System.out.println("is your number in this set ?(type 1 for yes and 0 for no)");
        choice = input.nextInt();
        if (choice == 1) {
            num += 32;
        }
        System.out.println(set7);
        System.out.println("is your number in this set ?(type 1 for yes and 0 for no)");
        choice = input.nextInt();
        if (choice == 1) {
            num += 64;
        }
        System.out.println("your number is : " + num);
        input.close();
    }
}
