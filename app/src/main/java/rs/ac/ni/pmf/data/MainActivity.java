package rs.ac.ni.pmf.data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import rs.ac.ni.pmf.data.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements UsersHandler {

    //private ActivityMainBinding activityMainBinding;
    private ActivityMainBinding _binding;

    private UsersRepository _userRepository = UsersRepository.INSTANCE;
    private int _currentUser = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
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
    public void prevUser(){
        if(_currentUser > 0){
            _currentUser--;
            _binding.setUser(_userRepository.getUser(_currentUser));
        }
    }
}