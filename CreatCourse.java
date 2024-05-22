import java.util.Scanner;

public class CreatCourse{
    Scanner input = new Scanner(System.in);

    String[][] str_courses = new String[20][5];
    double[][] dub_courses = new double[20][5];

    //[20] in count_stu_class = count_of_student_participate_class
    String[][] count_stu_class = new String[20][1];


    protected String teacher_name;
    protected String language;
    protected String start_time;
    protected String end_time;
    protected String exam_time;
    protected double period_course_time;
    protected double session_in_week;
    protected double each_session_time;
    protected double price;
    protected double class_capacity;

    int i=0;
    int count_class = 0;
    public void save_course()
    {
        str_courses[i][0] = teacher_name;
        str_courses[i][1] = language;
        str_courses[i][2] = start_time;
        str_courses[i][3] = end_time;
        str_courses[i][4] = exam_time;

        dub_courses[i][0] = period_course_time;
        dub_courses[i][1] = session_in_week;
        dub_courses[i][2] = each_session_time;
        dub_courses[i][3] = price;
        dub_courses[i][4] = class_capacity;
        i++;
        }
        
        public CreatCourse(String tn, String l, String sr, String e, String ex ,double pt,double w, double et, double p,double cc)
        {
            teacher_name = tn;
            language = l;
            start_time = sr;
            end_time = e;
            exam_time = ex;
            period_course_time = pt;
            session_in_week = w;
            each_session_time = et;
            price = p;
            class_capacity = cc;
        }

        public void show_info()
        {
            for(int j=0 ; j<=i ; j++)
            {
                System.out.println("Inforamation of Course number " + j + ":");
                System.out.println("Teacher name is: " + str_courses[j][0]);
                System.out.println("This course learned " + str_courses[j][1] + "Language.");
                System.out.println("The class will be Start at: " + str_courses[j][2]);
                System.out.println("The class will be end at: " + str_courses[j][3]);
                System.out.println("Exam Time is: " + str_courses[j][4]);
                System.out.println("It takes time about: " + dub_courses[j][0]);
                System.out.println("There are " + dub_courses[j][1] + "session in a week");
                System.out.println("Each session Time: " + dub_courses[j][2]);
                System.out.println("Price of this Course is: " + dub_courses[j][3]);
                System.out.println("class capacity is: " + dub_courses[j][4]);

                System.out.println("Do you want to Participate in thid class?(yes/no)");
                String answer2 = input.next().toLowerCase();
                if(answer2.equals("yes"))
                {
                    //check konim zarfiat dashte bashe
                    if(dub_courses[i][4] !=0)
                    {
                        count_stu_class[count_class][0] = str_courses[i][1];
                        count_class++;
                        //yedone az zarfiat kam mikonim
                        dub_courses[i][4]--;
                        System.out.println("Congradulation you joined in this class!!"); 
                    }
                }
                else if(answer2.equals("no"))
                {
                    System.out.println("You can see other classes...");
                }
                else
                {
                    System.out.println("Invalid input!");
                }

            }
        }
}

    
    

    