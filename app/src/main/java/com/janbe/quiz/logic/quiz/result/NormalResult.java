package com.janbe.quiz.logic.quiz.result;

import com.janbe.quiz.userInterface.result.ResultActivity;
import com.janbe.quiz.logic.quiz.score.Score;

public class NormalResult implements Result {
    private Score score;

    @Override
    public void putScore(Score score) {
        this.score = score;
    }

    @Override
    public Class getFeedbackScreenClass() {
        return ResultActivity.class;

    }

    @Override
    public Score getScore() {
        return score;

    }

}
