public class QuickSort{
	static int a[]={87,35,60,72,55,43,28,67,95,31};
	static int i;//繰り返しで使う
	static int j;//繰り返しで使う
	static int x;//
	static int temp;//仮に代入される変数
	public static void main(String[]args){
		Quick(3,5);
	}

	//クイックソートの本体
	public static void Quick(int left,int right){
		i=left;
		j=right;
		x=a[(int)Math.floor((left+right)/2)];
		do{
			while(a[i]<x){i++;}
			while(x<a[j]){j--;}
			if(i<=j){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		while(i<=j);
		if(left<j){Quick(left,j);}
		if(i<right){Quick(i,right);}
	}
}
/*
クイックソートとは、バブルソートやセレクションソートよりも高速
整列アルゴリズムの中では最速。
配列要素のどれか一つを取り出す。
仕組みとしては、最初に配列からある数値xを取り出す。xより小さな要素は前半に、大きい要素は後半に配列を分割する。
前半部分をクイックソートする。
後半部分をクイックソートする。

大きさ10の配列を考える。
a[0]、a[1]、a[2]、a[3]・・・と10個入っている
a[4]を基準にして、その値より小さい値と大きい値に分ける。基準にする場所はどれでもいいが、真ん中だからa[4]にした。

分割の例では、
87,35,60,72,「55」,43,28,67,95,31の順番で作成したとすると、基準にしたのは55。左側から55より大きい値を探し、右側から55より小さい要素を探す。
左側では、まず最初に55より大きい87を発見。右側では55より小さい31を発見する。これらを入れ替える。これを繰り返す

*/
