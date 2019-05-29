public class Person {

    public Person () {
        private String name;
        private String email;

        //Constructor for Person Class Properties
        public  Person(String name, String email) {
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

    }
}
