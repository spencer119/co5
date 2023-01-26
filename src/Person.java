abstract class Person {
    private String name;
    private String occupation;

    public Person(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public void askName() {
        System.out.println("What is your name?");
    }

    public void giveName() {
        System.out.println("My name is " + name);
    }

    public void whatIDo() {
        System.out.println("I am a " + occupation);
    }

    public abstract void askQuestion();

    public abstract void answerQuestion();
}

class Teenager extends Person {
    String[] responses = {};

    public Teenager(String name, String occupation) {
        super(name, occupation);
    }


    public void answerQuestion() {

    }

    public void askQuestion() {

    }
}

class Astronomer extends Person {
    String[] responses = {};

    public Astronomer(String name, String occupation) {
        super(name, occupation);
    }

    @Override
    public void whatIDo() {
        super.whatIDo();
        System.out.println("I love to study planets.");
    }

    public void answerQuestion() {
        int index = (int) (Math.random() * responses.length);
        System.out.println(responses[index]);
    }

    public void askQuestion() {

    }
}

class Teacher extends Person {
    String[] responses = {};
    private String subject;

    public Teacher(String name, String occupation, String subject) {
        super(name, occupation);
        this.subject = subject;
    }

    @Override
    public void whatIDo() {
        super.whatIDo();
        System.out.println("I teach " + subject);
    }

    public void answerQuestion() {

    }

    public void askQuestion() {

    }
}
