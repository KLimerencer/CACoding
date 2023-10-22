package interface_adapter.clear_users;

import interface_adapter.signup.SignupState;
import use_case.clear_users.ClearOutputData;

import java.util.ArrayList;

public class ClearState {
    private ArrayList username;

    // Because of the previous copy constructor, the default constructor must be explicit.
    public ClearState(){}


    public void setstate(ArrayList<String> accounts) {
        username = accounts;}

    public ArrayList<String> getstate(){
        return username;}}