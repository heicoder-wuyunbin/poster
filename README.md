# poster
A tool to generate posters with QR code
## demo 
```
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
```
