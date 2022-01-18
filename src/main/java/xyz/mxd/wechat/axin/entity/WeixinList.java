package xyz.mxd.wechat.axin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by DELL(mxd) on 2021/10/16 11:58
 */
@TableName(value = "weixinlist")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class WeixinList {
    private int id;
    private String titleimg;
    private String title;
    private String content;
    private String time;
    private String showcode;
    private String number;
}
