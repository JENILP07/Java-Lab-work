public class Student {
    private int id_no;
    private int no_of_subjects_registered;
    private int[] subject_code;
    private int[] subject_credits;
    private char[] grade_obtained;
    private double spi;

    // Constructor
    public Student(int id_no, int no_of_subjects_registered, int[] subject_code, int[] subject_credits, char[] grade_obtained) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = 0.0; // Initialized to 0, will be calculated later
    }

    // Method to calculate SPI
    public void calculateSPI() {
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 0; i < no_of_subjects_registered; i++) {
            totalCredits += subject_credits[i];

            // Assuming grade points are on a 10-point scale (modify as needed)
            switch (grade_obtained[i]) {
                case 'A':
                    totalGradePoints += 10.0;
                    break;
                case 'B':
                    totalGradePoints += 8.0;
                    break;
                case 'C':
                    totalGradePoints += 6.0;
                    break;
                // Add more cases for other grades as needed
                default:
                    System.out.println("Invalid grade encountered for subject code " + subject_code[i]);
            }
        }

        if (totalCredits > 0) {
            spi = totalGradePoints / totalCredits;
        }
    }

    // Getter method for SPI
    public double getSPI() {
        return spi;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java StudentMain <number_of_students>");
            System.exit(1);
        }

        int n = Integer.parseInt(args[0]);
        Student[] students = new Student[n];

        // Sample data (replace with your data or input from users)
        for (int i = 0; i < n; i++) {
            int id_no = i + 1;
            int no_of_subjects_registered = 3;
            int[] subject_code = {101, 102, 103};
            int[] subject_credits = {3, 4, 3};
            char[] grade_obtained = {'A', 'B', 'A'};

            students[i] = new Student(id_no, no_of_subjects_registered, subject_code, subject_credits, grade_obtained);
            students[i].calculateSPI();
        }

        // Display SPI for each student
        System.out.println("SPI for each student:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + students[i].id_no + ": " + students[i].getSPI());
        }
    }
}
