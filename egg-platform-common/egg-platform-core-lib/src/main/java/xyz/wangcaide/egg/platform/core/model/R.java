package xyz.wangcaide.egg.platform.core.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.function.Supplier;


@Data
@Builder
@Slf4j
public class R<T> implements Serializable {

    public static final String SUCCESS = "success";
    public static final String SUCCESS_CODE = "000000";
    public static final String FAILURE_CODE = "999999";

    private String errCode;

    private String errMsg;

    private T data;

    public R error(String errCode, String msg, String... param) {
        return R.builder().errCode(errCode)
//                .errMsg(StrUtil.format(msg, param))
                .build();
    }

    public static R error(String msg) {
        return R.builder().errMsg(msg).errCode(FAILURE_CODE).build();
    }

    public static R ok() {
        return R.builder().errCode(SUCCESS_CODE).errMsg(SUCCESS).build();
    }

    public static <T> R ok(T data) {
        return R.builder().errCode(SUCCESS_CODE).errMsg(SUCCESS).data(data).build();
    }

    public static <T> R<T> wrapper(Supplier<T> supplier) {
        try {
            return R.ok(supplier.get());
        }  catch (Exception e) {
            log.error("R wrapper catch exception", e);
            return R.error(e.getMessage());
        }
    }

}
