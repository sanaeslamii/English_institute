public class Classes {

    //etelaat Baray sabtname , log in ostad , daneshjo;
    String[][] string_inform = new String[20][2];
    int[] int_inform = new int[1];

    int i=0;
    protected String full_name;
    protected int age;
    protected String email;
    protected String password;

    public Classes(String n, int a, String e , String p )
    {
        full_name = n;
        age = a;
        email = e;
        password = p;
    }
    public void save_inform()
    {
        string_inform[i][0] = full_name;
        string_inform[i][1] = email;
        string_inform[i][2] = password;
        int_inform[0] = age;
        i++;
    }

    public int check_inform(String email_person , String password_person)
    {
        for(int i=0 ; i<20 ; i++)
        {
            if(string_inform[i][1].equals(email_person) && string_inform[i][2].equals(password_person))
            {
                System.out.println("Welcome in! You Entered Succesfully...");
                return 1;
            }
        }
        System.out.println("Something went Wrong,The information entered does not match!!!");
        return 0;
    }

}


class Student extends Classes{

    public Student(String n, int a, String e , String p)
    {
        super(n, a, e, p);
    }

}
class Teacher extends Classes{

    public Teacher(String n, int a, String e , String p)
    {
        super(n, a, e, p);
    }
}
