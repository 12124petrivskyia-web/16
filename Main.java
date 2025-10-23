
interface Planet {
    void ReportAboutMovement(); 
    void ReportAboutLife();     
}


class Earth implements Planet {
    @Override
    public void ReportAboutMovement() {
        System.out.println("Земля обертається навколо Сонця.");
    }

    @Override
    public void ReportAboutLife() {
        System.out.println("На Землі існує життя.");
    }
}


class Moon implements Planet {
    @Override
    public void ReportAboutMovement() {
        System.out.println("Місяць обертається навколо Землі.");
    }

    @Override
    public void ReportAboutLife() {
        System.out.println("На Місяці життя не виявлено.");
    }
}


public class Main {
    public static void main(String[] args) {

        Planet earth = new Earth();
        Planet moon = new Moon();


        System.out.println("Інформація про планети:\n");

        earth.ReportAboutMovement();
        earth.ReportAboutLife();

        System.out.println();

        moon.ReportAboutMovement();
        moon.ReportAboutLife();
    }

}
