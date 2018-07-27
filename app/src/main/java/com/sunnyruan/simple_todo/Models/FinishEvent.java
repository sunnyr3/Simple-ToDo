package com.sunnyruan.simple_todo.Models;

import org.litepal.crud.DataSupport;

import java.io.Serializable;

public class FinishEvent extends DataSupport implements Serializable {

    private String eventName;
    private String eventFinishDate;

    public void setEventFinishDate(String eventFinishDate) {
        this.eventFinishDate = eventFinishDate;
    }

    public String getEventFinishDate() {
        return eventFinishDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

}
