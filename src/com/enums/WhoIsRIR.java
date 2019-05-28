package com.enums;

public enum WhoIsRIR {
	
	  ARIN("whois.arin.com"),
	    RIPE("whois.ripe.com"),
	    APNIC("whois.apnic.com"),
	    AFRINIC("whois.afrinic.com"),
	    LACNIC("whois.lacnic.com"),
	    JPNIC("whois.nic.co.uk"),
	    KRNIC("whois.nic.com"),
	    CNNIC("ipwhois.cnnic.cn"),
	    UNKNOWN("");
	
	private String url;
	
	WhoIsRIR(String url) {
	        this.url = url;
	    }

	    public String get() {
	        return url;
	    }

}
