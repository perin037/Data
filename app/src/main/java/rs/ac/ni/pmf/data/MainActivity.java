package rs.ac.ni.pmf.data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Button;

import rs.ac.ni.pmf.data.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private User _user = new User("Petar", "Petrovic", "pera123", 20, false);
    private User _user2 = new User("Mika", "Mikic", "mika123", 30, true);

    //private ActivityMainBinding activityMainBinding;
    private ActivityMainBinding _binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        _binding.setUser(_user);

        Button button = findViewById(R.id.buttonChange);
        button.setOnClickListener(view -> changeUser());
    }

    private void changeUser() {
        _binding.setUser(_user2);
    }
}