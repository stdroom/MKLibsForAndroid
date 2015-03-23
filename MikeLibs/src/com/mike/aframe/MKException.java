/**
 * 工程名: MikeLibs
 * 文件名: MKException.java
 * 包名: com.mike.aframe
 * 日期: 2015-3-16下午2:53:23
 * Mail: ammike@163.com.
 * QQ: 378640336
 * http://www.cnblogs.com/ammike/
 *
*/

package com.mike.aframe;
/**
 * 类名: MKException <br/>
 * 功能: TODO 添加功能描述. <br/>
 * 日期: 2015-3-16 下午2:53:23 <br/>
 *
 * @author   mike
 * @version  	 
 */
public class MKException extends RuntimeException{
	private static final long serialVersionUID = 1L;

    public MKException() {
        super();
    }

    public MKException(String msg) {
        super(msg);
    }

    public MKException(Throwable ex) {
        super(ex);
    }

    public MKException(String msg, Throwable ex) {
        super(msg, ex);
    }

}

