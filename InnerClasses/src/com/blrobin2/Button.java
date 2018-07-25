package com.blrobin2;

class Button {
    private String title;
    private OnClickListener onClickListener;

    Button(String title) {
        this.title = title;
    }

    void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    void onClick() {
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener {
        void onClick(String title);
    }
}
