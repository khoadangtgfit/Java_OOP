package BaiTap;

import java.util.Scanner;

public class baitoancaitui {

	static data a[]=new data[105];
    static int dp[][]=new int[110][110];
    static int res=0;
    public class data {
        int w=0;
        int v=0;    
    }
    public static int [][] Solve(int n,int M) {
        for(int i=0;i<n;i++){
            for(int j=1;j<=M;j++){
                if(j<a[i].w){
                    dp[i][j]=dp[i-1][j];
                }
                else
                    dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-a[i].w]+a[i].v);
            }
        }
        return dp;
    }
    public static void main(String[] args) {
        int n;
        int M;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n:");
        n=sc.nextInt();
        System.out.println("Nhap M:");
        sc.close();
        M=sc.nextInt();
        for(int i=0;i<=n;i++) {
        	System.out.println("w:");
        	a[i].w=sc.nextInt();
        	System.out.println("v:");
        	a[i].v=sc.nextInt();
        }
        int t[][]=Solve(n, M);
        for(int i=0;i<n;i++){
            for(int j=0;j<M;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }

}
