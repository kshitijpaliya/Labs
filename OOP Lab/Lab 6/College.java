import java.util.*;

class uni{
    int reg_no,age;
    String name;
    uni(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:" );
        this.name = sc.next();
        System.out.println("Enter registration no:" );
        this.reg_no = sc.nextInt();
        System.out.println("Enter age:" );
        this.age = sc.nextInt();
    }
};
class UG extends uni{
    int sem, fees;
    UG(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter semester:" );
    sem = sc.nextInt();
    System.out.println("Enter fees:" );
    fees = sc.nextInt();
    }
    void disp(){
    System.out.println("Name:"  + this.name);
    System.out.println("Reg No:"  + this.reg_no);    
    System.out.println("Semster:"  + this.sem);
    System.out.println("Fees: " + this.fees);
    }
}
class PG extends uni{
    int sem, fees;
    PG(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter semester:" );
    sem = sc.nextInt();
    System.out.println("Enter fees:" );
    fees = sc.nextInt();
    }
    void disp(){
    System.out.println("Name:"  + this.name);
    System.out.println("Reg No:"  + this.reg_no);
    System.out.println("Semster:"  + this.sem);
    System.out.println("Fees: " + this.fees);
    }
}
public class College {
    public static void main(String args[]){
        UG u=new UG();
        PG p=new PG();
        u.disp();
        p.disp();
    }
}   

