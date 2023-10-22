package interface_adapter.clear_users;

import interface_adapter.ViewManagerModel;
import interface_adapter.login.LoginState;
import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ClearViewModel clearViewModel, ViewManagerModel viewManagerModel ) {
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    public void prepareSuccessView(ArrayList<String> name){
        ClearState clearState = clearViewModel.getState();
        clearState.setstate(name);
        clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();

    }
}
