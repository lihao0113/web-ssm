package cn.mystic.dto.message;

public class MessageInfo {
    public static final String SERVER_INNER_ERROR = "服务器内部错误";
    public static final String NO_ANY_MESSAGE = "未查询到任何信息";
    public static final String UPDATE_SUCCESS = "修改成功";
    public static final String DELETE_SUCCESS = "未查询到任何信息";
    public static final String ADD_SUCCESS = "未查询到任何信息";

    public static String exceptionInfo(Exception e){
        if (e.getMessage() != null)
            return SERVER_INNER_ERROR + ":" + e.getMessage();
        else
            return SERVER_INNER_ERROR + ":" + e.toString();
    }
}
