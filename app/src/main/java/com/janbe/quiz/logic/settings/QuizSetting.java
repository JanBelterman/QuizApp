package com.janbe.quiz.logic.settings;

import com.janbe.quiz.R;

public enum QuizSetting {

    SETTING_QUIZ_MULTIPLE_CHOICE(R.string.multipleChoice),
    SETTING_QUIZ_LONG_LIST(R.string.longList),
    SETTING_SCORE_RATIO_SCORE(R.string.percentageCorrect),
    SETTING_SCORE_TIMED_SCORE(R.string.fastAnswers),
    SETTING_SCORE_STREAK_SCORE(R.string.streaks);

    private final int description;

    QuizSetting(int description) {
        this.description = description;

    }

    public int getDescription() {
        return description;

    }

}
