package xyz.mxd.wechat.axin.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by DELL(mxd) on 2021/10/16 11:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataVO {
    private Object json;
    private boolean rjson;

    public DataVO(Object json) {
        this.json = json;
    }
}
