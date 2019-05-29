public class Person {
    private String name;
    private String email;


    //Constructor for Person Class Properties//
    public Person (String name, String email) {
        this.name = name;
        this.email = email;
    }

    //getter Methods for Name and email - class Person

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
//
//        //Override equals
//        @Override
//                public boolean equals(Object otherPerson) {
//            if (!(otherPerson instanceof Person)) {
//                return false;
//            } else {
//                person newPerson = (Person) otherPerson;
//                return this.getName().equals(newPerson.getName()) && this.getEmail().equals(newPerson.getEmail());
//            }
//        }


    }

