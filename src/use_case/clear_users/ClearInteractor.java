package use_case.clear_users;

import entity.User;
import use_case.signup.SignupOutputData;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary ClearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.ClearPresenter = clearOutputBoundary;
    }

    public void execute() {
        ArrayList<String> accounts = userDataAccessObject.getnames();
        userDataAccessObject.clear();
        ClearPresenter.prepareSuccessView(accounts);

    }
}
