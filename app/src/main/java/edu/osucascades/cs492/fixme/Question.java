package edu.osucascades.cs492.fixme;

public class question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public question(int textResId, boolean answerTrue) {
         mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        this.mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        this.mAnswerTrue = answerTrue;
    }

}
