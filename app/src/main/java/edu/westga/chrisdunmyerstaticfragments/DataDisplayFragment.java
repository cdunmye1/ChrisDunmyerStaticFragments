package edu.westga.chrisdunmyerstaticfragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataDisplayFragment extends Fragment {

    private TextView resultTextView;
    private double number1;
    private double number2;
    private double productResult;
    private DataDisplayListener listener;

    interface DataDisplayListener {
        double onDisplay(double number1, double number2);
    }

    public DataDisplayFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (DataDisplayListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View theView = inflater.inflate(R.layout.fragment_data_display, container, false);
        this.resultTextView = (TextView) theView.findViewById(R.id.resultTextView);
        Button addButton = (Button) theView.findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addButtonClicked(v);
            }
        });
        return theView;
    }

    public void multiply() {
        this.productResult = this.number1 * this.number2;
    }

    public void displayProduct() {
        resultTextView.setText(Double.toString(this.productResult));
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    private void addButtonClicked(View v) {
        listener.onDisplay(number1, number2);
    }
}
