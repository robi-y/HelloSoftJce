package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok("<html><body><h1>JCE Rocks!.</h1></body></html>");
    }

}
