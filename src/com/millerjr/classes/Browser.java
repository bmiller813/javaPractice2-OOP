package com.millerjr.classes;

public class Browser {
    public void navigate(String address){
     String ip = findIpAddress(address);
     String html = sentHttpRequest(ip);
     System.out.println(html);
    }

    private String sentHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.01";
    }
}
