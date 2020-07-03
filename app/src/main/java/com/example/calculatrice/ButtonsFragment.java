package com.example.calculatrice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonsFragment extends Fragment {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonRacine, buttonCarre, buttonSurX, buttonPorcentage,
            button10, buttonC, buttonClearEdite, buttonEqual;
    EditText crunchifyEditText;
    TextView crunchifyLastCalc;

    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view =inflater.inflate(R.layout.fragment_buttons, container, false);
        View view_edit =inflater.inflate(R.layout.fragment_textedit, container, false);
        View view_text =inflater.inflate(R.layout.fragment_textview, container, false);

        button0 = (Button)view.findViewById(R.id.button0);
        button1 = (Button)view.findViewById(R.id.button1);
        button2 = (Button)view.findViewById(R.id.button2);
        button3 = (Button)view.findViewById(R.id.button3);
        button4 = (Button)view.findViewById(R.id.button4);
        button5 = (Button)view.findViewById(R.id.button5);
        button6 = (Button)view.findViewById(R.id.button6);
        button7 = (Button)view.findViewById(R.id.button7);
        button8 = (Button)view.findViewById(R.id.button8);
        button9 = (Button)view.findViewById(R.id.button9);
        button10 = (Button)view.findViewById(R.id.button10);
        buttonAdd = (Button)view.findViewById(R.id.buttonadd);
        buttonSub = (Button)view.findViewById(R.id.buttonsub);
        buttonMul = (Button)view.findViewById(R.id.buttonmul);
        buttonDivision = (Button)view.findViewById(R.id.buttondiv);
        buttonRacine = (Button)view.findViewById(R.id.buttonracine);
        buttonCarre = (Button)view.findViewById(R.id.buttoncarre);
        buttonSurX = (Button)view.findViewById(R.id.buttonsurx);
        buttonPorcentage = (Button)view.findViewById(R.id.buttonporcentage);
        buttonClearEdite = (Button)view.findViewById(R.id.buttoninutile);
        buttonC = (Button)view.findViewById(R.id.buttonclear);
        buttonEqual = (Button)view.findViewById(R.id.buttoneql);
        crunchifyEditText = (EditText)view_edit.findViewById(R.id.edt1);
        crunchifyLastCalc = (TextView)view_text.findViewById(R.id.textlastcalc);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyLastCalc.setText(mValueOne + " +");
                    crunchifyAddition = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyLastCalc.setText(mValueOne + " -");
                mSubtract = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyLastCalc.setText(mValueOne + " X");
                crunchifyMultiplication = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyLastCalc.setText(mValueOne + " /");
                crunchifyDivision = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonRacine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyEditText.setText(Math.sqrt(mValueOne) + "");
                crunchifyLastCalc.setText("√" + Float.toString(mValueOne) + " =");
            }
        });

        buttonCarre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyEditText.setText( mValueOne * mValueOne + "");
                crunchifyLastCalc.setText(mValueOne + "^2" + " =");
            }
        });

        buttonSurX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyEditText.setText( 1 / mValueOne + "");
                crunchifyLastCalc.setText("1/(" + Float.toString(mValueOne)  + ")" + " =");
            }
        });

        buttonPorcentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyEditText.setText( mValueOne / 100 + "");
                crunchifyLastCalc.setText(mValueOne + "%" + " =");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                if (crunchifyAddition) {
                    crunchifyEditText.setText(mValueOne + mValueTwo + "");
                    crunchifyLastCalc.setText(mValueOne + " + " + Float.toString(mValueTwo) + " =");
                    crunchifyAddition = false;
                }

                if (mSubtract) {
                    crunchifyEditText.setText(mValueOne - mValueTwo + "");
                    crunchifyLastCalc.setText(Float.toString(mValueOne) + " - " + Float.toString(mValueTwo) + " =");
                    mSubtract = false;
                }

                if (crunchifyMultiplication) {
                    crunchifyEditText.setText(mValueOne * mValueTwo + "");
                    crunchifyLastCalc.setText(Float.toString(mValueOne) + " X " + Float.toString(mValueTwo) + " =");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision) {
                    crunchifyEditText.setText(mValueOne / mValueTwo + "");
                    crunchifyLastCalc.setText(Float.toString(mValueOne) + " / " + Float.toString(mValueTwo) + " =");
                    crunchifyDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("");
                crunchifyLastCalc.setText("");
            }
        });

        buttonClearEdite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + ".");
            }
        });
        return view;
    }
}
