public class Saiki{
	static int result=1;

	public static void main(String[]args){
		Factorial(5);
		System.out.println("再帰処理での階乗の計算結果は"+Saiki_Factorial(5)+"です");
		System.out.println("50の二進数表示は");
		Binary_number_conversion(50);//数字一つ一つ表示して繋げるから
		System.out.println("");
	}

	//階乗の計算をするメソッド
	public static void Factorial(int start){
		for(int i=start;i>0;i--){
			result*=i;//×5、×4、×3・・・と計算していく
		}
		System.out.println("通常の繰り返しでの計算結果は"+result+"です");
	}

	//再帰処理
	public static int Saiki_Factorial(int start){
		if(start<=1){//これをしないと、0、-1、-2・・・と止まらなくなってしまう
			return start;
		}
		return (start*Saiki_Factorial(start-1));//再帰処理の部分。関数を関数が呼んでいる
	}

	//二進数に変換するメソッド
	public static void Binary_number_conversion(int n){
		System.out.print("次に計算する値は"+n+"だ");
		if(n<2){
			System.out.print(n);
		}else{
			Binary_number_conversion((int)Math.floor(n/2));//繰り返すたびに、数字を2で割っていく
			System.out.print(n%2);//110010(再帰処理の場合は、表示が逆になる)
		}
	}
}
