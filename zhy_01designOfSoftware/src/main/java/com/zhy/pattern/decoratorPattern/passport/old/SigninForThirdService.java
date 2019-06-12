package com.zhy.pattern.decoratorPattern.passport.old;

/**
 * @ClassName: SigninForThirdService
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/12 9:41
 * @Version: 1.0
 **/
public class SigninForThirdService implements ISigninForThirdService {
    private ISigninService iSigninService;

    public SigninForThirdService(ISigninService iSigninService) {
        this.iSigninService = iSigninService;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return this.iSigninService.regist(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return this.iSigninService.login(username,password);
    }

    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWeChart(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passward) {
        return null;
    }


}
