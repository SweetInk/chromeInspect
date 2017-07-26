package online.githuboy.module;

import android.os.Build;
import android.webkit.WebView;

import com.uzmap.pkg.uzapp.UZFileSystem;
import com.uzmap.pkg.uzcore.UZCoreUtil;
import com.uzmap.pkg.uzcore.UZWebView;
import com.uzmap.pkg.uzcore.uzmodule.UZModule;
import com.uzmap.pkg.uzcore.uzmodule.UZModuleContext;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 开启或关闭webview 调试.
 * Created by suchu on 2017/7/26.
 */

public class ChromeInspect extends UZModule {
    private UZWebView webView;
    public ChromeInspect(UZWebView webView) {
        super(webView);
        this.webView = webView;
    }

    /**
     * 开启webview 调试
     * @param context
     * @throws JSONException
     */
    public void jsmethod_enableDebug(UZModuleContext context) throws JSONException {
        JSONObject result = new JSONObject();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WebView.setWebContentsDebuggingEnabled(true);
            result.put("errno",0);
            result.put("msg","enable webContent Debugging success");
        }else{
            result.put("errno",-1);
            result.put("msg","enable webContent Debugging failure.Cause by your SDK_VERSION("+Build.VERSION.SDK_INT+") version below KITKAT");
        }
        context.success(result,true);

    }

    /**
     * 关闭webview 调试
     * @param context
     * @throws JSONException
     */
    public void jsmethod_disableDebug(UZModuleContext context) throws JSONException {
        JSONObject result = new JSONObject();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WebView.setWebContentsDebuggingEnabled(false);
            result.put("errno",0);
            result.put("msg","disable webContent Debugging success");
        }else{
            result.put("errno",-1);
            result.put("msg","disable webContent Debugging failure.Cause by your SDK_VERSION("+Build.VERSION.SDK_INT+")  below KITKAT");
        }
        context.success(result,true);
    }

}
