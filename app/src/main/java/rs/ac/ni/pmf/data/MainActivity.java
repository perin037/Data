package rs.ac.ni.pmf.data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import rs.ac.ni.pmf.data.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User _user = new User("Petar", "Petrovic", "pera123");

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        //setContentView(R.layout.activity_main);


        activityMainBinding.textFirstName.setText(_user.getFirstname());
        activityMainBinding.textLastName.setText(_user.getLastname());
        activityMainBinding.textUsername.setText(_user.getUsername());
    }
}