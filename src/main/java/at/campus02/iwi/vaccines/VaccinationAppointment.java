package at.campus02.iwi.vaccines;

public class VaccinationAppointment {

    public int age;
    public boolean majorIllness;
    public boolean contactOfPregnantPerson;
    public boolean workingInHealthSector;
    public boolean workingInEducationSector;
    public boolean baseRiskFactor;

    public int calculateRiskClass(int age, boolean majorIllness, boolean contactOfPregnantPerson,
                                  boolean workingInHealthSector, boolean workingInEducationSector, boolean baseRiskFactor){

        int rclass = 0;

        rclass += age / 10;
        if (majorIllness){
            rclass += 3;

        }
        if(contactOfPregnantPerson){
            rclass += 2;
        }
        if(workingInHealthSector){
            rclass += 2;
        }
        if(workingInEducationSector){
            rclass += 1;

        }
        if(baseRiskFactor){
            rclass += 1;
        }
        return rclass;
    }

    public String[] calculateMonthAndVaccine (int age, int riskClass){

        String[] erg = new String[2];

        switch(riskClass){
            case 0:
            case 1:
                erg[0] = "July";
                break;
            case 2:
            case 3:
                erg[0] = "June";
                break;
            case 4:
            case 5:
                erg[0] = "Mai";
                break;
            case 6:
                erg[0] = "April";
                break;
            case 7:
            case 8:
                erg[0] = "March";
                break;
            case 9:
                erg[0] = "February";
                break;
            default:
                erg[0] = "January";
                break;
        }

        if(age >= 65 || age < 18){

            erg[1] = "Pfizer";
        }else{
            if(age >= 50){
                erg[1] = "Moderna";
            }else{
                erg[1] = "Astra";
            }
        }

        return erg;
    }



}
