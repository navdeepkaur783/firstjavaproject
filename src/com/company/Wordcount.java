package com.company;

public class Wordcount {

    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nisl ex, ultricies vitae egestas et, lobortis sit " +
                "amet velit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vivamus placerat " +
                "sem quis semper rhoncus. Aenean lacus nisi, dictum vitae pulvinar et, mattis et mi. Quisque ut arcu in elit rutrum " +
                "ultricies. Proin iaculis mauris consequat leo luctus, eget porttitor tortor mattis. Vestibulum ut euismod nulla, ac" +
                " tempus libero. Aenean molestie, odio a ornare rhoncus, ipsum purus eleifend lacus, et accumsan sem enim eu nisl. " +
                "Duis condimentum, nunc a aliquet semper, ipsum sapien aliquet mi, luctus commodo velit turpis sit amet quam. Etiam " +
                "felis nisi, ornare et condimentum id, pharetra ut ante. Ut vehicula scelerisque dapibus. Curabitur blandit quis erat " +
                "vel tempor. Donec fermentum purus eget eros porta malesuada";
        String[] split = str.split(" ");
        int count=0;
        for(String st:split)
        {
            if(st.length()>=5)
            {
                count++;
            }
        }
        System.out.println(count);
        char[] chars= str.toCharArray();
        int charCount=0;
        for(char ch:chars)
        {
            if(ch=='A'||ch=='a')
            {
                charCount++;
            }
        }
        System.out.println(charCount);
        String upper=str.toUpperCase();
        int charCount1=0;
        while(upper.indexOf("A")!=-1)
        {
            charCount1++;
            upper=upper.substring(upper.indexOf("A")+1);
        }

    }


}
