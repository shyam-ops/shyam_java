class Practicalno1
{
    public static void main(String []argv)
    {
        CompanyData SBJAIN = new CompanyData("Shyam Patil",19,"Male",29);
        SBJAIN.display();
    }

}
class CompanyData
{
    String name;
    int age;
    String gender;
    int empid;

    CompanyData()
    {
        System.out.println("Inside default constructor");
    }
    CompanyData(String nm,int ag,String gd,int id)
    {
        this.name=nm;
        this.age=ag;
        this.gender=gd;
        this.empid=id;
        System.out.println("Inside Parameterized constructor");
    }

    public void display()
    {
        System.out.println("Name -"+ this.name + "Age -"+this.age + "Gender -" + this.gender + "EmployeeId -" + this.empid);
    }
}