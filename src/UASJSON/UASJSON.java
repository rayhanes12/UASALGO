package UASJSON;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UASJSON {
    public static void main(String[] args) {
        String jsonData = "{\"menu\": {\"id\": \"file\",\"value\": \"File\",\"popup\": {\"menuitem\": [{\"value\": \"New\",\"onclick\":" +
                " \"CreatNewDoc()\"},{\"value\": \"Open\",\"onclick\": \"OpenDoc()\"},{\"value\": \"Close\",\"onclick\": \"CloseDoc()\"}]}}}";

        try {
            JSONObject jsonObject = new JSONObject(jsonData);
            JSONObject menu = jsonObject.getJSONObject("menu");
            JSONObject popup = menu.getJSONObject("popup");
            JSONArray menuItems = popup.getJSONArray("menuitem");

            // Menangkap entity "menuitem"
            for (int i = 0; i < menuItems.length(); i++) {
                JSONObject menuItem = menuItems.getJSONObject(i);
                String value = menuItem.getString("value");
                String onclick = menuItem.getString("onclick");
                System.out.println("Menu Item: " + value);
                System.out.println("Onclick: " + onclick);
                System.out.println();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

