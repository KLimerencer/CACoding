package interface_adapter.clear_users;


import interface_adapter.login.LoginState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

import interface_adapter.ViewModel;
import use_case.clear_users.ClearOutputData;

public class ClearViewModel extends ViewModel{

    private Object accounts;
    private ClearState state = new ClearState();

    public ClearViewModel() {
        super("clear");
    }

    public ClearViewModel(String viewName) {
        super(viewName);
    }

    public void setState(ClearState state) {
        this.state = state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    // This is what the Signup Presenter will call to let the ViewModel know
    // to alert the View
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() {
        return state;
    }

    public String names(){
        return String.join("\n", state.getstate());
    }
}
