/*
練習問題1
3回目に交換される値は何と何か？
*/
public class Practice1{
	public static void main(String[]args){
		int a[]={50,16,30,48,52,28};
		int swapped=0;//正しい順番かどうかのフラグ。最初はフラグを立てておく
		int temp=0;//仮に代入される数字
		int n;//ループと、数字交換に使うための添え字の変数
		//練習問題要素
		int count=0;//交換処理を行った回数をカウントするため
		int numeric_exchanged_in_third_time[]=new int[2];//3回目に交換した数字

		System.out.println("--------整列前--------");
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}

		//バブルソート本体
		swapped=1;
		while(swapped==1){
			swapped=0;
			for(int i=0;i<5;i++){
				if(a[i]>a[i+1]){//交換する必要があるかを調べる
					count++;//交換処理を行った回数をカウントしている
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped=1;
					if(count==3){//3回目に交換した数字を代入している
						numeric_exchanged_in_third_time[0]=a[i];
						numeric_exchanged_in_third_time[1]=a[i+1];
					}
				}
			}
		}
		System.out.println("--------整列後--------");
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}

		System.out.println("3回目に交換した数字は"+numeric_exchanged_in_third_time[0]+"と"+numeric_exchanged_in_third_time[1]+"です");
	}
}
/*
50,16,30,48,52,28
16,50,30,48,52,28
16,30,50,48,52,28
16,30,48,50,52,28
16,30,48,50,28,52
一回目の走査が終わり
16,30,48,50,28,52
16,30,48,28,50,52
16,30,28,48,50,52
16,28,30,48,50,52
*/
