

	import java.io.BufferedReader;
import java.io.InputStreamReader;

	public class zodiac
	{
	public static void main(String[] args) throws Exception 
	{
	BufferedReader keyIn = new BufferedReader (new InputStreamReader(System.in));
	
	String[] array1 = {"January", "February", "March", "April", "May", "June", 
			"July", "August", "September", "October", "November", "December"};

	for (int i=0; i<=11; i++) {
		System.out.println(array1[i]);
	}

	System.out.print("What month were you born in (1-12)?" );
	int month = Integer.parseInt(keyIn.readLine());

	System.out.print("In what day?" );
	int day = Integer.parseInt(keyIn.readLine());

	String zodiacSign = " ";
	
	//System.out.println(array1[0] + array1[11]);
	switch (month)
	{
	case 1 :
	if (day > 0 && day <= 20)
	zodiacSign = "Capricorn, You may have been conceived during a sexy Easter egg hunt";
	else if (day > 20 && day < 32)
	zodiacSign = "Aquarius,You may have been conceived on Mothers Day.";
	else
	zodiacSign = "INVALID INPUT";
	break;

	case 2 :
	if (day > 0 && day <= 19)
	zodiacSign = "Aquarius,You may have been conceived on Mothers Day.";
	else if (day > 19 && day < 30)
	zodiacSign = "Pisces, You may have been coneived at someone's wedding.";
	else
	zodiacSign = "INVALID INPUT";
	break;

	case 3 :
	if (day > 0 && day <= 20)
	zodiacSign = "Pisces, You may have been coneived at someone's wedding";
	else if (day > 20 && day < 32)
	zodiacSign = "Aries, You may have been conceived after a 4th of July fireworks show.";
	else
	zodiacSign = "INVALID INPUT";
	break;
	
	case 4 :
	if (day > 0 && day <= 20)
	zodiacSign = "Aries, You may have been conceived after a 4th of July fireworks show.";
	else if (day > 20 && day < 31)
	zodiacSign = "Taurus, You may have been conceived on a hot August day.";
	else
	zodiacSign = "INVALID INPUT";
	break;
	
	case 5 :
	if (day > 0 && day <= 21)
	zodiacSign = "Taurus, You may have been conceived on a hot August day.";
	else if (day > 21 && day < 32)
	zodiacSign = "Gemini, You may have been conceived as the leaves began to change.";
	else
	zodiacSign = "INVALID INPUT";
	break;
	
	case 6 :
	if (day > 0 && day <= 21)
	zodiacSign = "Gemini, You may have been conceived as the leaves began to change.";
	else if (day > 21 && day < 31)
	zodiacSign = "Cancer, You may have been conceived by people trying on costumes.";
	else
	zodiacSign = "INVALID INPUT";
	break;
	
	case 7 :
	if (day > 0 && day <= 22)
	zodiacSign = "Cancer, You may have been conceived by people trying on costumes.";
	else if (day > 22 && day < 32)
	zodiacSign = "Leo, You may have been conceived during Thanksgiving.";
	else
	zodiacSign = "INVALID INPUT";
	break;

	case 8 :
	if (day > 0 && day <= 21)
	zodiacSign = "Leo, You may have been conceived during Thanksgiving.";
	else if (day > 21 && day < 32)
	zodiacSign = "Virgo, You may have been conceived while a Christmas song played.";
	else
	zodiacSign = "INVALID INPUT";
	break;

	case 9 :
	if (day > 0 && day <= 23)
	zodiacSign = "Virgo, You may have been conceived while a Christmas song played.";
	else if (day > 23 && day < 31)
	zodiacSign = "Libra, You may have been conceived after a New Years Eve party.";
	else
	zodiacSign = "INVALID INPUT";
	break;

	case 10 :
	if (day > 0 && day <= 23)
	zodiacSign = "Libra, You may have been conceived after a New Years Eve party.";
	else if (day > 23 && day < 32)
	zodiacSign = "Scorpio, You may have been conceived by people stuck inside after a long winter.";
	else
	zodiacSign = "INVALID INPUT";
	break;

	case 11 :
	if (day > 0 && day <= 22)
	zodiacSign = "Scorpio, You may have been conceived by people stuck inside after a long winter.";
	else if (day > 22 && day < 31)
	zodiacSign = "Sagittarius, You may have been conceived during March madness.";
	else
	zodiacSign = "INVALID INPUT";
	break;
	
	case 12 :
	if (day > 0 && day <= 22)
	zodiacSign = "Sagittarius, You may have been conceived during March madness.";
	else if (day > 22 && day < 32)
	zodiacSign = "You may have been conceived during a sexy Easter egg hunt";
	else
	zodiacSign = "INVALID INPUT";
	break;
	
	default :
	zodiacSign = "INVALID INPUT";

	}

	System.out.println("Your zodiac sign is " + zodiacSign + ".");
	}

}


