package rs.ac.ni.pmf.data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import rs.ac.ni.pmf.data.databinding.ActivityUserDetailsBinding;


public class UserDetailsActivity extends AppCompatActivity implements UsersHandler {

    //private ActivityMainBinding activityMainBinding;
    private ActivityUserDetailsBinding _binding;

    private UsersRepository _userRepository = UsersRepository.INSTANCE;
    private int _currentUser = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_user_details);

        _binding = DataBindingUtil.setContentView(this, R.layout.activity_user_details);
        _binding.setUser(_userRepository.getUser(_currentUser));
        _binding.setUsers(_userRepository.getUsers());
        _binding.setHandlers(this);

        //Button button = findViewById(R.id.button_next);
        //button.setOnClickListener(view -> nextUser());
    }

    @Override
    public void nextUser() {
        if(_currentUser < _userRepository.count() - 1){
            _currentUser++;
            _binding.setUser(_userRepository.getUser(_currentUser));
        }
    }

    @Override
    public void toastValue(boolean value) {
        Toast.makeText(this, "Value: " + String.valueOf(value), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void prevUser(){
        if(_currentUser > 0){
            _currentUser--;
            _binding.setUser(_userRepository.getUser(_currentUser));
        }
    }
}