package selection;

import java.util.Scanner;

public class Selection {

    public static void main(String[] args) {

        int select;
        int am;
        String firstname;
        String lastname;
        int bornyear;
        int importyear;
        char gender;
        String city;
        String addressname;
        int number;
        int tk;
        int students = -1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you want to record");
        int maxstudents = scanner.nextInt();

        int maxcourses = 10;

        Person[] person = new Person[maxstudents];

        double temp2;
        int search;
        int temp, tempp;
        String tempstr;
        do {
            System.out.println("1. Εισαγωγή φοιτητή");
            System.out.println("2. Εμφάνιση όλων των φοιτητών  ");
            System.out.println("3. Αναζήτηση φοιτητή με βάση το AM");
            System.out.println("4. Αναζήτηση φοιτητή με βάση το επώνυμο");
            System.out.println("5. Ποιοι φοιτητές έχουν εισηχθεί στο πανεπιστήμιο κάποια συγκεκριμένη χρονιά");
            System.out.println("6. Ποιοι φοιτητές κατοικούν σε συγκεκριμένη πόλη");
            System.out.println("7. Εμφάνιση του φοιτητή με τα περισσότερα περασμένα μαθήματα");
            System.out.println("8. Εμφάνιση του φοιτητή με τον μεγαλύτερο μέσο όρο");
            System.out.println("9. Εισαγωγή μαθήματος ");
            System.out.println("10. Εμφάνιση φοιτητών που έχουν περάσει κάποιο συγκεκριμένο μάθημα");
            System.out.println("11. Εμφάνιση όλων των μαθημάτων");
            System.out.println("0. Exit   ");
            select = scanner.nextInt();

            switch (select) {
                case 1:

                    if (students == maxstudents) {
                        System.out.println("To much students");
                        break;
                    } else {
                        students++;
                    }

                    System.out.println("Give your AM number");
                    am = scanner.nextInt();

                    System.out.println("Give your first name");
                    firstname = scanner.next();

                    System.out.println("Give your last name");
                    lastname = scanner.next();

                    System.out.println("give the year of your born");
                    bornyear = scanner.nextInt();

                    System.out.println("Give the year of your import in University");
                    importyear = scanner.nextInt();

                    System.out.println("Give your gender(M/F)");
                    gender = scanner.next().charAt(0);

                    Person t = new Person(am, firstname, lastname, bornyear, importyear, gender);
                    System.out.println("Give the name of your city");
                    city = scanner.next();

                    System.out.println("Give the name of your road");
                    addressname = scanner.next();

                    System.out.println("Give the number of your address");
                    number = scanner.nextInt();

                    System.out.println("Give the TK of your city");
                    tk = scanner.nextInt();

                    address tempaddress = new address(city, addressname, number, tk);
                    t.setaddress(tempaddress);

                    person[students] = t;
                    break;
                case 2:
                    if (maxstudents == -1) {
                        System.out.println("No students has been record");
                    } else {
                        for (int i = 0; i <= students; i++) {
                            String q = person[i].toString();
                            System.out.println(q);
                        }
                    }
                    break;
                case 3:

                    if (maxstudents == -1) {
                        System.out.println("No students has been record");
                    } else {
                        System.out.println("What AM do you want to search;");

                        search = scanner.nextInt();
                        temp = -1;
                        for (int i = 0; i <= students; i++) {
                            if (person[i].getam() == search) {
                                temp = i;
                            }
                        }
                        if (temp == -1) {
                            System.out.println("AM not matches with any student.");
                        } else {
                            String w = person[temp].toString();
                            System.out.println(w);
                        }
                    }
                    break;
                case 4:
                    if (maxstudents == -1) {
                        System.out.println("No students has been record");
                    } else {
                        System.out.println("What last name do you want to search;");
                        String search2;
                        search2 = scanner.next();
                        temp = -1;
                        for (int i = 0; i <= students; i++) {
                            if (search2.equals(person[i].getlastname())) {
                                String w = person[i].toString();
                                System.out.println(w);
                                temp = 1;
                            }
                        }

                        if (temp == -1) {
                            System.out.println("Last name does not matches with any student.");
                        }
                    }
                    break;

                case 5:
                    if (maxstudents == -1) {
                        System.out.println("No students has been record");
                    } else {
                        System.out.println("What import year do you want to search;");
                        int search3;
                        search = scanner.nextInt();
                        temp = -1;
                        for (int i = 0; i <= students; i++) {
                            if (person[i].getimportyear() == search) {
                                String w = person[i].toString();
                                System.out.println(w);
                                temp = 1;
                            }
                        }
                        if (temp == -1) {
                            System.out.println("Import year does not matches with any student.");
                        }
                    }
                    break;

                case 6:
                    if (maxstudents == -1) {
                        System.out.println("No students has been record");
                    } else {
                        System.out.println("What city do you want to search;");
                        String search4;
                        search4 = scanner.next();
                        temp = -1;
                        for (int i = 0; i <= students; i++) {
                            if (search4.equals(person[i].newaddress.getcity())) {
                                String w = person[i].toString();
                                System.out.println(w);
                                temp = 1;
                            }
                        }

                        if (temp == -1) {
                            System.out.println("City does not matches with any student.");
                        }
                    }
                    break;

                case 7:
                    if (maxstudents == -1) {
                        System.out.println("No students has been record");
                    } else {
                        int maxpass = -2;
                        tempp = -1;
                        for (int i = 0; i <= students; i++) {
                            temp = 0;
                            if (person[i].getcounter() == -1) {
                                System.out.println("No courses has been record for this student");
                            } else {
                                for (int j = 0; j <= person[i].getcounter(); j++) {
                                    if (person[i].getgrade(j) > 5) {
                                        temp++;
                                    }
                                }

                                if (temp > maxpass) {
                                    tempp = i;
                                }
                            }
                        }
                        if (tempp != -1) {
                            String z;
                            z = person[tempp].toString();
                            System.out.print(z);
                        }
                    }
                    break;

                case 8:
                    if (students == -1) {
                        System.out.println("No students has been record");
                    } else {
                        int mo = -1;

                        tempp = -1;
                        for (int i = 0; i <= students; i++) {
                            temp = 0;
                            if (person[i].getcounter() == -1) {
                                System.out.println("No courses has been record for this student");
                            } else {
                                for (int j = 0; j <= person[i].getcounter(); j++) {
                                    if (person[i].getgrade(j) > 5) {
                                        temp += person[i].getgrade(j);
                                    }
                                }
                                temp = temp / person[i].getcounter();
                                if (temp > mo) {
                                    tempp = i;
                                }
                            }
                        }
                        if (tempp != -1) {
                            String x;
                            x = person[tempp].toString();
                            System.out.print(x);
                        }
                    }
                    break;

                case 9:
                    Course tempcourse;
                    temp = -1;
                    System.out.println("Give AM for the student that you want to set courses.");
                    search = scanner.nextInt();
                    if (students == -1) {
                        break;
                    }

                    for (int i = 0; i <= students; i++) {
                        if (person[i].getam() == search) {
                            temp = i;
                        }

                    }

                    if (temp == -1) {
                        break;
                    } else if (maxcourses == person[temp].getcounter()) {
                        System.out.println("To many courses");
                    } else {
                        int a;
                        do {
                            System.out.println("If you want to add an other cours Press 1.\nIf you want to go back Press 0.");
                            a = scanner.nextInt();
                            switch (a) {

                                case 1:
                                    System.out.println("Give the name of the course");
                                    String coursename = scanner.next();

                                    System.out.println("Give the id of the course");
                                    String coursecode = scanner.next();

                                    System.out.println("Give the semester of the course");
                                    int semester = scanner.nextInt();

                                    System.out.println("Give the ects of the cours");
                                    int ects = scanner.nextInt();

                                    System.out.println("Give the grade of the cours");
                                    double grade = scanner.nextDouble();
                                    tempcourse = new Course(coursename, coursecode, semester, ects, grade);
                                    person[temp].setcourse(tempcourse);
                                    break;
                                default:
                                    System.out.println("Wronge button.");
                                    break;

                            }
                        } while (a != 0);
                    }

                    break;

                case 10:
                    System.out.println("Give the lesson that you want to search");
                    tempstr = scanner.next();
                    temp = -1;

                    for (int i = 0; i <= students; i++) {

                        for (int j = 0; j <= person[i].getcounter(); j++) {

                            if (tempstr.equals(person[i].getcoursename(j))) {

                                if (person[i].getgrade(j) >= 5) {
                                    temp = 1;
                                    String v;
                                    v = person[i].toString();
                                    System.out.print(v);
                                }
                            }

                        }

                    }
                    if (temp == -1) {
                        System.out.println("No match ");
                    }

                    break;

                case 11:
                    if (students == -1) {
                        System.out.println("No students and courses have been record");
                    } else {
                        for (int i = 0; i <= students; i++) {
                            System.out.println(person[i].getfirstname() + "  " + person[i].getlastname());

                            if (person[i].getcounter() == -1) {
                                System.out.println(" No courses has been record to " + person[i].getfirstname() + "  " + person[i].getlastname()+"\n");
                            } else {
                                
                                    tempstr = (person[i].printcourses());
                                    System.out.println(tempstr);

                                }
                            }
                        }
                    
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wronge number");
                    break;
            }

        } while (select != 0);
    }

}
