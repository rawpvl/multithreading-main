package task1710;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Person {

    private String name;
    private Sex sex;
    private Date birthdate;

    private Person(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthdate = birthDate;
    }

    public static Person createMale(String name, Date birthDate) {
        return new Person(name, Sex.MALE, birthDate);
    }

    public static Person createFemale(String name, Date birthDate) {
        return new Person(name, Sex.FEMALE, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}

 /*   DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    DateFormat dateFormatPrt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        if (args[0].startsWith("-c")) {
                Date date = null;
                try {
                date = dateFormat.parse(args[3]);
                } catch (ParseException | IndexOutOfBoundsException e) {
                e.printStackTrace();
                }

                if (args[2].startsWith("м")) {
                Person person = Person.createMale(args[1], date);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
                } else {
                Person person = Person.createFemale(args[1], date);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
                }
                }

                if (args[0].startsWith("-u")) {
                int index = Integer.parseInt(args[1]);
                Person person = allPeople.get(index);

                person.setName(args[2]);

                Date date = null;
                try {
                date = dateFormat.parse(args[4]);
                } catch (ParseException e) {
                e.printStackTrace();
                }
                person.setBirthDay(date);

                if (args[3].startsWith("м"))
                person.setSex(Sex.MALE);
                else
                person.setSex(Sex.FEMALE);
                }

                if (args[0].startsWith("-d")) {
                int index = Integer.parseInt(args[1]);
                Person person = allPeople.get(index);

                person.setName(null);
                person.setSex(null);
                person.setBirthDay(null);
                }

                if (args[0].startsWith("-r")) {
                int index = Integer.parseInt(args[1]);
                Person person = allPeople.get(index);
                String s = person.getName() +
                " " +
                (person.getSex() == Sex.MALE ? "м" : "ж") +
                " " +
                dateFormatPrt.format(person.getBirthdate());
                System.out.println(s);
                }

  */