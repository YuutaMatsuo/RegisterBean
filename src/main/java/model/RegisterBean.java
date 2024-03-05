package model; // ①パッケージ化（modelパッケージ）

import java.io.Serializable;

// ②クラスのアクセス修飾子はpublic
public class RegisterBean implements Serializable { // ③Serializableインタフェースの実装
	// ④フィールドのカプセル化（private化）
	private String name;
	private String age;
	private String[] langs;

	// ⑤publicで引数なしのコンストラクタ
	public RegisterBean() {
		// ※処理は書かなくてもOK
	}

	// publicでgeter/seterを定義する
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String[] getLangs() {
		return langs;
	}

	public void setLangs(String[] langs) {
		this.langs = langs;
	}

	// JavaBeansで処理したいメソッドも追加で定義OK
	
	// 年齢を判定して、「子供」か「大人」の文字列を取得するメソッド
	public String getAgeString() {
		String judgeAge = "";
		if (this.age.equals("child")) {
			judgeAge = "子供";
		} else {
			judgeAge = "大人";
		}
		return judgeAge;
	}
	
	// 複数選択（チェックボックス）の配列から、各要素の文字列を連結してひとつの文字列を返す
	public String getLangsString() {
		String allLangs = "";
		for(String str : langs) {
			allLangs += str + " ";
		}
		return allLangs;
	}
}
