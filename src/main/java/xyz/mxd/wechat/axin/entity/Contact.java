package xyz.mxd.wechat.axin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by DELL(mxd) on 2021/10/16 12:09
 */
@TableName(value = "contact")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Contact {
    @TableId(value="id", type= IdType.AUTO)
    private Integer id;
    private String img;
    private String name;
    private String friendid;
    private String number;
}
