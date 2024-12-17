import java.util.Scanner;

class NestedFor
    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Types of Programs:\n");
        System.out.println("1. Right Triangle");
        System.out.println("2. Upside-Down Right Triangle");
        System.out.println("3. Upside-Down Inverted Right Triangle");
        System.out.println("4. Upside-Down Inverted Right Triangle");
        System.out.println("5. Letter Up Tri");
        System.out.println("6. Letter sandwich Palindrome Tri");
        System.out.println("7. Inverted Number Down Tri");
        System.out.println("8. Binary 101 Alternating Tri");
        System.out.println("9. Diamond Tri x2");
        System.out.println("10. Stars and Stri... erm letters");
        System.out.println("\n");
        System.out.println("Enter a key");
        int key = sc.nextInt();
        System.out.println("Enter a number");
        int n = sc.nextInt();

        boolean showSystemProperties;

        //If character inputs are taken in -> gotta practice everythin :)
        char c;

        switch (key)
            {
            case 1:
        /*
        Visual Output
        *
        **
        ***
        ****
        *****
         */

                for (int i = 1; i <= n; i++)
                    {
                    for (int j = i; j > 1; j--)
                        {
                        System.out.print("*");
                        }

                    System.out.println();
                    }
                break;

            case 2:
        /*
        Visual Output
        *****
        ****
        ***
        **
        *
         */

                for (int i = n; i > 0; i--)
                    {
                    for (int j = i; j > 0; j--)
                        {
                        System.out.print("*");
                        }

                    System.out.println();
                    }
                break;

            case 3:
            /*
        Visual Output
        *****
         ****
          ***
           **
            *
           */

                for (int i = n; i > 0; i--)
                    {
                    for (int s = n - i; s > 0; s--)
                        {
                        System.out.print(" ");
                        }

                    for (int j = i; j > 0; j--)
                        {
                        System.out.print("*");
                        }

                    System.out.println();
                    }
                break;

            case 4:
            /*
        Visual Output
            *
           **
          ***
         ****
        *****
            */

                for (int i = 1; i <= n; i++)
                    {
                    for (int s = n - i; s > 0; s--)
                        {
                        System.out.print(" ");
                        }

                    for (int j = i; j > 0; j--)
                        {
                        System.out.print("*");
                        }

                    System.out.println();

                    }
                break;

            case 5:
            /*
            Visual Output
            A
            AB
            ABC
            ABCD
            ABCDE
             */
                System.out.print("Enter CHARACTER value to go up to:");
                /*char*/
                c = sc.next().charAt(0);
                for (int i = 65; i <= c; i++)
                    {
                    for (char j = 'A'; j <= i; j++)
                        {
                        System.out.print(j);
                        }

                    System.out.println();

                    }
                break;

            case 6:
            /*
            Visual Output
            A
            ABA
            ABCBA
            ABCDCBA
            ABCDEDCBA
             */
                System.out.print("Enter CHARACTER value to go up to:");
                /*char*/
                c = sc.next().charAt(0);
                for (int i = 65; i <= c; i++)
                    {
                    for (char j = 'A'; j <= i; j++)
                        {
                        System.out.print(j);
                        }

                    for (char k = (char) (i - 1); k >= 'A'; k--)
                        {
                        System.out.print(k);
                        }

                    System.out.println();
                    }
                break;

            case 7:
            /*
            Visual Output
                1
               21
              321
             4321
            54321
             */

                for (int i = 1; i <= n; i++)
                    {
                    for (int s = n - i; s > 0; s--)
                        {
                        System.out.print(" ");
                        }

                    for (int j = i; j > 0; j--)
                        {
                        System.out.print(j);
                        }

                    System.out.println();
                    }
                break;

            case 8:
            /*
            Visual Output
            1
            01
            101
            0101
             */

                for (int i = 1; i <= n; i++)
                    {
                    for (int j = i; j > 0; j--)
                        {
                        if (j % 2 == 0)
                            System.out.print("0");
                        else
                            System.out.print("1");
                        }

                    System.out.println();
                    }
                break;

            case 9:
            /*
            Visual Output
            *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *
            BUT WITH SPACES ON LEFT
             */

                for (int i = 1; i <= n; i++)
                    {
                    for (int s = n - i; s > 0; s--)
                        {
                        System.out.print(" ");
                        }

                    for (int j = i; j > 0; j--)
                        {
                        System.out.print("*");
                        }

                    System.out.println();
                    }

                for (int i = n - 1; i > 0; i--)
                    {
                    for (int s = n - i; s > 0; s--)
                        {
                        System.out.print(" ");
                        }

                    for (int j = i; j > 0; j--)
                        {
                        System.out.print("*");
                        }

                    System.out.println();
                    }

                break;

            case 10:
            /*
            Visual Output
               *
              **A
             ***BA
            ****CBA
            */
                for (int i = 1; i <= n ; i++)
                    {
                    for (int s = n-i; s > 0; s--)
                        {
                        System.out.print(" ");
                        }

                    for (int j = i; j > 0; j--)
                        {
                        System.out.print("*");
                        }

                    for (int k = i+63; k >= 65; k--)
                        {
                        char z = (char) k;
                        System.out.print(z);
                        }

                    System.out.println();
                    }


            }

        //Resolution
        showSystemProperties = true;
        if (showSystemProperties)
            {
            System.out.println("\n\n\n");
            System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
            System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println ("By: Blu");
            System.out.println ("Coded to study for a test & Submitted for Hack Club High Seas on Dec 16th 2024");
            }

    }
}
