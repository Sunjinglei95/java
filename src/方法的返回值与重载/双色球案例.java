package �����ķ���ֵ������;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ˫ɫ���� {

	public static void main(String[] args) {
		//������ر���
		int[] userRedBall=new int[6];
		int[] sysRedBall=new int[6];
		int userBlueBall = 0;//
		int sysBlueBall = 0;
		int redCount=0;//ѡ����ȷ�ĺ�����
		int blueCount=0;//ѡ����ȷ��������
		int[] redBall=new int[33];
		//�������6��1����33֮�䲻�ظ�����
		Random r=new Random();
		for(int i=0;i<redBall.length;i++) {
			redBall[i]=i+1;
		}
		
		//��Ϸ��ʼ
		System.out.println("˫ɫ����Ϸ��ʼ");
		System.out.println("��ѡ����ѡ1��2");
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			int isAuto = input.nextInt();
			switch(isAuto) {
			case 1:
				computerSelection(redBall,userRedBall);
				
					System.out.println(Arrays.toString(userRedBall));
				
				userBlueBall=r.nextInt(6)+1;
				System.out.println(userBlueBall);
				flag=false;
				break;
			case 2:
				for(int i=0;i<userRedBall.length;i++) {
					userRedBall[i]=input.nextInt();
				}
				userBlueBall=input.nextInt();
				flag=false;
				break;
			default:
				break;
			}
		}
		//ϵͳ����
		computerSelection(redBall,sysRedBall);
		System.out.println(Arrays.toString(sysRedBall));
		sysBlueBall=r.nextInt(6)+1;
		System.out.println(sysBlueBall);

		//ͳ�ƽ��
		//ͳ�ƺ���
		for(int i=0;i<userRedBall.length;i++) {
			for(int j=0;j<sysRedBall.length-redCount;j++) {
				if(userRedBall[i]==sysRedBall[j]) {
					int temp = sysRedBall[j];
					sysRedBall[j] = sysRedBall[sysRedBall.length-i-redCount];
					sysRedBall[sysRedBall.length-i-redCount]=temp;
					redCount++;
				}
			}
		}
		//ͳ������
		if(userBlueBall==sysBlueBall) {
			blueCount++;
		}
		if(redCount==6&&blueCount==1)
			System.out.println("һ�Ƚ�");
		else
			System.out.println("weizhongjiang");
	}
	
	//��ָ���������������6�����ظ��������㷨
	public static void computerSelection(int[] redBall,int[] userRedBall)
	{
		Random r=new Random();
		int index=-1;
		for(int i=0;i<userRedBall.length;i++) {
			index=r.nextInt(redBall.length-i);
			userRedBall[i]=redBall[index];
			
			int temp=redBall[index];
			redBall[index]=redBall[redBall.length-1-i];
			redBall[redBall.length-1-i]=temp;
		}
		
	}
}
