package com.example.restapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// 検索条件用DTOクラスの作成
public class UserSearchRequest {

    @NotBlank(message = "名前は必須です")
    private String name;
    @NotBlank(message = "メールアドレスは必須です")
    @Email(message = "メールアドレスの形式で入力してください")
    private String email;

    // デフォルトコンストラクタ
    public UserSearchRequest() {
    }

    // 全フィールドコンストラクタ
    public UserSearchRequest(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // toString
    @Override
    public String toString() {
        return "UserSearchRequest [name=" + name + ", email=" + email + "]";
    }

    

}
