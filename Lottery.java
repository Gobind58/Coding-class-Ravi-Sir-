
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=300 && n<=460){
            System.out.println("Mackbook");
            if(n>300 && n<=380){
                System.out.print("Macbook with M1 chip");
            }else if(n>381 && n<=460){
                System.out.println("Macbook with M2 chip");
            }

        }else if(n>=200 && n<=280){
            System.out.println("Kurkure");
            if(n>200 && n<=240){
                System.out.println("Kurkure Masala");
            }else if(n>241 && n<=280){
                System.out.println("Kurkure Chatpata");
            }    


        }else if(n>=1100 && n<=1500){
            System.out.println("Cycle");
            if(n>1100 && n<=1300){
                System.out.println("Hercules Cycle");
            }else if(n>1301 && n<=1500){
                System.out.println("Atlas Cycle");
            }

        }else if(n>50 && n<=80){
            System.out.println("Bike");
            if(n>50 && n<=65){
                System.out.println("Bullet");
            }else if(n>65 && n<=80){
                System.out.println("Rajdoot");
            }

        }else{
            System.out.println("Bettre luck next time");
        }
        sc.close();
    }
}
