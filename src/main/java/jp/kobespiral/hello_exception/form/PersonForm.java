package jp.kobespiral.hello_exception.form;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class PersonForm {

    /* ユーザID は 英数字のみ許す */
    @Pattern(regexp = "[0-9a-zA-Z]+")
    private String uid;

    /* 名前は無記名は許さない */
    @NotBlank
    private String name;

}
