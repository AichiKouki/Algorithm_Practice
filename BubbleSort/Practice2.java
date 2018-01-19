/*
練習問題2
最後に交換される配列要素の添え字は？(最後の二つの添え字)
終わり
*/
public class Practice2{
	public static void main(String[]args){
		int a[]={50,16,30,48,52,28};
		int swapped=0;//正しい順番かどうかのフラグ。最初はフラグを立てておく
		int temp=0;//仮に代入される数字
		int n;//ループと、数字交換に使うための添え字の変数
		//練習問題要素
		int count=0;
		int numeric_replaced_last[]=new int[2];

		//バブルソート本体
		swapped=1;
		while(swapped==1){
			swapped=0;
			for(int i=0;i<5;i++){
				if(a[i]>a[i+1]){//交換する必要があるかを調べる
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped=1;
					//最後に交換した数字の添え字を入れている。直接ここに処理すれば、毎回最後のの添え字が更新される。
					numeric_replaced_last[0]=i;
					numeric_replaced_last[1]=i+1;
				}
			}
		}

		System.out.println("最後に交換した配列要素の添え字は"+numeric_replaced_last[0]+"と"+numeric_replaced_last[1]+"です");
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
