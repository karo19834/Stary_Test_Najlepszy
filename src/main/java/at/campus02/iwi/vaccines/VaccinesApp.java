package at.campus02.iwi.vaccines;

import java.util.Arrays;

public class VaccinesApp {
    public static void main(String[] args) {

        VaccinationAppointment person1= new VaccinationAppointment();
        VaccinationAppointment person2= new VaccinationAppointment();


        System.out.println( person1.calculateRiskClass(23,false,true,false,true,true));
        System.out.println(Arrays.toString(person1.calculateMonthAndVaccine(23,6)));

        System.out.println(person2.calculateRiskClass(67,true,true,true,true,true));
        System.out.println(Arrays.toString(person2.calculateMonthAndVaccine(67,15)));



    }
}
