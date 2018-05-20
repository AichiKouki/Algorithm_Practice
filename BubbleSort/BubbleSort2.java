import java.util.Arrays;//配列を使う上での便利な機能の提供(配列をソートしたい、配列の要素を検索したい)

public class BubbleSort2{

	public static void main(String[] args) {
		
		//ソートしたい数字をまず用意
		int[] array = new int[] { 5, 4, 6, 7, 1, 9, 8, 2, 3 };
		
		//一番左から隣り合う二つの値を比べて、入れ替える
		//昇順の場合、一周するたびに、一番右の値は一番大きい値で固定になる
		//ループするたびに、右の値が確定して固定になるので、それを繰り返す
		for(int i = 0; i < array.length; i++){//配列の要素数ぶん繰り返す
		//右の値として1つ先からスタートするから-1する
		//「-i」は、ループするたびに右の値が一番大きいと確定するので、次第に比べる値が狭くなるから
			for(int j = 0; j < array.length - 1 - i; j++){
				if(array[j] > array[j + 1]){//左と右の値を比べて、左のほうが大きかったら入れ替え処理
					int tmp = array[j];//左のほうが大きかったら入れ替える必要があるのでtmpに入れる
					array[j] = array[j + 1];//右の値を左に入れる
					array[j + 1] = tmp;//さっきtmpに入れた右の値を右に入れる(これで入れ替え完了)
				}
			}
		}
		//入れ替えが終了(forの多重ループが終了)したら、入れ替え結果を表示
		System.out.println(Arrays.toString(array));
	}
}
/*
バブルソートとは、配列のリストの中の隣り合う値を比べて、入れ替えを繰り返す
*/