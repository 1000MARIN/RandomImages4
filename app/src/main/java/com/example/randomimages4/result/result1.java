package com.example.randomimages4.result;

import org.json.JSONException;
import org.json.JSONObject;

public class result1 {


    protected static String agency = "";      //- 기관
    protected static String date_time   = "";    //
    protected static int set1_time  = 0;      //
    protected static int set1_point   = 0;      //
    protected static int set2_time = 0;      //
    protected static int set2_point  = 0;      //
    protected static int set3_time   = 0;      //
    protected static int set3_point  = 0;      //


    public static String getAgency() {
        return agency;
    }

    public static void setAgency(String agency) {
        result1.agency = agency;
    }

    public static String getDate_time() {
        return date_time;
    }

    public static void setDate_time(String date_time) {
        result1.date_time = date_time;
    }


    public static int getSet1_time() {
        return set1_time;
    }

    public static void setSet1_time(int set1_time) {
        result1.set1_time = set1_time;
    }

    public static int getSet1_point() {
        return set1_point;
    }

    public static void setSet1_point(int set1_point) {
        result1.set1_point = set1_point;
    }

    public static int getSet2_time() {
        return set2_time;
    }

    public static void setSet2_time(int set2_time) {
        result1.set2_time = set2_time;
    }

    public static int getSet2_point() {
        return set2_point;
    }

    public static void setSet2_point(int set2_point) {
        result1.set2_point = set2_point;
    }

    public static int getSet3_time() {
        return set3_time;
    }

    public static void setSet3_time(int set3_time) {
        result1.set3_time = set3_time;
    }

    public static int getSet3_point() {
        return set3_point;
    }

    public static void setSet3_point(int set3_point) {
        result1.set3_point = set3_point;
    }

//    protected static int res_1;
//
//    public static int getRes_1() {
//        return res_1;
//    }
//
//    public static void setRes_1(int res_1) {
//        result1.res_1 = res_1;
//    }
    public result1(){

    }

    public String toJSON() {
//        protected static String agency = "";      //- 기관
//        protected static String date_time   = "";    //
//        protected static int set1_time  = 0;      //
//        protected static int set1_point   = 0;      //
//        protected static int set2_time = 0;      //
//        protected static int set2_point  = 0;      //
//        protected static int set3_time   = 0;      //
//        protected static int set3_point  = 0;      //
        JSONObject jsonObject= new JSONObject();
        try {
            jsonObject.put("agency", agency);
            jsonObject.put("date_time", date_time);
            jsonObject.put("set1_time", set1_time);
            jsonObject.put("set1_point", set1_point);
            jsonObject.put("set2_time", set2_time);
            jsonObject.put("set2_point", set2_point);
            jsonObject.put("set3_time", set3_time);
            jsonObject.put("set3_point", set3_point);

            return jsonObject.toString();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "";
        }
    }
}
