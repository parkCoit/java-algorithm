package 수학;
import java.util.*;

class 비만도 {
    public static void main(String[] args) {
        비만도 solution = new 비만도();
        Scanner scanner = new Scanner(System.in);
        System.out.println( "이름 :" );
        String name = scanner.next();
        System.out.println( " 키 : " );
        float cm = scanner.nextFloat();
        System.out.println( " 몸무게 : " );
        float kg = scanner.nextFloat();
        System.out.println(solution.solution(name, cm, kg));
    }
    String solution(String name, float cm, float kg) {
        String title = " ### 비만도 계산 ### ";
        Float m = cm / 100;
        Float bmi =  kg / (m * m) ;
        String biman = "";
        if(bmi >= 35 ){biman = "고도비만";}
        else if(bmi >= 30.0){biman = "중도비만";}
        else if(bmi >= 25.0){biman = "경도비만";}
        else if(bmi >= 23.0){biman = "과체중";}
        else if(bmi >= 18.5){biman = "정상";}
        else { biman = "저체중";}
        return String.format(
        "%s \n***************************"
        +"이름 키(cm) 몸무게(kg) 비만도"
        +"***************************"
        +"%s %.1f %.1f %s"
        +"***************************", title, name, cm, kg, biman );
    }
}