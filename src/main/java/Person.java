public class Person {
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String email;
        private String phoneNumber;


    public Person() {

    }

        public Person(String firstName, String lastName, int age, String address, String email, String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.address = address;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }



        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

    public Person withFirstName(String firstName) {
        if (firstName == null) {
            return this;
        }
        this.firstName = firstName;
        return this;
    }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    public Person withLastName(String lastName) {
        if (lastName == null) {
            return this;
        }
        this.lastName = lastName;
        return this;
    }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    public Person withAge(int age) {
        if (age <= 0) {
            return this;
        }
        this.age = age;
        return this;
    }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Person withAddress(String address) {
            if (address == null) {
                return this;
            }
            this.address = address;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Person withEmail(String email) {
            if (email == null) {
                return this;
            }
            this.email = email;
            return this;
        }


        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Person withPhoneNumber(String phoneNumber) {
            if (phoneNumber == null) {
                return this;
            }
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName +
                    ", lastName='" + lastName +
                    ", age=" + age +
                    ", address='" + address +
                    ", email='" + email +
                    ", phoneNumber='" + phoneNumber +
                    '}';
        }
    }


