//package com.yjp.kafkaspringboot;
//
//import com.yjp.kafkaspringboot.test.KafkaProducerProperties;
//import com.yjp.kafkaspringboot.test.KafkaSendRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class KafkaSpringbootApplicationTests {
//
//
//    @Autowired
//    KafkaProducerProperties kafkaProperties;
//    @Autowired
//    private KafkaSendRepository kafkaSendRepository;
//
//
//    @Test
//    public void test1() throws InterruptedException {
////        kafkaSendRepository.sendMessage(kafkaProperties.getTopic(), 100, "{\"isCreateOrder\":1,\"isOrderComplete\":1,\"orderUserId\":222409,\"itemProductId\":11700003077515,\"orderSaleManId\":null,\"itemId\":169368317216256247,\"itemTotalAmount\":41.00,\"orderCityId\":117,\"itemProductSaleMode\":0,\"orderCreateTimeHH\":2018032820,\"orderCompleteTimeHH\":2018033020,\"orderId\":117018032820589653,\"latestUpdateTime\":1522238417011,\"orderNo\":\"117808700304\",\"orderType\":0,\"statisticsPackageCount\":1.00,\"orderEnvChannelType\":0,\"jiupiOrderType\":null,\"orderItemPropertyFirstCategoryId\":1,\"itemPrice\":22.00}");
////
////        Map<String, Object> map = new HashMap<>();
////        map.put("database", "yjp_bizuserwallet_1");
////        map.put("table", "couponcode");
////        map.put("type", "insert");
////        map.put("ts", "1553822833");
////        map.put("xid", "8993219992");
////        map.put("commit", true);
////        kafkaSendRepository.sendMessage(kafkaProperties.getTopic(), 100, JSONObject.toJSONString(map));
//
//        kafkaSendRepository.sendMessage(kafkaProperties.getTopic(), 100, "\"{\\\"database\\\":\\\"yjp_broker\\\",\\\"table\\\":\\\"brokerregionordersync\\\",\\\"type\\\":\\\"update\\\",\\\"ts\\\":1554858429,\\\"xid\\\":474102006,\\\"commit\\\":true,\\\"server_id\\\":2,\\\"data\\\":{\\\"id\\\":169368317038937789,\\\"orderid\\\":102119040819376528,\\\"orderitemid\\\":169368317927945433,\\\"city_id\\\":102,\\\"state\\\":2,\\\"regionbrokerid\\\":1430,\\\"crmchannelid\\\":169368317027002993,\\\"salaryratio\\\":1.00,\\\"returnorderid\\\":null,\\\"returnorderitemid\\\":null,\\\"createtime\\\":\\\"2019-04-08 19:51:03\\\",\\\"lastmodifytime\\\":\\\"2019-04-10 09:07:09\\\",\\\"salarybrokerid\\\":1430,\\\"ordercompletetime\\\":\\\"2019-04-10 09:07:06\\\",\\\"bizuser_id\\\":116950},\\\"old\\\":{\\\"state\\\":1,\\\"lastmodifytime\\\":\\\"2019-04-08 19:51:03\\\",\\\"ordercompletetime\\\":null}}\"");
//
////        for (int i = 0; i < 500; i++) {
////            Thread.sleep(500);
////            kafkaSendRepository.sendMessage(kafkaProperties.getTopic(), 1, String.valueOf(i));
////        }
//    }
//
//}
