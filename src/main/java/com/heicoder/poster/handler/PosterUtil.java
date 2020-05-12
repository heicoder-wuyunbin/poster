package com.heicoder.poster.handler;

import com.heicoder.poster.entity.HeadImage;
import com.heicoder.poster.entity.NickName;
import com.heicoder.poster.entity.QrCode;
import com.heicoder.poster.image.HeadBuilder;
import com.heicoder.poster.image.PosterBuilder;

/**
 * @author wuyunbin
 */
public class PosterUtil {

    public String base64PosterCreate(String backgroundImageUrl, NickName nickName, HeadImage headImage, QrCode qrCode) {
        if (!headImage.getHeadImageUrl().isEmpty()) {
            return new PosterBuilder(backgroundImageUrl).addNickname(nickName).addQrCode(qrCode).addHeadImage(headImage).getBase64();
        } else {
            return new PosterBuilder(backgroundImageUrl).addNickname(nickName).addQrCode(qrCode).getBase64();
        }
    }

    public String jpgPosterCreate(String backgroundImageUrl, NickName nickName, HeadImage headImage, QrCode qrCode) {
        if (!headImage.getHeadImageUrl().isEmpty()) {
            new PosterBuilder(backgroundImageUrl).addNickname(nickName).addQrCode(qrCode).addHeadImage(headImage).build();
        } else {
            new PosterBuilder(backgroundImageUrl).addNickname(nickName).addQrCode(qrCode).build();
        }
        return "success";
    }

    public String headCreate(String name, String rgb, String bgRgb) {
        String rgbReg = "#[0-9A-F]{6}";
        if (!rgb.matches(rgbReg)) {
            return "rgb is invalid";
        }
        if (!bgRgb.matches(rgbReg)) {
            return "bgRGB is invalid";
        }
        String displayName = name.length() > 2 ? name.substring(name.length() - 2) : name;
        new HeadBuilder(bgRgb).addName(displayName, rgb).build();
        return "success";
    }


    public static void main(String[] args) {
        PosterUtil posterUtil = new PosterUtil();
        //构建昵称对象
        String backgroundImage = "https://mashangjie-prod.oss-cn-qingdao.aliyuncs.com/posterbg.jpg";
        String nickname = "社会你圣哥";
        NickName nickName = new NickName(nickname, 45, 88, 5);

        //构建头像对象
        String headImageUrl = "http://thirdwx.qlogo.cn/mmopen/vi_32/Vc8AF6CPGj7f1ENAibOHibIqZeyrDNQgMPAkgacLDygrL84SgVBHaxAQHPc07iateRarZyMrVUkdWVoRvbV6I9HxQ/132";
        HeadImage headImage = new HeadImage(headImageUrl, 18, 18, 18, 83);

        //构建二维码对象
        String qrText = "http://member.mashangjie.shop/#/pages/wechatlogin/wechatlogin?recommendId=01UkTw1IjiiG";
        QrCode qrCode = new QrCode(qrText, 50, 50, 25, 50);
        String result = posterUtil.base64PosterCreate(backgroundImage, nickName, headImage, qrCode);
        System.out.println(result);
    }
}
