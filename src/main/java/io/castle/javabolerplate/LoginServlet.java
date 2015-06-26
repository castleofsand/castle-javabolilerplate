package io.castle.javabolerplate;

import io.castle.client.Castle;
import io.castle.client.objects.Event;
import io.castle.client.objects.UserInfoHeader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;

/**
 * Created by castleofsand on 26/06/15.
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Castle.setApiBaseURI(URI.create("https://api.castle.io/v1"));
        Castle.setSecret(Config.apiKey());
        Event event = new Event();
        event.setUserId("1234");
        event.setName(Event.EventName.LOGIN_SUCCEEDED);
        UserInfoHeader userInfoHeader = UserInfoHeader.fromRequest(req);
        Event.setUserInfoHeader(userInfoHeader).trackEvent(event);
        resp.sendRedirect("authenticated.jsp");
    }

}
