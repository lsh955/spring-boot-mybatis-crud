package com.example.springboot_mybatis_crud.dto;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author 이승환
 * @since 2019-12-18
 */
@Component  // @Component는 Bean을 생성 할 때 java에서 new로 생성하듯이 생성한다.
public class BoardDto implements Serializable {
    
    private int id;         // 키값
    private String name;    // 이름
    private String tel;     // 번호
    private String age;     // 나이
    private String title;   // 제목
    private String content; // 내용
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTel() {
        return tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String getAge() {
        return age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
}
