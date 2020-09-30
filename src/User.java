public class User {
    public String firstName;
    public String lastName;
    public String userName;
    public String passWord;

    public User(String firstName, String lastName, String userName, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.passWord = passWord;
        }
        public String getFirstName () {
            return firstName;
        }
        public void setFirstName (String firstName){
            this.firstName = firstName;
        }
        public String getLastName () {
            return lastName;
        }
        public void setLastName (String lastName){
            this.lastName = lastName;
        }
        public String getUserName () {
            return userName;
        }
        public void setUserName (String userName){
            this.userName = userName;
        }
        public String getPassword () {
            return passWord;
        }
        public void setPassWord (String passWord){
            String specialCharacter = ("~`!@#$%^&*%");
            if (passWord.length() >= 10 && passWord.contains(specialCharacter)) {
                this.passWord = passWord;
            } else
                System.out.println("ERROR:Invalid Password");
        }

    }
 