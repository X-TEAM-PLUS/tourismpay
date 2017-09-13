package com.xteam.tourismpay;

import org.junit.Test;


import static org.junit.Assert.*;

public class PFTMXStubTest {
    private static final String account = "100019";

    private static final String pwd = "jjl4yk11f82ce6c0f33a5c003f2fec56";

    /**
     * 通过webService调用景区列表接口1.1
     */
    @Test
    public  void getScenieSpotList() {

        try {
            //通过axis2自动生成的web service客户端的代码类
            com.xteam.tourismpay.PFTMXStub pFTMXStub = new com.xteam.tourismpay.PFTMXStub();

            //创建接口对应对象
            com.xteam.tourismpay.PFTMXStub.Get_ScenicSpot_List get_ScenicSpot_List = new com.xteam.tourismpay.PFTMXStub.Get_ScenicSpot_List();
            //设置接口调用参数
            get_ScenicSpot_List.setAc(account);
            get_ScenicSpot_List.setPw(pwd);
            get_ScenicSpot_List.setN("10");
            get_ScenicSpot_List.setM("");
            //获取接口响应值
            com.xteam.tourismpay.PFTMXStub.Get_ScenicSpot_ListResponse get_ScenicSpot_ListResponse = pFTMXStub
                    .get_ScenicSpot_List(get_ScenicSpot_List);
            String result = get_ScenicSpot_ListResponse.getGet_ScenicSpot_List();

            System.out.println(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }


    @Test
    public  void PFT_Order_Submit() {

        try {
            //通过axis2自动生成的web service客户端的代码类
            com.xteam.tourismpay.PFTMXStub pFTMXStub = new com.xteam.tourismpay.PFTMXStub();

            //创建接口对应对象
            com.xteam.tourismpay.PFTMXStub.PFT_Order_Submit order_submit = new com.xteam.tourismpay.PFTMXStub.PFT_Order_Submit();
            //设置接口调用参数
            order_submit.setAc(account);
            order_submit.setPw(pwd);

            //设置接口调用参数
            order_submit.setAc(account);
            order_submit.setPw(pwd);
            order_submit.setLid("2633"); //景区的ID 号int （注：2.1&门票接口的UUlid）  2633
            order_submit.setTid("5715");//门票的ID 号int （注：2.1&门票接口的UUid）
            order_submit.setRemotenum("JQ11123455123");//远端订单号 String（贵网站的唯一订单号，请确保唯一，不能为空）
            order_submit.setTprice("10");//单价(分单位)int
            order_submit.setTnum("1");//数量 int
            order_submit.setPlaytime("2017-10-02");//游玩时间 Date(e.g.2012-03-16)
            order_submit.setOrdername("测试test");//取票人姓名 String （使用测试接口，取票人姓名必须为‘测试test’）
            order_submit.setOrdertel("13521846578");//取票人手机 String
            order_submit.setContactTEL("13521846578");//联系人手机String
            order_submit.setSmsSend("1");//是否需要发送短信 int （0 发送 1 不发送 注：发短信只会返回双方订单号，不发短信才会将凭证信息返回）
            order_submit.setPaymode("0");//扣款方式int （0 使用账户余额 2 使用供应商处余额 4 现场支付 注：余额不足返回错误122）
            order_submit.setOrdermode("0");//下单方式 int （0 正常下单1 手机用户下单 注：如无特殊请使用正常下单）
            order_submit.setAssembly("");//集合地点 （线路时需要，可为空）
            order_submit.setSeries("");//团号 （线路时需要，可为空）（场次信息获取接口详情 3.7 方法。必填参数 格式：
            // json_encode(array(（int）场馆 id,（int）场次 id,（string）分区 id));）
            order_submit.setConcatID("0");//联票ID （未开放，请填0）
            order_submit.setPCode("0");//套票ID （未开放，请填0）
            order_submit.setM("113");//供应商ID （注：2.1 查询门票列表的UUaid）
            order_submit.setPersonID("640322199307130913");//身份证号码


            //获取接口响应值
            com.xteam.tourismpay.PFTMXStub.PFT_Order_SubmitResponse  order_submitResponse = pFTMXStub.pFT_Order_Submit(order_submit);
            String result = order_submitResponse.getPFT_Order_Submit();
            System.out.println(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}