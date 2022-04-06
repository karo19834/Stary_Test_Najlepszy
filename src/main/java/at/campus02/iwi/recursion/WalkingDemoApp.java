package at.campus02.iwi.recursion;

public class WalkingDemoApp {

    public static void main(String[] args) {

        walk(5,1);

    }

    public static void walk (int countSteps, int currentStep) {

     if(currentStep==0){
         return;
     }
     if(currentStep<countSteps){
         System.out.println("Step forward:"+ currentStep);
         walk(countSteps,  ++currentStep);
     }else {
         countSteps=0;

         System.out.println("Step backward:"+ currentStep);
         walk(countSteps, --currentStep);
     }

    }

}
