public class Practice{
	public static void main(String[]args){
		int a[]={50,16,30,48,52,28};
		int swapped=0;//正しい順番かどうかのフラグ。最初はフラグを立てておく
		int temp=0;//仮に代入される数字
		int n;//ループと、数字交換に使うための添え字の変数
		swapped=1;
		while(swapped==1){
			swapped=0;
			for(int i=0;i<5;i++){
				if(a[i]>a[i+1]){//交換する必要があるかを調べる
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped=1;
				}
			}
		}
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
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
