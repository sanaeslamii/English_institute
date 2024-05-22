import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {


        System.out.println("Welcome to the Instute!!!");
        Menu();
        
    }
    public static void Menu()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Here we have main Menu:\nSelect the option:\n1.Register  2.Log in  3.Exit\n");
        int x = 0;
        do{
        x = input.nextInt();
        if(x==1 || x==2)
            identity(x);
        else if(x==3)
            System.out.println("Bye!Hope to see you soon again...");
        else
            System.out.println("You has been Entered invalid input.try again!");
    }while(x>3);

    input.close();

    }
    public static void identity(int x){

        Scanner input = new Scanner(System.in);
        System.out.println("Choose your role...\n1.Student 2.Teacher 3.Return 4.Exit");
        
        int y=0;
        do{
            y = input.nextInt();
            if(y==1 || y==2)
            {
                Student st = new Student(input.next(), input.nextInt(), input.next(), input.next());
                Teacher t = new Teacher(input.next(), input.nextInt(), input.next(), input.next());

                //register student
                if(x==1 && y==1)
                {
                    st.save_inform();
                    Situation2();
                }

                //register Teacher
                else if(x==1 && y==2)
                {
                    t.save_inform();
                    Situation();
                }

                //Log in Student
                else if(x==2 && y==1)
                {
                    System.out.print("Enter your Email: \n");
                    String email_person = input.next();

                    System.out.print("Enter your Password: \n");
                    String password_person = input.next();

                    st.check_inform(email_person, password_person);
                    Situation2();
                }

                //Log in Teacher
                else
                {
                    System.out.print("Enter your Email: \n");
                    String email_person = input.next();

                    System.out.print("Enter your Password: \n");
                    String password_person = input.next();

                    t.check_inform(email_person, password_person);
                    Situation();
                }
            }
            else if(y==3)
                Menu();

            else
                System.out.println("Bye! Hope to see you soon again...");
        }while(y>4);

        input.close();
    }
    //Situation Teacher
    public static void Situation()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose option: 1.Create class  2.Return Back  3.Log out");
        int answer = 0;

        do{
            answer = input.nextInt();
            if(answer == 1)
            {
                CreatCourse n_course = new CreatCourse(input.next(), input.next(), input.next(),input.next(), input.next(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
                n_course.save_course();
            }
            else if(answer == 2)
            {
                Menu();
            }
            else
            {
                System.out.println("Bye...You were Logged Out!");
            }
        }while(answer>3);

        input.close();
    }

    //Situation Student
    public static void Situation2()
    {
        Scanner input = new Scanner(System.in);
        CreatCourse n_course = new CreatCourse(input.next(), input.next(), input.next(),input.next(), input.next(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());

        System.out.println("Choose option: 1.See all Courses  2.Return Back  3.Log out");

        int answer = 0;
        do{
            answer = input.nextInt();
            if(answer == 1)
            {
                n_course.show_info();
            }
            else if(answer == 2)
            {
                Menu();
            }
            else
            {
                System.out.println("Bye...You were Logged Out!");
            }
                
        }while(answer>3);


        input.close();
    }  
}
