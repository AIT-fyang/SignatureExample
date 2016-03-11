package com.mycompany.customalgorithmsignatureexample;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Formatter;

/**
 *
 * @author JL-SSD
 */
public class Example {
    private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";
    private static String publicKey = "mnsAI6";
    private static String secret = "k3_W50+j?";
    public static String message = "{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}";
    public static String shortMessage = "aoj2j1o3jo123jdjsaodjfdsaf423";
    public static String shortMessage2 = "o12j39sannnioq23542153";
    public static String shortMessage3 = "7777777adsfer+-a-_--w-41k[14f{''";
    public static String longMessage = "{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}{\"fName\":\"Johnny\",\"lName\":\"Vu\",\"bizName\":\"Johnny's Shoe Store\",\"bizPhone\":\"514-999-999\",\"email\":\"johnny@jshoes.ca\",\"finAmount\":\"$25,000 to $50,000\",\"finReason\":\"Hiring new staff\",\"externalId\":\"16jss+loek1wva\",\"ownerInfo\":{\"dob\":\"31-12-1976\",\"title\":\"President\",\"homeAddr\":\"411 Elephant Castle\",\"homeAddrCity\":\"Montreal\",\"homeAddrProv\":\"Quebec\",\"homeAddrPostal\":\"H1F6K1\",\"homePhone\":\"514-888-0898\",\"mobile\":\"514-999-0123\",\"ownership\":75.5,\"sin\":\"999999999\"}}";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String timestamp;
        System.out.println("\r\n----------------------------------------\r\nTesting normal message:");
        timestamp = getTimeStamp();
        test(message,timestamp);
        
        timestamp = getTimeStamp();
        test(message,timestamp);
        
        
        
        System.out.println("\r\n----------------------------------------\r\nTesting short message:");
        timestamp = getTimeStamp();
        test(shortMessage,timestamp);
        
        timestamp = getTimeStamp();
        test(shortMessage2,timestamp);
        
        timestamp = getTimeStamp();
        test(shortMessage3,timestamp);
        
        
        
        System.out.println("\r\n----------------------------------------\r\nTesting long message:");
        timestamp = getTimeStamp();
        test(longMessage, timestamp);
        
        System.out.println("Aborting");
    }
    
    public static void test(String data, String timestamp){
        System.out.println("Message Length - " + data.length() + " characters");
        long start = System.nanoTime();
        String signature = sign(data, timestamp);
        long end = System.nanoTime();
        long microseconds = (end - start) / 1000;
        long millseconds = microseconds / 1000;
        System.out.println("Time cost(milliseconds) - " + millseconds + " ;  microseconds:" + microseconds);
        System.out.println("Signature - " + signature);
        System.out.println("Verify Signature - " + (verify(data, timestamp, signature) ? "[success]" : "[failed]"));
    }
    
    private static String sign(Object data, String timestamp) {
        try {
            String toSign = data.toString().concat(publicKey).concat(timestamp);
            String signature = hmacSha1(toSign, secret);
            return signature;
        } catch (Exception e) {
            System.out.println("Error - method sign:" + e.getMessage());
        }
        return null;
    }
    
    private static boolean verify(Object data, String timestamp, String signature){
        return sign(data, timestamp).equals(signature);
    }
    
    public static String utf8(String str){
        try{
            byte[] bytes = str.getBytes("UTF8");
            return new String(bytes, "UTF-8");
        }catch(Exception ex){
            System.out.printf("Error: make utf-8 string:" + ex.getMessage());
        }
        return "";
    }
    /**
     * @author fyang
     * @date  3/10/16
     * @descripton hmacSha1 calculation, all string need convert to utf8 bytes, otherwise signature will be different
     * also beware, signature will be different if time stamp changed
     */
    public static String hmacSha1(String data, String key)//calculateRFC2104HMAC
            throws SignatureException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            SecretKeySpec signingKey = new SecretKeySpec(key.getBytes("UTF8"), HMAC_SHA1_ALGORITHM);
            Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
            mac.init(signingKey);
            return toHexString(mac.doFinal(data.getBytes("UTF8")));
        } catch (Exception ex) {

        }
        return "";
    }
    
    private static String toHexString(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }

        return formatter.toString();
    }
    
    private static String getTimeStamp(){
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
        System.out.println("currentTimestamp: " + currentTimestamp.toString());
        return currentTimestamp.toString();
    }
    
}

