// Інтерфейс Planet
interface Planet {
    void ReportAboutMovement(); // повідомляє, навколо чого рухається
    void ReportAboutLife();     // повідомляє про наявність життя
}

// Клас Earth, який реалізує Planet
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

// Клас Moon, який реалізує Planet
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

// Головний клас програми
public class Main {
    public static void main(String[] args) {
        // Використовуємо поліморфізм — змінні типу Planet
        Planet earth = new Earth();
        Planet moon = new Moon();

        // Викликаємо методи (поліморфізм у дії)
        System.out.println("Інформація про планети:\n");

        earth.ReportAboutMovement();
        earth.ReportAboutLife();

        System.out.println();

        moon.ReportAboutMovement();
        moon.ReportAboutLife();
    }
}