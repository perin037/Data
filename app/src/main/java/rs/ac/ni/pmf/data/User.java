package rs.ac.ni.pmf.data;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableInt;

public class User extends BaseObservable {
    private String firstname;
    private String lastname;
    private String username;
    private int age;
    private boolean registered;

    public User(String firstname, String lastname, String username, int age, boolean registered) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.age = age;
        this.registered = registered;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    @Bindable
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    public boolean isRegistered() {
        return registered;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", registered=" + registered +
                '}';
    }

    public void makeOlder(){
        setAge(getAge() + 1);
        Log.i("LOGTAG", "User " + username + " is now " + age + " years old");
    }
}
