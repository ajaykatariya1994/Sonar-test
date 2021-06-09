package LabBook1;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class ZoneId1 {

	
	public static void main(String[] args) {
		ZonedDateTime currentTime =ZonedDateTime.now();
		ZonedDateTime currentTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime currentTimeInNewYork =currentTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		ZonedDateTime currentTimeInTokyo =currentTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
		ZonedDateTime currentTimeInPacific =currentTime.withZoneSameInstant(ZoneId.of("US/Pacific"));
		ZonedDateTime currentTimeInCairo =currentTime.withZoneSameInstant(ZoneId.of("Africa/Cairo"));
		ZonedDateTime currentTimeInSydney =currentTime.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
		
		
		
		System.out.println("India: "+ currentTime);
		System.out.println("Paris: "+ currentTimeInParis);
		System.out.println("New York: "+ currentTimeInNewYork);
		System.out.println("Tokyo: "+ currentTimeInTokyo);
		System.out.println("Pacific: "+ currentTimeInPacific);
		System.out.println("Cairo: "+ currentTimeInCairo);
		System.out.println("Sydney: "+ currentTimeInSydney);
}
}
