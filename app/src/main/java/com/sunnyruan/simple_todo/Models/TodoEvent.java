package com.sunnyruan.simple_todo.Models;

import android.support.annotation.NonNull;

import org.litepal.crud.DataSupport;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TodoEvent extends DataSupport implements Serializable, Comparable<TodoEvent>{

    private String eventName;
    private String eventDetail;
    private int eventCategory = 0;
    private Date eventDeadline;
    private String eventDate;
    private String eventTime;
    private byte[] eventImageBitMap;
    private boolean isClicked;
    private boolean hasSetAlarm;
    private int pos;
    private String eventPhotoPath;


    //========================== EVENT PHOTO PATH =================================
    public void setEventPhotoPath(String eventPhotoPath) {
        this.eventPhotoPath = eventPhotoPath;
    }

    public String getEventPhotoPath() {
        return eventPhotoPath;
    }


    //=========================== FINISH OR NOT ==================================
    public void setClicked(boolean clicked) {
        isClicked = clicked;
    }

    public boolean isClicked() {
        return isClicked;
    }


    //=========================== CHECK ALARM ====================================
    public void setHasSetAlarm(boolean hasSetAlarm) {
        this.hasSetAlarm = hasSetAlarm;
    }

    public boolean isHasSetAlarm() {
        return hasSetAlarm;
    }


    //=========================== EVENT DEADLINE =================================
    public void setEventDeadline(Date eventDeadline) {
        this.eventDeadline = eventDeadline;
    }

    public Date getEventDeadline() {
        return eventDeadline;
    }


    //========================== DATE OF EVENT DEADLINE ==========================
    public void setEventDate() {
        SimpleDateFormat format1 = new SimpleDateFormat("YYYY年MM月dd日");
        this.eventDate = format1.format(this.eventDeadline);

    }

    public String getEventDate() {
        return eventDate;
    }


    //========================= TIME OF EVENT DEADLINE ===========================
    public void setEventTime() {
        SimpleDateFormat format1 = new SimpleDateFormat("HH时mm分");
        this.eventTime = format1.format(this.eventDeadline);

    }

    public String getEventTime() {
        return eventTime;
    }


    //=========================== EVENT PICTURE ==================================
    public byte[] getEventImageBitMap() {
        return eventImageBitMap;
    }

    public void setEventImageBitMap(byte[] eventImageBitMap) {
        this.eventImageBitMap = eventImageBitMap;
    }


    //=========================== EVENT DESCRIPTION ==============================
    public void setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
    }

    public String getEventDetail() {
        return eventDetail;
    }


    //=========================== EVENT NAME ================================
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }


    //========================== EVENT INDEX ==============================
    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }


    @Override
    public int compareTo(@NonNull TodoEvent todoEvent) {
        return this.getPos() - todoEvent.getPos();
    }

    public boolean isEventExpired(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        Date date = c.getTime();
        return date.compareTo(eventDeadline) > 0;
    }

    //============================ EVENT CATEGORY =================================
    public void setEventCategory(int eventCategory) {
        this.eventCategory = eventCategory;
    }

    public int getEventCategory() {
        return eventCategory;
    }

}
