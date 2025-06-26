class EmpolyeeDetail{
    int id;
    String name;
    int salary;
    

    public EmpolyeeDetail(int id,String name,int salary){
      this.id = id;
      this.name= name;
      this.salary = salary;
    }
    void display(){
       System.out.println("Empolyee Id :" + id);
    System.out.println("Empolyee Name :" + name);
    System.out.println("Empolyee Salary :" + salary);
    }
    public static void main(String[]args){
        EmpolyeeDetail emp = new EmpolyeeDetail(101,"Aman singh",50000);
        emp.display();
    }
}