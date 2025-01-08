package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		byte a;
		//バイト型
		short b;
		//短整数型
		int age;
		//整数型
		long c;
		//長整数型
		float d;
		//単精度浮動小数点数型
		double e;
		//倍精度浮動小数点数型
		char cha;
		//文字型
		String str;
		//文字列型
		boolean bool;
		//ブーリアン型
		
		
		//2それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		//3初期化をしたそれぞれの変数に下記の値を代入してください
		byte ab = 10;
		//バイト型
		short cd = 100;
		//短整数型
		int ef = 1000;
		//整数型
		long gh = 10000;
		//長整数型
		float ij = 9.5F;
		//単精度浮動小数点数型
		double k = 10.5;
		//倍精度浮動小数点数型
		char sl = 'a';
		//文字型
		String st = "ハロー";
		//文字列型
		boolean gu = true;
		//ブーリアン型
		
		//4下記の通りにコンソール出力されるようにしてください
		System.out.println( ab + cd + ef + gh );
		System.out.println( ab + ab );
		System.out.println( sl + st + gu );
		System.out.println( ab + cd + ef + gh + ij + k ); 
	    System.out.println( ab * cd * ef * gh );
	    System.out.println( k / cd );
	    System.out.println( ab - cd );
		
	    
	    //5次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
	    //「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
	    int num=20;
	    int num1=23 ;
	    System.out.println("ハローJAVA"+ (num + num1));
	    
	    
	    
	    
	    //6『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
	    //『山田太郎 18歳 170.5cm 62.2kg 寿司』
	    String name = "山田太郎";
	    int nenrei = 18 ;
	    double sintyou = 170.5 ;
	    double taijyu = 62.2 ;
	    String tabemono = "寿司";
	    int hun = 100 ;
	    double bmi;
	    
	    System.out.println("初めまして" + name + "です");
	    System.out.println("年齢は"+ nenrei + "歳です");
	    System.out.println("身長は"+ sintyou +"cmです");
	    System.out.println("体重"+ taijyu + "kgです");
	    System.out.println("好きな食べ物は"+ tabemono + "です");
	    
	    //7.6で作成した自己紹介に続いてBMIが出力されるようにしてください"
	    System.out.println( taijyu /(sintyou/hun)/(sintyou/hun));
	    
	    
	    //8.6で宣言した変数に再代入し下記の通りコンソールに出力してください"
	    name = "鈴木一郎";
	    nenrei = 24 ;
	    sintyou = 168.5 ;
	    taijyu = 64.2 ;
	    tabemono = "オムライス";
	    bmi =22.6;
	    
	    System.out.println("初めまして" + name + "です");
	    System.out.println("年齢は"+ nenrei + "歳です");
	    System.out.println("身長は"+ sintyou +"cmです");
	    System.out.println("体重"+ taijyu + "kgです");
	    System.out.println("好きな食べ物は"+ tabemono + "です");
	    System.out.println("BMIは" + bmi + "です");
	    
	    
	    
	    //9.8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
	    nenrei = nenrei + 24;
	    sintyou = sintyou + 168.5;
	    taijyu = taijyu + 64.2;
	    
	    System.out.println("初めまして" + name + "です");
	    System.out.println("年齢は"+ nenrei + "歳です");
	    System.out.println("身長は"+ sintyou +"cmです");
	    System.out.println("体重"+ taijyu + "kgです");
	    System.out.println("好きな食べ物は"+ tabemono + "です");
	    bmi =11.31;
	    System.out.println("BMIは" + bmi + "です");
	    
	    
	    //10.8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
	    System.out.println(nenrei >= 25); //true
	    
	    
	    //11.8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
	    nenrei = 24 ;
	    sintyou = 168.5 ;
	    taijyu = 64.2 ;

	    String nenrei2 = String.valueOf(nenrei);
	    String sintyou2 = String.valueOf(sintyou);
	    String taijyu2 = String.valueOf(taijyu);
	    
	    System.out.println(nenrei2);
	    System.out.println(sintyou2);
	    System.out.println(taijyu2);
	    
	    
	    
	    //12.11で変換した【年齢・身長】を整数型に変換して出力してください
	    int tosi = Integer.parseInt(nenrei2);
        System.out.println(tosi);	
	    
	    
        int senobi = (int)Double.parseDouble(sintyou2);
        System.out.println(senobi);
        
        
        
        /*13.12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください。
          ただしif文は使わないでください
         */
        
        
        System.out.println(tosi==25 || senobi >= 160);
   
	    
	    
	 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
