package com.fuel_token_creator;

// Dependency - Temboo SDK Version 2.24.0

import com.temboo.Library.Google.Gmail.SendEmail;
import com.temboo.core.TembooSession;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fuel_Token_Creator {
    public static void main(String[] args) {
        try {
            System.out.println("\t\t\t\t\t\t\t\t################################################");
            System.out.println("\t\t\t\t\t\t\t\t#      WELCOME TO Fuel Token Creator           #");
            System.out.println("\t\t\t\t\t\t\t\t################################################");

            menu1();
        } catch (Exception e) {
            System.out.println("\t\t\t\t\t\t\t\tAn Unknown Error Occurred!!!");
        }
    }

    public static void menu1() {
        char[] op = new char[3];
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("\n\t\t\t\t\t\t\t\tFIRST STEP");
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [1] HEALTH SERVICES                                 |");
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [2] AIRPORT, PORT, ELECTRICITY SERVICES             |");
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [3] DEFENCE SERVICES                                |");
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [4] TRANSPORT SERVICES                              |");
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [5] OTHER GOVERNMENT SERVICES                       |");
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [6] OTHER                                           |");
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [0] EXIT                                            |");
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");

            A:
            for (; ; ) {
                System.out.print("\n\t\t\t\t\t\t\t\tSELECT AN OPTION FROM THE BOX ABOVE: ");
                op[0] = input.next().charAt(0);

                if (Character.isDigit(op[0])) {
                    switch (op[0]) {
                        case '0':
                            System.out.println("\n\t\t\t\t\t\t\t\t################################################");
                            System.out.println("\t\t\t\t\t\t\t\t#    Thank You for Using Fuel Token Creator    #");
                            System.out.println("\t\t\t\t\t\t\t\t################################################");
                            System.exit(0);
                            break A;
                        case '1':
                            System.out.println("\n\t\t\t\t\t\t\t\tYour allocated day is Saturday!");
                            menu2(op);
                            break A;
                        case '2':
                            System.out.println("\n\t\t\t\t\t\t\t\tYour allocated day is Sunday!");
                            menu2(op);
                            break A;
                        case '3':
                            System.out.println("\n\t\t\t\t\t\t\t\tYour allocated day is Monday!");
                            menu2(op);
                            break A;
                        case '4':
                            System.out.println("\n\t\t\t\t\t\t\t\tYour allocated day is Tuesday!");
                            menu2(op);
                            break A;
                        case '5':
                            System.out.println("\n\t\t\t\t\t\t\t\tYour allocated day is Wednesday!");
                            menu2(op);
                            break A;
                        case '6':
                            System.out.println("\n\t\t\t\t\t\t\t\tYour allocated day is Thursday / Friday!");
                            menu2(op);
                            break A;
                        default:
                            System.out.println("\t\t\t\t\t\t\t\tInvalid Selection!!!");
                            break;
                    }
                } else {
                    System.out.println("\t\t\t\t\t\t\t\tInvalid Selection!!!");
                }
            }
        } catch (Exception e) {
            System.out.println("\t\t\t\t\t\t\t\tAn Unknown Error Occurred!!!");
        }
    }

    public static void menu2(char[] op) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("\n\t\t\t\t\t\t\t\tSECOND STEP");
            System.out.println("\t\t\t\t\t\t\t\t_________________________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [1] CATEGORY 01                                               |");
            System.out.println("\t\t\t\t\t\t\t\t|     BIKES, THREE-WHEELS                                       |");
            System.out.println("\t\t\t\t\t\t\t\t| ______________________________________________________________|");
            System.out.println("\t\t\t\t\t\t\t\t| [2] CATEGORY 02                                               |");
            System.out.println("\t\t\t\t\t\t\t\t|     CARS, DUAL PURPOSE VEHICLES, LIGHT MOTOR LORRIES          |");
            System.out.println("\t\t\t\t\t\t\t\t| ______________________________________________________________|");
            System.out.println("\t\t\t\t\t\t\t\t| [3] CATEGORY 03                                               |");
            System.out.println("\t\t\t\t\t\t\t\t|     LIGHT MOTOR COACHES                                       |");
            System.out.println("\t\t\t\t\t\t\t\t| ______________________________________________________________|");
            System.out.println("\t\t\t\t\t\t\t\t| [4] CATEGORY 04                                               |");
            System.out.println("\t\t\t\t\t\t\t\t|     MOTOR COACHES                                             |");
            System.out.println("\t\t\t\t\t\t\t\t| ______________________________________________________________|");
            System.out.println("\t\t\t\t\t\t\t\t| [5] CATEGORY 05                                               |");
            System.out.println("\t\t\t\t\t\t\t\t|     HEAVY MOTOR COACHES, HEAVY MOTOR LORRIES                  |");
            System.out.println("\t\t\t\t\t\t\t\t| ______________________________________________________________|");
            System.out.println("\t\t\t\t\t\t\t\t| [0] EXIT                                                      |");
            System.out.println("\t\t\t\t\t\t\t\t_________________________________________________________________");

            B:
            for (; ; ) {
                System.out.print("\n\t\t\t\t\t\t\t\tSELECT YOUR VEHICLE TYPE: ");
                op[1] = input.next().charAt(0);

                if (Character.isDigit(op[1])) {
                    switch (op[1]) {
                        case '0':
                            System.out.println("\n\t\t\t\t\t\t\t\t################################################");
                            System.out.println("\t\t\t\t\t\t\t\t#    Thank You for Using Fuel Token Creator    #");
                            System.out.println("\t\t\t\t\t\t\t\t################################################");
                            System.exit(0);
                            break B;
                        case '1':
                            System.out.println("\n\t\t\t\t\t\t\t\tYour allocated time is 6A.M - 9A.M!");
                            user_details(op);
                            break B;
                        case '2':
                            System.out.println("\n\t\t\t\t\t\t\t\tYour allocated time is 9A.M - 12P.M!");
                            user_details(op);
                            break B;
                        case '3':
                            System.out.println("\n\t\t\t\t\t\t\t\tYour allocated time is 12P.M - 3P.M!");
                            user_details(op);
                            break B;
                        case '4':
                            System.out.println("\n\t\t\t\t\t\t\t\tYour allocated time is 3P.M - 6P.M!");
                            user_details(op);
                            break B;
                        case '5':
                            System.out.println("\n\t\t\t\t\t\t\t\tYour allocated time is 6P.M - 9P.M!");
                            user_details(op);
                            break B;
                        default:
                            System.out.println("\t\t\t\t\t\t\t\tInvalid Selection!!!");
                            break;
                    }
                } else {
                    System.out.println("\t\t\t\t\t\t\t\tInvalid Selection!!!");
                }
            }
        } catch (Exception e) {
            System.out.println("\t\t\t\t\t\t\t\tAn Unknown Error Occurred!!!");
        }
    }

    public static void user_details(char[] op) {
        Scanner input_string = new Scanner(System.in);
        Scanner input_double = new Scanner(System.in);
        String nic, vehicle_no, email;
        double distance;
        LocalDate cur_date = LocalDate.now();
        LocalDate pre_date = LocalDate.parse(LocalDate.parse("" + cur_date).plusDays(-7).toString());
        int c = 0;

        try {
            System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Name: ");
            String name = input_string.nextLine();
            for (; ; ) {
                System.out.print("\t\t\t\t\t\t\t\tEnter Your NIC Number: ");
                nic = input_string.nextLine();
                if (nic.length() == 10 || nic.length() == 12) {
                    break;
                } else {
                    System.out.println("\n\t\t\t\t\t\t\t\tInvalid NIC Number!!!\n");
                }
            }
            System.out.print("\t\t\t\t\t\t\t\tEnter Your Vehicle Number: ");
            vehicle_no = input_string.nextLine();

            System.out.print("\t\t\t\t\t\t\t\tEnter the Average Distance Hoping to Travel: ");
            distance = input_double.nextDouble();

            System.out.print("\t\t\t\t\t\t\t\tEnter Your Email Address: ");
            email = input_string.nextLine();

            File file = new File("user_details.txt");
            Scanner sc = new Scanner(file);
            FileWriter user_details = new FileWriter(file, true);
            user_details.write(nic);
            user_details.write("\n");
            user_details.write(String.valueOf(cur_date));
            user_details.write("\n");
            user_details.close();

            while (sc.hasNextLine()) {
                sc.nextLine();
                c++;
            }
            sc.close();
            System.out.println("\n\t\t\t\t\t\t\t\tYour Details has been saved.");

            for (int i = c; i > 2; i--) {
                String data1 = sc.nextLine();
                if (data1.equals(nic)) {
                    String data2 = sc.nextLine();
                    if (data2.equals(pre_date.toString())) {
                        System.out.println("\n\t\t\t\t\t\t\t\tYou Have Already Used Your Token!");
                        break;
                    }
                    if (!sc.hasNextLine()) {
                        break;
                    }
                }
            }
            sc.close();

            menu3(op, name, nic, vehicle_no, distance, email);
        } catch (IOException e1) {
            System.out.println("\t\t\t\t\t\t\t\tAn Unknown Error Occurred!!!");
            e1.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("\t\t\t\t\t\t\t\tInvalid Input!!!");
        }
    }

    public static void menu3(char[] op, String name, String nic, String vehicle_no, double distance, String email) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("\n\t\t\t\t\t\t\t\tTHIRD STEP");
            System.out.println("\t\t\t\t\t\t\t\t______________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [1] DIESEL                         |");
            System.out.println("\t\t\t\t\t\t\t\t______________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [2] SUPER DIESEL                   |");
            System.out.println("\t\t\t\t\t\t\t\t______________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [3] PETROL - OCTANE 92             |");
            System.out.println("\t\t\t\t\t\t\t\t______________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [4] PETROL - OCTANE 93             |");
            System.out.println("\t\t\t\t\t\t\t\t______________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [5] PETROL - OCTANE 95             |");
            System.out.println("\t\t\t\t\t\t\t\t______________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| [0] EXIT                           |");
            System.out.println("\t\t\t\t\t\t\t\t______________________________________");

            C:
            for (; ; ) {
                System.out.print("\n\t\t\t\t\t\t\t\tSELECT AN OPTION FROM THE BOX ABOVE: ");
                op[2] = input.next().charAt(0);

                if (Character.isDigit(op[2])) {
                    switch (op[2]) {
                        case '0':
                            System.out.println("\n\t\t\t\t\t\t\t\t################################################");
                            System.out.println("\t\t\t\t\t\t\t\t#    Thank You for Using Fuel Token Creator    #");
                            System.out.println("\t\t\t\t\t\t\t\t################################################");
                            System.exit(0);
                            break C;
                        case '1', '2', '3', '4', '5':
                            fuel(op, name, nic, vehicle_no, distance, email);
                            break C;
                        default:
                            System.out.println("\t\t\t\t\t\t\t\tInvalid Selection!!!");
                            break;
                    }
                } else {
                    System.out.println("\t\t\t\t\t\t\t\tInvalid Selection!!!");
                }
            }
        } catch (Exception e) {
            System.out.println("\t\t\t\t\t\t\t\tAn Unknown Error Occurred!!!");
        }
    }

    private static void fuel(char @NotNull [] op, String name, String nic, String vehicle_no, double distance, String email) {
        double litre = 0;

        try {
            switch (op[1]) {
                case '1', '2':
                    if (distance > 0 && distance < 20) {
                        litre = 5;
                    } else if (distance > 20 && distance < 50) {
                        litre = 10;
                    } else if (distance > 50 && distance < 100) {
                        litre = 20;
                    } else {
                        litre = 30;
                    }
                    break;
                case '3', '4':
                    if (distance > 0 && distance < 20) {
                        litre = 10;
                    } else if (distance > 20 && distance < 50) {
                        litre = 20;
                    } else if (distance > 50 && distance < 100) {
                        litre = 50;
                    } else {
                        litre = 100;
                    }
                    break;
                case '5':
                    if (distance > 0 && distance < 20) {
                        litre = 20;
                    } else if (distance > 20 && distance < 50) {
                        litre = 40;
                    } else if (distance > 50 && distance < 100) {
                        litre = 80;
                    } else {
                        litre = 150;
                    }
                    break;
                default:
                    System.out.println("\t\t\t\t\t\t\t\tInvalid Selection!!!");
                    break;
            }
            System.out.println("\t\t\t\t\t\t\t\tYour allocated amount of fuel is " + litre + "L!!!");
            token(op, name, nic, vehicle_no, email, litre);
            email(op, name, nic, vehicle_no, email, litre);
        } catch (Exception e) {
            System.out.println("\t\t\t\t\t\t\t\tAn Unknown Error Occurred!!!");
        }
    }

    public static void token(char @NotNull [] op, @NotNull String name, String nic, String vehicle_no, String email, double litre) {
        try {
            System.out.println("\n\t\t\t\t\t\t\t\tFUEL TOKEN");
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| NAME            - " + name.toUpperCase());
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| NIC             - " + nic);
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| EMAIL           - " + email);
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| VEHICLE NO      - " + vehicle_no);
            switch (op[0]) {
                case '1' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| PROFESSION TYPE - HEALTH SERVICES");
                }
                case '2' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| PROFESSION TYPE - AIRPORT, PORT, ELECTRICITY SERVICES");
                }
                case '3' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| PROFESSION TYPE - DEFENCE SERVICES");
                }
                case '4' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| PROFESSION TYPE - TRANSPORT SERVICES");
                }
                case '5' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| PROFESSION TYPE - OTHER GOVERNMENT SERVICES");
                }
                case '6' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| PROFESSION TYPE - OTHER");
                }
                default -> {
                }
            }
            switch (op[1]) {
                case '1' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| VEHICLE TYPE    - CATEGORY 01");
                }
                case '2' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| VEHICLE TYPE    - CATEGORY 02");
                }
                case '3' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| VEHICLE TYPE    - CATEGORY 03");
                }
                case '4' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| VEHICLE TYPE    - CATEGORY 04");
                }
                case '5' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| VEHICLE TYPE    - CATEGORY 05");
                }
                default -> {
                }
            }
            switch (op[2]) {
                case '1' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| FUEL TYPE       - DIESEL");
                }
                case '2' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| FUEL TYPE       - SUPER DIESEL");
                }
                case '3' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| FUEL TYPE       - PETROL (OCTANE 92)");
                }
                case '4' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| FUEL TYPE       - PETROL (OCTANE 93)");
                }
                case '5' -> {
                    System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
                    System.out.println("\t\t\t\t\t\t\t\t| FUEL TYPE       - PETROL (OCTANE 95)");
                }
                default -> {
                }
            }
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t| FUEL QUOTA      - " + litre + "L");
            System.out.println("\t\t\t\t\t\t\t\t_______________________________________________________");
        } catch (Exception e) {
            System.out.println("\t\t\t\t\t\t\t\tAn Unknown Error Occurred!!!");
        }
    }

    public static void email(char @NotNull [] op, @NotNull String name, String nic, String vehicle_no, String email, double litre) {
        String field1 = null;
        String field2 = null;
        String field3 = null;

        try {
            switch (op[0]) {
                case '1' -> field1 = "HEALTH SERVICES";
                case '2' -> field1 = "AIRPORT, PORT, ELECTRICITY SERVICES";
                case '3' -> field1 = "DEFENCE SERVICES";
                case '4' -> field1 = "TRANSPORT SERVICES";
                case '5' -> field1 = "OTHER GOVERNMENT SERVICES";
                case '6' -> field1 = "OTHER";
                default -> {
                }
            }
            switch (op[1]) {
                case '1' -> field2 = "CATEGORY 01";
                case '2' -> field2 = "CATEGORY 02";
                case '3' -> field2 = "CATEGORY 03";
                case '4' -> field2 = "CATEGORY 04";
                case '5' -> field2 = "CATEGORY 05";
                default -> {
                }
            }
            switch (op[2]) {
                case '1' -> field3 = "DIESEL";
                case '2' -> field3 = "SUPER DIESEL";
                case '3' -> field3 = "PETROL (OCTANE 92)";
                case '4' -> field3 = "PETROL (OCTANE 93)";
                case '5' -> field3 = "PETROL (OCTANE 95)";
                default -> {
                }
            }

            // Create a new Temboo session.
            TembooSession session = new TembooSession("Nureka99", "myFirstApp", "WIm8zBHog1CyS4gT47KdAaN2UjnUvlcl");

            SendEmail sendEmailChoreo = new SendEmail(session);

            // Get an InputSet object for the choreo
            SendEmail.SendEmailInputSet sendEmailInputs = sendEmailChoreo.newInputSet();

            // Set credential to use for execution
            //sendEmailInputs.setCredential("FuelToken");

            // Set inputs
            sendEmailInputs.set_FromAddress("FuelTokenSL@gmail.com");
            sendEmailInputs.set_Username("FuelTokenSL@gmail.com");
            sendEmailInputs.set_Password("llmnutyqlkhiwojy");
            sendEmailInputs.set_ToAddress("" + email);
            sendEmailInputs.set_Subject("Fuel Token Details");
            sendEmailInputs.set_MessageBody(
                    "FUEL TOKEN\n" +
                            "_______________________________________________________\n" +
                            "| NAME             - " + name.toUpperCase() +
                            "\n_______________________________________________________\n" +
                            "| NIC              - " + nic +
                            "\n_______________________________________________________\n" +
                            "| EMAIL            - " + email +
                            "\n_______________________________________________________\n" +
                            "| VEHICLE NO       - " + vehicle_no +
                            "\n_______________________________________________________\n" +
                            "| PROFESSION TYPE  - " + field1 +
                            "\n_______________________________________________________\n" +
                            "| VEHICLE TYPE     - " + field2 +
                            "\n_______________________________________________________\n" +
                            "| FUEL TYPE        - " + field3 +
                            "\n_______________________________________________________\n" +
                            "| FUEL QUOTA       - " + litre + "L" +
                            "\n_______________________________________________________");

            // Execute Choreo
            SendEmail.SendEmailResultSet sendEmailResults = sendEmailChoreo.execute(sendEmailInputs);

            // Print status
            System.out.println(sendEmailResults.get_Success());
        } catch (Exception e) {
            System.out.println("\t\t\t\t\t\t\t\tAn Unknown Error Occurred!!!");
        }
    }
}