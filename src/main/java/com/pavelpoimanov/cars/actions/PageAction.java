package com.pavelpoimanov.cars.actions;

/**
 * Created by pauluxxx on 18.02.2017.
 */
public class PageAction {

    private String page;
    private boolean forward;

    public PageAction(String page, boolean forward) {
        this.page = page;
        this.forward = forward;
    }

    public boolean isForward() {
        return forward;
    }

    public void setForward(boolean forward) {
        this.forward = forward;

    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}