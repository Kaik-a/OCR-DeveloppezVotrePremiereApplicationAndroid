package com.kaika.topquiz.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionBank {
    private List<Question> mQuestionList;
    private int mNextQuestionIndex;
    List<Integer> questionDone = new ArrayList<Integer>();


    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;
        Collections.shuffle(mQuestionList);
        mNextQuestionIndex = 0;
    }


    public Question getQuestion() {
        if (mNextQuestionIndex == mQuestionList.size()) {
            mNextQuestionIndex = 0;
        }

        return mQuestionList.get(mNextQuestionIndex++);
    }
}
