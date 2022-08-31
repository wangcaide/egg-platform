## 项目名称
> egg-platform-auth-serv
* 提供auth 2.0认证服务

## 运行条件
> mysql  
* 条件一
* 条件二
* 条件三


## 运行说明
> 说明如何运行和使用你的项目，建议给出具体的步骤说明
* 操作一
* 操作二
* 操作三  

## 测试说明
> 获取code
* 在浏览器中输入以下链接
  ```
  http://localhost:9000/oauth2/authorize?response_type=code&client_id=messaging-client&scope=openid&state=some-state&redirect_uri=http://127.0.0.1:8080/login/oauth2/code/messaging-client-oidc
  ```
  然后在跳转出来的登陆页面中输入user1/password
> 获取token
* 在上一步中的操作后，会获取到code。在终端输入以下命令获取token
  ```
  curl --location --request POST 'http://localhost:9000/oauth2/token' \
  --header 'Authorization: Basic base64(messaging-client:secret)' \
  --header 'Content-Type: application/x-www-form-urlencoded' \
  --data-urlencode 'grant_type=authorization_code' \
  --data-urlencode 'code=${code}' \
  --data-urlencode 'redirect_uri=http://127.0.0.1:8080/login/oauth2/code/messaging-client-oidc'
  ```
> 验证token
  ```
  curl --location --request POST 'http://localhost:9000/oauth2/introspect' \
  --header 'Authorization: Basic base64(messaging-client:secret)' \
  --header 'Content-Type: application/x-www-form-urlencoded' \
  --data-urlencode 'token=${token}' \
  ```
> 刷新token
  ```
  curl --location --request POST 'http://localhost:9000/oauth2/token' \
  --header 'Authorization: Basic base64(messaging-client:secret)' \
  --header 'Content-Type: application/x-www-form-urlencoded' \
  --data-urlencode 'grant_type=refresh_token' \
  --data-urlencode 'refresh_token=${refresh_token}' 
  ```
> 撤销token
  ```
  curl --location --request POST 'http://localhost:9000/oauth2/revoke' \
  --header 'Authorization: Basic base64(messaging-client:secret)' \
  --header 'Content-Type: application/x-www-form-urlencoded' \
  --data-urlencode 'token=${token}' 
  ```

## 技术架构
> 基于spring-security-oauth2-authorization-server框架进行适配调整

## 备注
> spring security 框架默认生成的登陆页面由DefaultLoginPageGeneratingFilter生成

## 协作者
> Caide, Wang
