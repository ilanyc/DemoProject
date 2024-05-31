package datedemo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneExample2 {

	public static void main(String[] args) {
	
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		for (String zoneId : zoneIds) {
		    if (zoneId.equals("Asia/Dacca")) {
		        System.out.println(zoneId);
		        break; 
		        
}
   }
	 }
        }
