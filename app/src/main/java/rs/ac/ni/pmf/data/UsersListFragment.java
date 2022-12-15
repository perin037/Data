package rs.ac.ni.pmf.data;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class UsersListFragment extends ListFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        setListAdapter(new UsersListAdapter(getActivity(), UsersRepository.INSTANCE.getUsers()));
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        final User _selectedUser = UsersRepository.INSTANCE.getUser((int)id);
        Log.i("LOGTAG", "User " + _selectedUser.toString());
    }
}
