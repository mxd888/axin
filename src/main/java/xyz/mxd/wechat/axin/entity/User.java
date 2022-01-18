package xyz.mxd.wechat.axin.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;



/**
 * Created by DELL(mxd) on 2021/10/16 10:53
 */
@TableName(value = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {

//    @TableId
    @TableId(value="id", type= IdType.AUTO)
    private Integer id;
    private String number;
    private String name;
    private String password;
    private String phone;
    private String avatar = "https://gitee.com/mxd_2022/smartboot/raw/master/images/user.jpg";
    private String remark = "t-im粉丝";

}
