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
public class DataDisplayFragment extends Fragment {

    private TextView resultTextView;
    private double number1Text;
    private double number2Text;
    private double productResult;

    public DataDisplayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View theView = inflater.inflate(R.layout.fragment_data_display, container, false);
        this.resultTextView = (TextView) theView.findViewById(R.id.resultTextView);
        return theView;
    }

    public void multiply(double number1, double number2) {
        this.productResult = number1 * number2;
    }

    public void displayProduct() {
        resultTextView.setText(Double.toString(this.productResult));
    }

    public void setNumber1Text(double number1Text) {
        this.number1Text = number1Text;
    }

    public void setNumber2Text(double number2Text) {
        this.number2Text = number2Text;
    }

}
