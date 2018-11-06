package com.silvermoon.crud_application.util;

import android.content.Context;
import android.widget.Toast;

public class Util {
    public static String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    public static String[] states = {"Agra", "Ahmedabad", "Alappuzha", "Alwar", "Amritsar", "Aurangabad", "Bangalore", "Bharatpur", "Bhavnagar", "Bhikaner",
            "Bhopal", "Bhubaneshwar", "Bodh Gaya", "Calangute", "Chandigarh", "Chennai", "Chittaurgarh", "Coimbatore", "Cuttack", "Dalhousie", "Dehradun", "Delhi", "Diu-Island", "Ernakulam", "Faridabad", "Gaya", "Gangtok", "Ghaziabad", "Gurgaon", "Guwahati", "Gwalior", "Haridwar", "Hyderabad", "Imphal", "Indore", "Jabalpur", "Jaipur", "Jaisalmer", "Jalandhar", "Jamshedpur", "Jodhpur", "Junagadh", "Kanpur", "Kanyakumari", "Khajuraho", "Khandala", "Kochi", "Kodaikanal", "Kolkata", "Kota", "Kottayam", "Kovalam", "Lucknow", "Ludhiana", "Madurai", "Manali", "Mangalore", "Margao", "Mathura", "Mountabu", "Mumbai", "Mussoorie", "Mysore", "Manali", "Nagpur", "Nainital",
            "Noida", "Ooty", "Orchha", "Panaji", "Patna", "Pondicherry", "Porbandar", "Portblair", "Pune", "Puri", "Pushkar", "Rajkot", "Rameswaram", "Ranchi", "Sanchi", "Secunderabad", "Shimla", "Surat"
            , "Thanjavur", "Thiruchchirapalli", "Thrissur", "Tirumala", "Udaipur", "Vadodra", "Varanasi", "Vasco-Da-Gama", "Vijayawada", "Visakhapatnam"};

    public static void make_toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
