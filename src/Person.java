import java.util.Random;

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
        System.out.println("This party is lame.");
    }

    public void askQuestion() {
        System.out.println("Why are there teachers at this party?");
    }
}

class Astronomer extends Person {
    String[] responses = {"I love space travel.", "Pluto is not a planet", "I can't wait for more information to be discovered about Mars."};
    String[] questions = {"What's your favorite planet?", "Do you think Pluto is a planet?", "What do you think about human life on Mars?"};

    public Astronomer(String name, String occupation) {
        super(name, occupation);
    }

    @Override
    public void whatIDo() {
        super.whatIDo();
        System.out.println("I love to study planets.");
    }

    public void answerQuestion() {
        Random rand = new Random();
        System.out.println(responses[rand.nextInt(responses.length)]);
    }

    public void askQuestion() {
        Random rand = new Random();
        System.out.println(questions[rand.nextInt(questions.length)]);
    }
}

class Teacher extends Person {
    private String subject;
    private String[] questions = {"Whats your favorite academic subject?", "Do you like to read?", "Do you like Shakespeare?"};
    private String[] answers = {"I love math.", "I enjoy reading. Historical fiction is my favorite.", "I don't really like Shakespeare."};
    private int answerIndex = 0;
    private int questionIndex = 0;

    public Teacher(String name, String occupation, String subject) {
        super(name, occupation);
        this.subject = subject;
    }

    @Override
    public void whatIDo() {
        super.whatIDo();
        System.out.println("I teach " + subject);
    }

    public void askQuestion() {
        if (questionIndex >= questions.length) questionIndex = 0;
        System.out.println(questions[questionIndex]);
        questionIndex++;
    }

    public void answerQuestion() {
        if (answerIndex >= answers.length) answerIndex = 0;
        System.out.println(answers[answerIndex]);
        answerIndex++;
    }
}
