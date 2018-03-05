package com.zm.zhuma.user.model.po;

import com.zm.zhuma.commons.annotations.EnumValue;
import com.zm.zhuma.commons.model.po.BasePO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @desc 登录凭证

 * @author zhumaer
 * @since 6/15/2017 2:48 PM
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginCredential extends BasePO<Long> {

    private static final long serialVersionUID = 5550420394013305835L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 账号
     */
    @NotBlank
    @Length(min=1, max=128)
    private String account;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 密码加密随机盐
     */
    @Length(max=64)
    private String randomSalt;

    /**
     * 用户ID
     */
    @NotBlank
    private String userId;

    /**
     * 账号类型
     */
    @EnumValue(enumClass=LoginCredential.TypeEnum.class, enumMethod="isValidName")
    private String type;

    /**
     * 账号类型枚举
     */
    public enum TypeEnum {
        /**自定义*/
        CUSTOM,
        /**微信UNION ID*/
        UNION_ID;

        public static boolean isValidName(String name) {
            for (LoginCredential.TypeEnum typeEnum : LoginCredential.TypeEnum.values()) {
                if (typeEnum.name().equals(name)) {
                    return true;
                }
            }
            return false;
        }
    }
}
