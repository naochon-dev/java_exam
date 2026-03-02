package com.example.q7;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class CalcForm {

	@NotEmpty(message = "テキストボックスへの入力は必須です")
	@Pattern(regexp = "\\d", message = "左のテキストボックスには数値を入力してください。")
	private String left;

	@NotEmpty(message = "テキストボックスへの入力は必須です")
	@Pattern(regexp = "\\d", message = "右のテキストボックスには数値を入力してください。")
	private String right;
	
	public String getLeft() {
		return left;
	}
	public void setLeft(String left) {
		this.left = left;
	}
	public String getRight() {
		return right;
	}
	public void setRight(String right) {
		this.right = right;
	}
}
