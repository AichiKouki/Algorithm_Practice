public class SelectionSort{
	public static void main(String[]args){
		int a[]=new int[1000];
		for(int i=0;i<1000;i++){
			a[i]=(int)Math.floor(Math.random()*1000);//0から1000までの乱数を作成し配列に入れている
			System.out.println(a[i]);
		}
	}
}
/*
セレクションそーとは、比較的単純なアルゴリズムに基づいている
セレクションソートはバブルソートより簡単だと感じる人もいる

*/
