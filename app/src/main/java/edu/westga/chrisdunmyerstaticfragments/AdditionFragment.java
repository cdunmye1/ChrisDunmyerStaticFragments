package edu.westga.chrisdunmyerstaticfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdditionFragment extends Fragment {

    private TextView sumResultTextView;
    private double number1;
    private double number2;
    private double sumResult;

    public AdditionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View theView = inflater.inflate(R.layout.fragment_addition, container, false);
        this.sumResultTextView = (TextView) theView.findViewById(R.id.sumResultTextView);
        return theView;
    }

    public void add() {
        this.sumResult = this.number1 + this.number2;
    }

    public void displaySum() {
        sumResultTextView.setText(Double.toString(this.sumResult));
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
}
