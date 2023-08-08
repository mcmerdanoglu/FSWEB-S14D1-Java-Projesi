package ClassFolder.Company;

public class HRManager extends Employee {
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary, JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper junior) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = junior;
            } else System.out.println("index "+ index + " has another junior dev data");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("junior dev index can not be reached" + exception.getMessage());
        }
    }

    public void addEmployee(int index, MidDeveloper mid){
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = mid;
            } else System.out.println("index has another mid dev data");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("mid dev index can not be reached" + exception.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper senior){
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = senior;
            } else System.out.println("index has another senior dev data");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("senior dev index can not be reached" + exception.getMessage());
        }
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    /* Employee classında work methodunu dinamik yaptığım için gerek kalmadı
    @Override
    public void work() {
        super.work();
    }*/
}
