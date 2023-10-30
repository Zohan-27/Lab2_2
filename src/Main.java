import java.util.Scanner;

class Website {
    private String name;
    private String description;
    private int yearFounded;

    public Website(String name, String description, int yearFounded) {
        this.name = name;
        this.description = description;
        this.yearFounded = yearFounded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public void displayWebsiteInfo() {
        System.out.println("Website Name: " + name);
        System.out.println("Website Description: " + description);
        System.out.println("Year Founded: " + yearFounded);
    }
}

class Wizard {
    private String name;
    private int level;
    private boolean isStrong;

    public Wizard(String name, int level, boolean isStrong) {
        this.name = name;
        this.level = level;
        this.isStrong = isStrong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isStrong() {
        return isStrong;
    }

    public void setStrong(boolean isStrong) {
        this.isStrong = isStrong;
    }

    public void performMagic() {
        System.out.println("Name of magician: " + name);
        System.out.println("Level of magician: " + level);
        System.out.println("IsStrong:" + isStrong);
    }
}

class Workplace {
    private String companyName;
    private int numberOfEmployees;
    private double revenue;

    public Workplace(String companyName, int numberOfEmployees, double revenue) {
        this.companyName = companyName;
        this.numberOfEmployees = numberOfEmployees;
        this.revenue = revenue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void displayWorkplaceInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println("Revenue: $" + revenue);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Website information:");
        System.out.print("Name: ");
        String websiteName = scanner.nextLine();
        System.out.print("Description: ");
        String websiteDescription = scanner.nextLine();
        System.out.print("Year Founded: ");
        int websiteYearFounded = scanner.nextInt();
        Website website = new Website(websiteName, websiteDescription, websiteYearFounded);

        System.out.println("\nEnter Wizard information:");
        scanner.nextLine();  // Очистка буфера после nextInt()
        System.out.print("Name: ");
        String wizardName = scanner.nextLine();
        System.out.print("Level: ");
        int wizardLevel = scanner.nextInt();
        System.out.print("Is Strong (true/false): ");
        boolean isStrong = scanner.nextBoolean();
        Wizard wizard = new Wizard(wizardName, wizardLevel, isStrong);

        System.out.println("\nEnter Workplace information:");
        scanner.nextLine();  // Очистка буфера после nextBoolean()
        System.out.print("Company Name: ");
        String companyName = scanner.nextLine();
        System.out.print("Number of Employees: ");
        int numberOfEmployees = scanner.nextInt();
        System.out.print("Revenue: ");
        double revenue = scanner.nextDouble();
        Workplace workplace = new Workplace(companyName, numberOfEmployees, revenue);

        // Вывод информации о объектах
        System.out.println("\nWebsite Information:");
        website.displayWebsiteInfo();

        System.out.println("\nWizard Information:");
        wizard.performMagic();

        System.out.println("\nWorkplace Information:");
        workplace.displayWorkplaceInfo();
    }
}
