package xyz.mxd.wechat.axin.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import xyz.mxd.wechat.axin.entity.Contact;
import xyz.mxd.wechat.axin.entity.User;
import xyz.mxd.wechat.axin.entity.WeixinList;
import xyz.mxd.wechat.axin.mapper.ContactMapper;
import xyz.mxd.wechat.axin.mapper.UserMapper;
import xyz.mxd.wechat.axin.mapper.wexinlistMapper;
import xyz.mxd.wechat.axin.vo.DataVO;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.List;
import java.util.Objects;

/**
 * Created by DELL(mxd) on 2021/10/16 10:50
 */
@CrossOrigin
@RestController
public class Register {


    @Resource
    private UserMapper userMapper;

    @Resource
    private wexinlistMapper wexinlistMapper;

    @Resource
    private ContactMapper contactMapper;

    @PostMapping(value = "/Register")
    public DataVO doRegister(@RequestBody User user){
        if (Objects.nonNull(user)){
            contactMapper.insert(new Contact(null,
                    "https://gitee.com/mxd_2022/smartboot/raw/master/images/author.png",
                    "t-im作者",
                    "15511090451",
                    user.getPhone()));
            contactMapper.insert(new Contact(null,
                    "https://gitee.com/mxd_2022/smartboot/raw/master/images/user.jpg",
                    "t-im用户",
                    user.getPhone(),
                    "15511090451"
                    ));
            user.setAvatar("https://gitee.com/mxd_2022/smartboot/raw/master/images/user.jpg");
            return new DataVO(userMapper.insert(user) > 0, true);
        }else
            return new DataVO(false);
    }

    @PostMapping(value = "/add")
    public DataVO add(@RequestBody String friendid, String userid){
        if (userid != null && friendid != null){
            User phone = userMapper.selectOne(new QueryWrapper<User>()
                    .eq("phone", userid));
            if (Objects.isNull(phone)) {
                return new DataVO(false);
            }
            return new DataVO(contactMapper.insert(new Contact(null,
                    phone.getAvatar(),
                    phone.getName(),
                    phone.getPhone(),
                    userid)) > 0);
        }else
            return new DataVO(false);
    }

    @PostMapping(value = "/Login")
    public DataVO Login(@RequestBody User user){
//        System.out.println(user);
        if (Objects.nonNull(user)){
            return new DataVO(Objects.nonNull(userMapper.selectOne(new QueryWrapper<User>()
                    .eq("number",user.getNumber())
                    .eq("password",user.getPassword()))), true);
        }else
            return new DataVO(false);
    }



    @PostMapping(value = "/WeixinInformation")
    @ResponseBody
    public DataVO WeixinInformation(@RequestBody User user){
        if (Objects.nonNull(user)){
            DataVO number = new DataVO(wexinlistMapper.selectOne(new QueryWrapper<WeixinList>()
                    .eq("number", user.getNumber())), true);
//            System.out.println(number);
            return new DataVO(wexinlistMapper.selectOne(new QueryWrapper<WeixinList>()
                    .eq("number",user.getNumber())),true);
        }else
            return new DataVO(false,false);
    }



    @PostMapping(value = "/Contact")
    public DataVO Contact(@RequestBody User user){
        if (Objects.nonNull(user)){
            List<Contact> number = contactMapper.selectList(new QueryWrapper<Contact>()
                    .eq("number", user.getNumber()));
            return new DataVO(number,true);
        }else
            return new DataVO(false,false);
    }




}
