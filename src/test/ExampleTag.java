package test;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by Administrator on 2018/10/1.
 */
public class ExampleTag extends SimpleTagSupport {

    private int fontSize = 12;
    private String align = "left";

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        out.println("<div style=\"font-size:" + fontSize + "px;text-align:" + align + ";\">");
        out.println("i am a tag自定义标签");
        getJspBody().invoke(null);
        out.println("</div>");
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }
}
