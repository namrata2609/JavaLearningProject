import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;

public class StringParsingJava {

    public static void main(String args[]){

        String  obj = "    [{\n" +
                "        \"id\": 6813,\n" +
                "        \"created-at\": \"2020-09-08T05:49:08-04:00\",\n" +
                "        \"updated-at\": \"2021-02-12T01:50:12-05:00\",\n" +
                "        \"quantity\": \"5.0\",\n" +
                "        \"allocated\": \"0.0\",\n" +
                "        \"available\": \"5.0\",\n" +
                "        \"item\": {\n" +
                "            \"id\": 113958,\n" +
                "            \"created-at\": \"2020-06-08T07:52:06-04:00\",\n" +
                "            \"updated-at\": \"2020-10-26T18:10:17-04:00\",\n" +
                "            \"description\": \"Combo Kit; Colilert-18-200 EA; QT 51-well-100 EA; W/AF vessels; 200 EA\",\n" +
                "            \"item-number\": \"DK000776\",\n" +
                "            \"name\": \"Combo Kit; DK; Colilert-18-200 EA; QT 51-well-100 EA; W/AF vessels; 200 EA\",\n" +
                "            \"active\": true,\n" +
                "            \"storage-quantity\": 1,\n" +
                "            \"consumption-quantity\": 1,\n" +
                "            \"image-url\": null,\n" +
                "            \"manufacturer-name\": null,\n" +
                "            \"manufacturer-part-number\": null,\n" +
                "            \"item-type\": \"Item\",\n" +
                "            \"require-inspection\": false,\n" +
                "            \"require-asset-tag\": false,\n" +
                "            \"use-pack-weight\": null,\n" +
                "            \"pack-qty\": null,\n" +
                "            \"pack-weight\": null,\n" +
                "            \"pack-uom-id\": null,\n" +
                "            \"receive-catch-weight\": false,\n" +
                "            \"allow-partial-quantity\": false,\n" +
                "            \"inventory-lot-tracking-enabled\": true,\n" +
                "            \"inventory-lot-expiration-type\": \"On a specific date\",\n" +
                "            \"eurofins-name\": \"Combo Kit; Colilert-18-200 EA; QT 51-well-100 EA; W/AF vessels; 200 EA\",\n" +
                "            \"item-class-code\": \"09C0099\",\n" +
                "            \"cas\": \"\",\n" +
                "            \"purchase-unit\": \"1x(200xEA)\",\n" +
                "            \"base-comparison-unit\": {\n" +
                "                \"id\": 16,\n" +
                "                \"created-at\": \"2017-10-13T08:56:03-04:00\",\n" +
                "                \"updated-at\": \"2017-10-13T08:56:03-04:00\",\n" +
                "                \"active\": true,\n" +
                "                \"name\": \"EA\",\n" +
                "                \"description\": \"each\",\n" +
                "                \"external-ref-num\": null,\n" +
                "                \"external-ref-code\": \"EA\",\n" +
                "                \"parent-id\": null,\n" +
                "                \"lookup-id\": 3,\n" +
                "                \"depth\": 0,\n" +
                "                \"is-default\": false,\n" +
                "                \"less-than-50k\": \"\",\n" +
                "                \"less-than-100k\": \"\",\n" +
                "                \"less-than-250k\": \"\",\n" +
                "                \"less-than-500k\": \"\",\n" +
                "                \"greater-than-500k\": \"\",\n" +
                "                \"level-4-le-md\": \"\",\n" +
                "                \"level-3-operational-leader\": \"\",\n" +
                "                \"level-2-business-line-leader\": \"\",\n" +
                "                \"level-1-executive-vp\": \"\",\n" +
                "                \"le-md-16a-up-to-50k\": \"\",\n" +
                "                \"level-3-16a-up-to-150k\": \"\",\n" +
                "                \"level-2-16a-up-to-200k\": \"\",\n" +
                "                \"level-1-16a-over-200k\": \"\",\n" +
                "                \"dynamic-account\": \"\",\n" +
                "                \"custom-fields\": {\n" +
                "                    \"approver-14\": \"\",\n" +
                "                    \"approver-15\": \"\",\n" +
                "                    \"group-approver\": \"\",\n" +
                "                    \"group-approver-2\": \"\"\n" +
                "                },\n" +
                "                \"lookup\": {\n" +
                "                    \"id\": 3,\n" +
                "                    \"created-at\": \"2017-10-13T08:49:58-04:00\",\n" +
                "                    \"updated-at\": \"2019-11-19T08:11:33-05:00\",\n" +
                "                    \"active\": true,\n" +
                "                    \"name\": \"Base Comparison Unit\",\n" +
                "                    \"description\": \"Lookup used for Based Comparison Unit field on Item object\",\n" +
                "                    \"fixed-depth\": false,\n" +
                "                    \"level-1-name\": \"\",\n" +
                "                    \"level-2-name\": \"\",\n" +
                "                    \"level-3-name\": \"\",\n" +
                "                    \"level-4-name\": \"\",\n" +
                "                    \"level-5-name\": \"\",\n" +
                "                    \"level-6-name\": \"\",\n" +
                "                    \"level-7-name\": \"\",\n" +
                "                    \"level-8-name\": \"\",\n" +
                "                    \"level-9-name\": \"\",\n" +
                "                    \"level-10-name\": \"\",\n" +
                "                    \"content-groups\": [\n" +
                "                        {\n" +
                "                            \"id\": 486,\n" +
                "                            \"created-at\": \"2018-06-18T08:06:19-04:00\",\n" +
                "                            \"updated-at\": \"2018-06-18T08:06:19-04:00\",\n" +
                "                            \"name\": \"PL-CGA\",\n" +
                "                            \"description\": \"CoupaGroupAdmin\",\n" +
                "                            \"created-by\": {\n" +
                "                                \"id\": 45,\n" +
                "                                \"login\": \"DW2S\",\n" +
                "                                \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                                \"employee-number\": \"\",\n" +
                "                                \"firstname\": \"Lukasz\",\n" +
                "                                \"lastname\": \"Pinkawa\",\n" +
                "                                \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                                \"salesforce-id\": null,\n" +
                "                                \"avatar-thumb-url\": null,\n" +
                "                                \"self-approval\": \"\",\n" +
                "                                \"enterprise\": \"EU-PL-GSC\",\n" +
                "                                \"custom-fields\": {\n" +
                "                                    \"notes\": \"\",\n" +
                "                                    \"userbusinessunit\": \"\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"updated-by\": {\n" +
                "                                \"id\": 45,\n" +
                "                                \"login\": \"DW2S\",\n" +
                "                                \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                                \"employee-number\": \"\",\n" +
                "                                \"firstname\": \"Lukasz\",\n" +
                "                                \"lastname\": \"Pinkawa\",\n" +
                "                                \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                                \"salesforce-id\": null,\n" +
                "                                \"avatar-thumb-url\": null,\n" +
                "                                \"self-approval\": \"\",\n" +
                "                                \"enterprise\": \"EU-PL-GSC\",\n" +
                "                                \"custom-fields\": {\n" +
                "                                    \"notes\": \"\",\n" +
                "                                    \"userbusinessunit\": \"\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            },\n" +
                "            \"purchase-to-base\": \"200.0\",\n" +
                "            \"group-item-number\": \"\",\n" +
                "            \"radioactive\": false,\n" +
                "            \"animal\": false,\n" +
                "            \"controlled\": false,\n" +
                "            \"custom-fields\": {\n" +
                "                \"givd-code\": \"\",\n" +
                "                \"wap-from-previous-year\": \"\"\n" +
                "            },\n" +
                "            \"commodity\": {\n" +
                "                \"id\": 254,\n" +
                "                \"created-at\": \"2017-10-13T07:14:40-04:00\",\n" +
                "                \"updated-at\": \"2017-10-13T07:14:41-04:00\",\n" +
                "                \"active\": true,\n" +
                "                \"name\": \"09C0099 Other\",\n" +
                "                \"translated-name\": \"09C0099 Other\",\n" +
                "                \"deductibility\": null,\n" +
                "                \"category\": null,\n" +
                "                \"subcategory\": null,\n" +
                "                \"item-category-code\": \"09C0099\",\n" +
                "                \"parent\": {\n" +
                "                    \"id\": 99,\n" +
                "                    \"created-at\": \"2017-10-13T07:14:20-04:00\",\n" +
                "                    \"updated-at\": \"2017-10-13T07:14:41-04:00\",\n" +
                "                    \"active\": true,\n" +
                "                    \"name\": \"09C00 Chemistry Diagnostic Kits\",\n" +
                "                    \"translated-name\": \"09C00 Chemistry Diagnostic Kits\",\n" +
                "                    \"deductibility\": null,\n" +
                "                    \"category\": null,\n" +
                "                    \"subcategory\": null,\n" +
                "                    \"item-category-code\": \"09C00\",\n" +
                "                    \"parent\": {\n" +
                "                        \"id\": 48,\n" +
                "                        \"created-at\": \"2017-10-13T07:14:16-04:00\",\n" +
                "                        \"updated-at\": \"2017-10-13T07:14:42-04:00\",\n" +
                "                        \"active\": true,\n" +
                "                        \"name\": \"09C Diagnostic Kits\",\n" +
                "                        \"translated-name\": \"09C Diagnostic Kits\",\n" +
                "                        \"deductibility\": null,\n" +
                "                        \"category\": null,\n" +
                "                        \"subcategory\": null,\n" +
                "                        \"item-category-code\": \"09C\",\n" +
                "                        \"parent\": {\n" +
                "                            \"id\": 36,\n" +
                "                            \"created-at\": \"2017-10-13T07:14:15-04:00\",\n" +
                "                            \"updated-at\": \"2018-11-23T02:20:10-05:00\",\n" +
                "                            \"active\": true,\n" +
                "                            \"name\": \"09 Consumables\",\n" +
                "                            \"translated-name\": \"09 Consumables\",\n" +
                "                            \"deductibility\": null,\n" +
                "                            \"category\": null,\n" +
                "                            \"subcategory\": null,\n" +
                "                            \"item-category-code\": \"9\",\n" +
                "                            \"created-by\": {\n" +
                "                                \"id\": 45,\n" +
                "                                \"login\": \"DW2S\",\n" +
                "                                \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                                \"employee-number\": \"\",\n" +
                "                                \"firstname\": \"Lukasz\",\n" +
                "                                \"lastname\": \"Pinkawa\",\n" +
                "                                \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                                \"salesforce-id\": null,\n" +
                "                                \"avatar-thumb-url\": null,\n" +
                "                                \"self-approval\": \"\",\n" +
                "                                \"enterprise\": \"EU-PL-GSC\",\n" +
                "                                \"custom-fields\": {\n" +
                "                                    \"notes\": \"\",\n" +
                "                                    \"userbusinessunit\": \"\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"updated-by\": {\n" +
                "                                \"id\": 44,\n" +
                "                                \"login\": \"X79V\",\n" +
                "                                \"email\": \"igorkrok@eurofins.com\",\n" +
                "                                \"employee-number\": \"\",\n" +
                "                                \"firstname\": \"Igor\",\n" +
                "                                \"lastname\": \"Krok\",\n" +
                "                                \"fullname\": \"Igor Krok\",\n" +
                "                                \"salesforce-id\": null,\n" +
                "                                \"avatar-thumb-url\": null,\n" +
                "                                \"self-approval\": \"250\",\n" +
                "                                \"enterprise\": \"EU-PL-GSC-CGA\",\n" +
                "                                \"custom-fields\": {\n" +
                "                                    \"notes\": \"\",\n" +
                "                                    \"userbusinessunit\": \"\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        },\n" +
                "                        \"created-by\": {\n" +
                "                            \"id\": 45,\n" +
                "                            \"login\": \"DW2S\",\n" +
                "                            \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                            \"employee-number\": \"\",\n" +
                "                            \"firstname\": \"Lukasz\",\n" +
                "                            \"lastname\": \"Pinkawa\",\n" +
                "                            \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                            \"salesforce-id\": null,\n" +
                "                            \"avatar-thumb-url\": null,\n" +
                "                            \"self-approval\": \"\",\n" +
                "                            \"enterprise\": \"EU-PL-GSC\",\n" +
                "                            \"custom-fields\": {\n" +
                "                                \"notes\": \"\",\n" +
                "                                \"userbusinessunit\": \"\"\n" +
                "                            }\n" +
                "                        },\n" +
                "                        \"updated-by\": {\n" +
                "                            \"id\": 45,\n" +
                "                            \"login\": \"DW2S\",\n" +
                "                            \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                            \"employee-number\": \"\",\n" +
                "                            \"firstname\": \"Lukasz\",\n" +
                "                            \"lastname\": \"Pinkawa\",\n" +
                "                            \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                            \"salesforce-id\": null,\n" +
                "                            \"avatar-thumb-url\": null,\n" +
                "                            \"self-approval\": \"\",\n" +
                "                            \"enterprise\": \"EU-PL-GSC\",\n" +
                "                            \"custom-fields\": {\n" +
                "                                \"notes\": \"\",\n" +
                "                                \"userbusinessunit\": \"\"\n" +
                "                            }\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"created-by\": {\n" +
                "                        \"id\": 45,\n" +
                "                        \"login\": \"DW2S\",\n" +
                "                        \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                        \"employee-number\": \"\",\n" +
                "                        \"firstname\": \"Lukasz\",\n" +
                "                        \"lastname\": \"Pinkawa\",\n" +
                "                        \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                        \"salesforce-id\": null,\n" +
                "                        \"avatar-thumb-url\": null,\n" +
                "                        \"self-approval\": \"\",\n" +
                "                        \"enterprise\": \"EU-PL-GSC\",\n" +
                "                        \"custom-fields\": {\n" +
                "                            \"notes\": \"\",\n" +
                "                            \"userbusinessunit\": \"\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"updated-by\": {\n" +
                "                        \"id\": 45,\n" +
                "                        \"login\": \"DW2S\",\n" +
                "                        \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                        \"employee-number\": \"\",\n" +
                "                        \"firstname\": \"Lukasz\",\n" +
                "                        \"lastname\": \"Pinkawa\",\n" +
                "                        \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                        \"salesforce-id\": null,\n" +
                "                        \"avatar-thumb-url\": null,\n" +
                "                        \"self-approval\": \"\",\n" +
                "                        \"enterprise\": \"EU-PL-GSC\",\n" +
                "                        \"custom-fields\": {\n" +
                "                            \"notes\": \"\",\n" +
                "                            \"userbusinessunit\": \"\"\n" +
                "                        }\n" +
                "                    }\n" +
                "                },\n" +
                "                \"created-by\": {\n" +
                "                    \"id\": 45,\n" +
                "                    \"login\": \"DW2S\",\n" +
                "                    \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                    \"employee-number\": \"\",\n" +
                "                    \"firstname\": \"Lukasz\",\n" +
                "                    \"lastname\": \"Pinkawa\",\n" +
                "                    \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                    \"salesforce-id\": null,\n" +
                "                    \"avatar-thumb-url\": null,\n" +
                "                    \"self-approval\": \"\",\n" +
                "                    \"enterprise\": \"EU-PL-GSC\",\n" +
                "                    \"custom-fields\": {\n" +
                "                        \"notes\": \"\",\n" +
                "                        \"userbusinessunit\": \"\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"updated-by\": {\n" +
                "                    \"id\": 45,\n" +
                "                    \"login\": \"DW2S\",\n" +
                "                    \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                    \"employee-number\": \"\",\n" +
                "                    \"firstname\": \"Lukasz\",\n" +
                "                    \"lastname\": \"Pinkawa\",\n" +
                "                    \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                    \"salesforce-id\": null,\n" +
                "                    \"avatar-thumb-url\": null,\n" +
                "                    \"self-approval\": \"\",\n" +
                "                    \"enterprise\": \"EU-PL-GSC\",\n" +
                "                    \"custom-fields\": {\n" +
                "                        \"notes\": \"\",\n" +
                "                        \"userbusinessunit\": \"\"\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"uom\": {\n" +
                "                \"id\": 19,\n" +
                "                \"created-at\": \"2017-10-13T03:19:11-04:00\",\n" +
                "                \"updated-at\": \"2017-12-21T02:39:14-05:00\",\n" +
                "                \"code\": \"PK\",\n" +
                "                \"name\": \"pack\",\n" +
                "                \"allowable-precision\": 0,\n" +
                "                \"active\": true,\n" +
                "                \"created-by\": {\n" +
                "                    \"id\": 45,\n" +
                "                    \"login\": \"DW2S\",\n" +
                "                    \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                    \"employee-number\": \"\",\n" +
                "                    \"firstname\": \"Lukasz\",\n" +
                "                    \"lastname\": \"Pinkawa\",\n" +
                "                    \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                    \"salesforce-id\": null,\n" +
                "                    \"avatar-thumb-url\": null,\n" +
                "                    \"self-approval\": \"\",\n" +
                "                    \"enterprise\": \"EU-PL-GSC\",\n" +
                "                    \"custom-fields\": {\n" +
                "                        \"notes\": \"\",\n" +
                "                        \"userbusinessunit\": \"\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"updated-by\": {\n" +
                "                    \"id\": 640,\n" +
                "                    \"login\": \"RW7V\",\n" +
                "                    \"email\": \"mateuszdudek@eurofins.com\",\n" +
                "                    \"employee-number\": \"\",\n" +
                "                    \"firstname\": \"Mateusz\",\n" +
                "                    \"lastname\": \"Dudek\",\n" +
                "                    \"fullname\": \"Mateusz Dudek\",\n" +
                "                    \"salesforce-id\": null,\n" +
                "                    \"avatar-thumb-url\": \"/users/640/avatar?style=thumb\",\n" +
                "                    \"self-approval\": \"\",\n" +
                "                    \"enterprise\": \"EU-PL-GSC-CGA\",\n" +
                "                    \"custom-fields\": {\n" +
                "                        \"notes\": \"\",\n" +
                "                        \"userbusinessunit\": {\n" +
                "                            \"id\": 216328,\n" +
                "                            \"created-at\": \"2020-04-15T10:27:35-04:00\",\n" +
                "                            \"updated-at\": \"2020-04-15T10:27:35-04:00\",\n" +
                "                            \"active\": true,\n" +
                "                            \"name\": \"CDE058 - Eurofins WEJ Contaminants GmbH\",\n" +
                "                            \"description\": \"CDE058 - Eurofins WEJ Contaminants GmbH\",\n" +
                "                            \"external-ref-num\": \"CDE058 - Eurofins WEJ Contaminants GmbH\",\n" +
                "                            \"external-ref-code\": \"CDE058 - Eurofins WEJ Contaminants GmbH\",\n" +
                "                            \"parent-id\": null,\n" +
                "                            \"lookup-id\": 1205,\n" +
                "                            \"depth\": 0,\n" +
                "                            \"is-default\": false,\n" +
                "                            \"less-than-50k\": \"\",\n" +
                "                            \"less-than-100k\": \"\",\n" +
                "                            \"less-than-250k\": \"\",\n" +
                "                            \"less-than-500k\": \"\",\n" +
                "                            \"greater-than-500k\": \"\",\n" +
                "                            \"level-4-le-md\": \"\",\n" +
                "                            \"level-3-operational-leader\": \"\",\n" +
                "                            \"level-2-business-line-leader\": \"\",\n" +
                "                            \"level-1-executive-vp\": \"\",\n" +
                "                            \"le-md-16a-up-to-50k\": \"\",\n" +
                "                            \"level-3-16a-up-to-150k\": \"\",\n" +
                "                            \"level-2-16a-up-to-200k\": \"\",\n" +
                "                            \"level-1-16a-over-200k\": \"\",\n" +
                "                            \"dynamic-account\": \"\",\n" +
                "                            \"custom-fields\": {\n" +
                "                                \"approver-14\": \"\",\n" +
                "                                \"approver-15\": \"\",\n" +
                "                                \"group-approver\": \"\",\n" +
                "                                \"group-approver-2\": \"\"\n" +
                "                            },\n" +
                "                            \"lookup\": {\n" +
                "                                \"id\": 1205,\n" +
                "                                \"created-at\": \"2020-02-17T03:11:34-05:00\",\n" +
                "                                \"updated-at\": \"2020-02-17T03:11:34-05:00\",\n" +
                "                                \"active\": true,\n" +
                "                                \"name\": \"UserBusinessUnit\",\n" +
                "                                \"description\": \"UserBusinessUnit\",\n" +
                "                                \"fixed-depth\": false,\n" +
                "                                \"level-1-name\": \"\",\n" +
                "                                \"level-2-name\": \"\",\n" +
                "                                \"level-3-name\": \"\",\n" +
                "                                \"level-4-name\": \"\",\n" +
                "                                \"level-5-name\": \"\",\n" +
                "                                \"level-6-name\": \"\",\n" +
                "                                \"level-7-name\": \"\",\n" +
                "                                \"level-8-name\": \"\",\n" +
                "                                \"level-9-name\": \"\",\n" +
                "                                \"level-10-name\": \"\",\n" +
                "                                \"content-groups\": [\n" +
                "                                    {\n" +
                "                                        \"id\": 255,\n" +
                "                                        \"created-at\": \"2018-05-17T16:08:18-04:00\",\n" +
                "                                        \"updated-at\": \"2018-05-17T16:08:18-04:00\",\n" +
                "                                        \"name\": \"DE-AX\",\n" +
                "                                        \"description\": \"DE-AX ERP\",\n" +
                "                                        \"created-by\": {\n" +
                "                                            \"id\": 1574,\n" +
                "                                            \"login\": \"MDO5\",\n" +
                "                                            \"email\": \"LarsGolhar@eurofins.de\",\n" +
                "                                            \"employee-number\": \"\",\n" +
                "                                            \"firstname\": \"Lars\",\n" +
                "                                            \"lastname\": \"Golhar\",\n" +
                "                                            \"fullname\": \"Lars Golhar\",\n" +
                "                                            \"salesforce-id\": null,\n" +
                "                                            \"avatar-thumb-url\": \"/users/1574/avatar?style=thumb\",\n" +
                "                                            \"self-approval\": \"\",\n" +
                "                                            \"enterprise\": \"EU-DE\",\n" +
                "                                            \"custom-fields\": {\n" +
                "                                                \"notes\": \"\",\n" +
                "                                                \"userbusinessunit\": \"\"\n" +
                "                                            }\n" +
                "                                        },\n" +
                "                                        \"updated-by\": {\n" +
                "                                            \"id\": 1574,\n" +
                "                                            \"login\": \"MDO5\",\n" +
                "                                            \"email\": \"LarsGolhar@eurofins.de\",\n" +
                "                                            \"employee-number\": \"\",\n" +
                "                                            \"firstname\": \"Lars\",\n" +
                "                                            \"lastname\": \"Golhar\",\n" +
                "                                            \"fullname\": \"Lars Golhar\",\n" +
                "                                            \"salesforce-id\": null,\n" +
                "                                            \"avatar-thumb-url\": \"/users/1574/avatar?style=thumb\",\n" +
                "                                            \"self-approval\": \"\",\n" +
                "                                            \"enterprise\": \"EU-DE\",\n" +
                "                                            \"custom-fields\": {\n" +
                "                                                \"notes\": \"\",\n" +
                "                                                \"userbusinessunit\": \"\"\n" +
                "                                            }\n" +
                "                                        }\n" +
                "                                    }\n" +
                "                                ]\n" +
                "                            }\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"storage-uom\": {\n" +
                "                \"id\": 19,\n" +
                "                \"created-at\": \"2017-10-13T03:19:11-04:00\",\n" +
                "                \"updated-at\": \"2017-12-21T02:39:14-05:00\",\n" +
                "                \"code\": \"PK\",\n" +
                "                \"name\": \"pack\",\n" +
                "                \"allowable-precision\": 0,\n" +
                "                \"active\": true,\n" +
                "                \"created-by\": {\n" +
                "                    \"id\": 45,\n" +
                "                    \"login\": \"DW2S\",\n" +
                "                    \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                    \"employee-number\": \"\",\n" +
                "                    \"firstname\": \"Lukasz\",\n" +
                "                    \"lastname\": \"Pinkawa\",\n" +
                "                    \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                    \"salesforce-id\": null,\n" +
                "                    \"avatar-thumb-url\": null,\n" +
                "                    \"self-approval\": \"\",\n" +
                "                    \"enterprise\": \"EU-PL-GSC\",\n" +
                "                    \"custom-fields\": {\n" +
                "                        \"notes\": \"\",\n" +
                "                        \"userbusinessunit\": \"\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"updated-by\": {\n" +
                "                    \"id\": 640,\n" +
                "                    \"login\": \"RW7V\",\n" +
                "                    \"email\": \"mateuszdudek@eurofins.com\",\n" +
                "                    \"employee-number\": \"\",\n" +
                "                    \"firstname\": \"Mateusz\",\n" +
                "                    \"lastname\": \"Dudek\",\n" +
                "                    \"fullname\": \"Mateusz Dudek\",\n" +
                "                    \"salesforce-id\": null,\n" +
                "                    \"avatar-thumb-url\": \"/users/640/avatar?style=thumb\",\n" +
                "                    \"self-approval\": \"\",\n" +
                "                    \"enterprise\": \"EU-PL-GSC-CGA\",\n" +
                "                    \"custom-fields\": {\n" +
                "                        \"notes\": \"\",\n" +
                "                        \"userbusinessunit\": {\n" +
                "                            \"id\": 216328,\n" +
                "                            \"created-at\": \"2020-04-15T10:27:35-04:00\",\n" +
                "                            \"updated-at\": \"2020-04-15T10:27:35-04:00\",\n" +
                "                            \"active\": true,\n" +
                "                            \"name\": \"CDE058 - Eurofins WEJ Contaminants GmbH\",\n" +
                "                            \"description\": \"CDE058 - Eurofins WEJ Contaminants GmbH\",\n" +
                "                            \"external-ref-num\": \"CDE058 - Eurofins WEJ Contaminants GmbH\",\n" +
                "                            \"external-ref-code\": \"CDE058 - Eurofins WEJ Contaminants GmbH\",\n" +
                "                            \"parent-id\": null,\n" +
                "                            \"lookup-id\": 1205,\n" +
                "                            \"depth\": 0,\n" +
                "                            \"is-default\": false,\n" +
                "                            \"less-than-50k\": \"\",\n" +
                "                            \"less-than-100k\": \"\",\n" +
                "                            \"less-than-250k\": \"\",\n" +
                "                            \"less-than-500k\": \"\",\n" +
                "                            \"greater-than-500k\": \"\",\n" +
                "                            \"level-4-le-md\": \"\",\n" +
                "                            \"level-3-operational-leader\": \"\",\n" +
                "                            \"level-2-business-line-leader\": \"\",\n" +
                "                            \"level-1-executive-vp\": \"\",\n" +
                "                            \"le-md-16a-up-to-50k\": \"\",\n" +
                "                            \"level-3-16a-up-to-150k\": \"\",\n" +
                "                            \"level-2-16a-up-to-200k\": \"\",\n" +
                "                            \"level-1-16a-over-200k\": \"\",\n" +
                "                            \"dynamic-account\": \"\",\n" +
                "                            \"custom-fields\": {\n" +
                "                                \"approver-14\": \"\",\n" +
                "                                \"approver-15\": \"\",\n" +
                "                                \"group-approver\": \"\",\n" +
                "                                \"group-approver-2\": \"\"\n" +
                "                            },\n" +
                "                            \"lookup\": {\n" +
                "                                \"id\": 1205,\n" +
                "                                \"created-at\": \"2020-02-17T03:11:34-05:00\",\n" +
                "                                \"updated-at\": \"2020-02-17T03:11:34-05:00\",\n" +
                "                                \"active\": true,\n" +
                "                                \"name\": \"UserBusinessUnit\",\n" +
                "                                \"description\": \"UserBusinessUnit\",\n" +
                "                                \"fixed-depth\": false,\n" +
                "                                \"level-1-name\": \"\",\n" +
                "                                \"level-2-name\": \"\",\n" +
                "                                \"level-3-name\": \"\",\n" +
                "                                \"level-4-name\": \"\",\n" +
                "                                \"level-5-name\": \"\",\n" +
                "                                \"level-6-name\": \"\",\n" +
                "                                \"level-7-name\": \"\",\n" +
                "                                \"level-8-name\": \"\",\n" +
                "                                \"level-9-name\": \"\",\n" +
                "                                \"level-10-name\": \"\",\n" +
                "                                \"content-groups\": [\n" +
                "                                    {\n" +
                "                                        \"id\": 255,\n" +
                "                                        \"created-at\": \"2018-05-17T16:08:18-04:00\",\n" +
                "                                        \"updated-at\": \"2018-05-17T16:08:18-04:00\",\n" +
                "                                        \"name\": \"DE-AX\",\n" +
                "                                        \"description\": \"DE-AX ERP\",\n" +
                "                                        \"created-by\": {\n" +
                "                                            \"id\": 1574,\n" +
                "                                            \"login\": \"MDO5\",\n" +
                "                                            \"email\": \"LarsGolhar@eurofins.de\",\n" +
                "                                            \"employee-number\": \"\",\n" +
                "                                            \"firstname\": \"Lars\",\n" +
                "                                            \"lastname\": \"Golhar\",\n" +
                "                                            \"fullname\": \"Lars Golhar\",\n" +
                "                                            \"salesforce-id\": null,\n" +
                "                                            \"avatar-thumb-url\": \"/users/1574/avatar?style=thumb\",\n" +
                "                                            \"self-approval\": \"\",\n" +
                "                                            \"enterprise\": \"EU-DE\",\n" +
                "                                            \"custom-fields\": {\n" +
                "                                                \"notes\": \"\",\n" +
                "                                                \"userbusinessunit\": \"\"\n" +
                "                                            }\n" +
                "                                        },\n" +
                "                                        \"updated-by\": {\n" +
                "                                            \"id\": 1574,\n" +
                "                                            \"login\": \"MDO5\",\n" +
                "                                            \"email\": \"LarsGolhar@eurofins.de\",\n" +
                "                                            \"employee-number\": \"\",\n" +
                "                                            \"firstname\": \"Lars\",\n" +
                "                                            \"lastname\": \"Golhar\",\n" +
                "                                            \"fullname\": \"Lars Golhar\",\n" +
                "                                            \"salesforce-id\": null,\n" +
                "                                            \"avatar-thumb-url\": \"/users/1574/avatar?style=thumb\",\n" +
                "                                            \"self-approval\": \"\",\n" +
                "                                            \"enterprise\": \"EU-DE\",\n" +
                "                                            \"custom-fields\": {\n" +
                "                                                \"notes\": \"\",\n" +
                "                                                \"userbusinessunit\": \"\"\n" +
                "                                            }\n" +
                "                                        }\n" +
                "                                    }\n" +
                "                                ]\n" +
                "                            }\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"consumption-uom\": {\n" +
                "                \"id\": 19,\n" +
                "                \"created-at\": \"2017-10-13T03:19:11-04:00\",\n" +
                "                \"updated-at\": \"2017-12-21T02:39:14-05:00\",\n" +
                "                \"code\": \"PK\",\n" +
                "                \"name\": \"pack\",\n" +
                "                \"allowable-precision\": 0,\n" +
                "                \"active\": true,\n" +
                "                \"created-by\": {\n" +
                "                    \"id\": 45,\n" +
                "                    \"login\": \"DW2S\",\n" +
                "                    \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                    \"employee-number\": \"\",\n" +
                "                    \"firstname\": \"Lukasz\",\n" +
                "                    \"lastname\": \"Pinkawa\",\n" +
                "                    \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                    \"salesforce-id\": null,\n" +
                "                    \"avatar-thumb-url\": null,\n" +
                "                    \"self-approval\": \"\",\n" +
                "                    \"enterprise\": \"EU-PL-GSC\",\n" +
                "                    \"custom-fields\": {\n" +
                "                        \"notes\": \"\",\n" +
                "                        \"userbusinessunit\": \"\"\n" +
                "                    }\n" +
                "                },\n" +
                "                \"updated-by\": {\n" +
                "                    \"id\": 640,\n" +
                "                    \"login\": \"RW7V\",\n" +
                "                    \"email\": \"mateuszdudek@eurofins.com\",\n" +
                "                    \"employee-number\": \"\",\n" +
                "                    \"firstname\": \"Mateusz\",\n" +
                "                    \"lastname\": \"Dudek\",\n" +
                "                    \"fullname\": \"Mateusz Dudek\",\n" +
                "                    \"salesforce-id\": null,\n" +
                "                    \"avatar-thumb-url\": \"/users/640/avatar?style=thumb\",\n" +
                "                    \"self-approval\": \"\",\n" +
                "                    \"enterprise\": \"EU-PL-GSC-CGA\",\n" +
                "                    \"custom-fields\": {\n" +
                "                        \"notes\": \"\",\n" +
                "                        \"userbusinessunit\": {\n" +
                "                            \"id\": 216328,\n" +
                "                            \"created-at\": \"2020-04-15T10:27:35-04:00\",\n" +
                "                            \"updated-at\": \"2020-04-15T10:27:35-04:00\",\n" +
                "                            \"active\": true,\n" +
                "                            \"name\": \"CDE058 - Eurofins WEJ Contaminants GmbH\",\n" +
                "                            \"description\": \"CDE058 - Eurofins WEJ Contaminants GmbH\",\n" +
                "                            \"external-ref-num\": \"CDE058 - Eurofins WEJ Contaminants GmbH\",\n" +
                "                            \"external-ref-code\": \"CDE058 - Eurofins WEJ Contaminants GmbH\",\n" +
                "                            \"parent-id\": null,\n" +
                "                            \"lookup-id\": 1205,\n" +
                "                            \"depth\": 0,\n" +
                "                            \"is-default\": false,\n" +
                "                            \"less-than-50k\": \"\",\n" +
                "                            \"less-than-100k\": \"\",\n" +
                "                            \"less-than-250k\": \"\",\n" +
                "                            \"less-than-500k\": \"\",\n" +
                "                            \"greater-than-500k\": \"\",\n" +
                "                            \"level-4-le-md\": \"\",\n" +
                "                            \"level-3-operational-leader\": \"\",\n" +
                "                            \"level-2-business-line-leader\": \"\",\n" +
                "                            \"level-1-executive-vp\": \"\",\n" +
                "                            \"le-md-16a-up-to-50k\": \"\",\n" +
                "                            \"level-3-16a-up-to-150k\": \"\",\n" +
                "                            \"level-2-16a-up-to-200k\": \"\",\n" +
                "                            \"level-1-16a-over-200k\": \"\",\n" +
                "                            \"dynamic-account\": \"\",\n" +
                "                            \"custom-fields\": {\n" +
                "                                \"approver-14\": \"\",\n" +
                "                                \"approver-15\": \"\",\n" +
                "                                \"group-approver\": \"\",\n" +
                "                                \"group-approver-2\": \"\"\n" +
                "                            },\n" +
                "                            \"lookup\": {\n" +
                "                                \"id\": 1205,\n" +
                "                                \"created-at\": \"2020-02-17T03:11:34-05:00\",\n" +
                "                                \"updated-at\": \"2020-02-17T03:11:34-05:00\",\n" +
                "                                \"active\": true,\n" +
                "                                \"name\": \"UserBusinessUnit\",\n" +
                "                                \"description\": \"UserBusinessUnit\",\n" +
                "                                \"fixed-depth\": false,\n" +
                "                                \"level-1-name\": \"\",\n" +
                "                                \"level-2-name\": \"\",\n" +
                "                                \"level-3-name\": \"\",\n" +
                "                                \"level-4-name\": \"\",\n" +
                "                                \"level-5-name\": \"\",\n" +
                "                                \"level-6-name\": \"\",\n" +
                "                                \"level-7-name\": \"\",\n" +
                "                                \"level-8-name\": \"\",\n" +
                "                                \"level-9-name\": \"\",\n" +
                "                                \"level-10-name\": \"\",\n" +
                "                                \"content-groups\": [\n" +
                "                                    {\n" +
                "                                        \"id\": 255,\n" +
                "                                        \"created-at\": \"2018-05-17T16:08:18-04:00\",\n" +
                "                                        \"updated-at\": \"2018-05-17T16:08:18-04:00\",\n" +
                "                                        \"name\": \"DE-AX\",\n" +
                "                                        \"description\": \"DE-AX ERP\",\n" +
                "                                        \"created-by\": {\n" +
                "                                            \"id\": 1574,\n" +
                "                                            \"login\": \"MDO5\",\n" +
                "                                            \"email\": \"LarsGolhar@eurofins.de\",\n" +
                "                                            \"employee-number\": \"\",\n" +
                "                                            \"firstname\": \"Lars\",\n" +
                "                                            \"lastname\": \"Golhar\",\n" +
                "                                            \"fullname\": \"Lars Golhar\",\n" +
                "                                            \"salesforce-id\": null,\n" +
                "                                            \"avatar-thumb-url\": \"/users/1574/avatar?style=thumb\",\n" +
                "                                            \"self-approval\": \"\",\n" +
                "                                            \"enterprise\": \"EU-DE\",\n" +
                "                                            \"custom-fields\": {\n" +
                "                                                \"notes\": \"\",\n" +
                "                                                \"userbusinessunit\": \"\"\n" +
                "                                            }\n" +
                "                                        },\n" +
                "                                        \"updated-by\": {\n" +
                "                                            \"id\": 1574,\n" +
                "                                            \"login\": \"MDO5\",\n" +
                "                                            \"email\": \"LarsGolhar@eurofins.de\",\n" +
                "                                            \"employee-number\": \"\",\n" +
                "                                            \"firstname\": \"Lars\",\n" +
                "                                            \"lastname\": \"Golhar\",\n" +
                "                                            \"fullname\": \"Lars Golhar\",\n" +
                "                                            \"salesforce-id\": null,\n" +
                "                                            \"avatar-thumb-url\": \"/users/1574/avatar?style=thumb\",\n" +
                "                                            \"self-approval\": \"\",\n" +
                "                                            \"enterprise\": \"EU-DE\",\n" +
                "                                            \"custom-fields\": {\n" +
                "                                                \"notes\": \"\",\n" +
                "                                                \"userbusinessunit\": \"\"\n" +
                "                                            }\n" +
                "                                        }\n" +
                "                                    }\n" +
                "                                ]\n" +
                "                            }\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"reorder-alerts\": [\n" +
                "                \"#<ReorderAlertMinmax:0x0000000039318da8>\"\n" +
                "            ],\n" +
                "            \"created-by\": {\n" +
                "                \"id\": 3357,\n" +
                "                \"login\": \"FE8Q\",\n" +
                "                \"email\": \"MagdalenaBlotko@eurofins.com\",\n" +
                "                \"employee-number\": \"\",\n" +
                "                \"firstname\": \"Magdalena\",\n" +
                "                \"lastname\": \"Blotko\",\n" +
                "                \"fullname\": \"Magdalena Blotko\",\n" +
                "                \"salesforce-id\": null,\n" +
                "                \"avatar-thumb-url\": null,\n" +
                "                \"self-approval\": \"0\",\n" +
                "                \"enterprise\": \"EU-PL-GSC-MMD\",\n" +
                "                \"custom-fields\": {\n" +
                "                    \"notes\": \"\",\n" +
                "                    \"userbusinessunit\": \"\"\n" +
                "                }\n" +
                "            },\n" +
                "            \"updated-by\": {\n" +
                "                \"id\": 4628,\n" +
                "                \"login\": \"I1CD\",\n" +
                "                \"email\": \"CecilieKarlsmose@eurofins.dk\",\n" +
                "                \"employee-number\": \"\",\n" +
                "                \"firstname\": \"Cecilie\",\n" +
                "                \"lastname\": \"Karlsmose\",\n" +
                "                \"fullname\": \"Cecilie Karlsmose\",\n" +
                "                \"salesforce-id\": null,\n" +
                "                \"avatar-thumb-url\": null,\n" +
                "                \"self-approval\": \"250\",\n" +
                "                \"enterprise\": \"EU-DK\",\n" +
                "                \"custom-fields\": {\n" +
                "                    \"notes\": \"\",\n" +
                "                    \"userbusinessunit\": \"\"\n" +
                "                }\n" +
                "            }\n" +
                "        },\n" +
                "        \"inventory-valuations\": [\n" +
                "            {\n" +
                "                \"id\": 12739,\n" +
                "                \"created-at\": \"2020-09-08T05:49:08-04:00\",\n" +
                "                \"updated-at\": \"2020-12-14T02:26:21-05:00\",\n" +
                "                \"unit-price\": \"35939.61\",\n" +
                "                \"total\": \"0.00\",\n" +
                "                \"currency\": {\n" +
                "                    \"id\": 39,\n" +
                "                    \"code\": \"DKK\",\n" +
                "                    \"decimals\": 2,\n" +
                "                    \"updated-by\": {\n" +
                "                        \"id\": 45,\n" +
                "                        \"login\": \"DW2S\",\n" +
                "                        \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                        \"employee-number\": \"\",\n" +
                "                        \"firstname\": \"Lukasz\",\n" +
                "                        \"lastname\": \"Pinkawa\",\n" +
                "                        \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                        \"salesforce-id\": null,\n" +
                "                        \"avatar-thumb-url\": null,\n" +
                "                        \"self-approval\": \"\",\n" +
                "                        \"enterprise\": \"EU-PL-GSC\",\n" +
                "                        \"custom-fields\": {\n" +
                "                            \"notes\": \"\",\n" +
                "                            \"userbusinessunit\": \"\"\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 12907,\n" +
                "                \"created-at\": \"2020-10-02T14:41:34-04:00\",\n" +
                "                \"updated-at\": \"2020-12-14T02:26:21-05:00\",\n" +
                "                \"unit-price\": \"35939.61\",\n" +
                "                \"total\": \"0.00\",\n" +
                "                \"currency\": {\n" +
                "                    \"id\": 39,\n" +
                "                    \"code\": \"DKK\",\n" +
                "                    \"decimals\": 2,\n" +
                "                    \"updated-by\": {\n" +
                "                        \"id\": 45,\n" +
                "                        \"login\": \"DW2S\",\n" +
                "                        \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                        \"employee-number\": \"\",\n" +
                "                        \"firstname\": \"Lukasz\",\n" +
                "                        \"lastname\": \"Pinkawa\",\n" +
                "                        \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                        \"salesforce-id\": null,\n" +
                "                        \"avatar-thumb-url\": null,\n" +
                "                        \"self-approval\": \"\",\n" +
                "                        \"enterprise\": \"EU-PL-GSC\",\n" +
                "                        \"custom-fields\": {\n" +
                "                            \"notes\": \"\",\n" +
                "                            \"userbusinessunit\": \"\"\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 13473,\n" +
                "                \"created-at\": \"2020-12-14T02:27:21-05:00\",\n" +
                "                \"updated-at\": \"2021-02-12T01:50:12-05:00\",\n" +
                "                \"unit-price\": \"80.00\",\n" +
                "                \"total\": \"0.00\",\n" +
                "                \"currency\": {\n" +
                "                    \"id\": 39,\n" +
                "                    \"code\": \"DKK\",\n" +
                "                    \"decimals\": 2,\n" +
                "                    \"updated-by\": {\n" +
                "                        \"id\": 45,\n" +
                "                        \"login\": \"DW2S\",\n" +
                "                        \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                        \"employee-number\": \"\",\n" +
                "                        \"firstname\": \"Lukasz\",\n" +
                "                        \"lastname\": \"Pinkawa\",\n" +
                "                        \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                        \"salesforce-id\": null,\n" +
                "                        \"avatar-thumb-url\": null,\n" +
                "                        \"self-approval\": \"\",\n" +
                "                        \"enterprise\": \"EU-PL-GSC\",\n" +
                "                        \"custom-fields\": {\n" +
                "                            \"notes\": \"\",\n" +
                "                            \"userbusinessunit\": \"\"\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 13888,\n" +
                "                \"created-at\": \"2021-02-11T05:20:55-05:00\",\n" +
                "                \"updated-at\": \"2021-02-11T05:23:02-05:00\",\n" +
                "                \"unit-price\": \"3125.01\",\n" +
                "                \"total\": \"0.00\",\n" +
                "                \"currency\": {\n" +
                "                    \"id\": 39,\n" +
                "                    \"code\": \"DKK\",\n" +
                "                    \"decimals\": 2,\n" +
                "                    \"updated-by\": {\n" +
                "                        \"id\": 45,\n" +
                "                        \"login\": \"DW2S\",\n" +
                "                        \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                        \"employee-number\": \"\",\n" +
                "                        \"firstname\": \"Lukasz\",\n" +
                "                        \"lastname\": \"Pinkawa\",\n" +
                "                        \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                        \"salesforce-id\": null,\n" +
                "                        \"avatar-thumb-url\": null,\n" +
                "                        \"self-approval\": \"\",\n" +
                "                        \"enterprise\": \"EU-PL-GSC\",\n" +
                "                        \"custom-fields\": {\n" +
                "                            \"notes\": \"\",\n" +
                "                            \"userbusinessunit\": \"\"\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": 13891,\n" +
                "                \"created-at\": \"2021-02-11T15:10:02-05:00\",\n" +
                "                \"updated-at\": \"2021-02-11T15:10:02-05:00\",\n" +
                "                \"unit-price\": \"3593961.00\",\n" +
                "                \"total\": \"17969805.00\",\n" +
                "                \"currency\": {\n" +
                "                    \"id\": 39,\n" +
                "                    \"code\": \"DKK\",\n" +
                "                    \"decimals\": 2,\n" +
                "                    \"updated-by\": {\n" +
                "                        \"id\": 45,\n" +
                "                        \"login\": \"DW2S\",\n" +
                "                        \"email\": \"LukaszPinkawa@eurofins.com\",\n" +
                "                        \"employee-number\": \"\",\n" +
                "                        \"firstname\": \"Lukasz\",\n" +
                "                        \"lastname\": \"Pinkawa\",\n" +
                "                        \"fullname\": \"Lukasz Pinkawa\",\n" +
                "                        \"salesforce-id\": null,\n" +
                "                        \"avatar-thumb-url\": null,\n" +
                "                        \"self-approval\": \"\",\n" +
                "                        \"enterprise\": \"EU-PL-GSC\",\n" +
                "                        \"custom-fields\": {\n" +
                "                            \"notes\": \"\",\n" +
                "                            \"userbusinessunit\": \"\"\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        ]}]";


        JSONArray ItemNumbers = new JSONArray();
        JSONArray ItemNumbersResponse = new JSONArray(obj);
        if(ItemNumbersResponse.length()!=0){
            for(int k = 0; k < ItemNumbersResponse.length(); k++){
                JSONObject itemNumber = (JSONObject) ItemNumbersResponse.get(k);
                JSONArray inventoryValuations = (JSONArray) itemNumber.get("inventory-valuations");
                if(inventoryValuations.length()>1){
                    JSONArray inventoryValuArr = new JSONArray();
                    JSONObject inventoryValuObj = (JSONObject) inventoryValuations.get(inventoryValuations.length()-1);
                    inventoryValuArr.put(inventoryValuObj);
                    itemNumber.put("inventory-valuations",inventoryValuArr);
                }
                ItemNumbers.put(itemNumber);
            }
        }
        System.out.println(ItemNumbers.toString());
    }
}
