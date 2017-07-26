# chromeInspect
让chrome调试你的apicloud应用
# 使用方法
* 1.在apicloud后端打开模块管理，上传模块，然后添加至你当前项目里

* 2.js中使用
    ```js
      var ci = api.required("chromeInspect");
      //开启调试
      ci.enableDebug(function(ret,err){
        console.log(ret);
      });
      //输出
      //关闭调试
      ci.disableDebug(function(ret,err){
        console.log(ret);
      })
    ```
# 系统要求
* android 4.4+
* chrome 最新版
# 参考资料
* [模块开发指南_Android](http://doc.apicloud.com/Module-Dev/module-dev-guide-for-android)
* [远程调试 WebView](https://developers.google.com/web/tools/chrome-devtools/remote-debugging/webviews)
