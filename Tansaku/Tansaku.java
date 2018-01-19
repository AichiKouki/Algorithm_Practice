public class Tansaku{
	//線形探索
	static String teacher[]={"むとう","あべ","いけべ","まつもと","かわい","さくま","やぎゅう","まつばら","しゃくし","えら","ひろうち","さの","終"};
	static String target="まつもと";
	static int found=0;//見つけたかどうかのフラグ
	static int i;//繰り返しでの変数に使う

	//二分探索
	//アイウエオ順になっているので、昇順と同じ。二分探索の場合、このように整列tされたデータじゃないと意味がない
	static int number[]=new int[100];
	static int target2=20;
	static int found2=0;//見つけたかどうかのフラグ
	static int middle=0;
	static int top=100;
	static int bottom=0;
	static int j;//繰り返しでの変数に使う


	public static void main(String[]args){
		//線形探索
		//for文の条件式に関しては、teacherの配列の中身が「終」ではない　かつ　まだ見つかっていないことを表すfound=0であるかどうか
		for(i=0;teacher[i]!="終" && found==0;i++){
			if(teacher[i]==target) found=1;//ターゲットを見つけたらfoundに1を入れる
		}
//for文で、探し物が見つかったらfoundに1が代入されて、for文のループが終わるたびにiが+1されるので、その文を-1する。
		if(found==1) System.out.println(i-1);
		else System.out.println("not found");

		//二分探索
		for(int i=0;i<100;i++){//ランダムな変数を100個配列に入れる
			number[i]=i;
		}

		while(found2==0 && top>=bottom){//まだ見つかっていない　かつ　上限値が下限値より小さい場合
			middle=(int)Math.floor((top+bottom)/2);//中央に相当する添え字を計算してる。Math.floorは小数点以下のものをい切り捨てる関数
			if(number[middle]==target2) found2=1;//探し物と一致したら発見フラグを立てる
			else if(target2<number[middle]) top=top/2;//探し物のデータが真ん中のデータより小さい場合、探し物は前半にある。だから、下限値を、中央値の-1の数字を入れる
			else bottom=top/2;//探し物のデータが真ん中のデータより大きい場合は、探し物は真ん中より後半にある
			System.out.println("上限値は"+top+"下限値は"+bottom);
		}
		if(found2==1) System.out.println(middle);
		else System.out.println("not found");
	}
	}

/*
配列の中から特定の値を見つけ出すことを探索という。
線形探索と、二分探索というものがある。
線形探索は、繰り返しを使って順番に探し続けて、見つかったら繰り返しをやめる
二分探索は、データが昇順で並んでいるとして、真ん中の数字を繰り返し見ていく。1〜100の数字があるとして、まず真ん中の50をみる。
探している数字が50より小さい場合は、50〜100を探索しなくてもいい。これを繰り返して、今度は1〜50の半分の25からみる。みたいな。
これで、計算量が、1/4、1/8、1/16、1/32・・・となっていく。
なので、対象のデータが100万個あったとすれば、線形探索の場合最悪100満回探すかもしれないし、平均50万回になるかもしれない。
なので「データが大きいほど二分探索は効果的」

*/
