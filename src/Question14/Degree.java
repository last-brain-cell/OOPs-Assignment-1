package Question14;

public class Degree {
    void getDegree() {
        System.out.println("I got a Degree");
    }

    static class UnderGraduate {
        void getDegree() {
            System.out.println("I got an Undergraduate Degree!");
        }
    }

    static class PostGraduate {
        void getDegree() {
            System.out.println("I got a Post Graduate Degree!");
        }
    }

    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getDegree();

        UnderGraduate underGraduateDegree = new UnderGraduate();
        underGraduateDegree.getDegree();

        PostGraduate postGraduateDegree = new PostGraduate();
        postGraduateDegree.getDegree();
    }
}
