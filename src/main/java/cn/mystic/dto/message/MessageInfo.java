package cn.mystic.dto.message;

public class MessageInfo {
    public static final String SERVER_INNER_ERROR = "服务器内部错误";

    public static String exceptionInfo(Exception e){
        if (e.getMessage() != null)
            return SERVER_INNER_ERROR + ":" + e.getMessage();
        else
            return SERVER_INNER_ERROR + ":" + e.toString();
    }
}
