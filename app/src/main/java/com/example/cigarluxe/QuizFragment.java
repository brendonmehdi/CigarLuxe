package com.example.cigarluxe;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.cigarluxe.model.QuestionAnswer;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link QuizFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuizFragment extends Fragment {
    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC;

    Button submitBtn;
    int totalQuestions;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    String strength = "";
    String flavour = "";
    String cost = "";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public QuizFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment QuizFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QuizFragment newInstance(String param1, String param2) {
        QuizFragment fragment = new QuizFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);
        totalQuestionsTextView = view.findViewById(R.id.total_question);
        questionTextView = view.findViewById(R.id.question);
        ansA = view.findViewById(R.id.ans_A);
        ansB = view.findViewById(R.id.ans_B);
        ansC = view.findViewById(R.id.ans_C);

        submitBtn = view.findViewById(R.id.submit_btn);
        totalQuestions = QuestionAnswer.questions.length;


        totalQuestionsTextView.setText("Total Questions: " + totalQuestions);

        ansA.setOnClickListener(this::onClick);
        ansB.setOnClickListener(this::onClick);
        ansC.setOnClickListener(this::onClick);
        submitBtn.setOnClickListener(this::onClick);

        loadNewQuestion();





        return view;
    }

    private void onClick(View view) {

        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;
        if (clickedButton.getId() == R.id.submit_btn){
            currentQuestionIndex++;
            loadNewQuestion();

        }else{
            selectedAnswer = clickedButton.getText().toString();

            if(currentQuestionIndex == 0){
                strength = selectedAnswer;
            }else if(currentQuestionIndex == 1){
                flavour = selectedAnswer;
            }else if(currentQuestionIndex == 2){
                cost = selectedAnswer;
            }
            clickedButton.setBackgroundColor(Color.LTGRAY);
        }
    }

    void loadNewQuestion(){
        if (currentQuestionIndex == totalQuestions){
            finishQuiz();
            return;
        }

        questionTextView.setText(QuestionAnswer.questions[currentQuestionIndex]);
        ansA.setText(QuestionAnswer.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer.choices[currentQuestionIndex][2]);
    }


    void finishQuiz() {
        String suggestionType = getSuggestionType();

        // Display suggestion or perform any other actions based on the suggestionType
        displaySuggestion(suggestionType);
    }

    String getSuggestionType() {

        if (strength.equals("C. Full-bodied") && flavour.equals("C. Earthy and Robust") && cost.equals("C. Premium")) {
            return "Cuban";
        } else if (strength.equals("B. Medium") && flavour.equals("A. Sweet and Nutty") && cost.equals("B. Mid-range")) {
            return "Dominican";
        } else {
            return "Brazilian";
        }
    }



    void displaySuggestion(String suggestionType) {
        String suggestionMessage = "Based on your preferences, we suggest trying " + suggestionType + " cigars.";
        new AlertDialog.Builder(getActivity())
                .setTitle("Cigar Suggestion")
                .setMessage(suggestionMessage)
                .setPositiveButton("OK", (dialog, which) -> {
                    currentQuestionIndex = 0;
                    loadNewQuestion();
                })
                .show();
    }


}