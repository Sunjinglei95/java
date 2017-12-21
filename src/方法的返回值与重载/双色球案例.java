package 方法的返回值与重载;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 双色球案例 {

	public static void main(String[] args) {
		//定义相关变量
		int[] userRedBall=new int[6];
		int[] sysRedBall=new int[6];
		int userBlueBall = 0;//
		int sysBlueBall = 0;
		int redCount=0;//选择正确的红球数
		int blueCount=0;//选择正确的篮球数
		int[] redBall=new int[33];
		//随机生成6个1——33之间不重复的数
		Random r=new Random();
		for(int i=0;i<redBall.length;i++) {
			redBall[i]=i+1;
		}
		
		//游戏开始
		System.out.println("双色球游戏开始");
		System.out.println("机选或手选1、2");
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
		//系统生成
		computerSelection(redBall,sysRedBall);
		System.out.println(Arrays.toString(sysRedBall));
		sysBlueBall=r.nextInt(6)+1;
		System.out.println(sysBlueBall);

		//统计结果
		//统计红球
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
		//统计篮球
		if(userBlueBall==sysBlueBall) {
			blueCount++;
		}
		if(redCount==6&&blueCount==1)
			System.out.println("一等奖");
		else
			System.out.println("weizhongjiang");
	}
	
	//在指定数组中随机生成6个不重复的数的算法
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
