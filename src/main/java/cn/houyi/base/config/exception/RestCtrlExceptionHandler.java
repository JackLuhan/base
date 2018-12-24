package cn.houyi.base.config.exception;

import cn.houyi.base.common.utils.ResultUtil;
import cn.houyi.base.common.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author houyi
 */
@Slf4j
@RestControllerAdvice
public class RestCtrlExceptionHandler {

    @ExceptionHandler(GloabException.class)
    @ResponseStatus(value = HttpStatus.OK)
    public Result<Object> handleXCloudException(GloabException e) {

        String errorMsg="出现异常 exception";
        if (e!=null){
            errorMsg=e.getMsg();
            log.error(e.toString());
        }
        return new ResultUtil<>().setErrorMsg(500, errorMsg);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.OK)
    public Result<Object> handleException(Exception e) {

        String errorMsg="Exception";
        if (e!=null){
            errorMsg=e.getMessage();
            log.error(e.toString());
        }
        return new ResultUtil<>().setErrorMsg(500, errorMsg);
    }
}
