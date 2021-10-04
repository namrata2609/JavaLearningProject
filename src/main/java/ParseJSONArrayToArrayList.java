
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class ParseJSONArrayToArrayList {

    public static void main(String args[]){
        String str = "{\n" +
                "    \"items\": [\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001845591\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001980532\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000002016249\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000002056528\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000002063197\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000002063287\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001779576\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001781775\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001779685\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001845091\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001854025\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001975710\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001975808\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001980419\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000002016870\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000002017647\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000002017861\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001779257\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001845324\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001845956\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001854098\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000002016470\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000002016770\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000002016983\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"OrderKey\": \"OPS:300000001781559\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"count\": 25,\n" +
                "    \"hasMore\": true,\n" +
                "    \"limit\": 25,\n" +
                "    \"offset\": 0,\n" +
                "    \"links\": [\n" +
                "        {\n" +
                "            \"rel\": \"self\",\n" +
                "            \"href\": \"https://eohx.fa.us6.oraclecloud.com:443/fscmRestApi/resources/11.13.18.05/salesOrdersForOrderHub\",\n" +
                "            \"name\": \"salesOrdersForOrderHub\",\n" +
                "            \"kind\": \"collection\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        JSONObject json = new JSONObject(str);

        JSONArray array = (JSONArray) json.get("items");
        ArrayList ls = new ArrayList<String>();

        for(int i =0 ;i<array.length();i++){
            JSONObject obj = (JSONObject) array.get(i);
            System.out.println(obj.has("OrderKey"));
            ls.add(obj.get("OrderKey"));
        }

        System.out.println(ls.toString());
    }
}
