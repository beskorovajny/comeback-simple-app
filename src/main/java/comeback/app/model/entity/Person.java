package main.java.comeback.app.model.entity;

public class Person {
    private long id;
    private String firstName;
    private String lastName;
    private String eMail;
    private char[] password;

    private Person() {}

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return eMail;
    }

    public char[] getPassword() {
        return password;
    }

    public static Builder newBuilder () {
        return new Person().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setId(long id) {
            Person.this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            Person.this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            Person.this.lastName = lastName;
            return this;
        }

        public Builder setMail(String eMail) {
            Person.this.eMail = eMail;
            return this;
        }

        public Builder setPassword(char[] password) {
            Person.this.password = password;
            return this;
        }

        public Person build() {
            return Person.this;
        }
    }

}
