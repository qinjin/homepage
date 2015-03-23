package qinjin;

import java.io.IOException;
import javax.servlet.http.*;

public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = -330119396067396L;

	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
    }
}
