import java.util.Scanner;
public class BowlingGame{
public int getBowlingScore(String frame){
	int[] score=new int[22];
	int total=0;
	int j=0;
	int i;
	for (i=0;i<frame.length();i++){
	char c=frame.charAt(i);
	switch(c)
	{
		case 'X':score[j++]=10;
			score[j++]=0;
		break;
		case '/':score[j++]=10-score[j-2];
		break;
		case '-':score[j++]=0;
		break;
		case '|':
		break;
		default:score[j++]=c-'0';
	}
	}
	for (i=0;i<20;i+=2)
	{
		if(score[i]==10)
		{
			if (score[i+2]==10)
				total+=20+score[i+4];
			else
				total+=10+score[i+2]+score[i+3];
		}
		else if(score[i]+score[i+1]==10)
		{
			total+=10+score[i+2];
		}
		else
		{
			total+=score[i]+score[i+1];
		}
	}
	return total;
}
}
