public class MyExeption extends Exception{
    private String email;

    public String getEmail() {
        return email;
    }

    MyExeption(String msg, String email){
        super(msg);
        this.email = email;
    }
}
