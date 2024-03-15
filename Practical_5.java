 /*
Aim: Practical No.5   Author: Shyam Patil
USN: AD22030          Date: 20 Feb,2024
*/
class Emerging_Technologie {
    String principle;
    String vicePresident;
    String secretary;
    String jointSecretary;
    String treasurer;

    Emerging_Technologie(String principle, String vicePresident, String secretary, String jointSecretary,
            String treasurer) {
        this.principle = principle;
        this.vicePresident = vicePresident;
        this.secretary = secretary;
        this.jointSecretary = jointSecretary;
        this.treasurer = treasurer;
    }

    void forum() {
        System.out.println("Principle: " + principle);
        System.out.println("Vice President: " + vicePresident);
        System.out.println("Secretary: " + secretary);
        System.out.println("Joint Secretary: " + jointSecretary);
        System.out.println("Treasurer: " + treasurer);
    }
}

class AIML extends Emerging_Technologie {
    AIML(String principle, String vicePresident, String secretary, String jointSecretary, String treasurer) {
        super(principle, vicePresident, secretary, jointSecretary, treasurer);
    }
}

class AIDS extends Emerging_Technologie {
    AIDS(String principle, String vicePresident, String secretary, String jointSecretary, String treasurer) {
        super(principle, vicePresident, secretary, jointSecretary, treasurer);
    }
}

class CSE extends Emerging_Technologie {
    CSE(String principle, String vicePresident, String secretary, String jointSecretary, String treasurer) {
        super(principle, vicePresident, secretary, jointSecretary, treasurer);
    }
}

public class Practical_5 {
    public static void main(String[] args) {
        // Creating objects for each child class
        AIDS aids = new AIDS("shyam patil", "Nirbhay Ghagre", "Bhavesh More", "Pranay Borekar", "Ishant Morghade");
        AIML aiml = new AIML("shyam patil", "Harsh Meshram", "Kunal Bhelwa", "Abhishek Barai", "Nupur Kuhite");
        CSE cse = new CSE("shyam patil", "Harish Shettiyer", "Samarth Sharma", "Prajwal Bhopre", "Shyam Patil");

        // Calling forum function for each object
        System.out.println("AIDS Forum:");
        aids.forum();
        System.out.println("\nAIML Forum:");
        aiml.forum();
        System.out.println("\nCSE Forum:");
        cse.forum();
    }
}